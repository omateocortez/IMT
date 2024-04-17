idade = int(input("\n\n\nDigite a idade do atleta: "))
if idade < 5:
    print("Não tem idade para competir.\n\n\n\n")
if idade>=5 and idade <= 7:
    print("Sua classifcação: Infatil A\n\n")
elif idade >= 8 and idade <= 10:
    print("Sua classifcação: Infantil B\n\n")
elif idade >= 11 and idade <= 13:
    print("Sua classifcação: Juvenil A\n\n")

elif idade >= 14 and idade <= 17:
    print("Sua classifcação: Juvenil B\n\n")
elif idade >= 18:
    print("Sua classificação: Adulto\n\n")