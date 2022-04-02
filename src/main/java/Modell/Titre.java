package Modell;

public class Titre {
	private String Titre ;
	private int idTitre;
	private int ordreTitre;

	private int idChapitre;
	
	
	public Titre() {
		
	}
	public Titre(int idTitre, int ordreTitre, String titre) {
		super();
		this.idTitre = idTitre;
		this.ordreTitre = ordreTitre;
		this.Titre = titre;
	}
	
	public int getIdTitre() {
		return idTitre;
	}
	public void setIdTitre(int idTitre) {
		this.idTitre = idTitre;
	}
	public int getOrdreTitre() {
		return ordreTitre;
	}
	public void setOrdreTitre(int ordreTitre) {
		this.ordreTitre = ordreTitre;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		this.Titre = titre;
	}
	@Override
	public String toString() {
		return "Titre [idTitre=" + idTitre + ", ordreTitre=" + ordreTitre + ", titre=" + Titre + "]";
	}
	public int getIdChapitre() {
		return idChapitre;
	}
	public void setIdChapitre(int idChapitre) {
		this.idChapitre = idChapitre;
	}
	

}
