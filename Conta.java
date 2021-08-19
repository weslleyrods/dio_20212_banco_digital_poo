//abstract garante que a classe Conta fique abstrata, para que
//ninguem dê new, a não ser os filhos (Conta Corrente e Poupanca)
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    
    //atributos estão como protected para que sejam
    //encapsulados d euma forma mais adequadas para serem acessadas nas classes filhas
    //Protected é um modificador de acesso, para que as classes filhas consigam enxergar a informação
    //seja um atributo ou um método 
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;
    
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
        
    }
    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;  
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }
 
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){;
        System.out.println(String.format("Titular: %s", this.cliente.getNome())); 
        System.out.println(String.format("Agencia: %d", this.agencia)); 
        System.out.println(String.format("Conta: %d", this.numero)); 
        System.out.println(String.format("Saldo: %.2f", this.saldo)); 
        }
    
}
