
import math

#  recebe numero
entrada_ok = False

while not entrada_ok:
    try:
        entrada = int(input("\n\n\nInsira um número: "))
        if entrada>0 and entrada%2==1:
            entrada_ok = True
        else:
            print("Tente de novo.")
    except: ("\n\n\n\n\nErro.\n\n\n")

    # testar
    if entrada_ok:
        for x in range(2, int(entrada**0.5)+1):
            if entrada%x == 0:
                print("Seu número ", entrada, " não é primo!")
                break
        else:
            print("Seu número ", entrada, " é primo")