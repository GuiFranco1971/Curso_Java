package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Client;
import entidades.Order;
import entidades.OrderItem;
import entidades.Product;
import entidades_enum.OrderStatus;

public class Principal {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date dataHoje = new Date(System.currentTimeMillis());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre os dados do cliente:");
		System.out.print("  Nome: ");
		String nome = sc.nextLine();
		System.out.print("  Email: ");
		String email = sc.nextLine();
		System.out.print("  Data de Nascimento (dd/mm/yyyy): ");
		Date dataNasc = sdf.parse(sc.next());

		Client cliente = new Client(nome, email, dataNasc);
				
		sc.nextLine();
		System.out.println();
		System.out.println("Entre os dados do Pedido: ");
		System.out.print("  Status: ");
		String status = sc.nextLine().trim().toUpperCase();
		
		Order pedido = new Order(cliente, dataHoje, OrderStatus.valueOf(status));
		
		System.out.print("  Quantos itens farão parte deste pedido? ");
		int qty = sc.nextInt();

		for (int i = 1; i <= qty; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Entre os dados do Item #" + i + ": ");
			System.out.print("  Nome do Produto: ");
			String prod = sc.nextLine();
			System.out.print("  Preço do Produto: ");
			Double preco = sc.nextDouble();
			System.out.print("  Quantidade: ");
			int qtdItem = sc.nextInt();
			Product produto = new Product(prod, preco);
			OrderItem item = new OrderItem(produto, qtdItem);
			pedido.addItem(item);
		}

		System.out.println();
		System.out.println(pedido);
				
		sc.close();
	}

}
