package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {


	static Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {

		Main.primaryStage = primaryStage;

		abrirTela("main");
	}


	public static void abrirTela(String arquivo){

		Parent tela;

		try {

			tela = FXMLLoader.load(Main.class.getResource(arquivo+".fxml"));

			Scene sc = new Scene(tela);
			primaryStage.setScene(sc);
			primaryStage.show();

		}catch (Exception ex) {

		}
	}


	@FXML public void abrirInserir(){

		abrirTela("inserir");
	}

	@FXML public void abrirVisualizar(){

		abrirTela("visualizar");
	}



	public static void main(String[] args) {
		launch(args);
	}
}