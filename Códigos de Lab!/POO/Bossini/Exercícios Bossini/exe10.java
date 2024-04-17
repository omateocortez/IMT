import javax.swing.JOptionPane;

public class exe10 {
    public static void main(String[] args) {
        
        int opcao;

        opcao = 
        Integer.parseInt(JOptionPane.showInputDialog
        ("Escolha uma das opçoes:\n1 - Misto quente R$5,50\n2 - Salada Chinesa R$10,20\n3 - Suco de Laranja R$4,00\n4 - Suco de Manga R$3,50"));


        String mensagem;

        switch (opcao) {
            case 1:
            mensagem = "Bom apetite! Vai lhe custar R$5,50!";
            break;

            case 2:
            mensagem = "Bom apetite! Vai lhe custar R$10,20!";
            break;

            case 3:
            mensagem = "Tenha um excelente drink! Vai lhe custar R$4,00!";
            break;

            case 4:
            mensagem = "Tenha um excelente drink! Vai lhe custar R$3,50!";
            break;

            default:
            mensagem = "\n\n                (Erro)";
            break;
        }

        JOptionPane.showMessageDialog(null, "Você escolheu a opção " +opcao+ ". " +mensagem);

    }
}
