package set.contato;

public class Main {

    public static void main(String[] args) {
        var agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Kevin", 123456);
        agendaContatos.adicionarContato("Kevin Avanade", 123456);
        agendaContatos.adicionarContato("Kevin Trabalho", 222222);
        agendaContatos.adicionarContato("Joana", 678910);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Kevin"));

        agendaContatos.atualizarNumeroContato("Kevin Avanade", 654321);

        agendaContatos.exibirContatos();
    }
}
