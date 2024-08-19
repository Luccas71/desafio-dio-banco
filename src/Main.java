public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(100.0);
        cc.transferir(100.0, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}