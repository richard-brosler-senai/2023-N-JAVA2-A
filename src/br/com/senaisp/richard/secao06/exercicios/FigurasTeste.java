package br.com.senaisp.richard.secao06.exercicios;

import java.util.Scanner;

public class FigurasTeste {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite a qtde Linhas:");
		int linhas = scn.nextInt();
		System.out.println("Digite a qtde Colunas:");
		int colunas = scn.nextInt();
		//Chamando o criador de formas
		ConstrutorFiguras.criarRetangulo(linhas, colunas);
		System.out.println("---------------------");
		ConstrutorFiguras.criarTriangulo(linhas);
		//Fechando o scanner
		scn.close();
	}

}
