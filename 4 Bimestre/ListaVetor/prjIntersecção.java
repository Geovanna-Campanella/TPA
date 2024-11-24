import java.util.Scanner;
public class prjIntersecção {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j, A[], B[], C[];
		int TAM = 10;
		A = new int [TAM];
		B = new int [TAM];
		C = new int [TAM];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o " + (i+1) + " número do conjunto A:");
			A[i] = in.nextInt();
		}
			
		for(j=0; j<10; j++) {
			System.out.println("Digite o " + (j+1) + " número do conjunto B:");
			B[j] = in.nextInt();
			
			for(i=0; i<10; i++) {
				if ((B[j]-A[i])==0) {
					C[i] = B[j];
				}
			}
		}
		
		System.out.print("A= ");		
		for(i=0; i<10; i++) {
			System.out.print(A[i]+ " ");
		}
		System.out.println("");
		
		System.out.print("B= ");
		for(j=0; j<10; j++) {
			System.out.print(B[j]+ " ");
		}
		System.out.println("");
		
		System.out.print("C= ");
		for(i=0; i<10; i++) {
			if (C[i] > 0)
			System.out.print(C[i]+ " ");
		}
		System.out.println("");
		
		in.close();
		
	}
	
}
