package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		List<Contribuinte> lista = new ArrayList<>();
				
		System.out.print("Entre o número de contribuintes: ");
		int nro = sc.nextInt();
		System.out.println();
		
		for (int i=1 ; i<=nro ; i++) {
			sc.nextLine();
			System.out.println("Dados do Contribuinte #" + i + ": ");
			System.out.print("   Pessoa Física ou Jurídica (F/J): ");
			String tipos = sc.nextLine().trim().toUpperCase();
			char tipo = tipos.charAt(0);
			System.out.print("   Nome Contribuinte: ");
			String nome = sc.nextLine();
			if (tipo == 'F') {
				System.out.print("   Renda Anual: ");
				double renda = sc.nextDouble();
				System.out.print("   Gastos com Saúde: ");
				double saude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, renda, saude));
			} else {
				System.out.print("   Faturamento Anual: ");
				double fatur = sc.nextDouble();
				System.out.print("   Nro. de Funcionários: ");
				int func = sc.nextInt();
				lista.add(new PessoaJuridica(nome, fatur, func));
			}
		}

		double soma = 0;
		System.out.println();
		System.out.println("PAGAMENTO DE IMPOSTOS");
		System.out.println("-------------------------------------------------------");
		for (Contribuinte c : lista) {
			soma += c.vlrImposto();
			System.out.println(c.getNome() + ", R$ " + String.format("%.2f", c.vlrImposto()));
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Valor Total: R$ " + String.format("%.2f", soma));
				
		sc.close();
		
	}

}
