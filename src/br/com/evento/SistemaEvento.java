package br.com.evento;

import java.util.ArrayList;

public class SistemaEvento {
	
	ListarEspacoCafe listarEspacoCafe = new ListarEspacoCafe();
	ListarPessoa listaPessoa = new ListarPessoa();
	ListarSalas listaSala = new ListarSalas();
	ArrayList <CadastroEspacoCafe> salaCafe = listarEspacoCafe.getListarEspacoCafe();
	ArrayList <CadastroSalas> cadSala = listaSala.getListarSalas();
	ArrayList <CadastroPessoa> varPessoa = listaPessoa.getListarPessoa();
	private Tela tela = new Tela();

	public void menuIniciar() {
		
		int opcao=0;
		
		do {
			opcao = tela.cadastroGeral();
			
			switch(opcao) {
			case 1 :	
				CadastroPessoa pessoa = tela.cadastroDePessoas();
				listaPessoa.adicionarPessoa(pessoa);
				break;
			
			case 2 :	
				CadastroSalas salas = tela.cadastroDasSalas();
				listaSala.adicionarSalas(salas);
				break;
			
			case 3:	
				CadastroEspacoCafe espacoCafe = tela.cadastroDoEspacoCafe();
				listarEspacoCafe.adicionarEspacoCafe(espacoCafe);
				break;
			
			case 4 :
				//Consulta Sala
				//ArrayList <CadastroSalas> cadSala = listaSala.getListarSalas();
				ArrayList <CadastroPessoa> pe = listaPessoa.getListarPessoa();
				for(CadastroSalas salaCorrente : cadSala) {
					tela.imprimirSala(salaCorrente,pe);
				}
				break;
			case 5 :
				//Consulta Espaço cafe
				//ArrayList <CadastroEspacoCafe> salaCafe = listarEspacoCafe.getListarEspacoCafe();
				ArrayList <CadastroPessoa> varParaPessoa = listaPessoa.getListarPessoa();
				for(CadastroEspacoCafe varsalaCafe : salaCafe) {
					tela.imprimirEspacoCafe(varsalaCafe,varParaPessoa);
				}
				break;
			case 6 :
				//Consulta Pessoa
				ArrayList<CadastroPessoa> listPessoa= listaPessoa.getListarPessoa();
				
				for(CadastroPessoa pessoaVar : varPessoa) {
					tela.imprimirPessoa(pessoaVar,listPessoa,listarEspacoCafe,listaSala);
				}
				break;
			}
		}while(opcao != 0);
	}
	
}

