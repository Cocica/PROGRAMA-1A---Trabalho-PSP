package programa1A;

import java.util.Arrays;
import java.util.Scanner;

public class programa1A {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while(true) { //Complexidade 3
			Scanner entrada = new Scanner(System.in);
			int A = entrada.nextInt();
			int D = entrada.nextInt();
			if (ehFim(A,D)) {
				break;
			}
			int ataqueDist[] = new int [A];
			int defesaDist[] = new int [D];
			preencheDados(ataqueDist,A);
			preencheDados(defesaDist,D);
			System.out.println(avaliaDist(ataqueDist,defesaDist,A));
		}
	}
	
	public static char avaliaDist(int[] ataqueDist,int[] defesaDist,int A) { // complexidade 3
		Arrays.sort(defesaDist);
		for (int i=0 ;i<A;i++) {
			if (ataqueDist[i]<defesaDist[1])
				return 'Y';
		}
		return 'N';
	}
	
	public static boolean ehFim(int a,int b) {//complexidade 2
		if(a == 0 && b == 0) {
			return true;
		}
			return false;
		
	}
	public static void preencheDados(int[] vetor, int tam) {//complexidade 2
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		for (int i=0;i<tam;i++) {
			vetor[i]=entrada.nextInt();
		}
	}
}
