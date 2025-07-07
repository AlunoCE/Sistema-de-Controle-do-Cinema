public class Filme {
    private String titulo;
    private int duracaoMinutos;
    private String classificacao;

    public Filme(String titulo, int duracaoMinutos, String classificacao) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracaoMinutos;
    }

    public String getClassificacao() {
        return classificacao;
    } 
}