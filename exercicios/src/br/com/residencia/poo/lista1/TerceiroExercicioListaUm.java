package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class TerceiroExercicioListaUm {

	public static void main(String[] args) {

		double num1, num2;
		double soma, subtracao, multiplicacao, divisao;
		int operacao;

		var sc = new Scanner(System.in);
		System.out.println("######SELECIONE UMA OPERAÇÃO######");
		System.out.println("[1] - SOMAR");
		System.out.println("[2] - SUBTRAIR");
		System.out.println("[3] - MULTIPLICAR");
		System.out.println("[4] - DIVIDIR");
		System.out.println(">>>>>>>>>>>>>>>>>>>Digite a sua opção:");
		operacao = sc.nextInt();

		System.out.println("Informe o primeiro valor: ");
		num1 = sc.nextDouble();
		System.out.println("Informe o segundo valor: ");
		num2 = sc.nextDouble();

		switch (operacao) {
		case 1:
			soma = num1 + num2;
			System.out.println("A soma é: " + soma);
			break;

		case 2:
			subtracao = num1 - num2;
			System.out.println("A subtração é: " + subtracao);
			break;

		case 3:
			multiplicacao = num1 * num2;
			System.out.println("A multiplicação é: " + multiplicacao);
			break;

		case 4:
			if (num1 < num2) {
				System.out.println("Impossível de realizar o calculo.");
			}

			else if (num1 <= 0 || num2 <= 0) {
				System.out.println("IMPOSSÍVEL DE REALIZAR O CALCULO!!!");
			} else {
				divisao = num1 / num2;
				System.out.println("A divisão é: " + divisao);
			}
			break;

		default:
			System.out.println("OPERAÇÃO INVÁLIDA!!");

			sc.close();
		}

	}

}
