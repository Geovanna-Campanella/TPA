import java.util.Scanner;
public class Rela��oDivisores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n, f, A[];
		int i, j;
		int TAM = 10;
		A = new double [TAM];
	
		for (j=0; j<10; j++) {
			System.out.println("Digite o n�mero");
			A[j] = in.nextInt();
		
			System.out.print( "Seus divisores s�o: " );
			for (i=0; i<A[j]; i++) {
				f = A[j]%i;
				
				if (f==0){
					System.out.print( i + " ");
				} else {
					
				}
			}
			System.out.println("/n");
		}
		
		in.close();
	}
	
}
