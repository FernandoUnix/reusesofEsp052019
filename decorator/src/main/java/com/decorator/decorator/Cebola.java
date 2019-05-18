package com.decorator.decorator;

public class Cebola extends IAddAdicional{

	public Cebola(IPrato prato) {
		super(prato);
		// TODO Auto-generated constructor stub
	}

	public Double getPreco() {
		// TODO Auto-generated method stub
		return super.getPreco() + 1;
	}

}
