package br.com.unifacol.vakinha.entidades;

/*
 * classe Vakinha com os atributos definidos
 */

public class VakinhaCampanha {

	private int idVakinha;
	private Usuario idUsuario;
	private double valorArrecadado;
	private double meta;
	private double progresso;
	private int nApoiadores;
	private String sobre;

	public VakinhaCampanha() {
	};

	public VakinhaCampanha(int idVakinha, Usuario idUsuario,  double meta, String sobre) {

		this.idVakinha = idVakinha;
		this.idUsuario = idUsuario;
		this.valorArrecadado = valorArrecadado;
		this.meta = meta;
		this.nApoiadores = nApoiadores;
		this.sobre = sobre;

	}

	public VakinhaCampanha(int idVakinha, Usuario idUsuario) {

		this.idVakinha = idVakinha;
		this.idUsuario = idUsuario;
		this.valorArrecadado = valorArrecadado;
		this.nApoiadores = nApoiadores;

	}

	public int getIdVakinha() {
		return idVakinha;
	}

	public void setIdVakinha(int idVakinha) {
		this.idVakinha = idVakinha;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getValorArrecadado() {
		return valorArrecadado;
	}

	public void setValorArrecadado(double valorArrecadado) {
		this.valorArrecadado = 0;
	}

	public double getMeta() {
		return meta;
	}

	public void setMeta(double meta) {
		this.meta = meta;
	}

	public int getnApoiadores() {
		return nApoiadores;
	}

	public void setnApoiadores(int nApoiadores) {
		this.nApoiadores = 0;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public double getProgresso() {
		return progresso;
	}

	public void setProgresso(double progresso) {
		this.progresso = 0;
	}

}
