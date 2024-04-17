package Exercícios;

import javax.swing.JOptionPane;

public class exe04_1{ // dias da semanaaa
    public static void main(String[] args) {

        // int domingo, segunda, terca, quarta, quinta, sexta, sabado;
        String dSemana = "";
        int dia;

        dia = 
        Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número de 1 à 7: "));

        if (dia == 1)
        dSemana = "O 1º dia da semana é Domingo!";
        else if (dia == 2)
        dSemana = "O 2º dia da semana é Segunda!";
        else if (dia == 3)
        dSemana = "O 3º dia da semana é Terça!";
        else if (dia == 4)
        dSemana = "O 4º dia da semana é Quarta!";
        else if (dia == 5)
        dSemana = "O 5º dia da semana é Quinta!";
        else if (dia == 6)
        dSemana = "O 6º dia da semana é Sexta!";
        else if (dia == 7)
        dSemana = "O 7º dia da semana é Sábado!";
        // domingo = 1;
        // segunda = 2;
        // terca = 3;
        // quarta = 4;
        // quinta = 5;
        // sexta = 6;
        // sabado = 7;
       
        JOptionPane.showMessageDialog(null, dSemana);
    }
}
