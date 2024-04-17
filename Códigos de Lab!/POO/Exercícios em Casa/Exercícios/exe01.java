package Exercícios;
import javax.swing.JOptionPane;
public class exe01 {
    public static void main(String[] args){
    double x;
        x =
        Double.parseDouble(JOptionPane.showInputDialog("Insira um número para checar se o mesmo é positivo ou negativo: "));
        
        String resultado;
        if (x >  0)
            resultado = "Seu número (" +x+ ") é positivo!";
        else if (x == 0)
            resultado = "Seu número (" +x+ ") é neutro!";
        else
        resultado = "Seu número (" +x+ ") é negativo!";
        
    JOptionPane.showMessageDialog(null, resultado);
    }
}
