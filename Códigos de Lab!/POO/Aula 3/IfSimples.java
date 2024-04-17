// import javax.swing.*;

import javax.swing.JOptionPane;

public class IfSimples {
    public static void main(String[] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
        if (nota >= 70){
            JOptionPane.showMessageDialog(null, "Aprovado! Lesgooooo");
        }else{JOptionPane.showMessageDialog(null, "Reprovado seu otário!");
        }
    }
}