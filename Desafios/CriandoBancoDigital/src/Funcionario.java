import java.util.Calendar;

public class Funcionario {
        
    public Funcionario(String primeiroNome, String sobrenome, String cargo, Calendar nascimento, String endereco){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.dataDeNascimento = nascimento;   
        this.endereco = endereco;      
    }
    
    public String primeiroNome;
    public String sobrenome;
    public String cargo;
    public Calendar dataDeNascimento;
    public String endereco;


    public String getNome() {
        return primeiroNome + sobrenome;
    }


    public void setPrimeiroNome(String pNome) {
        this.primeiroNome = pNome;
    }

    public String toString(){        
        return "Funcionário " + primeiroNome + " " + sobrenome + "/r /n" +
        "Data de Nascimento: " + dataDeNascimento + " /r /n" + 
        "Cargo: " + cargo;
    } 
}


