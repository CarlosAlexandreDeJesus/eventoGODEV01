package br.com.evento;

import java.util.ArrayList;

public class ListarEspacoCafe {

	ArrayList<CadastroEspacoCafe> listaEspacoCafe;
	
	public ListarEspacoCafe() {
		this.listaEspacoCafe = new ArrayList<CadastroEspacoCafe>();
	}
	
	public void adicionarEspacoCafe(CadastroEspacoCafe espacoCafe) {
		this.listaEspacoCafe.add(espacoCafe);
	}

	public ArrayList<CadastroEspacoCafe> getListarEspacoCafe() {
		return this.listaEspacoCafe;
	}

}
