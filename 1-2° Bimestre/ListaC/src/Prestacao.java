import java.util.Scanner;
public class Prestacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double vp, diasA, va;
		
		System.out.println("Digite o valor da prestação: ");
		vp = ler.nextDouble();
		
		System.out.println("Digite os dias em atraso: ");
		diasA = ler.nextDouble();
		
		if ( diasA > 45 ) {
			va = (vp*2)/100 + (vp*3)/100 + (vp + (vp*0.01)/100);
			System.out.println("Valor atulizado da prestação: " + va);
		} else {
			va = (vp*2)/100 + (vp + (vp*0.01)/100);
			System.out.println("Valor atualizado da prestação: " + va);
		}
		ler.close();
	}
}
