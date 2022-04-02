package Main;

import Controller.controlleur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test extends Application {

public void start(Stage primaryStage) {
	try {
		primaryStage.setTitle("E-learning");
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 640, 480);

		controlleur cnt = new controlleur(root);
		//cnt.gestionChapitre();
	
		primaryStage.setScene(scene);
		primaryStage.show();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void main(String[] args) {
	launch(args);

}}