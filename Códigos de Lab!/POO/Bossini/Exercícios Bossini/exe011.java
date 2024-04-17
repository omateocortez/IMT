import javax.swing.JOptionPane;

public class exe011 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        int codigoEstado;
        double cargaInicial;

        codigoEstado = 
        Integer.parseInt(JOptionPane.showInputDialog("Insiria seu código de estado (1 à 5): "));

        cargaInicial = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira o valor inicial da sua carga: "));


        String erro;
        double cargaFinal;
        cargaFinal = 0;

        switch (codigoEstado) {

            case 2:
            case 5:
            cargaFinal = cargaInicial - (cargaInicial*0.12);
            break;

            case 1:
            case 3:
            case 4:
            cargaFinal = cargaInicial - (cargaInicial*0.15);

            default:
            erro = "Sua carga ou código são inválidos. Tente novamente.";
            break;
        }

        JOptionPane.showMessageDialog(null, 
        "O valor final da sua carga para o código de estado " +codigoEstado+ " é: " +cargaFinal);

    }
}


