import java.util.Scanner;
public class CorridaTaxi {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double h, dkm, b, vc, vt;
		
		System.out.println("Digite o hórario da corrida(24h): ");
		h = ler.nextDouble();
		
		System.out.println("Digite a distância percorrida(Km): ");
		dkm = ler.nextDouble();
		
		System.out.println("Digite a quantiedade de bagagens: ");
		b = ler.nextDouble();
		
		if (6 < h && h < 20 && b > 0) {
			vc = dkm*2.75;
			vt = vc+4.50+2.75;
			System.out.println("O valor da corrida a pagar é de R$" + vt);
		} else if (6 < h && h < 20 && b == 0) {
			vc = dkm*2.75;
			vt = vc+4.50;
			System.out.println("O valor da corrida a pagar é de R$" + vt);
		} else if (6 > h && h > 20 && b > 0) {
			vc = dkm*3.58;
			vt = vc+5.65+2.75;
			System.out.println("O valor da corrida a pagar é de R$" + vt);
		} else {
			vc = dkm*3.58;
			vt = vc+5.65;
			System.out.println("O valor da corrida a pagar é de R$" + vt);
		}
		ler.close();
	}
}