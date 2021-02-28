package br.com.SistemaEventoTest;

import org.junit.jupiter.api.Test;

import br.com.evento.SistemaEvento;
import br.com.evento.Tela;

public class SistemaEventoTest {
	
	SistemaEvento sistema = new SistemaEvento();
	Tela tela = new Tela();
	@Test
	  public void testeInteiros() {
		
		 sistema.menuIniciar();
		  
		 int resultado = tela.cadastroGeral();
		 
		 if(resultado < 0 || resultado > 6) {
			 System.out.println("Valor indeferido");
		 }
		 
	}
	
}






