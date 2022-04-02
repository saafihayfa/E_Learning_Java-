package Modell;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOChapitre extends DAO<Chapitre> {

	public DAOChapitre() {
	
	}

	@Override
	public Chapitre find(Chapitre obj) {
		Chapitre chap= new Chapitre();
		String requete="select * from chapitre  where idchapitre= ?  ";
		PreparedStatement ps;
		try {
			ps = getCon().prepareStatement(requete);
			ps.setString(1,""+obj.getIdChapitre());
			
			ResultSet rs =ps.executeQuery();
			while (rs.next()) {
				chap.setIdChapitre(rs.getInt("idchapitre"));
				chap.setTitre(rs.getString("titre"));
				chap.setOrdreChapitre(rs.getInt("ordrechapitre"));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chap;
	}
	
	public List<Titre> ListTitreByChapitre(Chapitre obj) {
		List<Titre> titres=new ArrayList<>();
		String requete="select t.titre as titre, t.idtitre, t.ordretitre  from "
	+ "chapitre c, titre t  where c.idchapitre= ?  and c.idchapitre= t.idchapitre";
		PreparedStatement ps;
		try {
			ps = getCon().prepareStatement(requete);
			ps.setString(1,""+obj.getIdChapitre());
			
			ResultSet rs =ps.executeQuery();
			while (rs.next()) {
				Titre titre = new Titre();
				titre.setIdTitre(rs.getInt("idtitre"));
				titre.setTitre(rs.getString("titre"));
				titre.setOrdreTitre(rs.getInt("ordretitre"));
				titres.add(titre);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return titres;
		
	}

}
