import javax.swing.JOptionPane;

public class gptmerda {
    public static void main(String[] args) {
        // Pedir ao usuário para inserir o número inteiro de quatro dígitos
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro de quatro dígitos: "));
        
        // Extrair os dígitos do número
        int primeiroDigito = numero / 1000; // Obtém o primeiro dígito
        int segundoDigito = (numero / 100) % 10; // Obtém o segundo dígito
        int terceiroDigito = (numero / 10) % 10; // Obtém o terceiro dígito
        int quartoDigito = numero % 10; // Obtém o quarto dígito

        // Verificar se é uma senha válida
        if ((primeiroDigito == 8 || primeiroDigito == 5) &&
            (quartoDigito == 5 || quartoDigito == 1) &&
            ((quartoDigito == 5 && segundoDigito + terceiroDigito == 3) ||
             (quartoDigito == 1 && segundoDigito + terceiroDigito == 0))) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é uma senha válida.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é uma senha válida.");
        }
    }
}
