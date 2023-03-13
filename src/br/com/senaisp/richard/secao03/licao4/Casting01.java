package br.com.senaisp.richard.secao03.licao4;

public class Casting01 {

	public static void main(String[] args) {
		//byte vlr = 128;
		short vlr = 128;
		System.out.println("Valor convertido " + 
		((byte) vlr) ); //houve estouro do valor, ficou negativo
		byte vlr2 = 127;
		System.out.println("Valor convertido 2: " + (++vlr2));
		System.out.println("Valor convertido 2x: " + (++vlr2));
	}

}
