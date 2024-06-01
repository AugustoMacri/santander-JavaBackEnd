/*
* O objeivo dessa classe Optional no Java é fornecer uma abordagem mais segura  e expressiva para tratar casos em que um valor pode ser ausente(null);
* É comum quando se trabalha com referências nulas;
* Optional permite encapsular um valor que pode ser nulo dentro de um Objeto Optional. Isso indica explicitamente que o valor pode ou não estar presente
* e requer que o código que deseja acessá-lo faça uma verificação.
*/

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalTeste {
    public static void main(String[] args) {
        // of(value): Cria um Optional contendo o valor fornecido. Se for nulo, lançará
        // uma exceção NullPOintet
        Optional<String> optional = Optional.of("Hello");
        System.out.println(optional.get());
    }

}
