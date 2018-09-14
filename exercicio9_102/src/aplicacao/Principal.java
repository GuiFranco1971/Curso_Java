package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Principal {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> lista = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int nro = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= nro; i++) {
			sc.nextLine();
			System.out.println("Product #" + i + " Data:");
			System.out.print("   Common, used or imported (c/u/i)? ");
			String tipos = sc.nextLine().toUpperCase().trim();
			char tipoc = tipos.charAt(0);
			System.out.print("   Name: ");
			String name = sc.nextLine();
			System.out.print("   Price: ");
			double price = sc.nextDouble();
			if (tipoc == 'I') {
				System.out.print("   Customs Fee: ");
				double fee = sc.nextDouble();
				lista.add(new ImportedProduct(name, price, fee));
			} else if (tipoc == 'U') {
				System.out.print("   Manufacture Date: ");
				Date data = sdf.parse(sc.next());
				lista.add(new UsedProduct(name, price, data));
			} else {
				lista.add(new Product(name, price));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS");
		for (Product prod : lista) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
