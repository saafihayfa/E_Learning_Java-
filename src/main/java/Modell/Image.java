package Modell;

import javafx.scene.text.Text;

public class Image extends Composant {
	private Text chemin;

	public Image() {

	}

	public Image(long composant, int ordrecomposant, Text chemin) {
		super(composant, ordrecomposant);
		this.chemin = chemin;

	}

	public String toString() {

		return ("Image" + super.toString() + " " + "chemin=" + chemin);

	}
}
