package com.strategy.Strategy;

public class Simples implements IContentTransformer {

	public Streaming converterQualidade() {
		Streaming s = new Streaming("Simples");
		return s;
	}

}
