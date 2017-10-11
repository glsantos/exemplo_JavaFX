package model;

import java.util.ArrayList;

public class LivroDao {

	private static LivroDao instance;

	public static LivroDao getInstance(){

		if(instance==null){

			instance = new LivroDao();
		}
		return instance;
	}


	ArrayList<Livro> lstLivros = new ArrayList<>();


	public void inserir(Livro l){
		//C�digo MySql
		lstLivros.add(l);
	}

	public ArrayList<Livro> selecionarTodos(){
		//C�digo MySql
		return lstLivros;
	}

}
