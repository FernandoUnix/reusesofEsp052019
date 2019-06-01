package com.strategy.Strategy;

public class TransmissaoUnica implements PreparadorNumeroTransmissoes {

	public int preparaAmbientePraTransmissoesSimultaneas() {
		return 1;
	}

}
