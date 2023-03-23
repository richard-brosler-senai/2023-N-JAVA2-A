package br.com.senaisp.richard.secao07.exercicios;

import java.util.Scanner;

public class JogoVelhaTeste {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		JogoVelha jg = new JogoVelha();
		jg.mostrarTabuleiro();
		do {
			System.out.println(jg.getTurno());
			System.out.println("Digite a linha:");
			int lin = scn.nextInt();
			System.out.println("Digite a coluna:");
			int col = scn.nextInt();
			//Efetuando a jogada
			jg.efetuarJogada(lin, col);
			// Mostrando o tabuleiro
			jg.mostrarTabuleiro();
		}while(!jg.isTerminado());
		//Verificando o fim do jogo
		if (jg.isEmpate()) {
			System.out.println("Fim do Jogo - Empate!");
		} else {
			System.out.println("Fim do Jogo - Vencedor é ...");
			System.out.println(jg.getTurno());
		}
		scn.close();
	}

}
