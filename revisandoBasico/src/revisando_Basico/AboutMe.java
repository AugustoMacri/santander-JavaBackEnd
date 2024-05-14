package revisando_Basico;

import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Meu nome é: ");
            String nome = sc.nextLine();

            System.out.println("Minha idade é: ");
            int idade = sc.nextInt();

            System.out.println("Minha altura é: ");
            double altura = sc.nextDouble();

            System.out.println("Meu nome é: " + nome + ", minha idade é: " + idade + ", minha altura é: " + altura);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();

    }

}
