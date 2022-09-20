package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class QuartoExercicio {
	
	public static void main(String[] args) {
		double nota, totalNotas = 0.0, media;
		String disciplina, nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome? ");
		nome = ler.nextLine();
		
		System.out.println("Qual é a disciplina? ");
		disciplina = ler.nextLine();
		
		for(int cont = 1; cont <= 3; cont++) {
			System.out.println("Insira a nota " + cont + ": ");
			nota = ler.nextDouble();
			totalNotas += nota;
		}
		
		media = totalNotas/3;
		System.out.println("Olá, " + nome);
		System.out.println("Na disciplina " + disciplina + " a média é " + media);
		
		ler.close();
	}
}