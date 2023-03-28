package br.com.senaisp.richard.secao08.exercicios;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TabuleiroTeste {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Tabuleiro tab = new Tabuleiro("Richard", scn);
		Tabuleiro tabC = new Tabuleiro("Computador", scn);
		tab.previewTabuleiro();
		tab.montagemAleatoria();
		
		tab.previewTabuleiro();
		//Montando o tabuleiro do computador
		System.out.println("Tabuleiro do advesário");
		tabC.montagemAleatoria();
		tabC.mostrarTabuleiro(false);
		//
		do {
			String pos;
			boolean haErro=false; 
			do {
				do { 
					haErro=false;
					//System.out.println("Digite a posição a ser atacada:");
					//pos=scn.nextLine();
					pos=tab.gerarAtaqueAleatorio();
					//Efetuando o ataque ao adversário
					if (pos.charAt(0)<'A' || pos.charAt(0)>'J') {
						System.out.println("Posição Inválida!");
						haErro=true;
					}
					try { //tratando erro de conversão (digitação errada)
						if (Integer.parseInt(pos.substring(1))<1 ||
							Integer.parseInt(pos.substring(1))>10) {
							System.out.println("Posição Inválida!");
							haErro=true;
						}
					} catch(Exception e) {
						System.out.println("Posição Inválida!");
						haErro = true;
					}
				}while(haErro);
			} while(!tabC.receberAtaque(pos) && !tabC.isTerminado());
			
			//Adversário atacando....
			do {
				pos=tabC.gerarAtaqueAleatorio();
			} while(!tab.receberAtaque(pos) && !tab.isTerminado());
			
			tab.previewTabuleiro();
			System.out.println("Tabuleiro do adversário");
			tabC.mostrarTabuleiro(false);
			//Pedindo a posição para o usuário
		} while (!tab.isTerminado() && !tabC.isTerminado());
		scn.close();
		//Verificando quem ganhou o jogo
		if (tab.isTerminado()) {
			System.out.println(tab.getNomeJogador() + " foi eliminado!");
		} else {
			System.out.println(tabC.getNomeJogador() + " foi eliminado!");
		}
	}

}
