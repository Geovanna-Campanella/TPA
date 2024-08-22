import java.util.Scanner;

public class SalaraioDependente {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double s, sf;
		int d;
		
		System.out.println("Insira o valor do salário: ");
		s = ler.nextDouble();
		
		System.out.println("Insira a quantiedade de dependentes: ");
		d = ler.nextInt();
		
		sf = s + (d*55);
		
		System.out.println("O valor do salário final é de: R$" + sf);
		
		ler.close();
	}
	
}