package br.com.senaisp.richard.secao04.licao04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que solicite um texto, 
		 * após solicitar o texto, o programa deve escolher 
		 * aleatóriamente uma posição de caracter de origem e 
		 * uma posição de caracter de destino para realizar uma 
		 * permuta de caracteres (trocar a posição entre eles). 
		 * A posição de destino deverá ser maior que a posição de 
		 * origem. Efetuar a permuta dos caracteres e imprimir o 
		 * resultado. Você utilizará os métodos das Strings. 
		 * charAt, substring e lenght, além da concatenação de 
		 * strings.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um texto para ser trocado:");
		//Para poder gerar numeros aleatórios
		Random rnd = new Random();
		String texto = scn.nextLine();
		int posOrigem = rnd.nextInt(texto.length()-1);
		int posDestino = posOrigem + 1 +
							rnd.nextInt(texto.length()-posOrigem-1);
		System.out.println("Posicao Origem: " + posOrigem);
		System.out.println("Posicao Origem: " + posDestino);
		String destino = texto.substring(0,posOrigem) + 
						 texto.charAt(posDestino) + //trocando posição
						 texto.substring(posOrigem+1,posDestino)+
						 texto.charAt(posOrigem)+ //trocando posição
						 texto.substring(posDestino+1);
		System.out.println(destino);
		scn.close();
	}

}
