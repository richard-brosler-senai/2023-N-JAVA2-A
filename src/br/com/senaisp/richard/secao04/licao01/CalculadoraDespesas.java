package br.com.senaisp.richard.secao04.licao01;

public class CalculadoraDespesas {
	private double imposto;
	private double comissao;
	public CalculadoraDespesas() {
		imposto = .05;
		comissao = .15;
	}
	
	public double calcularValor(double valorPessoa) {
		return calcularValor(valorPessoa, 0);
	}
	public double calcularValor(double valorPessoa, 
				double valorExtra) {
		return (valorPessoa + valorExtra) * 
					(1 + imposto + comissao);
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
