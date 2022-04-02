package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class InterfaceNouveauChapitre {
	Connection con;
	BorderPane root = new BorderPane();

	public BorderPane getnouveauchapitre() {

		GridPane G = new GridPane();
		root.setCenter(G);
		G.setPadding(new Insets(10, 10, 10, 10));
		G.setVgap(20);
		G.setHgap(20);

		Label l = new Label("id:");
		G.add(l, 0, 1);
		TextField T = new TextField();
		G.add(T, 1, 1);

		Label l1 = new Label("Titre:");
		G.add(l1, 0, 2);
		TextField T1 = new TextField();
		G.add(T1, 1, 2);

		Label l2 = new Label("Ordre:");
		G.add(l2, 0, 3);
		TextField T2 = new TextField();
		G.add(T2, 1, 3);

		Label l3 = new Label("Etat:");
		G.add(l3, 0, 4);
		TextField T3 = new TextField();
		G.add(T3, 1, 4);

		Label l4 = new Label("Date_Creation:");
		G.add(l4, 0, 5);
		TextField T4 = new TextField();
		G.add(T4, 1, 5);

		Label l5 = new Label("Date_Modifier:");
		G.add(l5, 0, 6);
		TextField T5 = new TextField();
		G.add(T5, 1, 6);

		Button b = new Button("Ajouter Chapitre");
		root.setBottom(b);
		b.setOnAction(event -> {

			String serveurBD = "jdbc:mysql://127.0.0.1:3306/elearningbd?useUnicode=true&characterEncoding="
					+ "UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT";

			String login = "root";
			String motPasse = "";

			try {
				// Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(serveurBD, login, motPasse);
				Statement stmt = con.createStatement();
				System.out.println("Successfully connected to MySQL DataBase \n");
				String sql = "INSERT INTO chapitre VALUES ('" + T.getText() + "','" + T1.getText() + "','"
						+ T2.getText() + "','" + T3.getText() + "','" + T4.getText() + "','" + T5.getText() + "')";
				stmt.executeUpdate(sql);

			} catch (SQLException e) {

				e.printStackTrace();
			}
		});

		return root;

	}

}
