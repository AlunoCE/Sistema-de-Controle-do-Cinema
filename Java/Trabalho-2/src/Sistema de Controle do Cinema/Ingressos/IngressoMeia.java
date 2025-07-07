public class IngressoMeia extends Ingresso {

    public IngressoMeia(Sessao sessao) {
        super(sessao);
    }

    public double calcularPreco() {
        return 10.0;
    }

    public String getTipo() {
        return "Meia";
    }
}