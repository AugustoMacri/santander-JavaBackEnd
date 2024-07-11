public class CarroBuilderImpl implements CarroBuilder{
    private Carro carro;

    public CarroBuilderImpl() {
        this.carro = new Carro(){};
    }

    @Override
    public void setTipo(String tipo) {
        this.carro.setTipo(tipo);
    }

    @Override
    public void setChassi(String chassi) {
        this.carro.setChassi(chassi);
    }

    @Override
    public void setCor(String cor) {
        this.carro.setCor(cor);
    }

    @Override
    public void setPneus(String pneu) {
        this.carro.setPneus(pneu);
    }

    @Override
    public void setSuspensao(String suspensao) {
        this.carro.setSuspensao(suspensao);
    }

    @Override
    public Carro construirCarro() {
        return this.carro;
    }
}
