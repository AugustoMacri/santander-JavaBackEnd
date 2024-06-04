/*
* Descrição
* Você está aprimorando o programa anterior e agora deseja utilizar a Stream API do Java para processar as transações bancárias de forma mais eficiente.

* Entrada
* O programa solicitará ao usuário que informe o saldo inicial da conta.
* Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.
* 
* Entrada de Transações:
* Para cada transação, o programa solicitará ao usuário:
* O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
* O valor da transação.
* 
* Saída
* Utilizando a Stream API, o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
* Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (tipoTransacao == 'd') {
                saldo += valorTransacao;
                transacao.setTipo(tipoTransacao);
                transacao.setValor(valorTransacao);
                transacoes.add(transacao);

            } else if (tipoTransacao == 's') {
                saldo -= valorTransacao;
                transacoes.add(transacao);
                transacao.setTipo(tipoTransacao);
                transacao.setValor(valorTransacao);

            }
        }

        System.out.println("\nSaldo : " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
