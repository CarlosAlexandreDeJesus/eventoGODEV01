package br.com.evento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Tela {
	
	CadastroEspacoCafe espacoCafe = new CadastroEspacoCafe();
	CadastroSalas sala = new CadastroSalas();
	SistemaEvento sistema = new SistemaEvento();
	
	Scanner teclado = new Scanner(System.in);
	
	public int cadastroGeral() {
		
		System.out.println();
		System.out.println("------------ Cadastramento Do Evento -----------");
		System.out.println();
		System.out.println("* 1 - Cadastro das Pessoas                     *");
		System.out.println("* 2 - Cadastro das Salas                       *");
		System.out.println("* 3 - Cadastro Espaço Café                     *");
		System.out.println("* 4 - Consultar Sala                           *");
		System.out.println("* 5 - Consultar Espaço Café                    *");
		System.out.println("* 6 - Consultar Pessoa                         *");
		System.out.println("* 0 - Sair                                     *");
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println("Digite uma opção: ");
		String opcao = teclado.next();
		int i = 0;
		  try {
		       i = Integer.parseInt(opcao);
		      if(i < 0 || i > 6)
		    	  System.out.println("Digite um numero de 0 a 6");
		      return i;
		         
		    } catch (Exception e) {
		    	System.out.println("Digite um numero de 0 a 6");
		        sistema.menuIniciar();
		    }
		
		return i;
	}

	public CadastroPessoa cadastroDePessoas() {
		
		System.out.println("---------------- Cadastrando Pessoas ------------");
		System.out.println();
		System.out.println("----------------- Infome seu nome ---------------");
		String nome = teclado.next();
		System.out.println();
		System.out.println("----------------  Infome seu sobrenome ---------");
		String sobrenome = teclado.next();
		CadastroPessoa nomeSobrenome = new CadastroPessoa(nome, sobrenome);
		return nomeSobrenome;
	}
	
	public CadastroSalas cadastroDasSalas() {
		
		System.out.println("----------------------Cadastrando Salas ------------------");
		System.out.println();
		System.out.println("------------ Informe o nome da sala 1 ----------");
		String nomeSala1 = teclado.next();
		System.out.println();
		System.out.println("------------ Informe a lotação maxima da sala " + nomeSala1);
		int lotacaoSala1 = teclado.nextInt();
		System.out.println();
		
		System.out.println("------------ Informe o nome da sala 2 ----------");
		String nomeSala2 = teclado.next();
		int lotacaoSala2;
		do {
			System.out.println("------------ Informe a lotação maxima da sala " + nomeSala2);
			lotacaoSala2 = teclado.nextInt();
			++lotacaoSala1;
			if(lotacaoSala2 > lotacaoSala1 ) {
				System.out.println("A lotação da sala" + nomeSala2 + " não pode ser maior que a lotação da sala " + nomeSala1);
				System.out.println("A lotação da sala " + nomeSala2 + " só pode ter no máximo uma pessoa a mais do que " + nomeSala1);
			}
			}while(lotacaoSala2 > lotacaoSala1);
		System.out.println();
		CadastroSalas cadastroSala = new CadastroSalas(nomeSala1,lotacaoSala1,nomeSala2,lotacaoSala2);
		return cadastroSala;
	}
	
	public CadastroEspacoCafe cadastroDoEspacoCafe() {
		
		System.out.println("----------------------Cadastrando Espaço Café ------------------");
		System.out.println();
		System.out.println("------------ Informe o nome do espaço cafe 1 ----------");
		String nomeEspacoCafe1 = teclado.next();
		System.out.println();
		
		System.out.println("------------ Informe o nome do espaço  2 ----------");
		String nomeEspacoCafe2 = teclado.next();
		System.out.println();
		CadastroEspacoCafe espacoCafe = new CadastroEspacoCafe(nomeEspacoCafe1,nomeEspacoCafe2);
		return espacoCafe;
	
	}
	public void imprimirSala(CadastroSalas salaCorrente, ArrayList<CadastroPessoa> pessoa) {
		
		System.out.println( pessoa + " "
		+ " esta na primeira etapa na sala "  + salaCorrente.getNomeSala1() +
				 " e na segunda etapa estará na sala " + salaCorrente.getNomeSala2());
	}
	public void imprimirEspacoCafe(CadastroEspacoCafe salaCafe, ArrayList<CadastroPessoa> pessoa) {
		
		System.out.println( pessoa + " " 
		+ " esta na primeira etapa no espaço cafe "  + salaCafe.getEspacoCafe1() +
				 " e na segunda etapa estará no espaço cafe " + salaCafe.getEspacoCafe2());
	}
	public void imprimirPessoa( CadastroPessoa pessoaVar, ArrayList<CadastroPessoa> listPessoa, ListarEspacoCafe listarEspacoCafe,
			ListarSalas listaSala) {
		
		List<String> listaDeStrings = new ArrayList<String>();
		
		
		System.out.println("Digite o nome da pessoa");
		String nome = teclado.next();

		System.out.println("Digite o sobrenome da pessoa");
		String sobrenome = teclado.next();
		String nomeCompleto;
		nomeCompleto = nome + " " + sobrenome;
		boolean boo = false;
		for(int i = 0; i < listPessoa.size(); i++) {
		if(listPessoa.get(i).toString().contains(nomeCompleto)) {
			boo = true;
			
			}
	
		}
		CadastroEspacoCafe espacoCafe = listarEspacoCafe.listaEspacoCafe.get(0);
		CadastroSalas listSala = listaSala.listaSala.get(0);

		for (int in = 0; in < listPessoa.size(); in++) {
				if(boo) {
				System.out.println();
				System.out.println( nomeCompleto + " " 
						+ " esta na primeira etapa na sala "  + listSala.getNomeSala1() + " e no espaço de café " +
						espacoCafe.getEspacoCafe1()+
								 " e na segunda etapa estará na sala " + listSala.getNomeSala2()+ 
								 " e " + "no espaço de café " + espacoCafe.getEspacoCafe2());
				
				
				}else {
					System.out.println("Essa pessoa " + nomeCompleto + " não esta na lista cadastrada");
					break;
				}
		}
	}
}
