import math

a = int(input("\nTermo a = "))
b = int(input("\nTermo b = "))
c = int(input("\nTermo c = "))
if a == 0:
    print("\n\nNão é de 2º grau.")
else:
    delta = (math.pow(b, 2)) - 4*a*c
    if delta < 0:
        print("Não tem raízes reais.\n\n\n")
    else:
        print("\n\nDelta = ", delta)
        PosBask = (-b + math.sqrt(delta))/(2*a)
        NegBask = (-b - math.sqrt(delta))/(2*a)
        print("\nX1 = : ", PosBask)
        print("X2 = : ",NegBask,"\n\n\n")
