import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");
        int agencia = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        String numeroConta = sc.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo da sua conta: ");
        double saldo = sc.nextDouble();

        System.out.println("olá, seja bem-vindo(a) " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia +
                ", conta número: " + numeroConta + ", e o saldo da sua conta e de: " + saldo);

        sc.close();
    }
}
