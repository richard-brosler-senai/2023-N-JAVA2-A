package br.com.senaisp.richard.secao07.exercicios;

public class Cartao {
	private int creditos;
	private int numero;
	private int tickets;
	
	public Cartao() {
		creditos = 0;
		numero = 0;
		tickets=0;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
}
