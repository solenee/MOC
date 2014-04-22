package moc.tds;

import java.util.ArrayList;
import java.util.List;

import moc.type.DTYPE;

/**
 * Cette classe décrit une variable locale : adresse et type
 * 
 * @author Solene, Zohour, Leger
 * 
 */
public class INFOFONCTION implements INFO {
	/**
	 * Le type de la variable
	 */
	protected DTYPE retour;
	protected List<DTYPE> parametres;

	public DTYPE getRetour() {
		return retour;
	}

	/**
	 * Une variable a un type et un emplacement pour sa valeur
	 * @param t
	 * @param e
	 */
	public INFOFONCTION(DTYPE r) {
		retour = r;
		parametres = new ArrayList<DTYPE> ();
	}

	public void addParametre (DTYPE p){
		parametres.add(p);
	}
	
	public boolean goodParametre (DTYPE d, int dep){
		if (parametres.get(dep).equals(d)){
			return true; 
		}
		else {
			return false;	
		}
	}
	@Override
	public String toString() {
		return "INFOFONCTION [retour=" + retour.getNom();// + ", empl=" + empl + "]";
	}

}
