from PyQt6.QtWidgets import QApplication, QMainWindow
from PyQt6.uic import loadUi
from PyQt6.QtGui import QPixmap, QImage
import sys

from board_renderer.board_generator import BoardGenerator

class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        loadUi("ui/mainwindow.ui", self)

        self.source_filename = ""
        self.map_filename = "TileMap.json"
        self.board_renderer = BoardGenerator(self.map_filename)

        self.runButton.clicked.connect(self.handle_run_clicked)

    def handle_run_clicked(self):
        self.interpret()
        self.display_image()

    def interpret(self):
        pass

    def display_image(self):
        self.board_renderer.render_once()
        surface, surface_size = self.board_renderer.get_surface()
        surface_qimage = QImage(surface, surface_size[0], surface_size[1], QImage.Format.Format_RGB888)
        surface_pixmap = QPixmap.fromImage(surface_qimage)
        self.imageSpace.setPixmap(surface_pixmap)

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec())