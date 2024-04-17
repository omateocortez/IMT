
import javax.swing.*
;

public class exe08 {
    public static void main(String[] args) {
        
        double altura, peso, imc;
        
        peso = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso em quilos: "));
        
        altura = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura em metros: "));
        
        
        imc = peso/(altura*altura);
        String imcFomat = String.format("%.2f", imc);
        
        int tipoImc;

        if (imc < 18.5)
            tipoImc = 0;

        else if (imc > 18.5 && imc < 24.9)
            tipoImc = 1;

        else if (imc >= 25 && imc < 29.9)
            tipoImc = 2;

        else if (imc >= 30 && imc < 34.9)
            tipoImc = 3;

        else if (imc >= 35 && imc < 39.9)
            tipoImc = 4;

        else
            tipoImc = 5;

        String mensagem; 
        switch (tipoImc) {
            case 0:
            mensagem = "abaixo do peso ideal.";
            break;

            case 1:
            mensagem = "peso ideal, muito bem!";
            break;

            case 2:
            mensagem = "Sobrepeso, um regime leve deve pode ajudar.";
            break;

            case 3:
            mensagem = "Obesidade leve.";
            break;

            case 4:
            mensagem = "Obesidade moderada.";
            break;


            case 5:
            mensagem = "Obesidade mórbida.";
            break;

            default:
            mensagem = "Categoria de IMC não reconhecida";
        }

        JOptionPane.showMessageDialog(null, "Seu IMC é " +imcFomat+
         " e seu peso está na classe considerada " + mensagem);
        
    }
}
