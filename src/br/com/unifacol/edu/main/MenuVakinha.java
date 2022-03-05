package br.com.unifacol.edu.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.unifacol.vakinha.entidades.Pessoa;
import br.com.unifacol.vakinha.entidades.VakinhaCampanha;
import br.com.unifacol.vakinha.entidades.Usuario;

import br.com.unifacol.vakinha.servicos.ServicosCampanha;
import br.com.unifacol.vakinha.servicos.ServicosUsuario;

public class MenuVakinha {

	public static ServicosUsuario servUsuario = new ServicosUsuario();
	public static ServicosCampanha servCampanha = new ServicosCampanha(servUsuario);

	public ArrayList<VakinhaCampanha> repCampTeste = new ArrayList<VakinhaCampanha>();
	public ArrayList<Usuario> repUserTeste = new ArrayList<Usuario>();

	static VakinhaCampanha c1 = new VakinhaCampanha();
	static VakinhaCampanha c2 = new VakinhaCampanha();

	static Usuario u1 = new Usuario();
	static Usuario u2 = new Usuario();
	static Usuario u3 = new Usuario();

	public static void main(String[] args) {
		// classe temporaria de teste

		u1.setCPF("7337");
		u1.setidUsuario(1);
		u1.setEmail("aruba");
		u1.setIdade(56);
		u1.setNome("julia");
		u1.setNumConta((long) 5454);
		u1.setRg(543);
		u1.setSexo("f");
		u1.setTelefone(654);

		u2.setCPF("435");
		u2.setidUsuario(2);
		u2.setEmail("raia");
		u2.setIdade(63);
		u2.setNome("maria");
		u2.setNumConta((long) 252);
		u2.setRg(8438);
		u2.setSexo("f");
		u2.setTelefone(726327);

		u3.setCPF("736");
		u3.setidUsuario(3);
		u3.setEmail("galinha");
		u3.setIdade(63);
		u3.setNome("tania");
		u3.setNumConta((long) 635);
		u3.setRg(733);
		u3.setSexo("f");
		u3.setTelefone(635);

		servUsuario.repositorioUsuario.add(u1);
		servUsuario.repositorioUsuario.add(u2);
		
		servUsuario.repositorioUsuario.add(u3);

		c1.setIdUsuario(u2);
		c1.setIdVakinha(1);
		c1.setMeta(200);
		c1.setnApoiadores(0);
		c1.setSobre("para fazer uma ultrassom");
		c1.setValorArrecadado(0);

		c2.setIdUsuario(u1);
		c2.setIdVakinha(2);
		c2.setMeta(362);
		c2.setnApoiadores(0);
		c2.setSobre("para fazer um parto");
		c2.setValorArrecadado(0);

		servCampanha.repositorioCampanhas.add(c1);
		servCampanha.repositorioCampanhas.add(c2);
		
		//servUsuario.alterarUsuario("ferreira", "435", (long) (444), "email.editado", 123);
		
		//servUsuario.alterarUsuario("ferreira", "736", (long) (4352), "email.unifacol", 32837);

		// servCampanha.cadastrarCampanha(1, 1, 0, 100, 0, false, "para comprar uma
		// bola!");

		// servUsuario.cadastrarUsuario(1, "jose", "abc", (long) 1.000, "jose.com",
		// 190);

		servUsuario.listarUsuarios();
		// servCampanha.cadastrarCampanha(1, 1, 0, 30, 0, true, "em prol da compra de
		// uma bengala!");
		// servCampanha.cadastrarCampanha(2, 1, 0, 300, 0, true, "em prol da compra de
		// uma CHAPA!");
		//servCampanha.listarVakinhas();
		
		
		servCampanha.listarVakinhas();
		//servCampanha.realizarDoacao(1, u1,80);
		//servCampanha.realizarDoacao(2, 5);

		// servCampanha.listarVakinhas();
		//servCampanha.alterar(1, false, "para comprar uma sonda", 40_000.00);
		//servCampanha.alterar(2, false, "para comprar uma cadeira de rodas", 4000);

		//servCampanha.listarVakinhas();
		
		//servCampanha.realizarDoacao(2, 500);
		
		//servCampanha.listarVakinhas();
		
		//servCampanha.buscarPoridVakinha(2);

	}

}
