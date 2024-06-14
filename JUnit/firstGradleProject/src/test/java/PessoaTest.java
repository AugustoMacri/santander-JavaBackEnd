
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void calcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(24, pessoa.getIdade());
    }

    @Test
    void maiorDeIdade(){
        Pessoa pessoa2 = new Pessoa("Marcos", LocalDate.of(2006, 1, 1));
        Assertions.assertTrue(pessoa2.ehMaiorDeIdade());

        Pessoa pessoa3 = new Pessoa("Marcos", LocalDate.of(2016, 1, 1));
        Assertions.assertFalse(pessoa3.ehMaiorDeIdade());
    }
}
