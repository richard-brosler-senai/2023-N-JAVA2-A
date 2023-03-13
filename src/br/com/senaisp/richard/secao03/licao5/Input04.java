package br.com.senaisp.richard.secao03.licao5;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(
				Input04.class.getResourceAsStream("input04text.txt"));
		System.out.println(scn.next());
		System.out.println(scn.next());
		System.out.println(scn.next());
		System.out.println(scn.next());
		System.out.println(scn.next());
		//System.out.println(scn.nextLine());
		//System.out.println(scn.nextLine());
		//System.out.println(scn.nextLine());
		//Verificando se há mais uma linha
		if (scn.hasNextLine())
			//se existir, mostra o conteúdo
			System.out.println(scn.nextLine());
		
		scn.close();
	}

}
