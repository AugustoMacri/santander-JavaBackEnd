class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    

    public ContaPoupanca( String titular, int numero, double saldo, double taxaJuros) {
        super(titular, numero, saldo);
        this.taxaJuros = taxaJuros;
    }



    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}