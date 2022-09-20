package br.com.residencia.poo.exercicios;

import java.util.Scanner; 

public class TerceiroExercicio {

	public static void main(String[] args) {
		System.out.println("Qual o seu nome?");
		Scanner sc = new Scanner (System.in);
		String nome = sc.nextLine();
		
		System.out.println("Qual a sua idade?");
		int idade = sc.nextInt();
		System.out.println("Seu nome é "+ nome + " , e sua idade é "+ idade + ".");
		sc.close();
		
		
	}

}
