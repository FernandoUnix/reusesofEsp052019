package com.factory.factory;


public class App {
	public static void main(String[] args) {
		var veiculo = new FactoryConcreta().criarVeiculo(2, CondicaoMetereologica.SOL);
		System.out.println(veiculo.getClass().getName());
		veiculo.Imprimir();
	}
}
