import java.util.Scanner;
public class Festa {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int m, f, bolo, salgado, doce, bebida;
		
		System.out.println("Insira a quantiedade de convidados homens: ");
		m = ler.nextInt();
		
		System.out.println("Insira a quantiedade de convidadas mulheres: ");
		f = ler.nextInt();
		
		salgado = m*15 + f*10;
		doce = m*6 + f*8;
		bolo = ((m + f)*100)/1000;
		bebida = (m*600 + f*500)/1000;
		
		System.out.println("Serão necessários " + salgado + " salgados para a festa.");
		System.out.println("Serão necessários " + doce + " doces para a festa.");
		System.out.println("Serão necessários " + bolo + "kg de bolo para a festa.");
		System.out.println("Serão necessários " + bebida + "l de bebida para a festa.");
		
		ler.close();
	}

}
