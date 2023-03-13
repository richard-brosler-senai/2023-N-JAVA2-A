package br.com.senaisp.richard.secao03;

public class Chickens01 {

	public static void main(String[] args) {
		int eggsPerChicken = 4;
		int chickenCount = 8;
		int totalEggs = 0;
		//Todos os dias ele coleta os ovos produzidos ao meio dia
		//No segundo dia ele ganha uma galinha
		//No terceiro dia no inicio, um lobo come metade das galinhas
		//Primeiro dia
		totalEggs += eggsPerChicken * chickenCount;
		//Segundo dia
		totalEggs += eggsPerChicken * ++chickenCount;
		//Terceiro dia
		totalEggs += eggsPerChicken * (chickenCount/2);
		
		System.out.println(totalEggs);
	}

}
