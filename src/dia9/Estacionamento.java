package dia9;

import java.util.Scanner;

public class Estacionamento {
	public static void main(String[] args) {
			Vaga vaga0 = new Vaga("Amarelo", 1);
			Vaga vaga1 = new Vaga("Azul", 2);
			Vaga vaga2 = new Vaga("Laranja", 3);
			Vaga vaga3 = new Vaga("Azul Claro", 4);
			Vaga vaga4 = new Vaga("Vermelho", 5);
			Placa placa1 = new Placa("ABC-6D66");
			vaga0.area = 15;
			vaga1.tipo = "PCD";
//			vaga2.tipo = "Gestante";
//			vaga3.tipo = "Idoso";
//			vaga4.tipo = "Moto";
			System.out.println(vaga1.ocupada);
			vaga1.ocupar(placa1);
			System.out.println(vaga1.ocupada);
			if (vaga1.estaOcupada()) {
				System.out.println("Está Ocupada");
			} else {
				System.out.println("Está vaga");
			}
			
	}
}
