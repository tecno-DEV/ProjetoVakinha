package br.com.unifacol.vakinha.servicos;

import br.com.unifacol.vakinha.entidades.Doacoes;
import br.com.unifacol.vakinha.entidades.Usuario;
import br.com.unifacol.vakinha.entidades.DoadorPJ;
import br.com.unifacol.vakinha.entidades.DoadorPF;
import br.com.unifacol.vakinha.entidades.VakinhaCampanha;

import java.util.ArrayList;

public class ServicosDoacoes {

	ServicosUsuario servUsuario;
	ServicosCampanha servCampanha;
	ServicosDoadorPF servDoadorPF;
	ServicosDoadorPJ servDoadorPJ;

	public ArrayList<Doacoes> repositorioDoacoes;

	public ServicosDoacoes(ServicosUsuario servUsuario, ServicosCampanha servCampanha, ServicosDoadorPF servDoadorPF,
			ServicosDoadorPJ servDoadorPJ) {

		this.repositorioDoacoes = new ArrayList<Doacoes>();
		this.servUsuario = servUsuario;
		this.servCampanha = servCampanha;
		this.servDoadorPF = servDoadorPF;
		this.servDoadorPJ = servDoadorPJ;

	}

	// metodo para cadastrar uma nova doacao do tipo doador pf
	public void realizarDoacaoPF(int idDoacao, DoadorPF doadorPF, double valor, String tipoDoacao,
			VakinhaCampanha idVakinha) {

		int idDoadorPF = doadorPF.getCpf();
		int IdVakinha = idVakinha.getIdVakinha();

		Doacoes novaDoacao = buscarIdDoacao(idDoacao);

		// VakinhaCampanha campanhaDoar = servCampanha.buscarPoridVakinha(IdVakinha);

		// DoadorPF doadorPf = servDoadorPF.buscarIdDoadorpf(idDoadorPF);

		if (buscarIdDoacao(idDoacao) == null && servDoadorPF.buscarIdDoadorpf(idDoadorPF) != null
				&& servCampanha.buscarPoridVakinha(IdVakinha) != null && valor > 0 && tipoDoacao != null) {

			idVakinha.setValorArrecadado(idVakinha.getValorArrecadado() + valor);
			idVakinha.setProgresso((idVakinha.getValorArrecadado() * 100) / idVakinha.getMeta());

			this.repositorioDoacoes.add(new Doacoes(idDoacao, doadorPF, valor, tipoDoacao, idVakinha));

			for (Doacoes doacoesApoiadores : repositorioDoacoes) {
				if (servDoadorPF.buscarIdDoadorpf(idDoadorPF) != doacoesApoiadores.getDoadorPF())
					;
				idVakinha.setnApoiadores(idVakinha.getnApoiadores() + 1);
			}
			System.out.println("DOAÇÃO REALIZADA COM SUCESSO!");

		} else
			System.out.println("DOACAO NÃO REALIZADA!");

	}

	// metodo para cadastrar uma doacao do tipo pj
	public void realizarDoacaoPJ(int idDoacao, DoadorPJ doadorPJ, double valor, String tipoDoacao,
			VakinhaCampanha idVakinha) {

		int idDoadorPJ = doadorPJ.getCnpj();
		int IdVakinha = idVakinha.getIdVakinha();

		Doacoes novaDoacao = buscarIdDoacao(idDoacao);

		if (buscarIdDoacao(idDoacao) == null && servDoadorPJ.buscarIdDoadorpj(idDoadorPJ) != null
				&& servCampanha.buscarPoridVakinha(IdVakinha) != null && valor > 0 && tipoDoacao != null) {

			idVakinha.setValorArrecadado(idVakinha.getValorArrecadado() + valor);
			idVakinha.setProgresso((idVakinha.getValorArrecadado() * 100) / idVakinha.getMeta());

			this.repositorioDoacoes.add(new Doacoes(idDoacao, doadorPJ, valor, tipoDoacao, idVakinha));

			for (Doacoes doacoesApoiadores : repositorioDoacoes) {
				if (servDoadorPJ.buscarIdDoadorpj(idDoadorPJ) != doacoesApoiadores.getDoadorPJ())
					;
				idVakinha.setnApoiadores(idVakinha.getnApoiadores() + 1);
			}
			System.out.println("DOAÇÃO REALIZADA COM SUCESSO!");

		} else
			System.out.println("DOACAO NÃO REALIZADA!");

	}

