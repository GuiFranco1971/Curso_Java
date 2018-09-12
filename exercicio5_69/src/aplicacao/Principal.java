package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> lista = new ArrayList<>();

		System.out.print("Quantos empregados ser�o registrados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcion�rio #" + i + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();
			lista.add(new Employee(id, nome, salario));
		}

		System.out.println();
		System.out.print("Entre com o ID do Funcion�rio que ter� aumento: ");
		int id = sc.nextInt();

		Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null)
			System.out.println("Este ID n�o existe");
		else {
			System.out.print("Entre com o percentual do aumento: ");
			double percent = sc.nextDouble();
			emp.aumetarSalario(percent);
		}

		System.out.println();
		System.out.println("Lista de Funcion�rios: ");
		for (Employee x : lista) {
			System.out.println(x);
		}

		sc.close();

	}

}
