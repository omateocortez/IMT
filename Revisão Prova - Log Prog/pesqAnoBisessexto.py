# criar variável
ano = int(input("\n Digite um ano: "))
div4 = ano%4 ==0
div100 = ano%100 ==0
div400 = ano%400 ==0
# criar condições
if div400 or div4 and not div100:
    print("\n O ano é bissexto! \n\n ;)\n ")
# gerar resposta
else:
    print("\n O ano é não bissexto! \n")
