package br.com.senaisp.richard.secao06.licao01;

import java.util.Random;
import java.util.Scanner;

public class ForcaTeste {

	public static void main(String[] args) {
		Random rnd = new Random();
		//Carregando o arquivo para o scanner
		Scanner scn = new Scanner(ForcaTeste.class.
				getResourceAsStream("palavras.txt"));
		//Sorteando a linha escolhida
		int linhaEscolhida = rnd.nextInt(150)+1;
		int contadorLinha = 1;
		String palavra="";
		//Percorrendo as palavras até a linha sorteada
		do {
			palavra = scn.nextLine();
			contadorLinha++;
		}while(scn.hasNext() && 
				contadorLinha<linhaEscolhida);
		//Saindo com a palavra sorteada
		Forca forca = new Forca();
		//Setando a palvra sorteada
		forca.setPalavra(palavra);
		//Fechando o arquivo
		scn.close();
		//Iniciando o scanner para pegar o teclado
		scn = new Scanner(System.in);
		do {
			forca.mostrarTela();
			char letra = scn.next().charAt(0);
			forca.checkLetra(letra);
		} while(!forca.isTerminado());
		System.out.println("A palavra era " + palavra);
		scn.close();
	}

}
