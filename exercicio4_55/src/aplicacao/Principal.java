package aplicacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ContaCorrente conta;
		double valor;

		System.out.print("Entre com o número da conta: ");
		int nroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre com o nome do cliente: ");
		String cliente = sc.nextLine();
		System.out.print("Você vai fazer um depósito inicial? ");
		String frase = sc.nextLine().toUpperCase();
		char opcao = frase.charAt(0);

		if (opcao == 'S') {
			System.out.print("Entre com o valor do depósito inicial: ");
			valor = sc.nextDouble();
			conta = new ContaCorrente(nroConta, cliente, valor);
		} else {
			conta = new ContaCorrente(nroConta, cliente);
		}

		System.out.println("Dados da Conta Aberta:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Entre com o valor do depósito: R$ ");
		valor = sc.nextDouble();
		conta.depositar(valor);
		System.out.println("Dados da Conta após depósito:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Entre com o valor do saque: R$ ");
		valor = sc.nextDouble();
		conta.sacar(valor);
		System.out.println("Dados da Conta após saque:");
		System.out.println(conta);

		sc.close();

	}

}
