package dia2;
import java.util.Scanner;
public class ex3 {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Esse algoritimo calcula a área de um retângulo");
	System.out.println("Por favor digite a base do retângulo");
			float base = scanner.nextFloat();
			System.out.println("Por favor digite a altura do retângulo");
			float altura = scanner.nextFloat();
			float area = base * altura;
			System.out.println("A área do retângulo é: " + area);
			scanner.close();
			}