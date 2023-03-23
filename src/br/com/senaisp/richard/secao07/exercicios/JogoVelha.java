package br.com.senaisp.richard.secao07.exercicios;

public class JogoVelha {
	private static final char JOGADOR_O = 'O';
	private static final char JOGADOR_X = 'X';
	private static final char AREA_VAZIA = '_';
	private String tabuleiro;
	private boolean terminado;
	private boolean empate;
	private int turno;
	
	public JogoVelha() {
		tabuleiro = (AREA_VAZIA+"").repeat(9);
		terminado = false;
		empate = false;
		turno = 0;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public boolean isEmpate() {
		return empate;
	}

	public String getTurno() {
		return turno==0 ? "Jogador O" : "Jogador X";
	}
	
	public void mostrarTabuleiro() {
		System.out.println("  1 2 3");
		System.out.print("1 ");
		for (int car=0;car<9;car++) {
			//Fazendo o teste para quebra de linha
			if (car%3==0 && car>0) {            // 0 1 2
				System.out.println();           // 3 4 5
				System.out.print((car/3+1)+" ");// 6 7 8
			}
			//Imprimindo o caracter do tabuleiro
			System.out.print(tabuleiro.charAt(car));
			//Testando se a primeira coluna ou segunda para colocar
			//o |
			if (car%3<2) {
				System.out.print("|");
			}
		}//termino do for
		System.out.println();
	}
	
	public void efetuarJogada(int lin, int col) {
		int pos = (lin-1) * 3 + (col-1);
		if (tabuleiro.charAt(pos)==AREA_VAZIA) {
			//pode efetuar a jogada
			tabuleiro = tabuleiro.substring(0,pos) + 
					    ( turno==0 ? JOGADOR_O : JOGADOR_X ) +
					    tabuleiro.substring(pos+1);
			//Usando uma variavel menor de apoio para ficar
			//menor os testes (lembrado que ao atribuir
			//uma string estamos colocando o endereço de 
			//memória, não o conteúdo)
			String t = tabuleiro;
			//fazendo o teste
			/* 0 1 2
			 * 3 4 5
			 * 6 7 8
			 * */
			//linhas 0 1 2
			terminado = t.charAt(0)==t.charAt(1) && 
						t.charAt(1)==t.charAt(2) && 
						t.charAt(0)!=AREA_VAZIA;
			terminado = terminado || //3 4 5
					(
						t.charAt(3)==t.charAt(4) && 
						t.charAt(4)==t.charAt(5) && 
						t.charAt(3)!=AREA_VAZIA
					);
			terminado = terminado || // 6 7 8
					(
						t.charAt(6)==t.charAt(7) && 
						t.charAt(7)==t.charAt(8) && 
						t.charAt(6)!=AREA_VAZIA
					);
			//Colunas 0 3 6
			terminado = terminado || 
					(
						t.charAt(0)==t.charAt(3) && 
						t.charAt(3)==t.charAt(6) && 
						t.charAt(0)!=AREA_VAZIA
					);
			terminado = terminado || // 1 4 7
					(
						t.charAt(1)==t.charAt(4) && 
						t.charAt(4)==t.charAt(7) && 
						t.charAt(1)!=AREA_VAZIA
					);
			terminado = terminado || //2 5 8
					(
						t.charAt(2)==t.charAt(5) && 
						t.charAt(5)==t.charAt(8) && 
						t.charAt(2)!=AREA_VAZIA
					);
			//Diagonais
			terminado = terminado || //0 4 8
					(
						t.charAt(0)==t.charAt(4) && 
						t.charAt(4)==t.charAt(8) && 
						t.charAt(0)!=AREA_VAZIA
					);
			terminado = terminado || //2 4 6
					(
						t.charAt(2)==t.charAt(4) && 
						t.charAt(4)==t.charAt(6) && 
						t.charAt(2)!=AREA_VAZIA
					);
			//Se não terminou o jogo, mudamos o turno
			if (!terminado) {
				turno = (turno + 1) % 2;
			}
			//Se não tiver mais jogadas, fim do jogo e empate
			if (t.indexOf(AREA_VAZIA)==-1 && !terminado) {
				terminado = true;
				empate= true;
			}
		} else {
			System.out.println("Posição ocupada, escolha outra!");
		}
	}
	
}
