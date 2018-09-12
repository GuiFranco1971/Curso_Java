package aplicacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Quarto[] q = new Quarto[10];
		
		System.out.print("Quantos quartos ser�o alugados? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i=1; i <= n; i++) {
			System.out.println("Aluguel #" + i);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Nro.Quatro (0-9): ");
			int nro = sc.nextInt();
			q[nro] = new Quarto(nome, email);
			System.out.println();	
			sc.nextLine();
		}

		System.out.println("Quartos Ocupados:");
		for (int i=0; i<q.length; i++) {
			if (q[i] != null) {
				System.out.println(i + ": " + q[i].getName() + ", " + q[i].getEmail());
			}
		}
		
		sc.close();
	}

}
