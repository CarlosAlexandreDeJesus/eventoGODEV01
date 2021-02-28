package br.com.SistemaEventoTest;

import org.junit.jupiter.api.Test;

import br.com.evento.CadastroPessoa;
import br.com.evento.Tela;

public class CadastroPessoaTest {
	
	Tela tela = new Tela();
	CadastroPessoa ca = new CadastroPessoa("a","b");
	@Test
	public void testeNomes() {
		CadastroPessoa ca = new CadastroPessoa("c","d");
		ca.setNome("c");
		ca.setSobrenome("d");
	}
}
