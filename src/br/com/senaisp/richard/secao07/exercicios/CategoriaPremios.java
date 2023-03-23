package br.com.senaisp.richard.secao07.exercicios;

import java.util.Random;

public class CategoriaPremios {
	private int valorTickets;
	private String nome;
	private int qtdeItens;
	
	public CategoriaPremios() {
		Random rnd = new Random();
		valorTickets = rnd.nextInt(10)+1;
		nome = null;
		qtdeItens = rnd.nextInt(100) + 1;
	}

	public int getValorTickets() {
		return valorTickets;
	}

	public void setValorTickets(int valorTickets) {
		this.valorTickets = valorTickets;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdeItens() {
		return qtdeItens;
	}

	public void setQtdeItens(int qtdeItens) {
		this.qtdeItens = qtdeItens;
	}
}
