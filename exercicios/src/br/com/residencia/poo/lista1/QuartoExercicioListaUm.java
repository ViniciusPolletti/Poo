package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class QuartoExercicioListaUm {

	public static void main(String[] args) {
		double TempC;
		double CalculoF;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a temperatura em °C?");
		TempC = ler.nextDouble();
		CalculoF = ( TempC * 1.8) + 32;
		
		System.out.println("A temperatura é "+CalculoF+"ºF.");
		
		ler.close();
		
		


	}

}
