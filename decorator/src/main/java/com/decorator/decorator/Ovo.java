package com.decorator.decorator;

public class Ovo extends IAddAdicional {

	public Ovo(IPrato prato) {
		super(prato);
	}

	public Double getPreco() {
		return super.getPreco() + 1.50d;
	}
}
