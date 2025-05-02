import pygame


class BoardGenerator:
    def __init__(self, x: int, y: int):
        pygame.init()
        self.screen = pygame.display.set_mode((x*20, y*20))
        self.clock = pygame.time.Clock()
        self.running = True
    def render_tile(self, x: int, y: int, color: pygame.Color):
        tile = pygame.Rect((x * 20, y * 20), (20, 20))
        pygame.draw.rect(self.screen, color, tile)

    def run(self):
        while self.running:
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    self.running = False

            board.render_tile(2, 2, pygame.Color("red"))
            pygame.display.flip()
            self.clock.tick(10)

        pygame.quit()


board = BoardGenerator(5, 5)
board.run()
