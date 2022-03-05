package br.com.unifacol.vakinha.servicos;

import java.util.ArrayList;
import br.com.unifacol.vakinha.entidades.Usuario;

public class ServicosUsuario {

	public ArrayList<Usuario> repositorioUsuario;

	public ServicosUsuario() {
		this.repositorioUsuario = new ArrayList<Usuario>();
	}

	// metodo para cadastrar um novo usuario
	public void cadastrarUsuario(String nome, String sexo, int telefone, int idade, int rg, int idUsuario, String cPF,
			Long numConta, String email) {

		if (buscarCPFUsuario(cPF) == null) {
			if (idUsuario > 0 && nome != null && cPF != null && numConta > 0 && email != null && telefone > 0
					&& sexo != null && rg > 0 && idade > 0) {
				this.repositorioUsuario
						.add(new Usuario(nome, sexo, telefone, idade, rg, idUsuario, cPF, numConta, email));
				System.out.println("USUARIO CADASTRADO COM SUCESSO!");
			}

		}
		if (buscarCPFUsuario(cPF) != null) {
			System.out.println("USUARIO NÃO CADASTRADO... DADOS INVÁLIDOS");
		}

	}

	// metodo para exibir todos os usuario cadastrados
	public void listarUsuarios() {

		if (repositorioUsuario.size() > 0) {
			System.out.println("LISTANDO USUARIOS...");
			for (Usuario usuario : repositorioUsuario) {
				System.out.println("************************************");
				System.out.println("ID USUARIO : " + usuario.getidUsuario());
				System.out.println("NOME : " + usuario.getNome());
				System.out.println("SEXO : " + usuario.getSexo());
				System.out.println("IDADE : " + usuario.getIdade());
				System.out.println("CPF : " + usuario.getCPF());
				System.out.println("Nº CONTA : " + usuario.getNumConta());
				System.out.println("EMAIL : " + usuario.getEmail());
				System.out.println("RG : " + usuario.getRg());
				System.out.println("TELEFONE : " + usuario.getTelefone());
				System.out.println("************************************");

			}

		} else {
			System.err.println("NÃO HÁ USUARIOS CADASTRADOS!");
		}

	}

	// metodo para editar um usuario
	public void alterarUsuario(String nome, String sexo, int telefone, int idade, int rg, String cPF, Long numConta,
			String email) {

		Usuario usuarioEDT = buscarCPFUsuario(cPF);

		if (usuarioEDT != null) {
			if (nome != null && nome != usuarioEDT.getNome())
				usuarioEDT.setNome(nome);
			if (cPF != null && cPF != usuarioEDT.getCPF())
				usuarioEDT.setCPF(cPF);
			if (numConta > 0 && numConta != usuarioEDT.getNumConta())
				usuarioEDT.setNumConta(numConta);
			if (email != null && email != usuarioEDT.getEmail())
				usuarioEDT.setEmail(email);
			if (telefone > 0 && telefone != usuarioEDT.getTelefone())
				usuarioEDT.setTelefone(telefone);
			if (sexo != null && sexo != usuarioEDT.getSexo())
				usuarioEDT.setSexo(sexo);
			if (idade > 0 && idade != usuarioEDT.getIdade())
				usuarioEDT.setIdade(idade);
			if (rg > 0 && rg != usuarioEDT.getRg())
				usuarioEDT.setRg(rg);

		}

	}

	// metodo para apagar um usuario
	public void excluirUsuario(String cPF) {

		Usuario usuarioDEL = buscarCPFUsuario(cPF);

		if (usuarioDEL != null) {
			System.out.println("**************************************");
			System.err.println("DESEJA APAGAR ESTE USUARIO?");
			System.out.println("************************************");
			System.out.println("ID USUARIO : " + usuarioDEL.getidUsuario());
			System.out.println("NOME : " + usuarioDEL.getNome());
			System.out.println("SEXO : " + usuarioDEL.getSexo());
			System.out.println("IDADE : " + usuarioDEL.getIdade());
			System.out.println("CPF : " + usuarioDEL.getCPF());
			System.out.println("Nº CONTA : " + usuarioDEL.getNumConta());
			System.out.println("EMAIL : " + usuarioDEL.getEmail());
			System.out.println("RG : " + usuarioDEL.getRg());
			System.out.println("TELEFONE : " + usuarioDEL.getTelefone());
			System.out.println("************************************");

			this.repositorioUsuario.remove(usuarioDEL);
			System.err.println("USUARIO EXCLUIDO COM SUCESSO!");

		}

	}

	// metodo para buscar um usuario pelo cpf
	public Usuario buscarCPFUsuario(String cPF) {

		for (Usuario usuario : repositorioUsuario) {

			if (cPF != null) {
				if (usuario.getCPF().equals(cPF))
					System.out.println("USUARIO ENCONTRADO!");
				return usuario;

			}

			if (cPF != usuario.getCPF()) {
				System.err.println("USUARIO NÃO ENCONTRADO!");

			}

		}
		return null;

	}

	// metodo para buscar um usuario pelo id
	public Usuario buscaridUsuario(int idUsuario) {

		for (Usuario usuario : repositorioUsuario) {

			if (idUsuario > 0) {
				if (usuario.getidUsuario() == (idUsuario))
					System.out.println("USUARIO ENCONTRADO!");
				return usuario;

			}

			if (idUsuario != usuario.getidUsuario()) {
				System.err.println("USUARIO NÃO ENCONTRADO!");

			}

		}
		return null;

	}

}
