import javax.swing.*;

public class Modulo{
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog
        ("Insira um número:"));
        int i = 1;
        int soma = 0;
        while(i<=n){
            soma = (i%2==0? soma+i : 0);
            i = i+1;
        }
        JOptionPane.showMessageDialog(null, soma);
    
    
    }
}