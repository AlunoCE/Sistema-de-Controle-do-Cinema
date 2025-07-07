public interface Cinema {

    String getNome();
    String getEndereco();
    public void adicionarSala(Sala sala);
    public void removerSala(Sala sala);
    public void programarSessao(Filme filme, Sala sala, Sessao sessao);
}