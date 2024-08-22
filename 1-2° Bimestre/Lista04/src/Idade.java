import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int AA, AN, id;
		
		System.out.println("Digite o Ano de Nascimento: ");
		AN = ler.nextInt();
		
		System.out.println("Digite o Ano de Atual: ");
		AA = ler.nextInt();
		
		id = AA - AN;
		
		System.out.println(id + " anos:");
		
		if (id < 10) {
			System.out.println("Criança");
		} else if (id < 18) {
			System.out.println("Adolescente");
		} else if (id < 60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		
		ler.close();
	}
}
