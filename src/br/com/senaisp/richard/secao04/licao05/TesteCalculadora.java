package br.com.senaisp.richard.secao04.licao05;

public class TesteCalculadora {

	public static void main(String[] args) {
		SuperCalculadora sp = new SuperCalculadora();
		//System.out.println(sp.jogarDados());
		//sp.mostrar10Randons();
		sp.setTaxaJuros(0.0525);
		System.out.println("Valor de 100,00 por 5 meses "
				+ "à 5,25% no juros composto:" + 
				sp.calcularJurosComposto(100.00, 5));
		System.out.println("Valor de 100,00 por 5 meses "
				+ "à 5,25% no juros simples:" + 
				sp.calcularJurosSimples(100.00, 5));
	}

}
