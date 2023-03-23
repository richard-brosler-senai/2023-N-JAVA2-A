package br.com.senaisp.richard.secao06.licao01;
/**
 * Classe para Jogo de forca
 * @author Richard Brosler
 * @version 2023-03-16
 *
 */
public class Forca {
	private int chances;
	private String palavra;
	private String palavraOculta;
	private int erros;
	private boolean terminado;
	/**
	 * Constructor da classe
	 */
	public Forca() {
		chances = 7;
		resetValores();
	}
	/**
	 * Método de apoio para reinicializar valores do jogo
	 */
	private void resetValores() {
		palavraOculta = null;
		erros = 0;
		terminado = false;
	}
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
		resetValores();
		palavraOculta = "-".repeat(palavra.length());
	}
	public String getPalavraOculta() {
		return palavraOculta;
	}
	public int getErros() {
		return erros;
	}
	public boolean isTerminado() {
		return terminado;
	}
	public void mostrarTela() {
		char cabeca =   erros>0 ? 'O' : ' ';
		char bracoEsq = erros>1 ? '\\' : ' ';
		char bracoDir = erros>2 ? '/' : ' ';
		char corpo =    erros>3 ? '|' : ' ';
		char pernaEsq = erros>4 ? '/' : ' ';
		char pernaDir = erros>5 ? '\\' : ' ';
		//Inicio para mostrar a tela
		System.out.println("=".repeat(30));
		System.out.println("Jogo da Forca");
		System.out.println("    +------+");
		System.out.println("    |      |");
		System.out.println("    |     " + bracoEsq+cabeca+bracoDir);
		System.out.println("    |      "+corpo);
		System.out.println("    |     "+pernaEsq+" "+pernaDir);
		System.out.println("    |      ");
		System.out.println("    |      ");
		System.out.println("    ========");
		System.out.println("Descubra a palavra:");
		System.out.println(getPalavraOculta());
		System.out.println("Digite uma letra para o jogo:");
	}
	public void checkLetra(char letra) {
		char letraAp = (letra + "").toLowerCase().charAt(0);
		String palavraAp = palavra.toLowerCase();
		String palavraOcultaAp = palavraOculta.toLowerCase();
		if (!isTerminado()) {
			if (palavraOcultaAp.indexOf(letraAp)>-1) {
				System.out.println("Você já digitou "
						+ "a letra " + letra);
			} else { //Não redigitada
				if (palavraAp.indexOf(letraAp)==-1) {
					System.out.println("Xiii, você não acertou "
							+ "com a letra " + letra);
					erros++;
				} else {
					System.out.println("Oba, você acertou "
							+ "com a letra " + letra);
					String ret="";
					for(int i=0;i<palavra.length();i++) {
						if (palavraAp.charAt(i)==letraAp) {
							ret += palavra.charAt(i);
						} else {
							ret += palavraOcultaAp.charAt(i);
						}
					}
					palavraOculta = ret;
				}
				terminado = erros>=7 || 
							palavraOculta.indexOf('-')==-1;
				if (isTerminado()) {
					System.out.println("Você " + 
							(erros>=7 ? "Perdeu" : "Ganhou") + "!");
				}
			} //Fim do if da redigitacao
		}
	}
}
