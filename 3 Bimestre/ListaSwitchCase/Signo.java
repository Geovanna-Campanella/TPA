import java.util.Scanner;
public class Signo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int mesNasci, diaNasci;
		
		System.out.println("Digite o Dia do seu nascimento");
		diaNasci = in.nextInt();
		
		System.out.println("Digite o Mês do seu nascimento");
		mesNasci = in.nextInt();
		
		switch(mesNasci) {
			case 1:
				if ( diaNasci <= 20 ) {
					System.out.println("Capricórnio");
				} else {
					System.out.println("Aquário");
				}
				break;
			case 2:
				if ( diaNasci <= 18 ) {
					System.out.println("Aquário");
				} else {
					System.out.println("Peixes");
				}
				break;
			case 3:
				if ( diaNasci <= 20 ) {
					System.out.println("Peixes");
				} else {
					System.out.println("Áries");
				}
				break;
			case 4:
				if ( diaNasci <= 20 ) {
					System.out.println("Áries");
				} else {
					System.out.println("Touro");
				}
				break;
			case 5:
				if ( diaNasci <= 20 ) {
					System.out.println("Touro");
				} else {
					System.out.println("Gêmeos");
				}
				break;
			case 6:
				if ( diaNasci <= 20 ) {
					System.out.println("Gêmeos");
				} else {
					System.out.println("Câncer");
				}
				break;
			case 7:
				if ( diaNasci <= 22 ) {
					System.out.println("Câncer");
				} else {
					System.out.println("Leão");
				}
				break;
			case 8:
				if ( diaNasci <= 22 ) {
					System.out.println("Leão");
				} else {
					System.out.println("Virgem");
				}
				break;
			case 9:
				if ( diaNasci <= 22 ) {
					System.out.println("Virgem");
				} else {
					System.out.println("Libra");
				}
				break;
			case 10:
				if ( diaNasci <= 22 ) {
					System.out.println("Libra");
				} else {
					System.out.println("Escorpião");
				}
				break;
			case 11:
				if ( diaNasci <= 21 ) {
					System.out.println("Escorpião");
				} else {
					System.out.println("Sagitário");
				}
				break;
			case 12: 
				if ( diaNasci <= 21 ) {
					System.out.println("Sagitário");
				} else {
					System.out.println("Capricórnio");
				}
				break;
			default:
				System.out.println("Dia/Mês inválido");
		}
		
	in.close();
	}
}
