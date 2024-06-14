import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AssertionsTest {

    @Test
    void validarLancamento(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
                int[] segundoLancamento = {-1, 5, 2, 3, 10};

                Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());

        Assertions.assertNotNull(pessoa);

    }

    @Test
    void validarNumerosTiposDiferentes(){
        double valor = 5.0;
        double valor2 = 5.0;

        Assertions.assertEquals(valor, valor2);
    }
}
