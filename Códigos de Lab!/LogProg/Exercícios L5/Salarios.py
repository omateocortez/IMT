


salario = int(input("\n\n\nInsira seu salário: "))
codigo = int(input("Insira o código do seu cargo: "))

# criar sistema de %
porc5 = salario/100*5
porc7p5 = salario/100*7.5
porc10 = salario/100*10
porc15 = salario/100*15

# variaveis de novos salarios
novoSalario310 = salario + porc5
novoSalario456 = salario + porc7p5
novoSalario885 = salario + porc10
novoSalario15 = salario + porc15

#criar taxacao de aumento
if codigo == 310:
    print("\nEste é seu novo salário com aumento de 5%!")
    print("Novo salário: ",novoSalario310)
    print("Aumento salarial efetivo: ",novoSalario310-salario,"\n\n")

elif codigo == 456:
    print("\nEste é seu novo salário com aumento de 7,5%!")
    print("Novo salário: ",novoSalario456)
    print("Aumento salarial efetivo: ",novoSalario456-salario,"\n\n")

elif codigo == 885:
    print("\nEste é seu novo salário com aumento de 10%!")
    print("Novo salário: ",novoSalario885)
    print("Aumento salarial efetivo: ",novoSalario885-salario,"\n\n")

else:
    print("\nEste é seu novo salário com aumento de 15%!")
    print("Novo salário: ",salario+porc15)
    print("Aumento salarial efetivo: ",novoSalario15-salario,"\n\n")

