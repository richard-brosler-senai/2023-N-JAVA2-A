package br.com.senaisp.richard.secao04.licao01;

public class TesteCalculo01 {

	public static void main(String[] args) {
		 /* Imposto é 5 %
		  * Taxa de serviço é 15%
		  * This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15
       Person 7: $11
       Person 8: $30
       */
		//Calculando pessoa 1
		//Se tivermos agora um estabelecimento com 
		//a comissão de 10% ao invés de 15%?
		//Se utilizarmos classe estática, teremos
		//que criar uma nova classe para os 10%
		//Isso não seria legal, não é mesmo?
		System.out.println("Pessoa 1: " + 
				CalculadoraEstatica.calcularValor(10));
		//Calculando pessoa 2
		System.out.println("Pessoa 2: " + 
				CalculadoraEstatica.calcularValor(12));
	}


}
