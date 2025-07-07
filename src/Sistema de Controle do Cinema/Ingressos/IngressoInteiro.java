public class IngressoInteiro extends Ingresso {

    public IngressoInteiro(Sessao sessao) {
        super(sessao);
    }

    public double calcularPreco() {
        return 20.0;
    }

    public String getTipo() {
        return "Inteira";
    }
}