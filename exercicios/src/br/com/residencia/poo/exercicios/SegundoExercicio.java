package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		System.out.println("Digite seu nome:");
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		System.out.println("Bem vindo, "+ nome + "!");
		sc.close();
	}

}
