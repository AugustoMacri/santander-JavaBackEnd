
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validaCalculoIdade(){
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2022, 1, 1));
        int idade = pessoa.getIdade();
        Assertions.assertEquals(2, idade);
    }
}
