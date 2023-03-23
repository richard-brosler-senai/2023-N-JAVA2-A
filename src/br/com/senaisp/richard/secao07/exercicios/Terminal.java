package br.com.senaisp.richard.secao07.exercicios;

public class Terminal {
	private CategoriaPremios cat01;
	private CategoriaPremios cat02;
	private CategoriaPremios cat03;
	public Terminal() {
		cat01 = new CategoriaPremios();
		cat02 = new CategoriaPremios();
		cat03 = new CategoriaPremios();
		//Setando os nomes
		cat01.setNome("Bronze");
		cat02.setNome("Prata");
		cat03.setNome("Ouro");
	}
	public CategoriaPremios getCat01() {
		return cat01;
	}
	public CategoriaPremios getCat02() {
		return cat02;
	}
	public CategoriaPremios getCat03() {
		return cat03;
	}
	
	public void verificarSaldo(Cartao ct) {
		System.out.println("=".repeat(10));
		System.out.println("Cartão No. " + ct.getNumero());
		System.out.println("Saldo de créditos: "+ct.getCreditos());
		System.out.println("Saldo de tickets: " + ct.getTickets());
		System.out.println("=".repeat(10));
		System.out.println("Agradecemos a preferência!");
	}
	
	public void transferenciaCredito(Cartao ori, Cartao des, int valor) {
		int vlrTransferencia = valor;
		//Se for zero, faremos a transferencia total dos créditos
		if (valor==0) {
			//Pegando o total de créditos
			vlrTransferencia = ori.getCreditos();
		}
		//Verificar se há saldo disponível para transferência
		if (vlrTransferencia<= ori.getCreditos()) {
			//ocorrerá a transferência
			des.setCreditos(des.getCreditos() + vlrTransferencia);
			//retirar da origem
			ori.setCreditos(ori.getCreditos() - vlrTransferencia);
			System.out.println("Transferência efetuada com êxito!");
			System.out.println("Cartão origem:");
			verificarSaldo(ori);
			System.out.println("Cartão Destino:");
			verificarSaldo(des);
		} else {
			System.out.println("Sem saldo suficiente para transferir!");
		}
	}
	
	public void mostrarPremiosDisponiveis() {
		System.out.println("=".repeat(10));
		System.out.println("Categoria " + cat01.getNome());
		System.out.println("Preço: " + cat01.getValorTickets());
		System.out.println("Quantidade Disponível: "+cat01.getQtdeItens());
		System.out.println();
		System.out.println("Categoria " + cat02.getNome());
		System.out.println("Preço: " + cat02.getValorTickets());
		System.out.println("Quantidade Disponível: "+cat02.getQtdeItens());
		System.out.println();
		System.out.println("Categoria " + cat03.getNome());
		System.out.println("Preço: " + cat03.getValorTickets());
		System.out.println("Quantidade Disponível: "+cat03.getQtdeItens());
		System.out.println("=".repeat(10));
		System.out.println("Obrigado pela preferência!");
	}
	
	public void resgatePremio(Cartao ct, String nomeCat, int qtdeItens) {
		CategoriaPremios ctP=null;
		//buscar a categoria pelo nome informado
		if (cat01.getNome().equalsIgnoreCase(nomeCat))
			ctP=cat01;
		if (cat02.getNome().equalsIgnoreCase(nomeCat))
			ctP=cat02;
		if (cat03.getNome().equalsIgnoreCase(nomeCat))
			ctP=cat03;
		if (ctP != null) {
			//Há uma categoria de premios encontrada
			if (ct.getTickets()>=qtdeItens*ctP.getValorTickets()) {
				//há saldo suficiente para troca de produtos!
				if (ctP.getQtdeItens()>=qtdeItens) {
					//tenho itens suficientes para troca
					//Debitando os tickets do cartão
					ct.setTickets(ct.getTickets()-qtdeItens*ctP.getValorTickets());
					//Debitando os prêmios da categoria
					ctP.setQtdeItens(ctP.getQtdeItens()-qtdeItens);
					//Mostrando a mensagem 
					System.out.println("Resgate de prêmios efetuada com sucesso!");
					System.out.println("Resgate de "+qtdeItens + " de itens!");
				} else {
					System.out.println("Sem itens suficientes para troca!");
				}
			} else {
				System.out.println("Não há saldo suficiente para troca!");
			}
		} else {
			System.out.println("Categoria inexistente!");
		}
	}
	
	public void carregarSaldo(Cartao ct, int vlrReal) {
		//Carregando o saldo
		ct.setCreditos(ct.getCreditos() + vlrReal * 2);
		//Mostrando o saldo
		verificarSaldo(ct);
	}
}
