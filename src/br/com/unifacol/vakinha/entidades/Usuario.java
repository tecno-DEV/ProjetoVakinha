package br.com.unifacol.vakinha.entidades;

public class Usuario extends Pessoa {
	
	/*
	 * classe usuario herdando atributos da classe pessoa
	 */

	private int idUsuario;
	private String CPF;
	private Long numConta;
	private String email;
	

	public Usuario() {
	};

	public Usuario(String nome, String sexo, int telefone, int idade, int rg,int idUsuario, String cPF, 
			Long numConta, String email) {
		super( nome,  sexo,  telefone,  idade,  rg);
		
		this.idUsuario = idUsuario;
		this.CPF = cPF;
		this.numConta = numConta;
		this.email = email;
	}

	public int getidUsuario() {
		return idUsuario;
	}

	public void setidUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Long getNumConta() {
		return numConta;
	}

	public void setNumConta(Long numConta) {
		this.numConta = numConta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
