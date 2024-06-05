/*
Descrição
Você foi contratado para desenvolver um sistema de cofres seguros. O objetivo é criar dois tipos de cofres: um Cofre Digital, que é aberto por senha, e um Cofre Físico,
que é aberto por chave.

Entrada
O programa irá solicitar ao usuário que digite o tipo de cofre a ser criado: "digital" ou "físico". Se for escolhido o tipo "digital", o programa irá solicitar a senha e 
a confirmação de senha do cofre digital (ambas com apenas números). Caso seja escolhido o tipo "físico", não é necessário nenhuma outra entrada.

Saída
O programa irá exibir as informações do cofre criado. Para o Cofre Digital, será exibido o tipo e o método de abertura (senha). Para o Cofre Físico, será exibido apenas o 
tipo e o método de abertura (chave).
*/

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner sc = new Scanner(System.in);
        String tipoCofre = sc.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = sc.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);
            cofreDigital.imprimirInformacoes();
            int confirmSenha = sc.nextInt();
            cofreDigital.validarSenha(confirmSenha);

        } else {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();

        }

        sc.close();
    }
}
