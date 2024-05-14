import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/*
 * Caso 1: Processo seletivo que existe salário de 2K reais e também existe o salário pretendido do candidato 
 * Se o salário base for maior que o pretendido (ligar para o candudato)
 * Se o salario for igual ao pretendido (ligar para o candidato com contra proposta)
 * 
 */
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option = -1;


        while (option != 0) {
            System.out.println("\n-------------------------Bem vindo ao processo seletivo-------------------------\n");
            System.out.println("1 - Avaliar candidato\n");
            System.out.println("2 - Selecionar candidatos\n");
            System.out.println("0 - Sair\n");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite o salário pretendido do candidato: \n");
                    int salario = sc.nextInt();
                    avaliarCandidato(salario);
                    break;
                case 2:
                    selecaoCandidatos();
                    System.out.println("\n");
                    imprimirSelecionados();

                    break;

                default:
                    break;
            }
        }

        sc.close();
    }

    public static void selecaoCandidatos(){
        //Array da lista de candidatos
        String[] candidatos = {"João","Maria","Pedro","Lucas", "Luciana", "Joaquim"};

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor de " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("Ligar para o candidato " + candidato + "\n");
                candidatoSelecionados++;

            } 
            candidatoAtual++;
        }

    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    public static boolean atender(){
        return new Random().nextInt(3)==0;
    }

    public static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado");
            }

        }while(continuarTentando == true && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Candidato " + candidato + " atendeu\n");
        }else{
            System.out.println("Candidato " + candidato + " não atendeu\n");
        }
    }

    public static void imprimirSelecionados(){
        String[] candidatos = {"João","Maria","Pedro","Lucas", "Luciana"};
        int i;

        System.out.println("----------------------CANDIDATOS SELECIONADOS COM INDICE----------------------\n");
        for(i=0; i<candidatos.length; i++){
            System.out.println(i + 1 + " - " + candidatos[i] + "\n");
        }

        System.out.println("---------------------------ENTRANDO EM CONTATO---------------------------------\n");
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    public static void avaliarCandidato(int salario) {

        if (salario < 2000) {
            System.out.println("Ligar para o candidato\n");
        } else if (salario == 2000) {
            System.out.println("Ligar para o candidato com contra proposta\n");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos\n");
        }

    }
}
