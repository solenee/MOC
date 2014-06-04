package moc.type;

public class DTYPE {
	// inutilisable avec EGG
	// final private DTYPE entier = new DTYPE("entier",4);
	// public DTYPE getTypeEntier(){return entier;}
	// final private DTYPE booleen = new DTYPE("booleen",1);
	// public DTYPE getTypeBooleen(){return booleen;}
	protected int taille;

	public int getTaille() {
		return taille;
	}

	protected String nom;

	public String getNom() {
		return nom;
	}

	public DTYPE(String n, int t) {
		nom = n;
		taille = t;
	}

	public boolean compareTo(DTYPE autre) {
		//mc
		if (nom.equals("int")){
			if (autre.nom.equals("char") || autre.taille != this.taille){
				return false;
			}
			else {
				return true; 
			}
		}
		//moc
		else if(nom.equals("id")) {
			return CLASSE.estObjet(autre);
		}
		else {
			return this.nom.equals(autre.nom);
		}
	}

        public boolean isOperable(){
		if (nom.equals("int") || nom.equals("bool"))
			return true; 
		return false;
	}
 
	public boolean isVoid(){
		if (nom.equals("void"))
			return true;
		return false;
	}

	public boolean castableTo(DTYPE autre){
		return this.taille == autre.taille;
	}

	public String toString() {
		return nom + "(" + taille + ")";
	}
}
