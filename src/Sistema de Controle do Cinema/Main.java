public class Main {
    public static void main(String[] args) {
        
        CinemaImpl cinemao = new CinemaImpl("Cinemao", "Av. São Pedro");

        Filme volta = new Filme("De Volta à Ação", 150, "14+");
        Sala sala3 = new Sala(3, 2); 
        Sessao sessaoVolta = new Sessao(volta, sala3, "25/12/2025 20:00", 0);

        Funcionario funcionario1 = new Funcionario("Kaique Silva", "878.453.261-00");
        Cliente daniel = new Cliente("Daniel Santos", "123.456.789-00");
        Cliente jubileu = new Cliente("Jubileu Silva", "987.654.321-00");
        Cliente carlos = new Cliente("Carlos", "111.222.333-44");

        cinemao.adicionarSala(sala3);
        cinemao.programarSessao(volta, sala3, sessaoVolta);

        System.out.println("\n===== VENDAS PARA 'DE VOLTA À AÇÃO' =====");
        funcionario1.venderIngresso(daniel, sessaoVolta, 0); 
        funcionario1.venderIngresso(jubileu, sessaoVolta, 1); 
        funcionario1.venderIngresso(carlos, sessaoVolta, 0);  
        /*
        Filme invencivel = new Filme("Invencível", 109, "12+");
        Sala sala5 = new Sala(5, 5);  
        Sessao sessaoInvencivel = new Sessao(invencivel, sala5, "21/02/2025 21:00", 0);

        Funcionario funcionario2 = new Funcionario("Henrique Santos", "989.745.643-22");
        Cliente sandra = new Cliente("Sandra Oliveira", "444.555.333-22");

        cinemao.adicionarSala(sala5);
        cinemao.programarSessao(invencivel, sala5, sessaoInvencivel);

        System.out.println("\n===== VENDAS PARA 'INVENCÍVEL' =====");
        funcionario2.venderIngresso(sandra, sessaoInvencivel, 0); 
        */
        
        System.out.println("\n===== RESUMO DA SESSÃO =====");
        
        System.out.println(sessaoVolta);
        System.out.println("Capacidade da sala: " + sessaoVolta.getSala().getCapacidade());
        System.out.println("Ingressos vendidos: " + sessaoVolta.getIngressosVendidos());
        System.out.println("--------------------------------------");

        /*
        System.out.println(sessaoInvencivel);
        System.out.println("Capacidade da sala: " + sessaoInvencivel.getSala().getCapacidade());
        System.out.println("Ingressos vendidos: " + sessaoInvencivel.getIngressosVendidos());
        System.out.println("--------------------------------------");
        */
        //sala3.removerSessao();
        cinemao.removerSala(sala3);
        //cinemao.removerSala(sala5);
    }
}
