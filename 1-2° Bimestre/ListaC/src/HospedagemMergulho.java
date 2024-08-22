import java.util.Scanner;
public class HospedagemMergulho {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int destino, dias, valor;
	
		System.out.println("Hospedagens : 1-Ilhabela 2-Fernando de Noronha");
		System.out.println("Digite o número do destino desejado: ");
		destino = ler.nextInt();
		
		System.out.println("Digite a quantiedade de dias de hospedagem: ");
		dias = ler.nextInt();
		
		if (destino == 1 && dias <= 5) {
			valor = (dias*240);
			System.out.println("Hospedagem: Ilhabela");
			System.out.println("Valor da hospedagem: " + valor);
		} else if (destino == 1 && dias < 10) {
			valor = (dias*220)+130;
			System.out.println("Hospedagem: Ilhabela");
			System.out.println("Valor da hospedagem: " + valor);
		} else if (destino == 1 && dias > 10) {
			valor = (dias*210)+150;
			System.out.println("Hospedagem: Ilhabela");
			System.out.println("Valor da hospedagem: " + valor);
		} else if (destino == 2 && dias <= 5) {
			valor = (dias*400)+100;
			System.out.println("Hospedagem: Fernando de Noronha");
			System.out.println("Valor da hospedagem: " + valor);
		} else if (destino == 2 && dias < 10) {
			valor = (dias*410)+150;
			System.out.println("Hospedagem: Fernando de Noronha");
			System.out.println("Valor da hospedagem: " + valor);
		} else {
			valor = (dias*420)+200;
			System.out.println("Hospedagem: Fernando de Noronha");
			System.out.println("Valor da hospedagem: " + valor);
		}
		
		ler.close();
	}
}