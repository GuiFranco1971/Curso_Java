package teste;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
/*
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;

		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.printf("%nMeasure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimals places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int beds = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same lime):");
		String lastName = sc.next();
		int age = Integer.parseInt(sc.next());
		double height = Double.parseDouble(sc.next());
		
		System.out.println(name);
		System.out.println(beds);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
				
		sc.close();
		
				
		
	}

}
