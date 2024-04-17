public class Personagem{
        
    // atributos ou caracteristicas sobre a classe que a gente tem que guardar
   
    String nome;
    int energia, fome, sono;
   
   
    public Personagem (String string, int energia, int fome, int sono){
        if (energia >= 0 && energia <= 10)
        this.energia = energia;
        if (fome >= 0 && fome <= 10)
        this.fome = fome;
        if (sono >= 0 && sono <= 10)
        this.sono = sono;
        }

    //  get  = retorna o valor atual dos atributos
    
    //set = recebe um valor por paramtro e atualiza o valor do atributo
    
    
    // metodos ou comportamentos que a classe realiza
    public void cacar(){
        if (energia >= 2){
            System.out.println(nome + " esta caçando.");
            energia -= 2; //energia - 2
        }else{ //enertgia < 2
            System.out.println(nome + " esta sem energia suficiente para caçar.");
        }
        fome = Math.min(fome+1,10);
        sono = Math.min(sono+1,10);
    }
    
    
    public void comer(){
        if (fome >= 1){
            System.out.println(nome + " esta comendo.");
            energia = Math.min(fome+1,10);
            fome = fome - 1;
        }else{ //fome < 1
            System.out.println(nome + " está satisfeito.");
        }
    }
    
    public void dormir(){
        if (sono >= 1){
            System.out.println(nome + " está dormindo.");
            sono = sono -1;
            energia = Math.min(energia+1,10);
        }else{ //sono < 1
            System.out.println(nome + ", você já descansou.");
        }        
    }
        
public int getEnergia(){
    return energia;
        }

public void setEnergia (int novaEnergia){
    energia = novaEnergia;  
        }

public String toString(){
    return String.format(("Nome: s%\nEnergia:%d\nFome:%d\nSono:%d"), nome, energia, fome, sono);
}
        
}