package br.edu.fcv.model;

public class Produto {

	private String nome;
	private int quantidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", "
				+ "quantidade=" + quantidade + "]";
	}

}
