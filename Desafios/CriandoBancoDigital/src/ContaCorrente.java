public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Funcionario funcionario){
        super(cliente, funcionario);
    }
    
    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
    }

    public String toString(){
        return (" === Conta Corrente " + this.getNumero() + " === /r/n") + 
        (String.format("Titular: %s", this.getCliente().getNome())) + " /r/n" +
        (String.format("Agencia: %d", this.getAgencia())) + " /r/n" +        
        (String.format("Saldo: %.2f", this.saldo));
        }

}