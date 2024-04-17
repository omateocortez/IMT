// import javax.swing.*;

import javax.swing.JOptionPane;

public class IfComposto{
    public static void main(String[] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
        if (nota>100)
            JOptionPane.showMessageDialog(null, "Valor inválido.\nTente novamente");
        else if (nota >= 90){
            JOptionPane.showMessageDialog(null, "Parabéns!");
            JOptionPane.showMessageDialog(null, "Conceito A.");
        }
        else if(nota >= 80){ // entra no ElseIf se a nota estiver entre 80 e 89
            JOptionPane.showMessageDialog(null, "Muito bem!");
            JOptionPane.showMessageDialog(null, "Conceito B.");
        }
        else if (nota >= 70){ // entra no ElseIf se a nota for entre 70 e 79 
            JOptionPane.showMessageDialog(null, "Ufa!");
            JOptionPane.showMessageDialog(null, "Conceito C.");
        }
        else { // caso nenhuma das outras se adequarem
            JOptionPane.showMessageDialog(null, "Reprovado.");
        }
    }
}

