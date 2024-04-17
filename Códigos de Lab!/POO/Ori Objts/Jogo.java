public class Jogo {
    public static void main(String[] args) throws InterruptedException {
    //    constroi um novo objeto de uma classe (Personagem)
        Personagem personagem = new Personagem(null, 0, 0, 0);
        personagem.nome = "Pedro";
        
        while (true){

    
        personagem.cacar();
        personagem.comer();
        personagem.dormir();
        personagem.cacar();    
        personagem.cacar();
        personagem.cacar();
        System.out.println("===================================");
        Thread.sleep(5000);

        }
    }
}
