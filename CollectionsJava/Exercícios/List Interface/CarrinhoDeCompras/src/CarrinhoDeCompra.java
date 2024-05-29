import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra{
    private List<Item> carrinhoItems;

    public CarrinhoDeCompra(){
        this.carrinhoItems = new ArrayList<>();
    }

    //Método para adicionar novos itens ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoItems.add(new Item(nome, preco, quantidade));
    }

    //Método para remover itens do carrinho
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i: carrinhoItems){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinhoItems.removeAll(itensParaRemover);
    }

    //Método para somar o preco dos itens do carrinho
    public Double calcularValorTotal(){
        Double val = 0.0;
        for(Item i : carrinhoItems){
            val += (i.getPreco() * i.getQuantidade());
        }

        return val;
    }

    public void exibirItens(){
        for(Item i : carrinhoItems){
            System.out.println(i.getNome());
        }
    }

}