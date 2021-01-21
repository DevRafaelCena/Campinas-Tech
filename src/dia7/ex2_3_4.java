package dia7;

import java.util.Scanner;

public class ex2_3_4 {
	
	public static void main(String args[]) {
		
		int negativo =0;
		int par = 0;
		int maior = 0;
		Integer[] numeros = new Integer[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Por favor digite um numero");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			numeros[i] = a;
		}

		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			
			if(numeros[i] < 0) {
			negativo++;
			}
			if(numeros[i] %2 == 0) {
				par ++;
				}
		}
		
		System.out.println("Numeros negativos = " +  negativo);
		System.out.println("Numeros pares = " +  par);
		System.out.println("Maior numero foi = " +  maior);
	}

}
