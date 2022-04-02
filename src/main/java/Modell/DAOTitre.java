package Modell;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOTitre extends DAO<Titre> {

	@Override
	public Titre find(Titre obj) {
		List<Titre> l = new ArrayList<>();
		Titre element = new Titre();
		String requete = "select * from titre  where idchapitre= ?  ";
		PreparedStatement ps;
		try {
			ps = getCon().prepareStatement(requete);
			ps.setString(1, "" + obj.getIdChapitre());

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				element.setIdTitre(rs.getInt("idtitre"));
				element.setTitre(rs.getString("titre"));
				element.setOrdreTitre(rs.getInt("ordretitre"));
				l.add(element);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public List<Composant> ListComposantByTitre(Titre t) {
		List<Composant> composants = new ArrayList<>();
		String requete = "select t.idcomposant as composant, t.idcomposant, t.ordtecomposant , t.text, i.image"
				+ " from composant c, titre t  where c.idcomposant= ?  and c.idtitre= t.idtitre";
		PreparedStatement ps;
		try {
			ps = getCon().prepareStatement(requete);
			ps.setString(1, "" + t.getIdTitre());

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Composant composant;
				String chemin = rs.getString("i.image");
				if (chemin != null) {
					composant = new Image();
				}

			//	composant.setcomposant(rs.getInt("idcomposant"));
				//composant.setordrecomposant(rs.getInt("ordtecomposant"));
				//composant.add(composant);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return composants;

	}

}