package br.com.senaisp.richard.secao04.licao03;

public class TesteParteNome {

	public static void main(String[] args) {
		String nome = "Richard Brosler";
		//Obtendo a posição do caracter branco " "
		int posicaoBranco = nome.indexOf(" ");
		System.out.println("Posição do branco no nome:" + 
				posicaoBranco);
		//Obtendo a primeira parte do nome (até antes do espaço em branco)
		String primeiroNome = nome.substring(0,posicaoBranco);
		System.out.println(primeiroNome);
		//Obtendo a segunda parte do nome (após o caracter branco)
		String sobreNomString = nome.substring(posicaoBranco+1);
		System.out.println(sobreNomString);
		//Comparando strings
		String valor1 = "Abcd";
		String valor2 = "abcde";
		//Verificando se uma é maior que a outra
		int teste = valor1.compareTo(valor2);
		//O valor pode retornar <0, =0 ou >0
		//Se for menor que zero, o valor1 é menor que o valor2
		//Se for 0, os valores são iguais
		//Se for maior que zero, o valor1 é maior que o valor2
		System.out.println(teste);
		//podemos comparar com ignorecase 
		//(desprezamos minusculos/maiusculas)
		teste = valor1.compareToIgnoreCase(valor2);
		//Nesse caso a diferença ocorre somente na posição 5
		System.out.println(teste);
	}

}
