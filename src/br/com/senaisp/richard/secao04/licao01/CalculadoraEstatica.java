package br.com.senaisp.richard.secao04.licao01;

public class CalculadoraEstatica {
	public static double imposto = 0.05;
	public static double comissao = 0.15;
	
	public static double calcularValor(double valorPessoa) {
		return valorPessoa * (1 + imposto + comissao);
	}
}
