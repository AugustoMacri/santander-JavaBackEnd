/*
 *  !Descrição
    Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. 
    O número da conta deve ter exatamente 8 dígitos.

    !Entrada
    O programa solicitará ao usuário que digite o número da conta bancária.
    
    !Saída
    O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
    Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
    Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException) e informará 
    que o número da conta é inválido.
    
 */

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Lendo a entrada do usuário
            String numConta = sc.nextLine();

            verificarNumeroConta(numConta);

            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            sc.close();
        }

    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta
    // tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta){
        
        //Verific se o número da conta tem exatamente 8 dígitos:
        if(numeroConta.length() != 8){
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }

}

