package continuacaoAtiv;

import java.util.Scanner;

public class Aitv9 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n=0, resultado=0, j=1;
		 
		System.out.println("Digite um n�mero: ");
		
		do {
			n = sc.nextInt();
			
			while (n>resultado) {
				resultado = j * (j+1) * (j+2);
				if (resultado == n) {
					System.out.print("Esse n�mero � triangular.");
					break;
				}
				j++;
			}
			if (resultado != n) {
			System.out.print("Esse n�mero n�o � triangular. "); }
			j =1;
		} while (n != 0);
		System.out.println("O programa acabou");
	}

}
