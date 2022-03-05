package br.com.unifacol.vakinha.entidades;

public class DoadorPJ extends Pessoa {
	
	/*
	 * classe doador pessoa juridica herdando atributos da classe pessoa
	 * 
	 */
	
	private String razaoSoacial;
	private int cnpj;
	
	public DoadorPJ() {}
	
	public DoadorPJ(String nome, String sexo, int telefone, int idade, int rg, String razaoSocial, int cnpj) {
	
		super(nome, sexo, telefone, idade, rg);
		
		this.cnpj = cnpj;
		this.razaoSoacial = razaoSocial;
		
	}
	
	public String getRazaoSoacial() {
		return razaoSoacial;
	}
	public void setRazaoSoacial(String razaoSoacial) {
		this.razaoSoacial = razaoSoacial;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	

}
