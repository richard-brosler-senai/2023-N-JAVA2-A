package br.com.senaisp.richard.secao04.licao03;

public class TesteString02 {

	public static void main(String[] args) {
		String vlr1 = "teste";
		String vlr2 = "teste";
		//Até aqui as 2 strings são as mesmas no endereço
		// de memória
		System.out.println("Situação 1");
		if (vlr1==vlr2)
			System.out.println("Endereços iguais");
		else
			System.out.println("Endereços diferentes");
		vlr1 = "Teste1"; //Cria-se uma nova string e endereços passam
		System.out.println("Situação 2");
		// a ser outro para a vlr1
		if (vlr1==vlr2)
			System.out.println("Endereços iguais");
		else
			System.out.println("Endereços diferentes");
		System.out.println("Situação 3");
		vlr1 = "teste"; 
		// a ser outro para a vlr1
		if (vlr1==vlr2)
			System.out.println("Endereços iguais");
		else
			System.out.println("Endereços diferentes");		
	}

}
