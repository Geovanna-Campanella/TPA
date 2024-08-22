import java.util.Scanner;

public class ValoresInvertidos {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int valor1, valor2, valor3;
		
		System.out.println("Insira o primeiro valor:");
		valor1 = ler.nextInt();
		
		System.out.println("Insira o segundo valor:");
		valor2 = ler.nextInt();
		
		valor3 = valor1;
		valor1 = valor2;
		valor2 = valor3;
		
		System.out.println("Valor 1: " + valor1);
		System.out.println("Valor 2: " + valor2);
		
		ler.close();
	}

}
