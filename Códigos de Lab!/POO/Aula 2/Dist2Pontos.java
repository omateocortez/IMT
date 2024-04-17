//importar o javax.swing.JOptionPane
import java.util.Scanner;

public class Dist2Pontos{
    //indentação (indent)
    static public void main(String args []){
        try (//declaracao de varieveis
        Scanner leitor = new Scanner(System.in)) {
            //float: 4 bytes, double: 8 bytes
            double x1, x2, y1, y2; //variaveis de entrada
            double distancia; //variavel de saida
            //entrada
            System.out.println("Digite x1: ");
            x1 = leitor.nextFloat();
            System.out.println("Digite x2: ");
            x2 = leitor.nextFloat();
            System.out.println("Digite y1: ");
            y1 = leitor.nextFloat();
            System.out.println("Digite y2: ");
            y2 = leitor.nextFloat();
            //processamento
            distancia = Math.sqrt((x2 - x1) * (x2 - x1) + Math.pow(y2 - y1, 2));

            //saida

            System.out.printf(
                "A distancia entre p1(%.2f, %f) e p2(%f, %f) é de: %f",
                x1, y1, x2, y2, distancia
            );
        }
    }
}