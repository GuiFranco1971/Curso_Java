package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> lista = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int nro = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= nro; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + " Data:");
			System.out.print("   Outsourced (y/n)? ");
			String outsourc = sc.nextLine().toUpperCase().trim();
			char outs = outsourc.charAt(0);
			System.out.print("   Name: ");
			String name = sc.nextLine();
			System.out.print("   Hours: ");
			int hours = sc.nextInt();
			System.out.print("   Value per Hour: ");
			double valor = sc.nextDouble();
			if (outs == 'Y') {
				System.out.print("   Additional charge: ");
				double addit = sc.nextDouble();
				lista.add(new OutsourcedEmployee(name, hours, valor, addit));
			} else {
				lista.add(new Employee(name, hours, valor));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS");
		for (Employee func : lista) {
			System.out.println(func.getName() + " - $ " + String.format("%.2f",  func.payment()));
		}
		sc.close();

	}

}
