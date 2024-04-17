import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Byte.parseByte;
import static java.lang.Short.parseShort;
import static java.lang.Long.parseLong;
import static java.lang.String.format;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class CompraRoupas{
    public static void main(String[] args) {
        double valorPeca;
        byte opcaoUsuario;
        double taxado;


        valorPeca = 
        Double.parseDouble(showInputDialog("Digite o valor da peça: "));
        
        taxado = valorPeca*1.1;

        opcaoUsuario = 
        Byte.parseByte((showInputDialog("0-A vista\n1-Cartão\n2-Crediário")));

        switch (opcaoUsuario) {
            case 0:{
            double desconto = (valorPeca - (valorPeca * 0.1));
            String exibirD;


            exibirD = format("Valor da peça com desconto e total a pagar: " + desconto);
            showMessageDialog(null, exibirD );            
                break;
            }
        
            case 1:{
            short numeroParcelas = 
            parseShort(showInputDialog("Número de parcelas: "));
            String exibir = format("Valor de cada parcela R$%f", valorPeca/numeroParcelas);
            showMessageDialog(null, exibir);
            break;
        }

            case 2:{ 
            long numeroParcelas = parseLong(showInputDialog("Número de parcelas:"));

            String exibir = format("Valor total: R$%f. \nValor da parcela: R$%f.", taxado, taxado/numeroParcelas);
            
            showMessageDialog(null, exibir);
                break;
        }

        
            default:
            showMessageDialog(null, "Opção inválida");    
            break;
            }
        }
    }














