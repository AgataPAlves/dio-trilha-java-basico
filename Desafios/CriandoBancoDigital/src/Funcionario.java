import java.util.Calendar;

public class Funcionario {
        
    public Funcionario(String primeiroNome, String sobrenome, String profissao, Calendar nascimento){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.profissao = profissao;
        this.dataDeNascimento = nascimento;        
    }
    
    public String primeiroNome;
    public String sobrenome;
    public String profissao;
    public Calendar dataDeNascimento;


    public String getNome() {
        return primeiroNome + sobrenome;
    }


    public void setPrimeiroNome(String pNome) {
        this.primeiroNome = pNome;
    }

    
}

}
