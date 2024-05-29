public class App {
    public static void main(String[] args) throws Exception {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome", 10, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome2", 20, 1.60);
        ordenacaoPessoa.adicionarPessoa("Nome3", 30, 1.90);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }
}
