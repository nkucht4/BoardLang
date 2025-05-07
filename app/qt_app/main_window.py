from PyQt6.QtWidgets import QApplication, QMainWindow
from PyQt6.uic import loadUi
import sys

class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        loadUi("../ui/mainwindow.ui", self)

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec())