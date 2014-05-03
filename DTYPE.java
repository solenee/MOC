package bloc.lib;

public class DTYPE {
	protected int    taille;
	protected String nom;

	public int getTaille() {
		return taille;
	}


	public String getNom() {
		return nom;
	}

	public DTYPE(String n, int t) {
		nom = n;
		taille = t;
	}
	
	/* Cas du cast explicite */
	public boolean compareTo(DTYPE autre) {
		return this.nom.equals(autre.nom);
	}

	/* Cas cast implicite */
	public boolean compareTo(DTYPE autre) {
		return this.taille >= autre.taille;
	}

	public String toString() {
		return nom + "(" + taille + ")";
	}
}
