package br.com.senaisp.richard.secao04.licao05;

import java.sql.Time;
import java.util.Random;

public class SuperCalculadora {
	private double taxaJuros;
	private Random rnd;
	public SuperCalculadora() {
		taxaJuros = 0.07;
		rnd = new Random();
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	/**
	 * Método para calcular Graus Fahrenheit para Celsius
	 * @param temperatura 
	 * @return retorna temperatura em graus celsius
	 */
	public double grausFparaC(double temperatura) {
		return 5.0/9*(temperatura - 32);
	}
	/**
	 * Método para calcular a hipotenusa
	 * @param ladoA
	 * @param ladoB
	 * @return retorna o valor da hipotenusa
	 */
	public double calcularHipotenusa(double ladoA, double ladoB) {
		return Math.sqrt(ladoA*ladoA + Math.pow(ladoB, 2));
	}
	/**
	 * Jogar 2 dados e somar os resultados
	 * @return retorna a soma dos 2 dados gerados
	 */
	public int jogarDados() {
		return 1+rnd.nextInt(6) + 1+rnd.nextInt(6);
	}
	
	public void mostrar10Randons() {
		rnd.setSeed(20L);
		for (int i=0;i<10;i++)
			System.out.println(rnd.nextInt(50));
		rnd.setSeed(System.currentTimeMillis());
	}
	/**
	 * Calcula o juros simples de uma operação
	 * @param valor
	 * @param periodo
	 * @return retorna o valor com o juros simples
	 */
	public double calcularJurosSimples(double valor, int periodo) {
		return Math.round( valor * (1 + taxaJuros * periodo) * 100 )
				/100.00;
	}
	/**
	 * Calcula o juros composto de uma operação
	 * @param valor
	 * @param periodo
	 * @return retorna o valor com o juros composto
	 */
	public double calcularJurosComposto(double valor, int periodo) {
		return Math.round( valor * Math.pow((1+taxaJuros), periodo) 
				* 100) / 100.00;
	}
}
