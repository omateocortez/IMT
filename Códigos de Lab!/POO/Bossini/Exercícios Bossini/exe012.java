import javax.swing.JOptionPane;

public class exe012 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int senha;
        int primeiroDigito, segundoDigito, terceiroDigito, quartoDigito;

        senha = 
        Integer.parseInt(JOptionPane.showInputDialog("Insira uma senha de 4 dígitos: "));

        primeiroDigito = (senha/1000);
        segundoDigito = (senha/100) % 10;
        terceiroDigito = (senha/10) % 10;
        quartoDigito = (senha % 10);
        
        if ((primeiroDigito == 8 || primeiroDigito == 5) &&
            (quartoDigito == 5 || quartoDigito == 1) &&
            ((quartoDigito == 5 && (segundoDigito + terceiroDigito ==3)) ||
            (quartoDigito == 1 && segundoDigito + terceiroDigito == 1))) 
            JOptionPane.showMessageDialog(null, "Sua senha (" +senha+ ") é válida!");

         else  
            JOptionPane.showMessageDialog(null, "Senha inválida.");
        
    }
}


