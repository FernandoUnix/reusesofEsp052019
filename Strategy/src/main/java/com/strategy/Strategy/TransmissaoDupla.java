package com.strategy.Strategy;

public class TransmissaoDupla implements PreparadorNumeroTransmissoes {

	public int preparaAmbientePraTransmissoesSimultaneas() {
		return 2;
	}

}
