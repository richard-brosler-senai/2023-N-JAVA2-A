package br.com.senaisp.richard.secao03;

public class Teste{
	private int idade;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private String nome;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Idade: "+idade + " Nome: " + nome;
	}
}
