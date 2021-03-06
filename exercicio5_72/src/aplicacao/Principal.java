package aplicacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o n�mero de linhas e colunas: ");
		int lin = sc.nextInt();
		int col = sc.nextInt();

		int[][] matriz = new int[lin][col];

		System.out.println();
		System.out.println("Entre com os dados da matriz");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Matriz Gerada");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%03d]", matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.print("Digite um n�mero pertence � matriz: ");
		int nro = sc.nextInt();
				
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (nro == matriz[i][j]) {
					System.out.printf("Encontrado na posi��o: %d, %d %n", i , j);
					if (j > 0) {
						System.out.println("  Esquerda: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("  Acima: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("  Direita: " + matriz[i][j+1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("  Abaixo: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
