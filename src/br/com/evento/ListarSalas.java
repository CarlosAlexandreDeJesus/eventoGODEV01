package br.com.evento;

import java.util.ArrayList;

public class ListarSalas{
	
	
	ArrayList<CadastroSalas> listaSala;
	
	public ListarSalas() {
		this.listaSala = new ArrayList<CadastroSalas>();
	}
	public void adicionarSalas(CadastroSalas sala) {
		this.listaSala.add(sala);
	}
	public ArrayList<CadastroSalas> getListarSalas() {
		return this.listaSala;
	}

}
