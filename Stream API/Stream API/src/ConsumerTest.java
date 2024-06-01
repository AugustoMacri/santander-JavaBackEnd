/*
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizado principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou retornar um valor.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Consumer Com expressão Lambda para imprimir os números
        Consumer<Integer> imprimirPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //Mas também da para fazer desse jeito
        System.out.println("Pares:");
        numeros.forEach(n -> {
            if(n %2 == 0){
                System.out.println(n);
            }
        });

        System.out.println("Ímpares:");
        numeros.forEach(n -> {
            if(n %2 == 1){
                System.out.println(n);
            }
        });

    }

}
