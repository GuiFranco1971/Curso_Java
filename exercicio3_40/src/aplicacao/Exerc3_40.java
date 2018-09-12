package aplicacao;

import java.util.Scanner;
import produto.Produto;

public class Exerc3_40 {

	public static void main(String[] args) {

		int qt;
		
		Scanner sc = new Scanner(System.in);

		Produto prod = new Produto();

		System.out.println("Enter product data: ");
		System.out.print("Nanme: ");
		prod.name = sc.nextLine();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		prod.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + prod);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		qt = sc.nextInt();
		prod.addProducts(qt);
		System.out.println();
		System.out.println("Updated data: " + prod);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		qt = sc.nextInt();
		prod.removeProducts(qt);
		System.out.println();
		System.out.println("Updated data: " + prod);

		sc.close();
	}

}
