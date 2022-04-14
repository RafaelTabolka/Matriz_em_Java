package aplications;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de linhas da matriz: ");
		int m = sc.nextInt();

		System.out.println("Digite o número de colunas da matriz: ");
		int n = sc.nextInt();

		while (m <= 0 || n <= 0) {
			System.out.println("Linhas ou colunas nulas são vetores.");
			System.out.println();

			System.out.println("Digite novamente o número de linhas: ");
			m = sc.nextInt();

			System.out.println("Digite novamente o número de colunas:");
			n = sc.nextInt();
		}

		int matriz[][] = new int[m][n];

		System.out.println("Digite os valores das linhas da matriz: ");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		char digNumero;
		do {
			System.out.println("Digie um valor existente na matriz: ");
			int x = sc.nextInt();

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (x == matriz[i][j]) {
						System.out.println("O número " + x + " se encontra na posição (" + i + ", " + j + ")");
						System.out.println();
						if (i > 0) {
							System.out.println("O número que está acima de " + x + " é igual a " + matriz[i - 1][j]);
						}
						if (j > 0) {
							System.out
									.println("O número que está à esquerda de " + x + " é igual a " + matriz[i][j - 1]);
						}
						if (i <= m - 2) {
							System.out.println("O n�mero que está abaixo de " + x + " é igual a " + matriz[i + 1][j]);
						}
						if (j <= n - 2) {
							System.out
									.println("O n�mero que está a direita de " + x + " é igual a " + matriz[i][j + 1]);
						}
					}
				}
			}
			System.out.println();

			System.out.println("Deseja digitar outro número? 's' (sim)   'n' (não)");
			digNumero = sc.next().charAt(0);

			while (digNumero != 's' && digNumero != 'n') {
				System.out.println("Opção inválida. Tente novamente: ");
				digNumero = sc.next().charAt(0);
			}

		} while (digNumero == 's');

		System.out.println("Operação finalizada.");
	}

}
