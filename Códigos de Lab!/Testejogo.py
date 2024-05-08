import pygame
import random
import time

# Inicialização do Pygame
pygame.init()

# Definição de constantes
SCREEN_WIDTH = 800
SCREEN_HEIGHT = 600
CARD_WIDTH = 100
CARD_HEIGHT = 100
GRID_ROWS = 4
GRID_COLS = 4
GREEN = (0, 255, 0)

# Configuração da tela
screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
pygame.display.set_caption("Pymemory")

# Função para desenhar os cartões
def draw_card(x, y, number):
    pygame.draw.rect(screen, GREEN, (x, y, CARD_WIDTH, CARD_HEIGHT))
    font = pygame.font.Font(None, 36)
    text = font.render(str(number), True, (0, 0, 0))
    text_rect = text.get_rect(center=(x + CARD_WIDTH / 2, y + CARD_HEIGHT / 2))
    screen.blit(text, text_rect)

# Função para criar a grade de cartões
def create_grid():
    grid = []
    numbers = list(range(1, (GRID_ROWS * GRID_COLS) // 2 + 1)) * 2
    random.shuffle(numbers)
    for row in range(GRID_ROWS):
        for col in range(GRID_COLS):
            number = numbers.pop()
            x = col * (CARD_WIDTH + 10) + 50
            y = row * (CARD_HEIGHT + 10) + 50
            grid.append((x, y, number, False))
    return grid

# Função principal do jogo
def main():
    running = True
    grid = create_grid()
    flipped_cards = []
    flipped_count = 0

    while running:
        screen.fill((255, 255, 255))

        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
            elif event.type == pygame.MOUSEBUTTONDOWN:
                if len(flipped_cards) < 2:
                    x, y = pygame.mouse.get_pos()
                    for card in grid:
                        if not card[3] and card[0] < x < card[0] + CARD_WIDTH and card[1] < y < card[1] + CARD_HEIGHT:
                            flipped_cards.append(card)
                            card_index = grid.index(card)
                            grid[card_index] = (card[0], card[1], card[2], True)
                            break

        for card in grid:
            draw_card(card[0], card[1], card[2])

        if len(flipped_cards) == 2:
            pygame.display.flip()
            time.sleep(1)
            if flipped_cards[0][2] == flipped_cards[1][2]:
                flipped_count += 2
                if flipped_count == GRID_ROWS * GRID_COLS:
                    print("Você ganhou!")
                    running = False
            else:
                for i in range(2):
                    card_index = grid.index(flipped_cards[i])
                    grid[card_index] = (flipped_cards[i][0], flipped_cards[i][1], flipped_cards[i][2], False)
            flipped_cards = []

        pygame.display.flip()

    pygame.quit()

if __name__ == "__main__":
    main()