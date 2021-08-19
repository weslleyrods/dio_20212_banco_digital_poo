
//Interface é uma classe abstrada com todos os métodos abstratos
//Ou seja, é uma classe que obriga a todo que extenderem dela, irá obrigar a implementar tudo que ela tem
public interface IConta {
    
    //uma interface pública tem que ter um método publico, logo a classe public nao é necessaria
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}
