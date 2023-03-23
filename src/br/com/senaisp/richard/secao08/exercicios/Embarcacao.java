package br.com.senaisp.richard.secao08.exercicios;

public class Embarcacao {
	private int tamanho; //pode variar de 1 a 4
	private int dano; //pode variar de 0 ao tamanho da embarcacao
	private boolean abatido; //irá ser verdadeiro se foi abatido
	
	public Embarcacao(int tam) {
		tamanho=tam;
		dano=0;
		abatido=false;
	}

	public int getDano() {
		return dano;
	}

	public void addDano() {
		this.dano++;
		abatido = (dano>=tamanho);
	}

	public int getTamanho() {
		return tamanho;
	}

	public boolean isAbatido() {
		return abatido;
	}
	
	public String getTipoEmbarcacao() {
		switch(tamanho) {
		case 1: return "Submarino";
		case 2: return "Contra-torpedeiro";
		case 3: return "Navio-tanque";
		case 4: return "Porta-aviões";
		default: return "Não é uma embarcação";
		}
	}
	
}
