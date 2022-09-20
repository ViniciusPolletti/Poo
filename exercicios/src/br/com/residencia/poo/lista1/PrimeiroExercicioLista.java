package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class PrimeiroExercicioLista {
	
	public static void main(String[] args) {
		String nome, sobrenome;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		nome = sc.nextLine();
		
		System.out.println("E qual é o seu sobrenome?");
		sobrenome = sc.nextLine();
		
		System.out.println("\nOlá,"+ nome + " " + sobrenome + ".Seja vem vindo(a) ao universo da programação." );
		
		sc.close();

	}

}
