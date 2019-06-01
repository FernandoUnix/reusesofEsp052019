package com.strategy.Strategy;

public class Hd implements IContentTransformer{

	public Streaming converterQualidade() {
		Streaming s = new Streaming("Hd");
		return s;
	}

}
