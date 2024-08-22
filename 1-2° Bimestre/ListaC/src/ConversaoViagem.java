import java.util.Scanner;
public class ConversaoViagem {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double dv, rs, eu, ds, psA;
		
		System.out.println("Digite o número do destino da viagem:");
		System.out.println("1-Nacional  2-Europa  3-Norte-América  4-Sul-América.");
		dv = ler.nextDouble();
		
		System.out.println("Digite a quantiedade de dinheiro em reais que será levado: ");
		rs = ler.nextDouble();
		
		if ( dv == 1 ) {
			System.out.println("Viagem: 1-Nacional");
			System.out.println("Conversão: " + rs);
		} else if ( dv == 2 ) {
			System.out.println("Viagem: 2-Europa");
			eu = rs/5.70;
			System.out.println("Conversão: " + eu);
		} else if ( dv == 3 ) {
			System.out.println("Viagem: 3-Norte-América");
			ds = rs/5.25;
			System.out.println("Conversão: " + ds);
		} else {
			System.out.println("Viagem: 4-Sul-América");
			psA = rs/0.0059;
			System.out.println("Conversão: " + psA);
		}
		
		ler.close();
	}
}
