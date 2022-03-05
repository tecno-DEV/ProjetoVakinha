package br.com.unifacol.vakinha.servicos;

import java.util.ArrayList;

import br.com.unifacol.vakinha.entidades.DoadorPJ;
import br.com.unifacol.vakinha.entidades.Pessoa;

public class ServicosDoadorPJ {

	public ArrayList<DoadorPJ> repositorioDoadorpj;

	public ServicosDoadorPJ() {
		this.repositorioDoadorpj = new ArrayList<DoadorPJ>();
	}

	//metodo para buscar um doador pj pelo cnpj
	public DoadorPJ buscarIdDoadorpj(int cnpj) {

		for (DoadorPJ doadorpjEnc : repositorioDoadorpj) {
			if (cnpj > 0) {
				if (cnpj == doadorpjEnc.getCnpj())
					;
				System.out.println("DOADOR PJ ENCONTRADO!");
				return doadorpjEnc;

			} else if (cnpj == 0 || cnpj != doadorpjEnc.getCnpj()) {
				System.err.println("DOADOR PJ NÃO ENCONTRADO!");
			}

		}
		return null;

	}

	//metodo para cadastrar um doador pj
	public void cadastrarDoadorPJ(String nome, String sexo, int telefone, int idade, int rg, String razaoSocial,
			int cnpj) {

		if (buscarIdDoadorpj(cnpj) == null) {
			if (nome != null && sexo != null && telefone > 0 && idade > 0 && rg > 0 && razaoSocial != null
					&& cnpj > 0) {

				this.repositorioDoadorpj.add(new DoadorPJ(nome, sexo, telefone, idade, rg, razaoSocial, cnpj));

			}

		} else {
			System.out.println("DOADOR PJ NÃO CADASTRADO!");

		}

	}

	//metodo para exibir todos os doadores pj
	public void listarDoadoresPJ() {

		if (repositorioDoadorpj.size() > 0) {
			for (DoadorPJ doadoresPJ : repositorioDoadorpj) {
				System.out.println("*****************************");
				System.out.println("LISTANDO DOADORES PJ...");
				System.out.println("*****************************");
				System.out.println("CNPJ : " + doadoresPJ.getCnpj());
				System.out.println("NOME : " + doadoresPJ.getNome());
				System.out.println("SEXO : " + doadoresPJ.getSexo());
				System.out.println("TELEFONE : " + doadoresPJ.getTelefone());
				System.out.println("IDADE : " + doadoresPJ.getIdade());
				System.out.println("RG : " + doadoresPJ.getRg());
				System.out.println("RAZÃO SOCIAL : " + doadoresPJ.getRazaoSoacial());
				System.out.println("*****************************");
			}
		} else {
			System.out.println("NÃO HÁ DOADORES PJ CADASTRADOS!");

		}

	}

	//metodo para apagar um doador pj
	public void excluirDoadorPJ(int cnpj) {

		DoadorPJ doadorPJdel = buscarIdDoadorpj(cnpj);

		if (doadorPJdel != null) {
			System.out.println("-----------------------------");
			System.out.println("DESEJA APAGAR ESTE DOADOR PJ?");
			System.out.println("-----------------------------");
			System.out.println("CNPJ : " + doadorPJdel.getCnpj());
			System.out.println("NOME : " + doadorPJdel.getNome());
			System.out.println("SEXO : " + doadorPJdel.getSexo());
			System.out.println("TELEFONE : " + doadorPJdel.getTelefone());
			System.out.println("IDADE : " + doadorPJdel.getIdade());
			System.out.println("RG : " + doadorPJdel.getRg());
			System.out.println("RAZÃO SOCIAL : " + doadorPJdel.getRazaoSoacial());
			System.out.println("*****************************");

			this.repositorioDoadorpj.remove(doadorPJdel);
			System.out.println("DOADOR PJ EXCLUIDO COM SUCESSO!");

		}

	}

	//metodo para editar um doador pj
	public void editarDoadorPJ(int cnpj, String nome, String sexo, int telefone, int idade, int rg,
			String razaoSocial) {

		DoadorPJ doadorpjEdit = buscarIdDoadorpj(cnpj);

		if (doadorpjEdit != null) {
			if (nome != null && nome != doadorpjEdit.getNome())
				doadorpjEdit.setNome(nome);
			if (sexo != null && sexo != doadorpjEdit.getSexo())
				doadorpjEdit.setSexo(sexo);
			if (telefone > 0 && telefone != doadorpjEdit.getTelefone())
				doadorpjEdit.setTelefone(telefone);
			if (idade > 0 && idade != doadorpjEdit.getIdade())
				doadorpjEdit.setIdade(idade);
			if (rg > 0 && rg != doadorpjEdit.getRg())
				doadorpjEdit.setRg(rg);
			if (razaoSocial != null && razaoSocial != doadorpjEdit.getRazaoSoacial())
				doadorpjEdit.setRazaoSoacial(razaoSocial);
		}

	}

}
