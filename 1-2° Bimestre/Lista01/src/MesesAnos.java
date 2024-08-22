import java.util.Scanner;

public class MesesAnos {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int dias, meses, anos;
		
		System.out.println("Insira a quantiedade de dias:");
		dias = ler.nextInt();
		
		meses = dias/30;
		anos = dias/365;
		
		System.out.println("Meses equivalentes: " + meses);
		System.out.println("Anos equivalente: " + anos);
		
		ler.close();
	}
}
