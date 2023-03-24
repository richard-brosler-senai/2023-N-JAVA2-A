package br.com.senaisp.richard.secao08.exercicios;

import java.util.Scanner;

public class TabuleiroTeste {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Tabuleiro tab = new Tabuleiro("Richard", scn);
		tab.previewTabuleiro();
		tab.montagemAleatoria();
		tab.previewTabuleiro();
		
		scn.close();
	}

}
