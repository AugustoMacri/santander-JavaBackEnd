import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos{
    private Set<Produto> listaProdutos;

    public CadastroProdutos() {
        this.listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        listaProdutos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(listaProdutos);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        listaProdutos.addAll(listaProdutos);
        return produtoPorPreco;
    }


    
}
