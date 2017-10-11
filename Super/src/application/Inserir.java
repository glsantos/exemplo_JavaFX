package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Livro;
import model.LivroDao;

public class Inserir {

	@FXML TextField txtTitulo;
	@FXML TextField txtEditora;
	@FXML TextField txtAno;

	@FXML public void voltar() {

		Main.abrirTela("main");

	}

	@FXML public void salvar() {

		LivroDao dao = LivroDao.getInstance();
		
		Livro livro = new Livro();
		
		livro.setTitulo(txtTitulo.getText());
		livro.setEditora(txtEditora.getText());
		livro.setAno(txtAno.getText());
		
		dao.inserir(livro);
	}



}
