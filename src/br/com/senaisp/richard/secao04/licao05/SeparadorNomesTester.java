package br.com.senaisp.richard.secao04.licao05;

import java.util.Scanner;

public class SeparadorNomesTester {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite seu nome e sobrenome:");
		String nome = scn.nextLine();
		// Roberto Carlos
		String primeiroNome = nome.substring(0,nome.indexOf(' '));
		String sobreNome = nome.substring(nome.indexOf(' ') + 1);
		System.out.println(sobreNome + ", " + primeiroNome);
		scn.close();
		scn = new Scanner(nome);
		System.out.println(scn.next() + "\n" + scn.next());
		scn.close();
	}

}
