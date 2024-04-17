package Exercícios;
import javax.swing.JOptionPane;
public class exe05 {
    public static void main(String[] args) {

        String nomeM;
        int mes;

        mes = 
        Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número de 1 à 12: "));

        switch (mes) {
            case 1:
                nomeM = "Janeiro";
                break;
            case 2:
                nomeM = "Fevereiro";
                break;
            case 3:
                nomeM = "Março";
                break;
            case 4:
                nomeM = "Abril";
                break;
            case 5:
                nomeM = "Maio";
                break;
            case 6:
                nomeM = "Junho";
                break;
            case 7:
                nomeM = "Julho";
                break;
            case 8:
                nomeM = "Agosto";
                break;
            case 9:
                nomeM = "Setembro";
                break;
            case 10:
                nomeM = "Outubro";
                break;
            case 11:
                nomeM = "Novembro";
                break;
            case 12:
                nomeM = "Dezembro";
                break;
            default:
            nomeM = "Número inválido, tente novamente.";
                break;
        }

        JOptionPane.showMessageDialog(null, "O mês que corresponde ao número " +mes+ " é: " +nomeM);

    }
}
