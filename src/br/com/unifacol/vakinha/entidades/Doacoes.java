package br.com.unifacol.vakinha.entidades;

/*
 * classe Doacoes que fará a ligação entre as classes vakinha, doador
 * 
 * 
 */

public class Doacoes {
	
	private int idDoacao;
	private VakinhaCampanha idVakinha;
	private DoadorPF doadorPF;
	private DoadorPJ doadorPJ;
	private double valor;
	private String tipoDoacao;
	
	public Doacoes() {
		
	}
	//construtor para doação pessoa fisica
	public Doacoes(int idDoacao,  DoadorPF doadorPF, double valor, String tipoDoacao, VakinhaCampanha idVakinha ) {
		
		this.doadorPF = doadorPF;
		this.idDoacao = idDoacao;
		this.idVakinha = idVakinha;
		this.valor = valor;
		this.tipoDoacao = tipoDoacao;
	}
	//construtor para doação pessoa juridica
	public Doacoes(int idDoacao,  DoadorPJ doadorPJ, double valor, String tipoDoacao, VakinhaCampanha idVakinha) {
		
		this.doadorPJ = doadorPJ;
		this.idDoacao = idDoacao;
		this.idVakinha = idVakinha;
		this.valor = valor;
		this.tipoDoacao = tipoDoacao;
	}
	
	public int getIdDoacao() {
		return idDoacao;
	}
	public void setIdDoacao(int idDoacao) {
		this.idDoacao = idDoacao;
	}
	public VakinhaCampanha getIdVakinha() {
		return idVakinha;
	}
	public void setIdVakinha(VakinhaCampanha idVakinha) {
		this.idVakinha = idVakinha;
	}
	public DoadorPF getDoadorPF() {
		return doadorPF;
	}
	public void setDoadorPF(DoadorPF doadorPF) {
		this.doadorPF = doadorPF;
	}
	public DoadorPJ getDoadorPJ() {
		return doadorPJ;
	}
	public void setDoadorPJ(DoadorPJ doadorPJ) {
		this.doadorPJ = doadorPJ;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipoDoacao() {
		return tipoDoacao;
	}
	public void setTipoDoacao(String tipoDoacao) {
		this.tipoDoacao = tipoDoacao;
	}

}
