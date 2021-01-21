package dia9;


public class Vaga {
	/** 
	 * 
	 * Vaga de estacionamento de um supermercado, 
	 * somente 1 subsolo 
	 * no estacionamento do supermercado, 100 vagas
	 * elas estão dividas em 4 setores 
	 *
	 */
	// void
	// String int float boolean
	/**
	 * 
	 * ctrl + 1 (quick fix) 
	 * alt  + shift + R (Renomeia tudo) 
	 */

		// Atributos
		int identificador;
		boolean ocupada;
		float area;
		String setor;
		String tipo;
		Placa placa;
		// Metodo Construtor
		Vaga(String setor, int identificador) {
			this.setor = setor;
			this.identificador = identificador;
			System.out.println("Oi Estou criando um vaga no setor " + setor + " com ID " + identificador);
		}
		// Metodos
		boolean estaOcupada() {
			return ocupada;
		}
		void ocupar(Placa placa) {
			this.placa = placa;
			this.ocupada = true;
		}
		void darBiscoito() {
			System.out.println("Toma um biscoito");
		}
	

}
