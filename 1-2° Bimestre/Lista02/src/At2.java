import java.util.Scanner;

public class At2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int num, ant, suce;
		
		System.out.println("Incira o número:");
		num = ler.nextInt();
		
		ant = num - 1;
		suce = num + 1;
		
		System.out.println("O número antecessor é " + ant + " e o número sucessor é "
				+ suce);
		
		ler.close();
	}
}
