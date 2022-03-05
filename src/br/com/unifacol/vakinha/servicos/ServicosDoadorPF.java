package br.com.unifacol.vakinha.servicos;

import java.util.ArrayList;

import br.com.unifacol.vakinha.entidades.DoadorPF;

public class ServicosDoadorPF {

	public ArrayList<DoadorPF> repositorioDoadorpf;

	public ServicosDoadorPF() {
		this.repositorioDoadorpf = new ArrayList<DoadorPF>();
	}

	// metodo para buscar um doador pf pelo cpf
	public DoadorPF buscarIdDoadorpf(int cpf) {

		for (DoadorPF doadorpfEnc : repositorioDoadorpf) {
			if (cpf > 0) {
				if (cpf == doadorpfEnc.getCpf())
					;
				System.out.println("DOADOR PF ENCONTRADO!");
				return doadorpfEnc;

			} else if (cpf == 0 || cpf != doadorpfEnc.getCpf()) {
				System.err.println("DOADOR PF NÃO ENCONTRADO!");
			}

		}
		return null;

	}

	// metodo para cadastrar um doador pf
	public void cadastrarDoadorPF(String nome, String sexo, int telefone, int idade, int rg, String email, int cpf) {

		if (buscarIdDoadorpf(cpf) == null) {
			if (nome != null && sexo != null && telefone > 0 && idade > 0 && rg > 0 && email != null && cpf > 0) {

				this.repositorioDoadorpf.add(new DoadorPF(nome, sexo, telefone, idade, rg, cpf, email));

			}

		} else {
			System.out.println("DOADOR PF NÃO CADASTRADO!");

		}

	}

	// metodo para exibir todos os doadores pf
	public void listarDoadoresPF() {

		if (repositorioDoadorpf.size() > 0) {
			for (DoadorPF doadoresPF : repositorioDoadorpf) {
				System.out.println("*****************************");
				System.out.println("LISTANDO DOADORES PJ...");
				System.out.println("*****************************");
				System.out.println("CPF : " + doadoresPF.getCpf());
				System.out.println("NOME : " + doadoresPF.getNome());
				System.out.println("SEXO : " + doadoresPF.getSexo());
				System.out.println("TELEFONE : " + doadoresPF.getTelefone());
				System.out.println("IDADE : " + doadoresPF.getIdade());
				System.out.println("RG : " + doadoresPF.getRg());
				System.out.println("EMAIL : " + doadoresPF.getEmail());
				System.out.println("*****************************");
			}
		} else {
			System.out.println("NÃO HÁ DOADORES PF CADASTRADOS!");

		}

	}

	// metodo para apagar um doador pf
	public void excluirDoadorPJ(int cpf) {

		DoadorPF doadorPFdel = buscarIdDoadorpf(cpf);

		if (doadorPFdel != null) {
			System.out.println("-----------------------------");
			System.out.println("DESEJA APAGAR ESTE DOADOR Pf?");
			System.out.println("-----------------------------");
			System.out.println("CPF : " + doadorPFdel.getCpf());
			System.out.println("NOME : " + doadorPFdel.getNome());
			System.out.println("SEXO : " + doadorPFdel.getSexo());
			System.out.println("TELEFONE : " + doadorPFdel.getTelefone());
			System.out.println("IDADE : " + doadorPFdel.getIdade());
			System.out.println("RG : " + doadorPFdel.getRg());
			System.out.println("EMAIL : " + doadorPFdel.getEmail());
			System.out.println("*****************************");

			this.repositorioDoadorpf.remove(doadorPFdel);
			System.out.println("DOADOR PF EXCLUIDO COM SUCESSO!");

		}

	}

	// metodo para editar um doador pf
	public void editarDoadorPF(int cpf, String nome, String sexo, int telefone, int idade, int rg, String email) {

		DoadorPF doadorpfEdit = buscarIdDoadorpf(cpf);

		if (doadorpfEdit != null) {
			if (nome != null && nome != doadorpfEdit.getNome())
				doadorpfEdit.setNome(nome);
			if (sexo != null && sexo != doadorpfEdit.getSexo())
				doadorpfEdit.setSexo(sexo);
			if (telefone > 0 && telefone != doadorpfEdit.getTelefone())
				doadorpfEdit.setTelefone(telefone);
			if (idade > 0 && idade != doadorpfEdit.getIdade())
				doadorpfEdit.setIdade(idade);
			if (rg > 0 && rg != doadorpfEdit.getRg())
				doadorpfEdit.setRg(rg);
			if (email != null && email != doadorpfEdit.getEmail())
				doadorpfEdit.setEmail(email);
		}

	}

}
