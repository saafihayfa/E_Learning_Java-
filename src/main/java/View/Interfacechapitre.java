package View;

import java.util.List;

import Modell.Chapitre;
import Modell.Titre;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Interfacechapitre {
	BorderPane root = new BorderPane();

	public Interfacechapitre(BorderPane root, Chapitre chapitre, List<Titre> listTitre) {
		this.root = root;
		root.setLeft(left(chapitre, listTitre));
		root.setCenter(center());
		root.setRight(right());
	}

	public Node right() {

		VBox Boxright = new VBox(20);
		Boxright.setPadding(new Insets(20, 20, 20, 20));
		root.setRight(Boxright);
		Button b = new Button("Image");
		Boxright.getChildren().add(b);
		Button b1 = new Button("Texte");
		Boxright.getChildren().add(b1);

		return Boxright;
	}

	public Node center() {
		// TODO Auto-generated method stub
		return null;
	}

	public Node left(Chapitre chapitre, List<Titre> listTitre) {

		VBox Boxleft = new VBox(10);
		Boxleft.setPadding(new Insets(10, 10, 10, 10));
		root.setLeft(Boxleft);
		Label l = new Label(chapitre.getTitre());
		Boxleft.getChildren().add(l);
		VBox Boxlisttitre = new VBox(10);

		for (int i = 0; i < listTitre.size(); i++) {
			Node noeudtitre = cadretitre(listTitre.get(i));
			Boxlisttitre.getChildren().add(noeudtitre);
		}

		Boxleft.getChildren().add(Boxlisttitre);

		return Boxleft;

	}

	private Node cadretitre(Titre titre) {
		HBox intTitre = new HBox(5);
		Label idT = new Label("" + titre.getOrdreTitre());
		intTitre.getChildren().add(idT);
		Label t = new Label(titre.getTitre());
		intTitre.getChildren().add(t);
		return intTitre;

	}

}
