public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("cliente");

        Conta cp = new ContaPoupanca(cliente);
        Conta cc = new ContaCorrente(cliente);

        cc.depositar(1000);
        cc.sacar(500);
        cc.transferir(250, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
