package br.com.unifacol.vakinha.interfaces;

import br.com.unifacol.vakinha.entidades.VakinhaCampanha;

import br.com.unifacol.vakinha.entidades.Usuario;

public interface ICampanhas {

	// interface que esta implementada na classe vakinhaCampanha

//assinatura dos metodos com seus respectivos parametros
	public void cadastrarCampanha(int idVakinha, Usuario idUsuario, double meta, String sobre);

	public void alterar(int edtVakinha, String sobre, double meta);

	public VakinhaCampanha buscarPoridVakinha(int idVakinha);

	public void excluir(int idVakinha);

	public void listarVakinhas();

}
