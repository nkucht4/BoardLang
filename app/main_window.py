from PyQt6.QtWidgets import QApplication, QMainWindow, QFileDialog
from PyQt6.uic import loadUi
from PyQt6.QtGui import QPixmap, QImage
from PyQt6.QtCore import Qt

import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'gen')))

from board_renderer.board_generator import BoardGenerator

from antlr4 import *
from gen.l_BoardLang import l_BoardLang
from gen.p_BoardLang import p_BoardLang
from gen.BoardLangVisitor import BoardLangVisitor

class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        loadUi("ui/mainwindow.ui", self)

        # self.source_filename = "test.txt"  # zmien to pozniej
        self.map_filename = "TileMap.json"
        self.board_renderer = BoardGenerator(self.map_filename)

        self.runButton.clicked.connect(self.handle_run_clicked)
        self.openButton.clicked.connect(self.handle_open_file_clicked)
        self.saveButton.clicked.connect(self.handle_save_file_clicked)
        self.saveImageButton.clicked.connect(self.handle_save_image_clicked)

    def handle_open_file_clicked(self):
        response = QFileDialog.getOpenFileName(parent=self,
                                               caption="Wybierz plik",
                                               filter='Text Files (*.txt)',
                                               directory=os.getcwd())
        try:
            with open(response[0], 'r') as file:
                text = file.read()
            self.textEditor.setPlainText(text)
        except Exception as e:
            print(f"Błąd podczas uruchamiania: {e}")
    def handle_save_file_clicked(self):
        try:
            text = self.textEditor.toPlainText()

            name, _ = QFileDialog.getSaveFileName(self, caption="Wybierz plik", filter="Text Files (*.txt")
            file = open(name, 'w')
            file.write(text)
            file.close()
        except Exception as e:
            print(f"Błąd podczas otwierania pliku: {e}")

    def handle_run_clicked(self):
        try:
            text = self.textEditor.toPlainText()

            self.interpret(text)
            self.display_image()
        except Exception as e:
            self.consoleOutput.setAlignment(Qt.AlignmentFlag.AlignTop)
            self.consoleOutput.setText(str(e))

    def interpret(self, input_string: str):
        source_stream = InputStream(input_string)
        lexer = l_BoardLang(source_stream)
        stream = CommonTokenStream(lexer)
        parser = p_BoardLang(stream)

        tree = parser.program()

        visitor = BoardLangVisitor()
        result = visitor.visit(tree)

    def display_image(self):
        self.board_renderer.render_once()
        surface, surface_size = self.board_renderer.get_surface()
        surface_qimage = QImage(surface, surface_size[0], surface_size[1], QImage.Format.Format_RGB888)
        surface_pixmap = QPixmap.fromImage(surface_qimage)

        self.imageSpace.setScaledContents(False)
        self.imageSpace.setAlignment(Qt.AlignmentFlag.AlignCenter)
        self.imageSpace.setPixmap(surface_pixmap)

        self.scrollArea.setWidgetResizable(True)

    def handle_save_image_clicked(self):
        surface = self.board_renderer.get_surface()

        file_path, _ = QFileDialog.getSaveFileName(
            parent=None,
            caption="Wybierz plik",
            directory="",
            filter="All Files (*)"
        )

        file_path += '.png'

        self.board_renderer.save_to_file(file_path)


if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec())
