import java.util.Scanner;
public class Valores {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int A, B, C;
		
		System.out.println("Digite o valor A: ");
		A = ler.nextInt();
		System.out.println("Digite o valor B: ");
		B = ler.nextInt();
		System.out.println("Digite o valor C: ");
		C = ler.nextInt();
		
		System.out.println("Valores em ordem crescente: ");
		
		if (A < B && A < C && B < C) {
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
		} else if (A > B && A > C && B > C) {
			System.out.println(C);
			System.out.println(B);
			System.out.println(A);
		} else if (A < B && A > C && B > C) {
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);
		} else if (A > B && A < C && B < C) {
			System.out.println(B);
			System.out.println(A);
			System.out.println(C);
		} else if (A < B && A < C && B > C) {
			System.out.println(A);
			System.out.println(C);
			System.out.println(B);
		} else if (A > B && A > C && B < C) {
			System.out.println(B);
			System.out.println(C);
			System.out.println(A);
		}
		
		ler.close();	
	}
}