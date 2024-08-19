import java.util.Scanner;

public class Media {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("insira primeira nota:");
		nota1 = ler.nextDouble();
		
		System.out.println("insira segunda nota:");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("A média do aluno é de: " + media);
		
		ler.close();
		
	}
}
