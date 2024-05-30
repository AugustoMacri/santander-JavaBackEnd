public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("nome1", 1234);
        agendaContatos.adicionarContato("nome1", 2345);
        agendaContatos.adicionarContato("nome2", 45678);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("nome2");

        agendaContatos.exibirContatos();

    }
}
