package Controller;

import java.util.List;

import Modell.Chapitre;
import Modell.DAOChapitre;
import Modell.DAOTitre;
import Modell.Titre;
import View.InterfaceConsulterChapitre;
import View.InterfaceNouveauChapitre;
import View.Interfacechapitre;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class controlleur {
	BorderPane root;

	public controlleur(BorderPane root) {
		this.root = root;
		root.setTop(Menu());

	}

	private MenuBar Menu() {
		MenuBar mb = new MenuBar();
		Menu menu = new Menu("Création Chapitre");
		mb.getMenus().add(menu);
		MenuItem ouv = new MenuItem("Ouvrir");
		menu.getItems().add(ouv);

		Menu menu1 = new Menu("Consultation Chapitre");
		mb.getMenus().add(menu1);
		MenuItem ouv1 = new MenuItem("Ouvrir");
		menu1.getItems().add(ouv1);

		Menu menu2 = new Menu("Gestion chapitre");
		mb.getMenus().add(menu2);
		MenuItem ouv2 = new MenuItem("Ouvrir");
		menu2.getItems().add(ouv2);

		ouv.setOnAction(event -> {

			InterfaceNouveauChapitre nv = new InterfaceNouveauChapitre();
			BorderPane nouveauchap = nv.getnouveauchapitre();
			root.setCenter(nouveauchap);

		});
		ouv1.setOnAction(event -> {

			InterfaceConsulterChapitre c = new InterfaceConsulterChapitre();
			BorderPane consulter = c.getinterfaceconsulter();
			root.setCenter(consulter);

		});

		ouv2.setOnAction(event -> {

			Chapitre chapitre = new Chapitre();
			chapitre.setIdChapitre(3);
			DAOChapitre dAOChapitre = new DAOChapitre();
			// fin chapitre
			chapitre = dAOChapitre.find(chapitre);

			List<Titre> listTitre = dAOChapitre.ListTitreByChapitre(chapitre);
			System.out.println(listTitre.size());

			Interfacechapitre interfaceChap = new Interfacechapitre(root, chapitre, listTitre);

		});

		return mb;
	}

}
