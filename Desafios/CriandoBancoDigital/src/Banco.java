import java.util.List;

public class Banco {

   
    public String nome;
    protected List<ContaCorrente> contasCorrente;
    protected List<ContaPoupanca> contasPoupanca;  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 

    
    // *********       ABRIR CONTAS      *********


    public void abrirContaCorrente(Cliente cliente){    
            ContaCorrente conta = new ContaCorrente(cliente);
            contasCorrente.add(conta);
            
    }

    public void abrirContaPoupanca(Cliente cliente){        
            ContaPoupanca conta = new ContaPoupanca(cliente);
            contasPoupanca.add(conta);
        
    }



    // ********* LISTAR CONTAS E CLIENTES ********


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
}
