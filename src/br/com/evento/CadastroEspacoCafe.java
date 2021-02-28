package br.com.evento;

public class CadastroEspacoCafe {
	
	protected String espacoCafe1,espacoCafe2;


	public CadastroEspacoCafe(String espacoCafe1, String espacoCafe2) {
		setEspacoCafe1(espacoCafe1);
		setEspacoCafe2(espacoCafe2);
	}
	@Override
	public String toString() {
		return  espacoCafe1 + " " + espacoCafe2;
	}
	
	public CadastroEspacoCafe() {
		
	}
	public String getEspacoCafe1() {
		return espacoCafe1;
	}

	public void setEspacoCafe1(String espacoCafe1) {
		this.espacoCafe1 = espacoCafe1;
	}

	public String getEspacoCafe2() {
		return espacoCafe2;
	}

	public void setEspacoCafe2(String espacoCafe2) {
		this.espacoCafe2 = espacoCafe2;
	}
}
