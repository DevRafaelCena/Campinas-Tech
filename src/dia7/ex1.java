package dia7;

import java.util.Scanner;

public class ex1 {

	public static void main(String args[]) {
		Integer[] numeros = new Integer[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Por favor digite um numero");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			numeros[i] = a;
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Impressao: " + numeros[i]);

		}
	}
}
