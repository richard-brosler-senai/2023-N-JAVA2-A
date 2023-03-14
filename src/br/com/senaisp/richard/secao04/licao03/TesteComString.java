package br.com.senaisp.richard.secao04.licao03;

import java.util.Scanner;

public class TesteComString {

	public static void main(String[] args) {
		String vlr1 = "teste";
		String vlr2 = "teste";
		//Nesse caso temos o mesmo endereço de memória do
		//texto teste
		if (vlr1==vlr2)
			System.out.println("São iguais!");
		Scanner scn = new Scanner(System.in);
		vlr1 = scn.next();
		vlr2 = scn.next();
		System.out.println("Testando com o scanner");
		//Comparando endereço de memória, não conteúdo
		if (vlr1==vlr2)
			System.out.println("São iguais no endereço de memória!");
		else
			System.out.println("São diferentes no endereço de memória");
		//Para comparar conteúdos, temos que usar equals
		if (vlr1.equals(vlr2))
			System.out.println("São iguais no conteúdo!");
		else
			System.out.println("São diferentes no conteúdo");
		//Aqui estamos criando uma nova string
		vlr1 = vlr1 + "valor x";
		System.out.println(vlr1);
		scn.close();
		
	}

}
