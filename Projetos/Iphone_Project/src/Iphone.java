public class Iphone implements Aparelho_Telefonico, Navegador_Internet, Reprodutor_Musical{

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada\n");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada " + musica + "\n");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println(("Nova Aba adicionada\n"));
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada\n");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida\n");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe sua mensagem no correio de voz\n");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    
}
