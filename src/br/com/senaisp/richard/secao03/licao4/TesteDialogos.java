package br.com.senaisp.richard.secao03.licao4;

import javax.swing.JOptionPane;

public class TesteDialogos {

	public static void main(String[] args) {
		String[] acceptableValues = {"Opçao 1", "Choice 2", "Choice 3"};
		String string= (String)JOptionPane.showInputDialog(null,
		"Esta é uma pergunta?",
		"Título da Caixa de Diálogo",
		2,
		null,
		acceptableValues,
		acceptableValues[1]);
		System.out.println(string);
	}

}
