from PyQt6.QtWidgets import QApplication, QMainWindow
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
from gen.p_BoardLangVisitor import p_BoardLangVisitor

class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        loadUi("ui/mainwindow.ui", self)

        self.source_filename = "test.txt"               # zmien to pozniej
        self.map_filename = "TileMap.json"
        self.board_renderer = BoardGenerator(self.map_filename)

        self.runButton.clicked.connect(self.handle_run_clicked)

    def handle_run_clicked(self):
        self.interpret()
        self.display_image()

    def interpret(self):
        source_stream = FileStream(self.source_filename)
        lexer = l_BoardLang(source_stream)
        stream = CommonTokenStream(lexer)
        parser = p_BoardLang(stream)

        tree = parser.program()

        visitor = p_BoardLangVisitor()
        result = visitor.visit(tree)

    def display_image(self):
        self.board_renderer.render_once()
        surface, surface_size = self.board_renderer.get_surface()
        surface_qimage = QImage(surface, surface_size[0], surface_size[1], QImage.Format.Format_RGB888)
        surface_pixmap = QPixmap.fromImage(surface_qimage)
        self.imageSpace.setAlignment(Qt.AlignmentFlag.AlignCenter)
        self.imageSpace.setPixmap(surface_pixmap)

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec())