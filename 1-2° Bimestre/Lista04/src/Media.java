import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, m, m2;
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextInt();
		
		m = (n1+n2)/2;
		
		if (m < 3){
			System.out.println("Reprovado");
		} else if (m >= 3 && m < 6) {
			System.out.println("Exame");
			System.out.println("Digite a nota do Exame: ");
			n3 = ler.nextInt();
			m2 = (m+n3)/2;
				if (m2 < 6) {
					System.out.println("Reprovado");
				} else {
					System.out.println("Aprovado");
				}
		} else {
			System.out.println("Aprovado");
		}
		ler.close();
	}
}