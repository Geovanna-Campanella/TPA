import java.util.Scanner;
public class Triangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int A, B, C;
		
		System.out.println("Digite valor A");
		A = ler.nextInt();
		
		System.out.println("Digite valor A");
		B = ler.nextInt();
		
		System.out.println("Digite valor A");
		C = ler.nextInt();
		
		if (A>B+C || B>C+A || C>A+B) {
			System.out.println("Não é um triangulo");
		} else if (A >= B || C >= A ) {
			System.out.println("Triangulo Equilátero");
		} else if (A > B && B > C) {
			System.out.println("Triangulo Escaleno");
		} else {
			System.out.println("Triangulo Isósceles");
		}
		
		ler.close();
		
	}
}
