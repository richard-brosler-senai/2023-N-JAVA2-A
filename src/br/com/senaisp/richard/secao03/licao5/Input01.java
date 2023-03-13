package br.com.senaisp.richard.secao03.licao5;

import javax.swing.JOptionPane;

public class Input01 {

	public static void main(String[] args) {
		//Create a JOptionPane.
        //Store the input as a String and print it.
        String msg = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Seja bem vindo,"+  msg);
        String vlrStr = JOptionPane.showInputDialog("Digite sua idade:");
        //Parse the input as an int.
        int vlrInt = Integer.parseInt(vlrStr);
        //Print its value +1
        JOptionPane.showMessageDialog(null,vlrInt + 1);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int vlr2 = Integer.parseInt(
          JOptionPane.showInputDialog("Digite o segundo valor:"))+1;
        JOptionPane.showMessageDialog(null, 
        			"Segundo valor: " + vlr2);
        
        String msg2 = (String) JOptionPane.showInputDialog(
        		null, //Janela parente do diálogo 
        		"Digite sua cidade", //Mensagem da caixa de texto
        		"Entrada de Valores", //Título da caixa de mensagem
        		JOptionPane.WARNING_MESSAGE, //Ícone de aviso
        		null, //Ícone da Janela
        		null, //Vetor de opções (caixa de seleção)
        		"Digite sua cidade aqui" //valor inicial
        		);
        JOptionPane.showMessageDialog(null, msg2);
        
	}

}
