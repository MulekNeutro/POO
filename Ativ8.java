package continuacaoAtiv;

import java.util.Scanner;

public class Ativ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0;
		Boolean ehPrimo = true;
		System.out.print("Digite um número");
		
		do {
			n = sc.nextInt();
			
			if (n == 0) {
				break;}
			for (int i=2; i<n; i++) {
				if (n % i == 0) {
					ehPrimo = false;
					break;}
				}
			if (ehPrimo == true) {
				System.out.print("Esse número é primo.");
			}
			else {
				System.out.print("Esse número não é primo.");
			}
			ehPrimo = true;
			
		} while (n != 0);
	}

}
