package br.com.senaisp.richard.secao06.exercicios;

public class ConstrutorFiguras {
	public static void criarRetangulo(int linha, int coluna) {
		if (linha>1 && coluna>1) {
			//posso fazer o desenho
			for(int lin=1;lin<=linha;lin++) {
				for(int col=1;col<=coluna;col++) {
					if (lin==1 || lin==linha || col==1 || col==coluna) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}//Fim do for das colunas
				System.out.println();
			}//Fim do for das linhas
		} else {
			System.out.println("Não posso fazer o "
					+ "retangulo nessas medidas");
		}
	}
	
	public static void criarTriangulo(int tamanho) {
		if (tamanho>1) {
			//aqui faremos o triangulo
			for (int lin=1;lin<=tamanho;lin++) {
				for (int col=1;col<=lin;col++) {
					if (col==1||col==lin||lin==tamanho) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}//for da coluna
				System.out.println();
			}//for da linha
		} else {
			System.out.println("Favor colocar tamanho maior que 1");
		}
	}
}
