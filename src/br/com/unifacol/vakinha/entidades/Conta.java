package br.com.unifacol.vakinha.entidades;


public class Conta {
	
	/*
	 * não achei serventia para esta classe.
	 * talvez fosse melhor remove-la.
	 * 
	 */
	
	int idUsuario;
	Double saldo;
	Long numConta;
	
	public Conta(int idUsuario, Double saldo, Long numConta) {
		super();
		this.idUsuario = idUsuario;
		this.saldo = saldo;
		this.numConta = numConta;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Long getNumConta() {
		return numConta;
	}

	public void setNumConta(Long numConta) {
		this.numConta = numConta;
	}

}
