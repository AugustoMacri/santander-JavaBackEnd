class Sedan extends Carro {
    private String tipo;
    private String chassi;
    private String cor;
    private String pneus;
    private String suspensao;

    public Sedan() {
        this.setTipo("Sedan");
        this.setChassi("Ferro");
        this.setCor("Azul");
        this.setPneus("Normal");
        this.setSuspensao("Baixa");
    }

}