package Modell;

public class Composant {
	private long composant;
	private int ordrecomposant;
	
	public Composant () {
		
	}

	public Composant(long composant, int ordrecomposant) {
		super();
		this.composant = composant;
		this.ordrecomposant = ordrecomposant;

	}
    public long getcomposant() {
    	return composant ;
    }
    public void setcomposant(long composant) {
    	this.composant=composant ;
    }
    public long getordrecomposant() {
    	return ordrecomposant ;
    }
    public void setordrecomposant(int ordrecomposant) {
    	this.ordrecomposant=ordrecomposant ;
    }
    public String toString() {
    	return "Composant [composant=" + composant +','+"ordrecomposant="+ ordrecomposant+"]";
    }
}
