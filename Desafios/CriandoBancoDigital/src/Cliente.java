import java.util.Calendar;

public class Cliente {
        
    public Cliente(String primeiroNome, String sobrenome, String profissao, Calendar nascimento, String endereco){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;        
        this.dataDeNascimento = nascimento;
        this.profissao = profissao;     
        this.endereco = endereco;   
    }
    
    public String primeiroNome;
    public String sobrenome;
    public String profissao;
    public Calendar dataDeNascimento;
    public String endereco;


    public String getNome() {
        return primeiroNome + sobrenome;
    }


    public void setPrimeiroNome(String pNome) {
        this.primeiroNome = pNome;
    }

    public String toString(){        
        return "Cliente " + primeiroNome + " " + sobrenome + "/r /n" +
        "Data de Nascimento: " + dataDeNascimento + " /r /n" + 
        "Profissão: " + profissao;
    }

}
