/*
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetod de um determinado tipo.
 */
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierTeste {
  public static void main(String[] args) {
   //Supplier<String> ola = () -> "Ola";
  
    //Usando o Supplier para obter uma lista com 5 mensagens
    List<String> listaOla = Stream.generate(() -> "Ola")
        .limit(5)
        .collect(Collectors.toList());

    listaOla.forEach(System.out::println); 
  }
}
