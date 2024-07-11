import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione a opção de carro:");

        CarroBuilder builder = new CarroBuilderImpl();
        DirectorCarro directorCarro = new DirectorCarro();

        System.out.println("1 - Criar Sedan");
        System.out.println("2 - Criar SUV");
        System.out.println("3 - Criar Off-Road");

        opcao = sc.nextInt();


        switch (opcao){
            case 1:
                directorCarro.construirSedan(builder);
                Carro sedan = builder.construirCarro();
                System.out.println(sedan);
                break;

            case 2:
                directorCarro.construirSuv(builder);
                Carro suv = builder.construirCarro();
                System.out.println(suv);
                break;

            case 3:
                CarFactory sportFactory = new SportFactory();
                Carro sport = sportFactory.createCar();
                System.out.println(sport);
                break;

        }



    }
}
