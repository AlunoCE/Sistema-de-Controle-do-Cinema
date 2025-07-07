public abstract class Ingresso {
    protected Sessao sessao;
    public abstract double calcularPreco();
    public abstract String getTipo();

    public Ingresso(Sessao sessao) {
        this.sessao = sessao;
    }

    public Sessao getSessao() {
        return sessao;
    }
}