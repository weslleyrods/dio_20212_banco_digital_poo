public class Main {

    public static void main(String[] args) {
        Cliente weslley = new Cliente();
        weslley.setNome("Weslley");

        Conta cc = new ContaCorrente(weslley);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(weslley);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
