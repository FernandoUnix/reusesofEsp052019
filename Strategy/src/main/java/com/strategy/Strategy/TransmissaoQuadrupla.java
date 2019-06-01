package com.strategy.Strategy;

public class TransmissaoQuadrupla implements PreparadorNumeroTransmissoes {

	public int preparaAmbientePraTransmissoesSimultaneas() {
		return 4;
	}
}
