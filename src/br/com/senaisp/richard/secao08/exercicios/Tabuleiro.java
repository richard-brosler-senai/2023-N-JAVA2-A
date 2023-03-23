package br.com.senaisp.richard.secao08.exercicios;

public class Tabuleiro {
	private final char SIT_VAZIO = '░';
	private final char SIT_CHEIO = '▓';
	private final char SIT_ABATIDO = '†';
	private String nomeJogador;
	private Embarcacao[] embarcacoes;
	private char[][] tabuleiro;
	private boolean terminado;
	
	public Tabuleiro(String nome) {
		nomeJogador = nome;
		embarcacoes = new Embarcacao[10];
		tabuleiro = new char[10][10];
		terminado = false;
		inicializarItens();
	}

	private void inicializarItens() {
		//inicializar as embarcacoes
		for(int i=0;i<10;i++) {
			//0 - tamanho 4
			//1 e 2 - tamanho 3
			//3, 4, 5 - tamanho 2
			//6, 7, 8, 9 - tamanho 1
			int tam=1;
			switch(i) {
			case 0: tam = 4; break;
			case 1:
			case 2: tam = 3; break;
			case 3:
			case 4:
			case 5: tam = 2; break;
			}
			embarcacoes[i]=new Embarcacao(tam);
		}
		//preenchendo o tabuleiro com vazio
		for(int lin=0;lin<10;lin++) {
			for(int col=0;col<10;col++) {
				tabuleiro[lin][col] = SIT_VAZIO;
			}
		}
	}
}
