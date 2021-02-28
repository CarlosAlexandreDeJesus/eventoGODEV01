package br.com.evento;

import java.util.ArrayList;

public class ListarPessoa {
	
	ArrayList<CadastroPessoa> listaPessoas;
	
	public ListarPessoa() {
		this.listaPessoas = new ArrayList<CadastroPessoa>();
	}
	
	public void adicionarPessoa(CadastroPessoa pessoa) {
		this.listaPessoas.add(pessoa);
	}

	public ArrayList<CadastroPessoa> getListarPessoa() {
		return this.listaPessoas;
	}

}
