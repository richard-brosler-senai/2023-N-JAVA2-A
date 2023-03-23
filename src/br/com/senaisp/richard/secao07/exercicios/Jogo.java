package br.com.senaisp.richard.secao07.exercicios;

import java.util.Random;

public class Jogo {
	private int custo;
	private int tickets;
	
	public Jogo() {
		Random rnd = new Random();
		custo = rnd.nextInt(4)+1;
		tickets = rnd.nextInt(10)+1;
	}

	public int getCusto() {
		return custo;
	}

	public int getTickets() {
		return tickets;
	}
	
	public void inserirCartao(Cartao ct) {
		if (ct.getCreditos()<custo) {
			System.out.println("Infelizmente você está "
					+ "sem créditos suficientes!");
		} else {
			//Abatendo o custo do jogo
			ct.setCreditos(ct.getCreditos() - custo);
			//Atribuindo o valor dos tickets
			ct.setTickets(ct.getTickets() + tickets);
			//Mostrando os valores
			System.out.println("O cartão " + ct.getNumero()+ " possui:");
			System.out.println(ct.getCreditos() + " Créditos");
			System.out.println(ct.getTickets() + " Tickets");
			System.out.println("------------------------------");
			System.out.println("Agradecemos a preferência!");
		}
	}
	
}
