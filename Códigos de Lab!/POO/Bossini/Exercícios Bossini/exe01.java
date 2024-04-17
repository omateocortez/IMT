import javax.swing.*;



public class exe01{
    public static void main(String[] args) {
        int inteiro;
        double real;

        real = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira um número real: "));

        inteiro = 
        Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));

        if (inteiro < real)
        JOptionPane.showMessageDialog(null,"O número inteiro " +inteiro+ " é menor que o número real " +real+ "!");

    }
}




