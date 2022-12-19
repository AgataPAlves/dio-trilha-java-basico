import java.util.List;

public class Banco {

   
    public String nome;
    protected List<ContaCorrente> contasCorrente;
    protected List<ContaPoupanca> contasPoupanca;  
    protected List<Cliente> clientes;
    protected List<Funcionario> funcionarios;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 

    
    // *********       ABRIR CONTAS      *********


    public void abrirContaCorrente(Cliente cliente, Funcionario funcionario){    
            ContaCorrente conta = new ContaCorrente(cliente, funcionario);
            contasCorrente.add(conta);
            
    }

    public void abrirContaPoupanca(Cliente cliente, Funcionario funcionario){        
            ContaPoupanca conta = new ContaPoupanca(cliente, funcionario);
            contasPoupanca.add(conta);
        
    }



    // ********* LISTAR CONTAS, CLIENTES E FUNCIONARIOS ********


    public void listarContasCorrente(){
        
        for(Conta conta: contasCorrente ){
            System.out.println(conta);
        }
    }    
    
    public void listarContasPoupanca(){
        
        for(Conta conta: contasCorrente ){
            System.out.println(conta);
        }
    }

    public void listarClientesCorrente(){
        for(Conta conta: contasCorrente ){
            System.out.println(conta.getCliente().getNome());
        }
    }

    public void listarClientesPoupança(){
        for(Conta conta: contasPoupanca ){
            System.out.println(conta.getCliente().getNome());
        }
    }

    public void listarFuncionarios(){
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }
    }

}
