package continuacaoAtiv;

import java.util.Scanner;

public class Ativ10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=0, P1=0, P2=0, R1=0, R2=0;
		System.out.print("Digite um número (acaba com 0)");
		
		do {
			n = sc.nextInt();
			
			if ( n>=1000 && n<=9999) {
			P1 = n/100;
			P2 = n%100;
			R1 = P1 + P2;
			R2 = R1*R1;
			
			if (R2 == n) {
				System.out.print("Esse número é Legal");
			}
			if (R2 != n) {
				System.out.print("Esse número não é Legal");
			}}
			else {
				System.out.println("O número tem de ser maior que 1000 e menor que 9999");
			}
		} while (n != 0);
		System.out.print("O programa acabou!");
	}

}
