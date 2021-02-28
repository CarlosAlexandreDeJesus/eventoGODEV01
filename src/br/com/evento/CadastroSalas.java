package br.com.evento;

public class CadastroSalas {
	
	protected String nomeSala1, nomeSala2;
	protected int lotacaoSala1,lotacaoSala2;
   
	@Override
	public String toString() {
		return  nomeSala1 + " " + nomeSala2;
	}

	public CadastroSalas(String nomeSala1, int lotacaoSala1,String nomeSala2, int lotacaoSala2) {
		setNomeSala1(nomeSala1);
		setLotacaoSala1(lotacaoSala1);
		setNomeSala2(nomeSala2);
		setLotacaoSala2(lotacaoSala2);
	}
	
	public CadastroSalas() {
	}
	
	public String getNomeSala1() {
		return nomeSala1;
	}

	public void setNomeSala1(String nomeSala1) {
		this.nomeSala1 = nomeSala1;
	}

	public String getNomeSala2() {
		return nomeSala2;
	}

	public void setNomeSala2(String nomeSala2) {
		this.nomeSala2 = nomeSala2;
	}

	public int getLotacaoSala1() {
		return lotacaoSala1;
	}

	public void setLotacaoSala1(int lotacaoSala1) {
		this.lotacaoSala1 = lotacaoSala1;
	}

	public int getLotacaoSala2() {
		return lotacaoSala2;
	}

	public void setLotacaoSala2(int lotacaoSala2) {
		this.lotacaoSala2 = lotacaoSala2;
	}
	
}
