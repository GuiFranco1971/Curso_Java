package aplicacao;

import java.util.Scanner;

import entities.Employee;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee func = new Employee();
		
		System.out.println("Entre com os dados do funcionário:");
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Salário Bruto: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		func.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + func);
		
		System.out.println();
		System.out.print("Qual o percentual de aumento de salário? ");
		double perc = sc.nextDouble();
		func.increaseSalary(perc);
		
		System.out.println();
		System.out.println("Dados Alterados: " + func);
				
		sc.close();
	}

}
