package exercicio2_23;

import java.util.Scanner;

public class Exerc2_23 {

	public static void main(String[] args) {
	  
	  System.out.println("Digite 3 nros na mesma linha: ");
	  Scanner sc = new Scanner(System.in);
	  
/* Desse jeito 	 
	  String[] vetor = sc.nextLine().split(" ");
	  int n1 = Integer.parseInt(vetor[0]);
	  int n2 = Integer.parseInt(vetor[1]);
	  int n3 = Integer.parseInt(vetor[2]);
ou dessse jeito */	 
	  int n1 = sc.nextInt();
	  int n2 = sc.nextInt();
	  int n3 = sc.nextInt();
	  
	  if (n1 >= n2 && n1 >= n3) {
	      System.out.println("Higher = " + n1);
	  } else if (n2 >= n1 && n2 >= n3) {
	      System.out.println("Higher = " + n2);
	  } else
	      System.out.println("Higher = " + n3);
	  
	 sc.close();
	  
   }
}
