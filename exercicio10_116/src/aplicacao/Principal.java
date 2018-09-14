package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter acount data:");
			System.out.print("Number: ");
			int nro = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String client = sc.nextLine();
			System.out.print("Initial Balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			double limit = sc.nextDouble();

			Account conta = new Account(nro, client, limit);
			conta.deposit(balance);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double valor = sc.nextDouble();

			try {
				conta.withdraw(valor);
				System.out.print("New balance: " + conta.getBalance());
			} catch (DomainException e) {
				System.out.println("Withdraw error: " + e.getMessage());
			}

		} catch (InputMismatchException e) {
			System.out.println("Dado digitado inválido");
		} catch (RuntimeException e) {
			System.out.println("Unexpected error !!!!");
		}

		sc.close();

	}

}
