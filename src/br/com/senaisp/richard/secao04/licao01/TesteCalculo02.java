package br.com.senaisp.richard.secao04.licao01;

public class TesteCalculo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraDespesas calc = new CalculadoraDespesas();
		//Atribuir uma comissão de 10% ao invés de 15%
		calc.setComissao(.10);
		//Calcular a despesa da pessoa 1
		//Deixaram $20 para rachar entre 6 pessoas porque
		//2 pessoas esqueceram a carteira
		double totalDespesas = 0;
		double valorPessoa;
		//Calculando pessoa 1
		valorPessoa = calc.calcularValor(10);
		System.out.println("Pessoa 1: $" + valorPessoa);
		totalDespesas += valorPessoa;
		//Calcular a despesa da pessoa 2
		//Calculando pessoa 2
		valorPessoa = calc.calcularValor(12);
		System.out.println("Pessoa 2: $" + valorPessoa);
		totalDespesas += valorPessoa;
		//Falta as outras pessoas que serão iguais aos de cima
		///
		System.out.println("Total da conta: " + totalDespesas);
	}

}
