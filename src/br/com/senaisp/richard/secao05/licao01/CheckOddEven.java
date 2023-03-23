package br.com.senaisp.richard.secao05.licao01;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 10:");
		int vlr = scn.nextInt();
		if (vlr%2==0) { //Resto da divisão por 2 == 0
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
		scn.close();
	}

}
