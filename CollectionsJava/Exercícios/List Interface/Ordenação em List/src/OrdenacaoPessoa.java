import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa{
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoa() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, Double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> idadeOrdenada = new ArrayList<>(listaPessoa); //Cria um novo array com as informações da outra lista já criada
        Collections.sort(idadeOrdenada);
        return idadeOrdenada;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> alturaOrdenada = new ArrayList<>(listaPessoa); //Cria um novo array com as informações da outra lista já criada
        Collections.sort(alturaOrdenada, new ComparatorPorAltura());
        return alturaOrdenada;
    }

    
}