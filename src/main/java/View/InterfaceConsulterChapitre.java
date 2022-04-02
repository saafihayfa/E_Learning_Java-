package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InterfaceConsulterChapitre {
	Connection con;
	BorderPane root = new BorderPane();

	public BorderPane getinterfaceconsulter() {

		VBox vBox = new VBox(20);
		vBox.setPadding(new Insets(20, 20, 20, 20));
		root.setLeft(vBox);

		Button b = new Button("généricité");
		vBox.getChildren().add(b);

		Button b1 = new Button("Java Fx");
		vBox.getChildren().add(b1);

		Button b2 = new Button("Base de Données");
		vBox.getChildren().add(b2);

		Button b3 = new Button("Gestion des Fichiers");
		vBox.getChildren().add(b3);

		Button b4 = new Button("Thread");
		vBox.getChildren().add(b4);

		b3.setOnAction(event -> {

			String serveurBD = "jdbc:mysql://127.0.0.1:3306/elearningbd?useUnicode=true&characterEncoding="
					+ "UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT";

			String login = "root";
			String motPasse = "";
			try {
				// Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(serveurBD, login, motPasse);
				Statement stmt = con.createStatement();
				System.out.println("Successfully connected to MySQL DataBase \n");

				String sql = "select idchapitre, titre,ordrechapitre,etat,date_creation, date_modifier "
						+ "from chapitre  where titre='Gestion des Fichiers'";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {

					int id = rs.getInt("idchapitre");
					System.out.println(id);
					String titre = rs.getString("titre");
					System.out.println(titre);
					int ordre = rs.getInt("ordrechapitre");
					System.out.println(ordre);
					String Etat = rs.getString("etat");
					System.out.println(Etat);
					String datec = rs.getString("date_creation");
					System.out.println(datec);
					String datem = rs.getString("date_modifier");
					System.out.println(datem);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		return root;

	}

}
