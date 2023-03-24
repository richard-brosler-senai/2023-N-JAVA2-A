package br.com.senaisp.richard.secao08.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {
	public static final char SIT_VAZIO = '░';
	public static final char SIT_CHEIO = '▓';
	public static final char SIT_BOMBARDEADO = '¤';
	public static final char SIT_ABATIDO = '†';
	
	private String nomeJogador;
	private Embarcacao[] embarcacoes;
	//private char[][] tabuleiro;
	private boolean[][] bombardeado;
	private Embarcacao [][] tabuleiroEmbarcacoes;
	private boolean terminado;
	
	private Random rnd;
	private Scanner scn;
	
	public Tabuleiro(String nome, Scanner sc) {
		nomeJogador = nome;
		embarcacoes = new Embarcacao[10];
		//Controle se recebeu um torpedo
		bombardeado = new boolean[10][10];
		//Controle se no local contém ou não uma embarcacao
		tabuleiroEmbarcacoes = new Embarcacao[10][10];
		terminado = false;
		//Criando o random e atribuindo o scanner
		rnd = new Random();
		scn = sc;
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
		inicializaTabuleiro();
	}

	private void inicializaTabuleiro() {
		//preenchendo o tabuleiro com vazio
		for(int lin=0;lin<10;lin++) {
			for(int col=0;col<10;col++) {
				bombardeado[lin][col] = false;
				tabuleiroEmbarcacoes[lin][col] = null;
			}
		}
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public char getPosCaracter(String pos, boolean preview) {
		char ret = SIT_VAZIO;
		//traduzindo a posição
		//Posição A1 - Letra é a linha e número a coluna
		int lin=pos.charAt(0)-65; //Letra A = 65 na tabela ASCII
		int col=Integer.parseInt(pos.substring(1))-1;
		//Subtrai-se 1 porque a coluna começa como zero
		if (!bombardeado[lin][col]) {
			ret = preview && tabuleiroEmbarcacoes[lin][col] != null ? 
					SIT_CHEIO : SIT_VAZIO;
		} else {
			//Foi atingida a posição
			ret = tabuleiroEmbarcacoes[lin][col] != null ? SIT_ABATIDO :
				SIT_BOMBARDEADO;
		}
		return ret;
	}
	
	public char getPosCaracter(String pos) {
		return getPosCaracter(pos,false);
	}
	
	public void previewTabuleiro() {
		                  //12
		System.out.println("  12345678910");
		char letraA = 'A';
		for (int lin=0;lin<10;lin++) {
			System.out.print(letraA+" ");
			for (int col=0;col<10;col++) {
				String pos = letraA + "" + (col+1);
				System.out.print(getPosCaracter(pos, true));
			}//fim do for da coluna
			System.out.println();
			letraA += 1; //mudando a letra
		}//fim do for da linha
	}
	
	public void montagemAleatoria() {
		//limpando o tabuleiro
		inicializaTabuleiro();
		//inicio do percurso nas embarcacoes
		for(Embarcacao emb: embarcacoes) {
			String posicao;
			int linIni, colIni, linFim, colFim;
			do {
				int rotacao = rnd.nextInt(2); //0-horizontal,1-vertical
				linIni = rnd.nextInt(10 - 
						(rotacao==1 ? emb.getTamanho() : 0));
				colIni = rnd.nextInt(10 - 
						(rotacao==0 ? emb.getTamanho() : 0));
				linFim = linIni + (rotacao==1 ? emb.getTamanho()-1 : 0);
				colFim = colIni + (rotacao==0 ? emb.getTamanho()-1 : 0);
				char letraA='A';
				char letraIni = letraA; 
				letraIni += linIni;
				
				char letraFim = letraA; 
				letraFim += linFim;
				posicao = letraIni + "" + (colIni + 1)+":"+
						letraFim + (colFim+1);//E6:H6
			} while(!isDisponivel(posicao));
			//preenchendo o vetor tabuleiroEmbarcacoes
			for(int lin=linIni;lin<=linFim;lin++) {
				for(int col=colIni;col<=colFim;col++) {
					//estou colocando a instância da embarcação
					//em cada célula até atingir o tamanho da embarcação/
					tabuleiroEmbarcacoes[lin][col]=emb;
				}
			}
		}
	}

	private boolean isDisponivel(String posicao) {
		//exemplo de como virá E6:H6
		int linIni, linFim, colIni, colFim;
		linIni = posicao.charAt(0) - 65; //A = 65 na tabela ascii
		int posPonto = posicao.indexOf(':');
		colIni = Integer.parseInt(posicao.substring(1,posPonto))-1;
		linFim = posicao.charAt(posPonto+1) - 65;
		colFim = Integer.parseInt(posicao.substring(posPonto+2))-1;
		boolean emUso = false;
		for(int lin=linIni;lin<=linFim;lin++) {
			for(int col=colIni;col<=colFim;col++) {
				//primeiro teste
				emUso = tabuleiroEmbarcacoes[lin][col]!= null;
				if (!emUso && lin>0) emUso = tabuleiroEmbarcacoes[lin-1][col]!= null;
				if (!emUso && col>0) emUso = tabuleiroEmbarcacoes[lin][col-1]!= null;
				if (!emUso && col<9) emUso = tabuleiroEmbarcacoes[lin][col+1]!= null;
				if (!emUso && lin<9) emUso = tabuleiroEmbarcacoes[lin+1][col]!= null;
				if (emUso) break;
			} //fim do for de colunas
			if (emUso) break;
		}//fim do for de linhas
		return !emUso;
	}
	
}
