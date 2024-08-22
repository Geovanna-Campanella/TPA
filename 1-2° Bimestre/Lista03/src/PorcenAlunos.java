import java.util.Scanner;

public class PorcenAlunos {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int nt, nm, nh, pm, ph;
		
		System.out.println("Digite o número total de alunos:");
		nt = ler.nextInt();
		
		System.out.println("Digite o número alunas mulheres");
		nm = ler.nextInt();
		
		System.out.println("Digite o número alunos homens");
		nh = ler.nextInt();
		
		pm = nm*100/nt;
		ph = nh*100/nt;
		
		System.out.println("A porcentagem de alunas na sala de aula é de: " + pm + "%");
		System.out.println("A porcentagem de alunos na sala de aula é de: " + ph + "%");
		
		ler.close();
	}
}