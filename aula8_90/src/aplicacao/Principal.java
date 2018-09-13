package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities_enum.WorkerLevel;

public class Principal {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter departament's name: ");
		Department depto = new Department(sc.nextLine());

		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base Salary: ");
		Double salary = sc.nextDouble();

		Worker func = new Worker(name, WorkerLevel.valueOf(level), salary, depto);

		System.out.println();
		System.out.print("How many contracts to this worker? ");
		int qty = sc.nextInt();

		for (int i = 1; i <= qty; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("   Date (dd/mm/yyyy): ");
			Date data = sdf.parse(sc.next());
			System.out.print("   Value per hour: $ ");
			double valor = sc.nextDouble();
			System.out.print("   Duration (hours): ");
			int horas = sc.nextInt();
			HourContract contrato = new HourContract(data, valor, horas);
			func.addContract(contrato);
		}

		sc.nextLine();
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String mesAno = sc.nextLine();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("  Name: " + func.getName());
		System.out.println("  Department: " + func.getDepartment().getName());
		System.out.println("  Income for " + mesAno + ": " + String.format("%.2f", func.income(ano, mes)));
		
		sc.close();

	}

}
