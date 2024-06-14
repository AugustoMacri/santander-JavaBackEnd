import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    @Test
    void validarCenario(){
        Conta origem = new Conta(1234);
        Conta destino = new Conta(23456);

        TransferenciaContas transferenciaContas = new TransferenciaContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaContas.transfere(origem, destino, -1));
    }
}
