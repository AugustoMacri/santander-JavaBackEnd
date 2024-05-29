public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("nome", 1);
        agendaContatos.adicionarContato("nome2", 2);
        agendaContatos.adicionarContato("nome3", 3);
        agendaContatos.adicionarContato("nome4", 4);
        agendaContatos.adicionarContato("nome5", 5);

        // agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarContatos("nome2"));

        agendaContatos.atualizarNumeroContato("nome2", 1234567);

        System.out.println(agendaContatos.pesquisarContatos("nome2"));

    }
}
