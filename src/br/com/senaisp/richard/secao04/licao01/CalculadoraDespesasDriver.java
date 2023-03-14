package br.com.senaisp.richard.secao04.licao01;

import java.util.Scanner;

public class CalculadoraDespesasDriver {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double totalContaSemImposto = 0;
		double totalContaComImposto = 0;
		int totalPessoas = 0;
		int totalPagantes = 0;
		double totalARatear = 0;
		//
		System.out.println("Bem vindo ao programa de rateio de despesas");
		System.out.println("Digite o total da conta sem impostos:");
		totalContaSemImposto = scn.nextDouble();
		System.out.println("Digite o total de pessoas na mesa:");
		totalPessoas = scn.nextInt();
		System.out.println("Digite o total de pessoas pagantes:");
		totalPagantes = scn.nextInt();
		//Se total de pessoas diferente de total pagantes, perguntamos o
		//valor do rateio
		if (totalPessoas!=totalPagantes) {
			System.out.println("Digite o valor a ser rateado:");
			totalARatear = scn.nextDouble();
		}
		//Calcularemos o valor do rateio
		double valorRateio = totalARatear / totalPagantes;
		//Criando a calculadora 
		CalculadoraDespesas calc = new CalculadoraDespesas();
		//Vou deixar o imposto e a comissao no padrão
		//Vamos pedir o valor de cada um e mostrar seu total individual
		for(int i=1;i<=totalPagantes;i++) {
			System.out.println("Digite o valor da pessoa " + i);
			double valorPessoa=scn.nextDouble();
			double totPessoa = calc.calcularValor(valorPessoa, 
					valorRateio);
			System.out.println("Valor a pagar da pessoa 1: "+ 
					totPessoa);
			totalContaComImposto += totPessoa;
		}
		//Mostramos o total geral da conta
		System.out.println("Total geral com impostos:" + 
					totalContaComImposto);
		System.out.println("Total geral sem impostos:"+
					totalContaSemImposto);
		scn.close();
	}

}
