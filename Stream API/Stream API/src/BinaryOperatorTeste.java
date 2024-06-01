/*
* Representa uma operação que combina dois argumentos do tipo T e retorna do mesmo tipo T.
* É usada para realizar operações de redução em pares de elementos, como somar numeros ou combinar objetos
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class BinaryOperatorTeste {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //Usando o BinaryOperator para somar todos os numeros no Stream
        int resultado = numeros.stream()
        .reduce(0, somar); //O primeiro argumento é uma variavel temporaria, que vai somar com esse 0

        System.out.println(resultado);
    }
}
