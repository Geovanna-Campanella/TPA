import java.util.Scanner;

public class At4 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double valor, ipva;
		
		System.out.println("Digite o valor do veículo:");
		valor = ler.nextDouble();
		
		ipva = valor/100*4;
		
		System.out.println("O valor do IPVA é de: " + ipva);
		
		ler.close();
	}

}
