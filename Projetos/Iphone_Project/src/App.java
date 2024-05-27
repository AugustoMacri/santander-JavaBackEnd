
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Apresentando funções do Iphone\n");
        Iphone iphone = new Iphone();

        iphone.adicionarNovaAba();
        iphone.tocar();
        iphone.pausar();
        iphone.atender();
        iphone.atualizarPagina();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.iphone.com");
        iphone.ligar("123456789");
        iphone.selecionarMusica("My way");
    }
}
