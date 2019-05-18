package com.decorator.decorator;

public abstract class IAddAdicional implements IPrato {
	public IPrato prato;

	public IAddAdicional(IPrato prato) {
		this.prato = prato;
	}

	public Double getPreco() {
		return prato.getPreco();
	}
}
