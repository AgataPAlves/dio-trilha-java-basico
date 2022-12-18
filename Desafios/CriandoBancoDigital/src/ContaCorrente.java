public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
    }

    public String toString(){
        return (" === Conta Corrente " + numero + " === /r/n") + 
        (String.format("Titular: %s", this.cliente.getNome())) + " /r/n" +
        (String.format("Agencia: %d", this.agencia)) + " /r/n" +        
        (String.format("Saldo: %.2f", this.saldo));
        }

}