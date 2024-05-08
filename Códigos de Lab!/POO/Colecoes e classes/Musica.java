public class Musica {
    private String titulo;
    private int avaliacao;

    public Musica(String titulo){
        this.titulo = titulo;
    }

    // retorna o vlaor de um atributo
    public String getTitulo(){
        return titulo;
    }

    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;   
    }

    @Override
    public int compareTo(Musica m) {
        if (this.avaliacao < m.avaliacao) return -1;
        if (this.avaliacao > m.avaliacao) return 1;
    return 0;
    }

    @Override 
    public String toString() {
        return String.format("Título: %s, Nota: %d\n", this.titulo, this.avaliacao);
    }
}