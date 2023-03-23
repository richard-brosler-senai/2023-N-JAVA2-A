package br.com.senaisp.richard.secao04.licao04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * 2) Desenvolver um programa que solicite um texto, 
		 * após solicitar o texto, solicite o texto que deseja 
		 * ser trocado e o que será colocado no lugar. Efetuar a 
		 * troca do texto e mostrar o resultante. Você utilizará o 
		 * método replace da String.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um texto:");
		String texto = scn.nextLine();
		System.out.println("Digite um texto a ser localizado:");
		String origem = scn.nextLine();
		System.out.println("Digite o texto a ser substituido:");
		String destino = scn.nextLine();
		//Trocando o texto
		System.out.println(texto.replace(origem, destino));
		scn.close();
	}

}
