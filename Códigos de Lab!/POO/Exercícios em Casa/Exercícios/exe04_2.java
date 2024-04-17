package Exercícios;

import javax.swing.JOptionPane;

public class exe04_2{ // dias da semanaaa
    public static void main(String[] args) {

        // int domingo, segunda, terca, quarta, quinta, sexta, sabado;
        String dSemana;
        int dia;

        dia = 
        Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número de 1 à 7: "));

        switch (dia) {
            case 1:
                dSemana = "Domingo!";                
                break;
            case 2:
                dSemana = "Segunda!";
                break;
            case 3:
                dSemana = "Terça!";
                break;
            case 4:
                dSemana = "Quarta!";
                break;
            case 5:
                dSemana = "Quinta!";
                break;
            case 6:
                dSemana = "Sexta!";
                break;
            case 7:
                dSemana = "Sábado!";
                break;
            default:
                dSemana = "\nNúmero inválido, tente novamente.";
                break;
        }

        JOptionPane.showMessageDialog(null, "O dia da semana correspondente ao número " +dia+ " é:  " +dSemana);
    }

}
