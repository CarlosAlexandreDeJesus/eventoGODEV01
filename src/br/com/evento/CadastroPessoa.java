package br.com.evento;

public class CadastroPessoa {
	
	@Override
	public String toString() {
		return  nome + " " + sobrenome ;
	}
	protected String nome,sobrenome;
	public CadastroPessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public CadastroPessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
