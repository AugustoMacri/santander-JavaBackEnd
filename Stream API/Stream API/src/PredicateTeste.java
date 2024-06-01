/*
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
 * Comumente usado para filtrar os elementos do Stream com base em alguma condição
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTeste {
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("java", "python", "c");

        //Verificando se a palavra tem mais de 5 letras
        Predicate<String> mais5 = palavra -> palavra.length() > 5;

        //Usar Stream para filtrar as palavras com mais de 5 e impprimir
        palavras.stream()
        .filter(mais5)
        .forEach(System.out::println);
    }
}
