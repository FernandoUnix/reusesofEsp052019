package com.strategy.Strategy;

public class Assinatura {

	public IContentTransformer contentTransormer;
	public IPreco preco;
	public PreparadorNumeroTransmissoes preparador;

	public Assinatura(IPreco preco, IContentTransformer contentTransormer, PreparadorNumeroTransmissoes preparador) {
		this.preco = preco;
		this.contentTransormer = contentTransormer;
		this.preparador = preparador;
	}

	public double getPreco() {
		return preco.getCalculoPreco();
	}

	public Streaming disponibilidadeConteudo() {
		return contentTransormer.converterQualidade();
	}

	public void permitirNumeroTransmissoesSimultaneas() {
		System.out.println("Nº Transmissões: "+preparador.preparaAmbientePraTransmissoesSimultaneas());
	}

	public double getCalculoPreco() {
		return 0;
	}

//	public int preparaAmbientePraTransmissoesSimultaneas() {
//		if(stream.descricao.contentEquals("Simples")) {
//			return new TransmissaoUnica().preparaAmbientePraTransmissoesSimultaneas();
//		}
//		
//		return 0;
//	}

}
