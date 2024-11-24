import java.util.Scanner;
public class prjRelaçãoPares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j, A[];
		int TAM = 10;
		A = new int [TAM];
		
		for (j=0; j<10; j++) {
			System.out.println("Digite o número");
			A[j] = in.nextInt();
		
			for (i=0; i<=A[j]; i=i+2 ) {
				System.out.println(i);
			}
		}
		
		in.close();
	}
}
