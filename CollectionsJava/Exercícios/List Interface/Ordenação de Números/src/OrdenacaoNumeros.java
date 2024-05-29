import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numeroLista;

    public OrdenacaoNumeros() {
        this.numeroLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroLista.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenadaAsc = new ArrayList<>(this.numeroLista);
        Collections.sort(listaOrdenadaAsc);

        return listaOrdenadaAsc;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenadaAsc = new ArrayList<>(this.numeroLista);
        listaOrdenadaAsc.sort(Collections.reverseOrder());

        return listaOrdenadaAsc;
    }

    public void exibirNum(){
        System.out.println(this.numeroLista);
    }

    
}
