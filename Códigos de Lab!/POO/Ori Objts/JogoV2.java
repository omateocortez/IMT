
import java.util.*;
import javax.swing.*;


public class JogoV2{
    public static void main (String[] args) throws Exception {
        var personagem = new Personagem("Pedro", 10, 5, 4);
        personagem.nome = "Pedro";
        var gerador = new Random();
        // 1 ou 2: cacar
        // 3: comer
        // 4 dormir
        int oQueFazer = 1 + gerador.nextInt(4);
        while (true){ // segue em lógica de queda (fall-through)
            switch (oQueFazer){
                default:
                    personagem.cacar();
                    break;
                case 3:
                    personagem.comer();
                    break;
                case 4 :
                    personagem.dormir();
                    break;
            }
            System.out.println(personagem);
            System.out.println("***********************");
            Thread.sleep(5000);

        }
    }
}