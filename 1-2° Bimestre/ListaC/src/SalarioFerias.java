import java.util.Scanner;

public class SalarioFerias {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double sl, vd, sf, ab; 
		
		System.out.println("Digite o valor do salário: ");
		sl = ler.nextDouble();
		
		System.out.println("Suas férias foram vendidas: 1-Sim  2-Não ");
		vd = ler.nextDouble();
		
		if ( vd == 2 ) {
			sf = sl+(sl/3);
			System.out.println("O salário de férias será de: " + sf);
		} else {
			ab = (sl/30)*10;
			sf = sl+ab;
			System.out.println("O Abono será de: " + sf);
		}
		ler.close();
	}
}
