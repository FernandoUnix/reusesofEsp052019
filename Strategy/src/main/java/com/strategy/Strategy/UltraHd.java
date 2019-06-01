package com.strategy.Strategy;

public class UltraHd implements IContentTransformer {

	public Streaming converterQualidade() {
		Streaming s = new Streaming("Ultra HD");
		return s;
	}
}
