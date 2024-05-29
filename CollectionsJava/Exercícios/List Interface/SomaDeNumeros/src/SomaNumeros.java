import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int val=0;
        for(int i : listaNumeros){
            val+=i;
        }

        return val;
    }

    public int encontrarMaiorNumero(){
        int maior=Integer.MIN_VALUE;
        for(int i : listaNumeros){
            if(i>maior){
                maior = i;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for(int i : listaNumeros){
            if(i<menor){
                menor = i;
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(this.listaNumeros);

    }
}
