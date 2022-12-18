public class ContaPoupanca extends Conta {

    
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    public String toString(){
        return (" === Conta Poupança " + numero + " === /r/n") + 
        (String.format("Titular: %s", this.cliente.getNome())) + " /r/n" +
        (String.format("Agencia: %d", this.agencia)) + " /r/n" +        
        (String.format("Saldo: %.2f", this.saldo));
        }

}
