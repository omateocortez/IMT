import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JOptionPane;


public class ListaDeMusicas {
    public static void main(String[] args) {
        List <Musica> musicas  = new ArrayList<>();
        int opcao;        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("0-Sair\n1-Inserir música\n2-Avaliar música\n3-Listar músicas"));
            switch (opcao){
                case 0:
                JOptionPane.showMessageDialog(null,"Até mais!");
                break;

            
                case 1:
                String inserirMusica = JOptionPane.showInputDialog("Qual o nome da música?");
                    musicas.add(new Musica(inserirMusica));
                    JOptionPane.showMessageDialog(null,"Música inserida com sucesso!");
                break;

                case 2:
                String avaliarMusica = JOptionPane.showInputDialog("Qual música deseja avaliar?");
                int nota = Integer.parseInt(JOptionPane.showInputDialog("Qual a nota?"));

                for (int i = 0; i<musicas.size(); i++){
                    if(musicas.get(i).getTitulo().equals(avaliarMusica)){
                        musicas.get(i).setAvaliacao(nota);
                        break;
                    }
                }
                break;

                case 3:
                    Collections.sort(musicas,Collections.reverseOrder());
                    JOptionPane.showMessageDialog(null, musicas);
                break;


                
                default:
                JOptionPane.showMessageDialog(null,"Opcão inválida.");


            }
            
//repetir
        }while(opcao!=0);
    }
}
