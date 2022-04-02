package Modell;

import javafx.scene.text.Text;

public class Texte extends Composant {

	private String text;

	public Texte() {

	}

	public Texte(long composant, int ordrecomposant, String text) {
		super(composant, ordrecomposant);
		this.text = text;

	}

	public String toString() {

		return ("Texte" + super.toString() + " " + "texte=" + text);

	}

}
