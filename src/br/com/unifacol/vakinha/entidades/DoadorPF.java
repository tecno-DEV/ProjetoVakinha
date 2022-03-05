package br.com.unifacol.vakinha.entidades;

/*
 * classe Doador pessoa fisica com herança da classe pessoa
 * 
 */

public class DoadorPF extends Pessoa{
	
	private int cpf;
	private String email;
	
	public DoadorPF(String nome, String sexo, int telefone, int idade, int rg, int cpf, String email) {
		super(nome, sexo, telefone, idade,rg);
		this.cpf = cpf;
		this.email = email;
	}
	
	public DoadorPF() {}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}




