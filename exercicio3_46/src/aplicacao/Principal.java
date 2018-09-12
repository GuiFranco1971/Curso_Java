package aplicacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double cot, vlr;
				
		System.out.print("Qual a cotação da moeda? ");
		cot = sc.nextDouble();
		System.out.print("Qual o valor de moeda a ser comprado? ");
		vlr = sc.nextDouble();
		System.out.print("Valor Total a pagar em Reais: " + String.format("%.2f", CurrencyConverter.calculadora(vlr, cot)));
		
		sc.close();

	}

}