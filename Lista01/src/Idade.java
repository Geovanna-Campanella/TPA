import java.util.Scanner;

public class Idade {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int anoNasci, anoAtual, idade;
		
		System.out.println("Digite o ano de nascimento:");
		anoNasci = ler.nextInt();
		
		System.out.println("Digite o ano desejado:");
		anoAtual = ler.nextInt();
		
		idade = (anoAtual - anoNasci);
		
		System.out.println("A idade é de "+ idade + " anos.");
		
		ler.close();
	}
}
