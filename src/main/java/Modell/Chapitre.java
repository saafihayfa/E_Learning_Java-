package Modell;

public class Chapitre {
	private int idchapitre;
	private String titre;
	private int ordrechapitre;
	public Chapitre(int idchapitre, String titre, int ordrechapitre) {
		super();
		this.idchapitre = idchapitre;
		this.titre = titre;
		this.ordrechapitre = ordrechapitre;
	}
	public Chapitre() {
		
	}
	public int getIdChapitre() {
		return idchapitre;
	}
	public void setIdChapitre(int idchapitre) {
		this.idchapitre = idchapitre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getOrdreChapitre() {
		return ordrechapitre;
	}
	public void setOrdreChapitre(int ordrechapitre) {
		this.ordrechapitre = ordrechapitre;
	}
	@Override
	public String toString() {
		return "Chapitre [idChapitre=" + idchapitre + ", titre=" + titre + ", ordreChapitre=" + ordrechapitre + "]";
	}
	

	

}