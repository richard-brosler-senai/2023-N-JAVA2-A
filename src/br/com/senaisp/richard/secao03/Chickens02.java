package br.com.senaisp.richard.secao03;

public class Chickens02 {

	public static void main(String[] args) {
		double dailyAverage = 0;
		double monthlyAverage = 0;
		double monthlyProfit = 0;
		//Primeiro dia
		dailyAverage += 100;
		//Segundo dia
		dailyAverage += 121;
		//Terceiro dia
		dailyAverage = (dailyAverage + 117) / 3;
		//Média mensal
		monthlyAverage = dailyAverage * 30;
		//Valor
		monthlyProfit = monthlyAverage * 0.18;
				
		System.out.println("Daily Average:   " +dailyAverage);
		System.out.println("Monthly Average: " +monthlyAverage);
		System.out.println("Monthly Profit:  $" +monthlyProfit);
	}

}
