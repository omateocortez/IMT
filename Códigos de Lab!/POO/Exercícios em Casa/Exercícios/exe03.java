package Exercícios;
import javax.swing.JOptionPane;

public class exe03 {
    public static void main(String[] args) {
        double x, y, z;
        
        x = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira seu 1º número"));
        
        y =
        Double.parseDouble(JOptionPane.showInputDialog("Insira seu 2º número"));
        
        z =
        Double.parseDouble(JOptionPane.showInputDialog("Insira seu 3º número"));

        String eMaior = "";
        if (x > y && x > z)
            eMaior = "Seu 1º número é o maior! X = " + x;
        else if (y > x && y > z)
            eMaior = "Seu 2º número é o maior! X = " + y;
        else if (z > x && z > y)
            eMaior = "Seu 3º número é o maior! X = " + z;

    JOptionPane.showMessageDialog(null, eMaior);
   
    }
}
