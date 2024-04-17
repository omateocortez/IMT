package Apostila;
//Devemos importar o JOptionPane usando o javax.swing.(ou JOptionPane ou * [importa a biblioteca inteira mas no caso nao ta rolando])
//pois ele não está instalado diretamente
import javax.swing.JOptionPane;

public class Soma2Numeros {
    public static void main(String[] args) {
        double x;
        double y;
        double resultado;
        x = 
            Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º número a ser somado: "));
        y = 
            Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º valor a ser somado: "));
        resultado = x + y;
        //JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);

    }
}
