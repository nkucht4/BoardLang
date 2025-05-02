import pygame
import os
import time
import json

class BoardGenerator:
    def __init__(self, x: int, y: int, filename: str):
        self.filename = filename
        self.last_modified = os.path.getmtime(filename)

        pygame.init()
        self.screen = pygame.display.set_mode((x*20, y*20))
        self.clock = pygame.time.Clock()
        self.running = True

    def run(self):
        with open(self.filename, "rb") as f:
            tilemap = json.load(f)
            print(tilemap)
        self.render_tilemap(tilemap)
        while self.running:
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    self.running = False

            current_modified = os.path.getmtime(self.filename)
            if current_modified != self.last_modified:
                with open(self.filename, "rb") as f:
                    tilemap = json.load(f)
                self.render_tilemap(tilemap)
                self.last_modified = current_modified

            self.clock.tick(10)

        pygame.quit()

    def render_tilemap(self, tilemap):
        width = tilemap['size'][0]
        height = tilemap['size'][1]
        if self.screen.get_size()[0]/20 != width or self.screen.get_size()[1]/20 != height:
            self.screen = pygame.display.set_mode((width*20, height*20))

        map = tilemap['map']
        for x, row in enumerate(map):
            for y, color in enumerate(row):
                if color != 0:
                    self.render_tile(x, y, pygame.Color(tuple(color)))
        pygame.display.flip()


    def render_tile(self, x: int, y: int, color: pygame.Color):
        tile = pygame.Rect((x * 20, y * 20), (20, 20))
        pygame.draw.rect(self.screen, color, tile)


board = BoardGenerator(2, 3, 'TileMap.json')
board.run()
