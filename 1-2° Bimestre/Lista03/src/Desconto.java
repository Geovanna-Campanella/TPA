import java.util.Scanner;

public class Desconto {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double p, d, v, pf;
		
		System.out.println("Digite o preço do produto:");
		p = ler.nextDouble();
		
		System.out.println("Digite a porcentagem desconto:");
		d = ler.nextDouble();
		
		v = p/100*d;
		pf = p-v;
		
		System.out.println("O valor do produto após o desconto é de: R$" + pf);
		
		ler.close();
		
	}
}
