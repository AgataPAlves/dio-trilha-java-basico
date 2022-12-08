import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = Integer.valueOf(scanner.nextLine());

        System.out.println("Por favor, digite o nome da Agência!");
        String nomeAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.nextLine();

        System.out.println("por favor, digite seu saldo!");
        double saldo = Double.valueOf(scanner.nextLine());

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + nomeAgencia + ", conta " + agencia + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
