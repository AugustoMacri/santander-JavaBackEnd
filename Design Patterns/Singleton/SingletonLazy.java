
public class SingletonLazy {
    private static SingletonLazy instancia;

    //Construtor do Singleton precisa ser privado, para garantir que ninguem podera instanciar ele
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
