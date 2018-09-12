package aplicacao;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double calculadora(double vlr_moeda, double cotacao) {
		double vlr_reais = (vlr_moeda * cotacao * (1 + IOF));
		return vlr_reais;
	}
}
