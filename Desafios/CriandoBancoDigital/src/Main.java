public class Main {
    
    public static void main(String [] args){

        Cliente Agata = new Cliente();
        Agata.setNome("Agata PAM Quites");

        Cliente Diego = new Cliente();
        Diego.setNome("Diego P D");

        Conta ccA = new ContaCorrente(Agata);
        Conta ccD = new ContaPoupanca(Diego);

        ccA.imprimirExtrato();
        ccD.imprimirExtrato();
        
    }
}
