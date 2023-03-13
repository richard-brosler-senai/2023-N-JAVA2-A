package br.com.senaisp.richard.secao03.licao5;

import javax.swing.JOptionPane;

public class Input02 {

	public static void main(String[] args) {
		 JOptionPane.showMessageDialog(null,
	                "There's no input here, just a message",
	                "Título da Mensagem",
	                JOptionPane.QUESTION_MESSAGE);

	        
	        String input1 = (String)JOptionPane.showInputDialog(null,
	                "Is this a question?",
	                "Dialog Title",
	                2,
	                null,
	                null,
	                "Mensagem Padrão.");
	        
	        
	        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
	        String input2 = (String)JOptionPane.showInputDialog(null,
	                "Is this a question?",
	                "Dialog Title",
	                2,
	                null,
	                acceptableValues,
	                acceptableValues[1]);
	}

}
