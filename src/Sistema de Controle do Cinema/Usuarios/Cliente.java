public class Cliente {
    private String nome;
    private String cpf;

    public Cliente (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public boolean comprarIngresso(Sessao sessao, int tipoIngresso) {
        if (sessao == null) {
            System.out.println("Sessão Inválida!");
            return false;
        }
        return sessao.venderIngresso(this, tipoIngresso);
    }
}