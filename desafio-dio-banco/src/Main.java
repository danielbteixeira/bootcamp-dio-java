
public class Main {

    public static void main(String[] args) {
        Cliente daniel = new Cliente();
        daniel.setNome("Daniel");

        Conta cc = new ContaCorrente(daniel);
        Conta poupanca = new ContaPoupanca(daniel);

        cc.depositar(200);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}