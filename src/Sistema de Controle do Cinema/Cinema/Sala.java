public class Sala {
    private int numero;
    private int capacidade;
    private int sessoesAtivas;

    public Sala (int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.sessoesAtivas = 0;
    }

    public void adicionarSessao() {
        sessoesAtivas++;
    }

    public void removerSessao() {
        if (sessoesAtivas > 0) {
            sessoesAtivas--;
        }
    }

    public int getSessoesAtivas() {
        return sessoesAtivas;
    }

    public boolean podeSerRemovida() {
        return sessoesAtivas == 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }
}