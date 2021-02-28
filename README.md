# Sistema para  evento
### Foi desenvolvido com a linguagem de programação java.

####Vamos as  observacoes

##### É necessario ter o eclipse instalado assim como também o java  onde voce pode baixar nos sites oficias.
##### Para testar os metodos é necessario configurar o JAVA  BUILD PATH  em liberies seleciona o ClassPath e adiciona JUnit em ADD Libray.

#### Documento do código fonte

A classe SistemaEvento.java
	Essa classe dar origem a todo o comportamento do sistema
Declarando comportamento principal:
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

A Classe Tela.java
Essa classe mostra para o usuário as opções do evento.


A Classe ListarPessos.java
Ela vai guardar o nome das pessoas através do método abaixo

public void adicionarPessoa(CadastroPessoa pessoa) {
		this.listaPessoas.add(pessoa);
	}


A Classe ListarSalas.java 
Ela vai guardar os nome das salas do evento através do método abaixo
public void adicionarSalas(CadastroSalas sala) {
		this.listaSala.add(sala);
	}

A Classe ListarEspacoCafe.java 
Ela vai guardar os nome dos espaços de café do evento através do método abaixo.
public void adicionarEspacoCafe(CadastroEspacoCafe espacoCafe) {
		this.listaEspacoCafe.add(espacoCafe);
	}
A Classe CadastroEspacoCafe.java 	

Ela faz o gerenciamento dos espaços de café do evento.

A Classe CadastroPessoa.java 	
Ela faz o gerenciamento  do nome da pessoa do evento.
A Classe CadastroSala.java 	
Ela faz o gerenciamento  dos nome das salas do evento.

A Classe Main.java

Ela executa o sistema chamando o método menuIniciar().


