import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {
    @BeforeAll
    static void configuraConexao(){
        BancoDados.iniciarConexao();
        System.out.println("rodou configuraConexao");
    }

    @BeforeEach
    void insereDados(){
        BancoDados.insereDados(new Pessoa("nome", LocalDate.of(2000, 1, 1)));
    }

    @AfterEach
    void removeDados(){
        BancoDados.removeDados(new Pessoa("nome", LocalDate.of(2000, 1, 1)));
    }

    @Test
    void validarDados(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDados.finalizarConexao();
        System.out.println("rodou finalizar");
    }

}
