

valor_ok = False

while not valor_ok:
    try:
        valor = int(input("\n\n\nInsira um valor a ser sacado: "))
        if valor %2 == 0:
            valor_ok = True
        else:
            print("Valor inserido não é par. \n\nTente novamente.")
        
    except: print("Seu valor não é um inteiro. \n\nTente novamente")

notas = [100, 50, 20, 10, 5, 2]
quantidades = []
v_total = valor

for nota in notas:
    quantidade = valor//nota
    quantidades.append(quantidade)
    valor -= quantidade*nota

print (f"Valor sacado: {v_total:.2f}")
for x in range (len(notas)):
    if quantidades[x]!=0:
        print(f"Notas de R${notas[x]:.0f}: {quantidades[x]}")


