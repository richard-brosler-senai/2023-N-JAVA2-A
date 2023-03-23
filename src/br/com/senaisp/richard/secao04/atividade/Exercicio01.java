package br.com.senaisp.richard.secao04.atividade;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Solicitar uma temperatura em fahreinheit
		 * e converter para celsius
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("Programa de conversão de temperatura");
		System.out.println("Digite a temperatura em fahreinheit:");
		double temp = scn.nextDouble();
		double tempC = 5.0/9*(temp - 32);
		System.out.println("Temperatura em Celsius: " + tempC);
		scn.close();
	}

}
