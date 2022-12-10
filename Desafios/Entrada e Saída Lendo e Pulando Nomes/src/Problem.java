import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++){
			String nome = sc.nextLine();
			nomes[i] = nome;
		}

    for(int i=0; i<10; i++){
        String printNome = nomes[i];
        if(i == 2 || i == 6 || i == 8){
            System.out.println(printNome);
        }
    }

	}
}