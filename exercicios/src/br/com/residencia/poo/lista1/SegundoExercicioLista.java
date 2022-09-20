package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class SegundoExercicioLista {

	public static void main(String[] args) {
		int idade;
		int totalIdade=0;
		
		var sc = new Scanner(System.in);
		
		for(int cont = 1; cont <=5; cont++) {
			System.out.println("Qual a idade do seu "+ cont + " colega ?");
			idade = sc.nextInt();
			totalIdade += idade;
			}
		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();
		totalIdade += idade;
		
		System.out.println("O tempo de vida meu e dos meus colegas é: "+totalIdade);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	
		
	}

}
