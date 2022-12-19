public class ContaPoupanca extends Conta {

    
    public ContaPoupanca(Cliente cliente, Funcionario funcionario){
        super(cliente, funcionario);
        
    }
    

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    public String toString(){
        return (" === Conta Poupança " + this.getNumero() + " === /r/n") + 
        (String.format("Titular: %s", this.getCliente().getNome())) + " /r/n" +
        (String.format("Agencia: %d", this.getAgencia())) + " /r/n" +        
        (String.format("Saldo: %.2f", this.saldo));
        }

}
