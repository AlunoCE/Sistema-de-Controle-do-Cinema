public class Sessao {
    private Filme filme;
    private Sala sala;
    private String dataEhoraLocal;
    private int ingressosVendidos;

    public Sessao (Filme filme, Sala sala, String dataEhoraLocal, int ingressosVendidos) {
        this.filme = filme;
        this.sala = sala;
        this.dataEhoraLocal = dataEhoraLocal;
        this.ingressosVendidos = ingressosVendidos;
    }

    public Filme getFilme() {
        return filme;
    }

    public Sala getSala() {
        return sala;
    }

    public String getDataEHoraLocal() {
        return dataEhoraLocal;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public boolean venderIngresso(Cliente cliente, int tipoIngresso) {
        if (ingressosDisponiveis() > 0) {
            ingressosVendidos++;
            return true;
        }
        System.out.println("\n----------------ALERTA----------------");
        System.out.println("Capacidade esgotada para " + cliente.getNome() + ". O cliente não conseguiu comprar ingresso para " + filme.getTitulo());
        System.out.println("\n");
        return false;
    }
            
    public int ingressosDisponiveis() {
        return sala.getCapacidade() - ingressosVendidos;
    }

    public String toString() {
        return "Sessão: " + filme.getTitulo() + " | Sala: " + sala.getNumero() + " | Horário: " + dataEhoraLocal;
    }
}