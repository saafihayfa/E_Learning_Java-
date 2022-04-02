package View;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Interfacecomposant {
	
	public BorderPane getInterfacetitre() {
		BorderPane B = new BorderPane () ;
		
		VBox vbox= new VBox();
		B.setCenter(vbox);
		vbox.setPadding(new Insets(5,5,5,5));
		
		Button b = new Button () ;
		vbox.getChildren().add(b);
		
		return B ;
	}

}
