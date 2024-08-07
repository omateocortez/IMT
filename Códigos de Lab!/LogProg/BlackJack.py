import random

# Definindo as cartas e seus valores
cartas = ['Ás', 'Dois', 'Três', 'Quatro', 'Cinco', 'Seis', 'Sete', 'Oito', 'Nove', 'Dez', 'Valete', 'Dama', 'Rei']
valores = {'Ás': 1, 'Dois': 2, 'Três': 3, 'Quatro': 4, 'Cinco': 5, 'Seis': 6, 'Sete': 7, 'Oito': 8, 'Nove': 9, 'Dez': 10, 'Valete': 10, 'Dama': 10, 'Rei': 10}

# Função para embaralhar as cartas
def embaralhar():
    random.shuffle(cartas)

# Função para dar cartas aos jogadores
def dar_carta():
    return cartas.pop()

# Função para calcular a pontuação de uma mão
def calcular_pontuacao(mao):
    pontuacao = 0
    ases = 0
    for carta in mao:
        pontuacao += valores[carta]
        if carta == 'Ás':
            ases += 1
    while pontuacao > 21 and ases > 0:
        pontuacao -= 10
        ases -= 1
    return pontuacao

# Função para mostrar as cartas de um jogador e sua pontuação
def mostrar_mao_e_pontuacao(jogador, mao):
    print(jogador + ' tem as seguintes cartas:')
    for carta in mao:
        print('  ' + carta)
    print('Pontuação total:', calcular_pontuacao(mao))

# Função para o jogo de blackjack
def blackjack():
    embaralhar()
    jogador = []
    dealer = []

    # Primeira rodada
    for _ in range(2):
        jogador.append(dar_carta())
        dealer.append(dar_carta())

    mostrar_mao_e_pontuacao('Jogador', jogador)
    print('Dealer tem uma carta virada para baixo e uma', dealer[0])

    # Jogada do jogador
    while calcular_pontuacao(jogador) < 21:
        escolha = input('Deseja ficar (f) ou pedir carta (p)? ')
        if escolha == 'p':
            jogador.append(dar_carta())
            mostrar_mao_e_pontuacao('Jogador', jogador)
        elif escolha == 'f':
            break
        else:
            print('Escolha inválida!')

    # Jogada do dealer
    while calcular_pontuacao(dealer) < 17:
        dealer.append(dar_carta())

    mostrar_mao_e_pontuacao('Dealer', dealer)

    # Verificar vencedor
    pontuacao_jogador = calcular_pontuacao(jogador)
    pontuacao_dealer = calcular_pontuacao(dealer)

    if pontuacao_jogador > 21:
        print('Jogador estourou! Dealer vence!')
    elif pontuacao_dealer > 21:
        print('Dealer estourou! Jogador vence!')
    elif pontuacao_jogador > pontuacao_dealer:
        print('Jogador vence!')
    elif pontuacao_jogador < pontuacao_dealer:
        print('Dealer vence!')
    else:
        print('Empate!')

# Iniciar o jogo
blackjack()
