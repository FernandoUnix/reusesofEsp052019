package com.strategy.Strategy;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Assinatura Simples");
		System.out.println("");

		// Assinatura Simples
		IContentTransformer contentTransformSimples = new Simples();
		IPreco precoSimples = new PrecoSimples();
		PreparadorNumeroTransmissoes transmissaoUnica = new TransmissaoUnica();

		Assinatura assinaturaSimples = new Assinatura(precoSimples, contentTransformSimples, transmissaoUnica);

		System.out.println("Assinatura : " + assinaturaSimples.disponibilidadeConteudo().descricao);
		System.out.println("Preço : " + assinaturaSimples.getPreco());
		assinaturaSimples.permitirNumeroTransmissoesSimultaneas();

		////////////////////////////////////////////////////////////////////
		System.out.println("");
		System.out.println("Assinatura Padrão");
		System.out.println("");

		// Assinatura Padrão
		IContentTransformer contentTransformHd = new Hd();
		IPreco precoPadrao = new PrecoPadrao();
		PreparadorNumeroTransmissoes transmissaoDupla = new TransmissaoDupla();

		Assinatura assinaturaPadrao = new Assinatura(precoPadrao, contentTransformHd, transmissaoDupla);

		System.out.println("Assinatura : " + assinaturaPadrao.disponibilidadeConteudo().descricao);
		System.out.println("Preço : " + assinaturaPadrao.getPreco());
		assinaturaPadrao.permitirNumeroTransmissoesSimultaneas();

		System.out.println("");
		System.out.println("Assinatura Premium");
		System.out.println("");

		// Assinatura Premium
		IContentTransformer contentTransformUltraHd = new UltraHd();
		IPreco precoPremiun = new PrecoPremiun();
		PreparadorNumeroTransmissoes transmissaoQuadr = new TransmissaoQuadrupla();

		Assinatura assinaturaPremiun = new Assinatura(precoPremiun, contentTransformUltraHd, transmissaoQuadr);

		System.out.println("Assinatura : " + assinaturaPremiun.disponibilidadeConteudo().descricao);
		System.out.println("Preço : " + assinaturaPremiun.getPreco());
		assinaturaPremiun.permitirNumeroTransmissoesSimultaneas();

		System.out.println("");
		System.out.println("Assinatura Premium com valor de padrão");
		System.out.println("");

		// Assinatura Premium com valor de padrão
		IContentTransformer contentTransformUltraHdComValorPadrao = new UltraHd();
		IPreco precoP = new PrecoPadrao();
		PreparadorNumeroTransmissoes transmissaoQuadrupla = new TransmissaoQuadrupla();

		Assinatura assinaturaPremiunComValorPadrao = new Assinatura(precoP, contentTransformUltraHdComValorPadrao,
				transmissaoQuadrupla);

		System.out.println("Assinatura : " + assinaturaPremiunComValorPadrao.disponibilidadeConteudo().descricao);
		System.out.println("Preço : " + assinaturaPremiunComValorPadrao.getPreco());
		assinaturaPremiunComValorPadrao.permitirNumeroTransmissoesSimultaneas();

	}
}
