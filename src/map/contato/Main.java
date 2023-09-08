package map.contato;

public class Main {
    public static void main(String[] args) {

        var agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Kevin", 123456);
        agendaContatos.adicionarContato("Maria", 654321);
        agendaContatos.adicionarContato("Pedro", 678910);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Pedro");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Kevin"));
    }
}
