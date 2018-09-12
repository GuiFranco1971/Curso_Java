package aplicacao;

import java.util.Scanner;

import entidade.Retangulo;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
				
		System.out.println("Entre a altura e largura do ret�gulo: ");
		
		ret.altura = sc.nextDouble();
		ret.largura = sc.nextDouble();
		
		System.out.println();
		System.out.println("AREA = " + ret.area());
		System.out.println("PERIMETRO = " + ret.perimetro());
		System.out.println("DIAGONAL = " + String.format("%.3f", ret.diagonal()));
				
		sc.close();
		
	}

}
