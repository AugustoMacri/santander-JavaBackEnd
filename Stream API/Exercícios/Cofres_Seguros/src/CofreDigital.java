class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        if(confirmacaoSenha != senha){
            System.out.println("Senha incorreta!");
        }else{
            System.out.println("Cofre aberto!");
        }
        return confirmacaoSenha == this.senha;
    }

    public void imprimirInformacoes(){
        super.imprimirInformacoes();
    }
}