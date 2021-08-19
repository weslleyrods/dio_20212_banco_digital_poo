public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

  

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");   
        super.imprimirInfosComuns();     
    }
    
   

    //Foi criada uma constante dentro da classe
    //estática, para que a informação que tenha relação com a classe ContaCorrente
    //e não com a instância criada
   /*  private static int SEQUENCIAL = 1;

    public ContaCorrente(){
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;

    } */

}
