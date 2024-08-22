import java.util.Scanner;
public class Combustivel {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double km, l, gm;
		
		System.out.println("Digite a distância percorrida em quilômetros: ");
		km = ler.nextDouble();
		
		System.out.println("Digite a capacidade de litros do tanque de combustível: ");
		l = ler.nextDouble();
		
		gm = km/l;
		
		System.out.println("O gasto médio é de: " + gm + "km/l");
		
		if (gm >= 10){
			System.out.println("Gasto econômico.");
		} else {
			System.out.println("Gasto não econômico.");
		}
		
		ler.close();
	}
}
