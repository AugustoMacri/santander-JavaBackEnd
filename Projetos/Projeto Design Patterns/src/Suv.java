public class Suv extends Carro{
    private String tipo;
    private String chassi;
    private String cor;
    private String pneus;
    private String suspensao;

    public Suv() {
        this.setTipo("SUV");
        this.setChassi("Aço");
        this.setCor("Preto");
        this.setPneus("Off-Road");
        this.setSuspensao("Alta");
    }
}
