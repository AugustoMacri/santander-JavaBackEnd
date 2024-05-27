/*
 * !Descrição
    Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. 
    O cliente pode fazer saques até atingir um limite diário predefinido.

    !Entrada
    O programa solicitará ao usuário que informe o limite diário de saque.
    Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.
    
    !Saída
    Utilizando um laço for, o programa iterará sobre os saques.
    Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
    Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
    Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.
 */

 import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        double limiteDiario = sc.nextDouble();

        double saque = -1;
        
        for(int i = 0; saque < limiteDiario; i++){
            saque = sc.nextDouble();

            if(saque == 0){
                break;
            }else if (saque <= limiteDiario && saque != 0){
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }else{
                System.out.print("Limite diario de saque atingido. ");
            }
        
        }

        System.out.println("Transacoes encerradas.");

        sc.close();
    }
}
