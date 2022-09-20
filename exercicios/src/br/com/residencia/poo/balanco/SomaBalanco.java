package br.com.residencia.poo.balanco;

public class SomaBalanco {

	double gastosJaneiro = 15000;
	double gastosFevereiro = 23000;
	double gastosMarco = 17000;
	double gastosAbril = 13000;
	double gastosMaio = 13000;
	double gastosJunho = 13000;
	double gastosJulho = 32000;
	double gastosAgosto = 42000;
	double gastosSetembro = 44000;
	double gastosOutubro = 30000;
	double gastosNovembro = 30000;
	double gastosDezembro = 30000;
	double trimestreTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	double semestreTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho;
	double anualTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho
			+ gastosJulho + gastosAgosto + gastosSetembro + gastosOutubro + gastosNovembro + gastosDezembro;

	public void Balanco() {
		System.out.println("o gasto trimestral foi de: " + this.trimestreTotal);
		System.out.println("O gasto semestral foi de: " + this.semestreTotal);
		System.out.println("O gasto anual foi de: " + this.anualTotal);
	}

}