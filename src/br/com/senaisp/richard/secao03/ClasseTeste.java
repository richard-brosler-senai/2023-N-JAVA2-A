package br.com.senaisp.richard.secao03;

public class ClasseTeste {
	
	
	public static void main(String[] args) {
		final Teste objetoTeste;
		
		objetoTeste = new Teste();
		objetoTeste.setIdade(10);
		objetoTeste.setNome("Richard");
		
		System.out.println(objetoTeste.toString());
		objetoTeste.setIdade(20);
		objetoTeste.setNome("Richard 2");
		System.out.println(objetoTeste.toString());
		//objetoTeste = new Teste();
		

	}

}
