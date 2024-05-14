package revisando_Basico;

import java.util.Locale;
import java.util.Scanner;

public class NovoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome, idade e altura: \n");
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        double altura = sc.nextDouble();

        System.out.println("Olá " + nome + ", sua idade é " + idade + " com altura " + altura);

        sc.close();
    }
}
