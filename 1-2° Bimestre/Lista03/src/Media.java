import java.util.Scanner;

public class Media {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int n1, n2, n3, m;
		
		System.out.println("Insira a primeira nota do aluno: ");
		n1 = ler.nextInt();
		
		System.out.println("Insira a segunda nota do aluno: ");
		n2 = ler.nextInt();
		
		System.out.println("Insira a terceira nota do aluno: ");
		n3 = ler.nextInt();
		
		m = (n1 + n2 + n3)/3;
		
		System.out.println("A média do aluno é de: " + m);
		
		ler.close();
	}
}