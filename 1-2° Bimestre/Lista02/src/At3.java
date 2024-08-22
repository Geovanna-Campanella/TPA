import java.util.Scanner;

public class At3 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double metros, kms;
		
		System.out.println("Digite o número de metros que deseja converter para quilômetros");
		metros = ler.nextDouble();
		
		kms = metros/1000;
		
		System.out.println("A conversão para quilômetros é de " + kms);
		
		ler.close();
	}
}
