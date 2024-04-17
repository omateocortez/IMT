
public class podeDirigir {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // fully qualy name
        // int a;
        // a = 2;
        // double d;
        // d = 2.5;
        // s = "abc";
        // seila = new Scanner(System.in);
// operador de inferencia de tipo (somente a partir da versão)
        // feito pelo compilador
        
        var leitor  = new java.util.Scanner(System.in);
        // var a = 2;
        // var s = "abc";
        // var d;
        System.out.println("Sua idade: ");
        var idade = leitor.nextShort();
        if (idade >= 18)
            System.out.println("Pode dirigir!\n\n\n");
        else
            System.out.println("Não pode dirigir!\n\n\n");
        
        System.out.println(idade >= 18 ? "Pode dirigir!" : "Não pode dirgir!");

    }
}





