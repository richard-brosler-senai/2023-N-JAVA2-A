package br.com.senaisp.richard.secao04.licao04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * 3) Desenvolver um programa que 
		 * solicite um nome composto de pelo menos 3 partes. 
		 * O programa deverá listar as partes 
		 * (que estão separadas por espaço em branco). 
		 * Nesse código você não precisará utilizar nenhum 
		 * método da string, poderá utilizar somente o Scanner 
		 * com os métodos next, hasNext e nextLine.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um texto com pelo menos 3 partes:");
		String texto = scn.nextLine();
		//Criando um leitor da string com o scanner
		Scanner scnAp = new Scanner(texto);
		//Fazendo a primeira leitura até o primeiro delimitador (branco)
		System.out.println(scnAp.next());
		//Se tiver a segunda parte da string, mostra
		if (scnAp.hasNext())
			System.out.println(scnAp.next());
		//Se tiver a terceira parte da string, mostra
		if (scnAp.hasNext())
			System.out.println(scnAp.next());
		//fechando os scanners
		scn.close();
		scnAp.close();
	}

}
