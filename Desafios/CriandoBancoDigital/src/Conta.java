public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1; 

    private int agencia;
    private int numero;
    public double saldo;
    private Cliente cliente;
    private Funcionario funcionario;
    

    public Conta(Cliente cliente, Funcionario funcionario){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }


    public void sacar(double valor) {
        this.saldo -= valor;        
    }
    
    public void depositar(double valor) {
        this.saldo += valor;        
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);    
    }
    
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Gerente da Conta: %s", this.funcionario.getNome()));
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

    public Cliente getCliente(){
        return cliente;
    }

    public void imprimirExtrato(){

    }

    
}