import java.util.logging.Logger;

public class BancoDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou Conexao");
    }

    public static void finalizarConexao(){
        LOGGER.info("finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa){
        //Inserindo a pessoa no banco de dados
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //Inserindo a pessoa no banco de dados
        LOGGER.info("Removeu dados");
    }
}
