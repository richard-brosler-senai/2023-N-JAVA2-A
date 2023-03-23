package br.com.senaisp.richard.secao05.licao01;

import java.util.Scanner;

public class ValidityAge {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite sua Idade:");
		int idade = scn.nextInt();
		boolean drivingUnderAge = false;
		drivingUnderAge = idade <= 18;
		System.out.println("Resultado " + drivingUnderAge);
		scn.close();
	}

}
