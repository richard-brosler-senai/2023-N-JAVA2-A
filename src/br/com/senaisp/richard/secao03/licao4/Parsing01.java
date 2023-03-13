package br.com.senaisp.richard.secao03.licao4;

public class Parsing01 {

	public static void main(String[] args) {
		//Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "10";
        String taxRate = "12.5";
        String gibberish = "887ds7nds87dsfs";
        //Parse shirtPrice and taxRate, and print the total tax
        System.out.println("Total tax:" +
        		( Double.parseDouble(shirtPrice) * 
        		  Double.parseDouble(taxRate))
        );  
        //Try to parse taxRate as an int
        System.out.println("Tax rate inteiro: " + 
        		Integer.parseInt(taxRate));
        //Try to parse gibberish as an int
        System.out.println("Gibberish inteiro: " + 
        		Integer.parseInt(gibberish));
	}

}
