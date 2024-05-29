public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 3);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 4);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 5);
        conjuntoConvidados.adicionarConvidado("Convidado 6", 4); // Não vai contar por conta do hashcode

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);

        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();

    }
}
