package br.com.unifacol.vakinha.entidades;

public abstract class Pessoa {
	
	/**
	 * codigo da classe abstrata pessoa
	 * com seus atributos
	 * 
	 */
	
	private String nome;
	private String sexo;
	private int telefone;
	private int idade;
	private int rg;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String sexo, int telefone, int idade, int rg) {
		this.nome = nome;
		this.sexo = sexo;
		this.telefone = telefone;
		this.idade = idade;
		this.rg = rg;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}

	

}


