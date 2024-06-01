/*
* Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
* É utilizado para transformar ou mapear(map) os elemenos do Stream em outros valores ou tipos
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTeste {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Usando function com lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n*2)
        .collect(Collectors.toList());


        numerosDobrados.forEach(System.out::println);
        
    }
    
}
