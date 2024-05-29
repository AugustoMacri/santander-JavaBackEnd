public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("Salgadinho", 3.90, 5);
        carrinhoDeCompra.adicionarItem("Salgadinho", 10.0, 1);
        carrinhoDeCompra.adicionarItem("Leite", 3.90, 3);
        System.out.println(carrinhoDeCompra.calcularValorTotal());
        carrinhoDeCompra.exibirItens();

        System.out.println("Após remover o salgadinho temos:");
        carrinhoDeCompra.removerItem("Salgadinho");
        System.out.println(carrinhoDeCompra.calcularValorTotal());
        carrinhoDeCompra.exibirItens();

    }
}
