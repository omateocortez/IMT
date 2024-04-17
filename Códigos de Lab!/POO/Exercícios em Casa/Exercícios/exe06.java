package Exercícios;
import javax.swing.JOptionPane;
public class exe06 {
    public static void main(String[] args) {

        double ano;
        boolean div100;
        boolean div4;
        boolean div400;
        ano = 
        Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um ano pra ver se é bissexto: "));

        String anoFormat = String.format("%.0f", ano);

        div100 = (ano%100 == 0);
        div4 = (ano%4 == 0);
        div400 = (ano%400 == 0);

        if (div400 || div4 && !div100)
        JOptionPane.showMessageDialog(null, anoFormat + " é um ano bissexto!");

        else
        JOptionPane.showMessageDialog(null, anoFormat + " não é um ano bissexto!");        
    }    
}
