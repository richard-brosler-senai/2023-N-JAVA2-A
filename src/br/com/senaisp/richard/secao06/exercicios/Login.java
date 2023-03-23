package br.com.senaisp.richard.secao06.exercicios;

public class Login {
	private String login;
	private String password;
	private int tentativas;
	private int qtdeTentativasLimite;
	
	public Login(String user, String senha) {
		login = user;
		password = senha;
		tentativas = 0;
		qtdeTentativasLimite = 3;
	}

	public int getTentativas() {
		return tentativas;
	}

	public int getQtdeTentativasLimite() {
		return qtdeTentativasLimite;
	}
	
	public boolean efetuarLogin(String usuario, String senha) {
		// Testando se o login e a senha estão corretos e a quantidade
		//de tentativas ainda está dentro da quantidade permitida
		//Como iniciamos a tentativa com 0, o teste tem que ser
		//somente menor que qtdeTentativasLimite
		boolean ret = login.equals(usuario) && 
					  password.equals(senha) && 
					  tentativas < qtdeTentativasLimite;
		//Se errou a senha ou o login e a quantidade de tentativas
		//ainda não superou o limite, aumentamos a quantidade
		//de tentativas
		if (!ret && tentativas < qtdeTentativasLimite) {
			tentativas++;
		}
		return ret;
	}
	
}
