public class CinemaImpl implements Cinema {
    private String nome;
    private String endereco;

    public CinemaImpl(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void adicionarSala(Sala sala) {
        System.out.println("Sala " + sala.getNumero() + " adicionada no cinema " + nome + "\n");
    }

    public void removerSala(Sala sala) {
        if (sala.podeSerRemovida()) {
        System.out.println("\nSala " + sala.getNumero() + " removida no cinema " + nome);
    } else {
        System.out.println("\nNão foi possível a sala " + sala.getNumero() + " pois tem " + sala.getSessoesAtivas() + " sessão ativa!");
    }
}

    public void programarSessao(Filme filme, Sala sala, Sessao sessao) {
        sala.adicionarSessao();
        System.out.println("Sessão do Filme: " + filme.getTitulo() + " \nSala: " + sala.getNumero() + " \nHorário: " + sessao.getDataEHoraLocal());
    }
}
