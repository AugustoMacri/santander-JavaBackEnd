package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired //Entende que quando o container já for inicializado, já tinha um component calculadora, mas o component myApp precisou do Autowired realizar a injeção de dependências
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Resultado: " + calculadora.somar(2, 2));

    }
}
