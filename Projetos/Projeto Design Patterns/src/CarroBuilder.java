public interface CarroBuilder {
    void setTipo(String tipo);
    void setChassi(String chassi);
    void setCor(String cor);
    void setPneus(String pneus);
    void setSuspensao(String suspensao);

    Carro construirCarro();
}
