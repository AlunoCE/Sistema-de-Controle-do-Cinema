public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Ingresso venderIngresso(Cliente cliente, Sessao sessao, int tipoIngresso) {
        if (tipoIngresso != 0 && tipoIngresso != 1) {
            System.out.println("Tipo de ingresso inválido! " + cliente.getNome() + " precisa escolher Ingresso 0 ou 1.");
            return null;
        }
        
        if (sessao.venderIngresso(cliente, tipoIngresso)) {
            Ingresso ingresso;
            if (tipoIngresso == 0) {
                ingresso = new IngressoInteiro(sessao);
            } else {
                ingresso = new IngressoMeia(sessao);
            }
            System.out.println("\n---------------COMPROVANTE----------------");
            System.out.println("Funcionário: " + nome + " (CPF: " + cpf + ")");
            System.out.println("Cliente: " + cliente.getNome() + " (CPF: " + cliente.getCPF() + ")");
            System.out.println("Filme: " + sessao.getFilme().getTitulo());
            System.out.println("Valor vendido: " + ingresso.calcularPreco() + ", do tipo " + ingresso.getTipo()); 
            return ingresso;
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }
}
