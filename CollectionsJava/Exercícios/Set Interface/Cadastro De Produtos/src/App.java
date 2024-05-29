public class App {
    public static void main(String[] args) throws Exception {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1234, "prod1", 1, 1);
        cadastroProdutos.adicionarProduto(2345, "prod2", 2, 2);
        cadastroProdutos.adicionarProduto(3455, "prod3", 3, 3);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}
