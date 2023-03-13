package br.com.senaisp.richard.secao03.licao5;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		String nome, comida, hobbie, nomePet, bio, bioPet;
		int idade, qtdeSaidas, qtdeSalarios;
		double gastoEstimadoMensal;
		///
		String tituloJanela = "Jogos Tabajara";
		nome = (String) JOptionPane.showInputDialog(null,"Digite seu nome:",
					tituloJanela,JOptionPane.INFORMATION_MESSAGE,
					null,null,"String");
		comida = (String) JOptionPane.showInputDialog(null,
				"Digite sua comida favorita:",
				tituloJanela,JOptionPane.INFORMATION_MESSAGE,
				null,null,"String");
		hobbie = (String) JOptionPane.showInputDialog(null,
				"Digite seu hobbie:",
				tituloJanela,JOptionPane.INFORMATION_MESSAGE,
				null,null,"String");
		nomePet = (String) JOptionPane.showInputDialog(null,
				"Digite seu Pet:",
				tituloJanela,JOptionPane.INFORMATION_MESSAGE,
				null,null,"String");
		bio = (String) JOptionPane.showInputDialog(null,
				"Fale um pouco sobre você:",
				tituloJanela,JOptionPane.INFORMATION_MESSAGE,
				null,null,"String");
		bioPet = (String) JOptionPane.showInputDialog(null,
				"Fale um pouco sobre seu Pet:",
				tituloJanela,JOptionPane.INFORMATION_MESSAGE,
				null,null,"String");
		idade = Integer.parseInt((String) JOptionPane.showInputDialog(null,
				"Digite sua idade:",
				tituloJanela,JOptionPane.INFORMATION_MESSAGE,
				null,null,"Int"));
		qtdeSaidas = Integer.parseInt((String) JOptionPane.showInputDialog(null,
				"Quantas vezes você sai na semana?",
				tituloJanela,JOptionPane.INFORMATION_MESSAGE,
				null,null,"Int"));
		qtdeSalarios = Integer.parseInt((String) JOptionPane.showInputDialog(null,
				"Quantos salários mínimos você ganha?",
				tituloJanela,JOptionPane.INFORMATION_MESSAGE,
				null,null,"Int"));
		gastoEstimadoMensal = Double.parseDouble((String) JOptionPane.showInputDialog(null,
				"Qual seu gasto estimado mensal?",
				tituloJanela,JOptionPane.INFORMATION_MESSAGE,
				null,null,"Double"));
		String msgFinal = "Essa é a vida de " + nome + "\n"+
				"Ele(a) é um(a) coitado(a)!\n" + 
				"Quase nunca pode comer " +comida + ". \n"+
				"Porque recebe somente R$ " + qtdeSalarios + ",00.\n"+
				"Mal consegue sustentar sua vida, e ainda\n" + 
				"tem que sustentar seu pet, que se chama " +nomePet+".\n"+
				"Imagina só! A pessoa gasta R$ " + gastoEstimadoMensal + " em 1 dia só!\n" +
				"Imagina no mês, como fica?\n" + 
				"Vamos conhecer um pouco da vida dele(a):\n" + 
				bio + "\nE da vida do seu pet.\n"+bioPet+"\n"+
				"Ele(a) com a idade que está ("+idade+"),\n"+
				"mal consegui praticar seu hobbie que é " + hobbie+"\n"+
				"que dirá sair " + qtdeSaidas + " na semana.\n"+
				"Enfim, desejo-lhe sorte, meu(minha) caro(a) "+ nome;
		JOptionPane.showMessageDialog(null, msgFinal,tituloJanela, 
				JOptionPane.INFORMATION_MESSAGE);
	}

}
