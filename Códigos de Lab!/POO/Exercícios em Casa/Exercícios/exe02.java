package Exercícios;

import javax.swing.JOptionPane;
import java.lang.Math;
public class exe02{
    public static void main(String[] args){
        double a, b, c;
        double x1;
        double x2;
        double deltaCalc;

        a = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira seu termo a:"));
        
        b = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira seu termo b: "));

        c = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira seu termo c: "));

        deltaCalc = 
        (Math.pow(b, 2)) + (4*a*c); 
        
        String deltaTxt;
        deltaTxt = "O seu delta de acordo com a conta " + b + "^2 - 4*" +a+ "*" +c+ " é igual a: " + deltaCalc;

        JOptionPane.showMessageDialog(null, deltaTxt);

        x1 = 
        (-b + (Math.sqrt(deltaCalc)))/(2*a);
        x2 = 
        (-b - (Math.sqrt(deltaCalc)))/(2*a);

        JOptionPane.showMessageDialog(null, "Logo suas raizes são: x1 = " +x1+ " e x2 = " +x2);

    }
}