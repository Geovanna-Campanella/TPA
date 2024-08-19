import java.util.Scanner;

public class Desconto {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double produto, desconto, valor;
		
		System.out.println("Insira o preço do produto:");
		produto = ler.nextDouble();
		
		desconto = produto/100*5;
		valor = produto-desconto;
		
		System.out.println("O valor do produto com o desconto é de: " + valor);
		
		ler.close();
	}
}
