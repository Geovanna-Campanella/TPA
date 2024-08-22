import java.util.Scanner;

public class At1 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Insira o primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println("Insira o segundo número: ");
		n2 = ler.nextInt();
		
		System.out.println("Insira o terceiro número: ");
		n3 = ler.nextInt();
		
		n1 = n1*n1;
		n2 = n2*n2;
		n3 = n3*n3;
		
		System.out.println("Resultados: " + n1 + ", " + n2 + ", " + n3);
		
		ler.close();
	}
}
