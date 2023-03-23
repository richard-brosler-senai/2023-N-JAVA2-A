package br.com.senaisp.richard.secao07.exercicios;

import java.util.Scanner;

public class FliperamaTeste {

	public static void main(String[] args) {
		//Criando 2 cartões
		Cartao ct01 = new Cartao();
		Cartao ct02 = new Cartao();
		//Setando o número do cartão
		ct01.setNumero(1);
		ct02.setNumero(2);
		//Criando o terminal
		Terminal tm = new Terminal();
		//Criar máquinas de jogos
		Jogo maq01 = new Jogo();
		Jogo maq02 = new Jogo();
		//Carregando os cartões com $5 e $10
		System.out.println("Carregando os valores");
		tm.carregarSaldo(ct01, 5);
		tm.carregarSaldo(ct02, 10);
		//Jogar na máquina 1
		System.out.println("Iniciando o jogo 1");
		maq01.inserirCartao(ct01);
		//Jogar na máquina 2
		System.out.println("Iniciando o jogo 2");
		maq02.inserirCartao(ct02);
		//Mostrando os prêmios disponíveis pelo cartão 1
		System.out.println("Prêmios disponíveis:");
		tm.mostrarPremiosDisponiveis();
		System.out.println("Digite o nome da categoria que deseja resgatar:");
		Scanner scn = new Scanner(System.in);
		String categoria = scn.nextLine();
		System.out.println("Digite a quantidade de prêmios desejada:");
		int qtde = scn.nextInt();
		tm.resgatePremio(ct01, categoria, qtde);
		//Fazer a transferência do cartão 2 para o cartão 1
		System.out.println("=".repeat(20));
		System.out.println("Saldo cartão: " + ct02.getCreditos());
		System.out.println("Digite o valor para troca. (0 = valor total):");
		int vlrTroca=scn.nextInt();
		tm.transferenciaCredito(ct02, ct01, vlrTroca);
		
		scn.close();
	}
}