	// metodo para buscar uma doacao por id
	public Doacoes buscarIdDoacao(int idDoacao) {

		if (idDoacao > 0) {
			for (Doacoes doacaoEncontrada : repositorioDoacoes) {
				if (idDoacao == doacaoEncontrada.getIdDoacao())
					System.out.println("DOACAO ENCONTRADA!");
				return doacaoEncontrada;
			}

		}
		System.err.println("DOACAO NÃO ENCONTRADA!");
		return null;

	}

	// metodo para exibir todas as doacoes pf
	public void imprimirDoacoesPF() {

		if (repositorioDoacoes.size() > 0) {
			System.out.println("IMPRIMINDO DOACOES...");
			for (Doacoes listaDoacoes : repositorioDoacoes) {
				System.out.println("-------------------------------------");
				System.out.println("ID.DOACAO: " + listaDoacoes.getIdDoacao());
				System.out.println("ID.VAKINHA: " + listaDoacoes.getIdVakinha());
				System.out.println("ID.DOADOR PF: " + listaDoacoes.getDoadorPF());
				System.out.println("VALOR: " + listaDoacoes.getValor());
				System.out.println("TIPO DOACAO: " + listaDoacoes.getTipoDoacao());
				System.out.println("-------------------------------------");

			}
		}
	}

//metodos para exibir todas as doacoes pj
	public void imprimirDoacoesPJ() {

		if (repositorioDoacoes.size() > 0) {
			System.out.println("IMPRIMINDO DOACOES...");
			for (Doacoes listaDoacoes : repositorioDoacoes) {
				System.out.println("-------------------------------------");
				System.out.println("ID.DOACAO: " + listaDoacoes.getIdDoacao());
				System.out.println("ID.VAKINHA: " + listaDoacoes.getIdVakinha());
				System.out.println("ID.DOADOR PJ: " + listaDoacoes.getDoadorPJ());
				System.out.println("VALOR: " + listaDoacoes.getValor());
				System.out.println("TIPO DOACAO: " + listaDoacoes.getTipoDoacao());
				System.out.println("-------------------------------------");

			}
		}
	}

	// metodo para retornar uma doacao pf pelo id
	public void imprimirDoacaoPFPorCodigo(int idDoacao) {

		Doacoes doacaoEncontrada = buscarIdDoacao(idDoacao);
		if (doacaoEncontrada != null) {
			System.out.println("-------------------------------------");
			System.out.println("DOACAO PF ENCONTRADA:");
			System.out.println("-------------------------------------");
			System.out.println("ID.DOACAO: " + doacaoEncontrada.getIdDoacao());
			System.out.println("ID.VAKINHA: " + doacaoEncontrada.getIdVakinha());
			System.out.println("ID.DOADOR PF: " + doacaoEncontrada.getDoadorPF());
			System.out.println("VALOR: " + doacaoEncontrada.getValor());
			System.out.println("TIPO DOACAO: " + doacaoEncontrada.getTipoDoacao());
			System.out.println("-------------------------------------");

		}

	}

	// metodo para retornar uma doacao pj pelo id
	public void imprimirDoacaoPJPorCodigo(int idDoacao) {

		Doacoes doacaoEncontrada = buscarIdDoacao(idDoacao);
		if (doacaoEncontrada != null) {
			System.out.println("-------------------------------------");
			System.out.println("DOACAO PF ENCONTRADA:");
			System.out.println("-------------------------------------");
			System.out.println("ID.DOACAO: " + doacaoEncontrada.getIdDoacao());
			System.out.println("ID.VAKINHA: " + doacaoEncontrada.getIdVakinha());
			System.out.println("ID.DOADOR PJ: " + doacaoEncontrada.getDoadorPJ());
			System.out.println("VALOR: " + doacaoEncontrada.getValor());
			System.out.println("TIPO DOACAO: " + doacaoEncontrada.getTipoDoacao());
			System.out.println("-------------------------------------");

		}

	}

}
