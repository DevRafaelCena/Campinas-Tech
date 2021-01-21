package dia9;

import java.time.LocalDate;

public class Pessoa {
	String nome;
	double altura;
	String dataNascimento;

	Pessoa(String nome, double altura, String dataNascimento) {
		this.nome = nome;
		this.altura = altura;
		this.dataNascimento = dataNascimento;
	}

	void imprimeDados() {
		System.out.println("Nome: " + this.nome + "\nAltura: " + this.altura + "\nData de nascimento: "
				+ this.dataNascimento + "\nIdade: " + this.calculaIdade());
	}

	// 02/05/1994
	/**
	 * 02/05/1194 02 05 1994
	 * 
	 */
	int calculaIdade() {
		String[] dataNascimentoCortada = dataNascimento.split("/");
		int anoNascimento = Integer.parseInt(dataNascimentoCortada[2]);
		int anoAtual = LocalDate.now().getYear();
		return anoAtual - anoNascimento;
	}
}
