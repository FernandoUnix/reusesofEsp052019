package com.factory.factory;

public class FactoryConcreta extends Factory {

	@Override
	public Veiculo criarVeiculo(int qtdePessoas, CondicaoMetereologica condicao) {

		if (qtdePessoas <= 2) {
			return new Tesla();

		} else if (qtdePessoas <= 5 && condicao == CondicaoMetereologica.SOL) {
			return new Escort();

		} else if (qtdePessoas <= 5 && condicao == CondicaoMetereologica.CHUVA) {
			return new Opala();
		} else if (qtdePessoas > 5 && qtdePessoas < 20) {
			return new Besta();
		}

		return null;
	}
}
