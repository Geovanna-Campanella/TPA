import java.util.Scanner;
public class Intersec��o {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j, A[], B[], C[];
		int TAM = 5;
		A = new int [TAM];
		B = new int [TAM];
		C = new int [TAM];
		
		//Leitura A
		for(i=0; i<5; i++) {
			System.out.println("Digite o " + (i+1) + " n�mero do conjunto A:");
			A[i] = in.nextInt();
		}
			
		//Leitua B + Compara��o
		for(j=0; j<5; j++) {
			System.out.println("Digite o " + (j+1) + " n�mero do conjunto B:");
			B[j] = in.nextInt();
			
			for(i=0; i<5; i++) {
				if ((B[j]-A[i])==0) {
					C[i] = B[j];
				}
			}
		}
		
		//Apresenta��o A
		System.out.print("A= ");		
		for(i=0; i<5; i++) {
			System.out.print(A[i]+ " ");
		}
		System.out.println("");
		
		//Apresenta��o B
		System.out.print("B= ");
		for(j=0; j<5; j++) {
			System.out.print(B[j]+ " ");
		}
		System.out.println("");
		
		//Apresenta��o C
		System.out.print("C= ");
		for(i=0; i<5; i++) {
			if (C[i] > 0)
			System.out.print(C[i]+ " ");
		}
		System.out.println("");
		
	}
	
}
