package br.com.senaisp.richard.secao04.licao04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4) Desenvolva um programa que solicite o angulo da 
		 * sobra do prédio e o comprimento da sobra do prédio 
		 * no solo. O programa deve calcular a altura aproximada 
		 * do prédio. Para isso utilizar a fórmula de 
		 * tang angulo = cateto oposto/cateto adjacente.
			Razões bem interessantes sobre o triângulo retângulo.
			Seno angulo = cateto oposto/hipotenusa
			Coseno angulo = cateto adjacente/hipotenusa
			Tangente angulo = cateto oposto/cateto adjacente
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o angulo da sombra:");
		double angulo = scn.nextDouble();
		System.out.println("Digite o tamanho da sombra em metros:");
		double distancia = scn.nextDouble();
		//calculando a altura do prédio
		double altura = Math.tan(angulo * Math.PI/180.00) * 
									distancia;
		System.out.println("Altura do prédio aproximada é "+ 
				altura);
		scn.close();
	}

}
