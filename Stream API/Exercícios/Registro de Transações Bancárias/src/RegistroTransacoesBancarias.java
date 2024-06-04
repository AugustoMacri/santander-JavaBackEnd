
/*
* Descrição
* Você está desenvolvendo um programa simples em Java para manter um registro de transações bancárias. Cada transação é armazenada em uma lista.
* 
* Entrada
* O programa solicitará ao usuário que informe o saldo inicial da conta.
* Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.
* Entrada de Transações:
* Para cada transação, o programa solicitará ao usuário:
* O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
* O valor da transação.
* 
* Saída
* Utilizando listas (ArrayList ou LinkedList), o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
* Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a Entrada que informa o saldo inicial da conta
        double saldo = sc.nextDouble();

        // Lê a Entrada com a quantidade total de transações
        int quantidadeTransacoes = sc.nextInt();

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
            // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
            char tipoTransacao = sc.next().toUpperCase().charAt(0);

            // Lê a Entrada com o valor da transação
            double valorTransacao = sc.nextDouble();

            // Atualiza o saldo da conta e adicionar a transação à lista
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }

        }

        //Usando laço comum
        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");
        for (int i = 0; i < quantidadeTransacoes; i++) {
            System.out.println((i+1) + ". " +transacoes.get(i));
        }

        /*Usando for each
        for(String lista : transacoes){
            System.out.println(lista);
        }
        */

        // Fechar o sc para evitar vazamentos de recursos
        sc.close();
    }
}
