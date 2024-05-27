/*
 *  !Descrição
    Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve 
    permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

    !Entrada
    O programa exibirá um menu com as seguintes opções:
    Depositar
    Sacar
    Consultar Saldo
    Encerrar
    O usuário escolherá uma dessas opções digitando o número correspondente.

    !Saída
    Utilizando um switch, o programa realizará a operação escolhida pelo usuário.

    Se o usuário escolher:

    1: O programa solicitará o valor a ser depositado e atualizará o saldo.
    2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente.
    3: O programa exibirá o saldo atual da conta.
    0: O programa encerrará.
 */

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;
        boolean cond = true;

        //System.out.println("1.Depositar");
        //System.out.println("2.Sacar");
        //System.out.println("3.Consultar Saldo");
        //System.out.println("4.Encerrar");

        while (cond) {

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:

                    double valor = sc.nextDouble();
                    saldo = valor;
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    double saque = sc.nextDouble();
                    if (saldo >= saque) {
                        double resp = sacar(saldo, saque);
                        System.out.println("Saldo atual: " + resp);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);

                    break;

                case 0:
                    cond = false;
                    System.out.println("Programa encerrado.");

                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

            }

        }
        sc.close();
    }

    public static double sacar(double saldo, double saque) {
        return saldo - saque;
    }
}
