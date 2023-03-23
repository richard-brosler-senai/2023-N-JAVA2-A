package br.com.senaisp.richard.secao06.exercicios;

import java.util.Scanner;

public class TabuadaTeste {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite a tabuada desejada:");
		int tabuada=scn.nextInt();
		for(int i=1;i<=12;i++) {
			System.out.println(tabuada+"x"+i+"="+tabuada*i);
		}
		scn.close();
	}

}
