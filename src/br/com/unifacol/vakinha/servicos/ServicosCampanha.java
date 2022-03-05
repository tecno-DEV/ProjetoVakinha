package br.com.unifacol.vakinha.servicos;

import java.util.ArrayList;
import br.com.unifacol.vakinha.entidades.VakinhaCampanha;
import br.com.unifacol.vakinha.entidades.Usuario;
import br.com.unifacol.vakinha.interfaces.ICampanhas;

public class ServicosCampanha implements ICampanhas {

	private ServicosUsuario servUsuario;

	public ArrayList<VakinhaCampanha> repositorioCampanhas;

	public ServicosCampanha(ServicosUsuario servUsuario) {
		this.repositorioCampanhas = new ArrayList<VakinhaCampanha>();
		this.servUsuario = servUsuario;
	}

	//metodo para cadastrar uma nova vakinha
	public void cadastrarCampanha(int idVakinha, Usuario idUsuario, double meta, String sobre) {

		int codUsuario = idUsuario.getidUsuario();

		if (buscarPoridVakinha(idVakinha) == null) {
			if (sobre != null && servUsuario.buscaridUsuario(codUsuario) != null && meta > 0 ) {

				this.repositorioCampanhas
						.add(new VakinhaCampanha(idVakinha, idUsuario, meta, sobre));

				System.out.println("Vakinha CADASTRADA COM SUCESSO!");
			} else {
				System.err.println("dados invalidos... Vakinha NAO CADASTRADA!");
			}

		}

	}

	//metodo para editar uma vakinha existente
	public void alterar(int edtVakinha, String sobre, double meta) {

		VakinhaCampanha campanhaEncontrada = buscarPoridVakinha(edtVakinha);
		if (campanhaEncontrada != null) {
			if (sobre != null && sobre != campanhaEncontrada.getSobre())
				campanhaEncontrada.setSobre(sobre);
			if (meta > 0 && meta != campanhaEncontrada.getMeta())
				campanhaEncontrada.setMeta(meta);

		}

	}

	//metodo para apagar uma vakinha
	public void excluir(int idVakinha) {
		VakinhaCampanha campanhaDel = buscarPoridVakinha(idVakinha);
		if (campanhaDel != null) {
			System.err.println("DESEJA EXCLUIR ESTE CAMPANHA ?");
			System.out.println("-------------------------------------");
			System.out.println("ID VAKINHA: " + campanhaDel.getIdVakinha());
			System.out.println("ID USUARIO: " + campanhaDel.getIdUsuario().getidUsuario());
			System.out.println("VALOR ARRECADADO: " + campanhaDel.getValorArrecadado());
			System.out.println("META: " + campanhaDel.getMeta());
			System.out.println("Nº APOIADORES: " + campanhaDel.getnApoiadores());
			System.out.println("SOBRE: " + campanhaDel.getSobre());
			System.out.println("PROGRESSO: " + campanhaDel.getProgresso()+ " %");
			System.out.println("-------------------------------------");
			this.repositorioCampanhas.remove(campanhaDel);
			System.out.println("CAMPANHA EXCLUIDA COM SUCESSO!");
		}

	}

	//metodo para listar todas as vakinhas cadastradas
	public void listarVakinhas() {

		if (repositorioCampanhas.size() > 0) {
			for (VakinhaCampanha campanha : repositorioCampanhas) {
				System.out.println("=========================================");
				System.out.println("Listando VAKINHAS ATIVAS...");
				System.out.println("=========================================");
				System.out.println("ID VAKINHA: " + campanha.getIdVakinha());
				System.out.println("ID USUARIO: " + campanha.getIdUsuario().getidUsuario());
				System.out.println("VALOR ARRECADADO: " + campanha.getValorArrecadado());
				System.out.println("META: " + campanha.getMeta());
				System.out.println("Nº APOIADORES: " + campanha.getnApoiadores());
				System.out.println("PROGRESSO: " + campanha.getProgresso() + " %");
				System.out.println("SOBRE: " + campanha.getSobre());
				System.out.println("==========================================");
			}

		} else {
			System.out.println("NÃO HÁ VAKINHAS CADASTRADAS!");
		}
	}


	//metodo para buscar uma vakinha por id
	public VakinhaCampanha buscarPoridVakinha(int idVakinha) {

		for (VakinhaCampanha campanha : repositorioCampanhas) {

			if (idVakinha > 0) {
				if (campanha.getIdVakinha() == idVakinha)
					System.out.println("VAKINHA ENCONTRADA!");

				return campanha;
			}

			if (campanha.getIdVakinha() != idVakinha) {
				System.err.println("VAKINHA NÃO ENCONTRADA!");
			}

		}
		return null;
	}
}
