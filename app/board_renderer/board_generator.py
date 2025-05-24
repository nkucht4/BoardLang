import pygame
import os
import time
import json

class BoardGenerator:
    def __init__(self, filename: str):
        self.filename = filename
        self.last_modified = os.path.getmtime(filename)
        self.images = {}

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

        if 'images' in tilemap.keys():
            self.load_images(tilemap['images'])

        map = tilemap['map']

        for x, row in enumerate(map):
            for y, color in enumerate(row):
                if color != 0:
                    if isinstance(color, tuple) or isinstance(color, list):
                        self.render_tile(x, y, pygame.Color(tuple(color)))
                    else:
                        self.render_image_tile(x, y, color.strip('"\''))

    def load_images(self, imgs: dict):
        self.images = {}
        for name, img in imgs.items():
            #try:
            loaded_img = pygame.image.load(img.strip('"\''))
            #except Exception as e:
                #raise FileNotFoundError(f'Can\'t open file {imgs}')
            self.images[name] = pygame.transform.scale(loaded_img, (20, 20))

    def render_tile(self, x: int, y: int, color: pygame.Color):
        tile = pygame.Rect((x * 20, y * 20), (20, 20))
        pygame.draw.rect(self.screen, color, tile)

    def render_image_tile(self, x: int, y: int, img: str):
        tile = pygame.Rect((x * 20, y * 20), (20, 20))
        image = self.images[img]
        self.screen.blit(image, tile.topleft)

    def get_surface(self):
        screen = self.screen.convert(24)
        surface = pygame.image.tostring(screen, "RGB", False)
        return surface, self.screen.get_size()

    def save_to_file(self, path: str):
        pygame.image.save(self.screen, path)

#if __name__ == "__main__":
 #   board = BoardGenerator( '../TileMap.json')
  #  board.run()
   # board.export_image_from_surface()
