import javax.swing.JOptionPane;

public class exe09 {
    public static void main(String[] args) {
        double p1, p2, media;

        p1 = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da sua P1: "));

        p2 = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da sua P2: "));

        media = (p1+p2)/2;

        if (media >= 9 && media <=10)
        JOptionPane.showMessageDialog(null, "Parabéns! Continue assim!\nMédia final: " +media);

        else if (media >= 7)
        JOptionPane.showMessageDialog(null, "Aprovado.\nMédia final: " +media);

        else if (media >= 6)
        JOptionPane.showMessageDialog(null,"Aprovado no limite, estude um pouco mais!\nMédia final: " +media);

        else if (media >= 2)
        JOptionPane.showMessageDialog(null, "Não está aprovado mas ainda pode fazer a segunda época.\nMédia final: " +media);

        else if (media <= 2)
        JOptionPane.showMessageDialog(null, "Reprovado.\nMédia final: " +media);

        else
        JOptionPane.showMessageDialog(null, "Valor não reconhecido, tente novamente.\nMédia calculada" +media);

    }
}
