package revisando_Basico;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println(smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println(smartTv.canal);
    }
}
