package br.com.residencia.poo.arvore;

import java.util.Scanner;

public class Arvore {
	public static void main(String[] args) {
		int n;
		int ini;
		int troncoArvore = 0;
		int alturaT = 3;
		int quantidadeA = 1;

		// It's asking the user to input the size of the tree.
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tamanho da arvore: ");
		n = sc.nextInt();

		ini = n;

		System.out.print("\n");
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= ini; j++) {
				System.out.print(" ");
			}
			ini -= 1;
			for (int j = 1; j <= quantidadeA; j++) {
				if (j == 1) {
				} else if (j == quantidadeA) {
					System.out.print("*");
				} else {
					System.out.print("*");
				}
			}
			quantidadeA += 2;
			System.out.print("\n");
		}

		if (n > 10 && n < 24) {
			n -= 2;
			troncoArvore = 4;
		} else if (n >= 25) {
			alturaT = 5;
			n -= 3;
			troncoArvore = 6;
		} else {
			troncoArvore = 2;
			n -= 1;
		}

		for (int i = 0; i < alturaT; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < troncoArvore; j++) {
				if (j == 0) {

					System.out.print("*");

				} else {
					System.out.print("*");
				}

			}
			System.out.print("\n");
		}

		sc.close();
	}
}
