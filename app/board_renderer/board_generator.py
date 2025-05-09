import pygame
import os
import time
import json

class BoardGenerator:
    def __init__(self, filename: str):
        self.filename = filename
        self.last_modified = os.path.getmtime(filename)

        pygame.init()
        self.screen = pygame.Surface((1, 1))
        self.clock = pygame.time.Clock()
        self.running = True

    def render_once(self):
        with open(self.filename, "rb") as f:
            self.tilemap = json.load(f)
        self.render_tilemap(self.tilemap)

    def render_tilemap(self, tilemap):
        width = tilemap['size'][0]
        height = tilemap['size'][1]
        if self.screen.get_size()[0]/20 != width or self.screen.get_size()[1]/20 != height:
            self.screen = pygame.Surface((width*20, height*20))

        map = tilemap['map']
        for x, row in enumerate(map):
            for y, color in enumerate(row):
                if color != 0:
                    self.render_tile(x, y, pygame.Color(tuple(color)))

    def render_tile(self, x: int, y: int, color: pygame.Color):
        tile = pygame.Rect((x * 20, y * 20), (20, 20))
        pygame.draw.rect(self.screen, color, tile)

    def get_surface(self):
        screen = self.screen.convert(24)
        surface = pygame.image.tostring(screen, "RGB", False)
        return surface, self.screen.get_size()

#if __name__ == "__main__":
 #   board = BoardGenerator( '../TileMap.json')
  #  board.run()
   # board.export_image_from_surface()
