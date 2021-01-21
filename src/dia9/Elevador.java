package dia9;

public class Elevador {

	int andarAtual;
	int totalAndares;
	int capacidade;
	int ocupacao;

	Elevador(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		System.out.println("Elevador Criado com sucesso, com capacidade de  " + capacidade + " o total de andares "
				+ totalAndares);
	}

	void Entra() {
		if (ocupacao == capacidade) {
			System.out.println("Elevador cheio , aguarde o proximo!");
		} else {
			ocupacao++;
			System.out.println("Elevador agora com " + ocupacao);
		}

	}

	void Sai() {
		if (ocupacao <= 0) {
			System.out.println("Elevador vazio!");
		} else {
			ocupacao--;
			System.out.println("Elevador agora com " + ocupacao);
		}

	}

	void SobeDesce(int destino) {
		String acao = "Subindo";
		if(destino > andarAtual) {
			acao = "Subindo";
		}else {
			acao = "Descendo";
		}
		if (destino >= totalAndares) {
			andarAtual = totalAndares;
			System.out.println("Elevador no ultimo andar ");
		} else if (destino <= 0) {
			andarAtual = 0;
			System.out.println("Elevador no terreo");
		}

		else {
			andarAtual = destino;
			System.out.println( acao + " até " + andarAtual + " º Andar");
		}

	}

}
