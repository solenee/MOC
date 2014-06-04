package moc.tds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import moc.gc.Emplacement;
import moc.type.DTYPE;

public class INFOCLASSE implements INFO {
	
	protected DTYPE type;
	protected TDS methodes; // Hashmap<String, INFOMETHODE>
	protected String tv;
	
	public INFOCLASSE(DTYPE type) {
		this.type = type;
		this.methodes = new TDS();
	}
	
	public INFOCLASSE(DTYPE type, String tv) {
		this.type = type;
		this.methodes = new TDS();
		this.tv = tv;
	}
	
	public INFOCLASSE(DTYPE type, INFOCLASSE parent) {
		this.type = type;
		if (parent != null) {
			this.methodes = new TDS(parent.getMethodes());
		} else {
			this.methodes = new TDS();
		}
	}
	
	public INFOCLASSE(DTYPE type, INFOCLASSE parent, String
			tv) {
		this.type = type;
		if (parent != null) {
			this.methodes = new TDS(parent.getMethodes());
		} else {
			this.methodes = new TDS();
		}
		this.tv = tv;
	}
	
	public INFOCLASSE(DTYPE type, TDS parent) {
		this.type = type;
		this.methodes = new TDS(parent);
	}
	
	public INFOCLASSE(DTYPE type, TDS parent, String tv) {
		this.type = type;
		this.methodes = new TDS(parent);
		this.tv = tv;
	}
	
	public INFOCLASSE(TDS methodes, DTYPE type) {
		this.type = type;
		this.methodes = new TDS(methodes);
	}
	
	public INFOCLASSE(TDS methodes, DTYPE type, String tv) {
		this.type = type;
		this.methodes = new TDS(methodes);
		this.tv = tv;
	}
	
	@Override
	public DTYPE getType() {
		return type;
	}

	public void setType(DTYPE type) {
		this.type = type;
	}

	public TDS getMethodes() {
		return methodes;
	}

	public void setMethodes(TDS methodes) {
		this.methodes = methodes;
	}

	public String getTv() {
		return tv;
	}

	public void setTv(String tv) {
		this.tv = tv;
	}
	
	public ArrayList<String> listeMethodes() {
		ArrayList<TDS> ascendants = new ArrayList<TDS>();
		TDS liste = new TDS();
		ArrayList<String> listeOrdonnee = new ArrayList<String>();
		TDS temp = new TDS();
		temp = this.methodes;
		//on fait la liste des TDS des méthodes des ascendants 
		while (temp != null) {
			ascendants.add(temp);
			temp = temp.getParente();
		}
		//on les "merge" en partant bien de la tds de l'ascendant le plus éloigné
		for(int i = ascendants.size() - 1; i >= 0; i--) {
			liste.putAll(ascendants.get(i));
		}
		// rangement dans l'ordre des numéros croissant, méthode plutôt barbare ^^
		for(int i = 1; i <= liste.size(); i++) {
			Iterator<Entry<String,INFO>> it = liste.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String, INFO> e = it.next();
				String nom = e.getKey();
				INFOMETHODE info = (INFOMETHODE) e.getValue();
				Integer numero = info.getNumero();
				String nom_classe = info.getClasse();
				if (numero == i) {
					listeOrdonnee.add("_"+nom_classe + "_" + nom);
				}
			}
		}
		return listeOrdonnee;
	}
	
	public TDS tdsMethodes() {
		ArrayList<TDS> ascendants = new ArrayList<TDS>();
		TDS liste = new TDS();
		TDS temp = new TDS();
		temp = this.methodes;
		//on fait la liste des TDS des méthodes des ascendants 
		while (temp != null) {
			ascendants.add(temp);
			temp = temp.getParente();
		}
		//on les "merge" en partant bien de la tds de l'ascendant le plus éloigné
		for(int i = ascendants.size() - 1; i >= 0; i--) {
			liste.putAll(ascendants.get(i));
		}
		return liste;
	}
	
	public void inserer(String nom, INFOMETHODE methode) {
		TDS liste = this.tdsMethodes();
		int nombre = liste.size();
		INFOMETHODE method = (INFOMETHODE) liste.chercherLocalement(nom);
		INFOMETHODE method_aux = methode;
		if (method == null) {
			method_aux.setNumero(nombre + 1);
		} else {
			method_aux.setNumero(method.getNumero());
		}
		this.methodes.put(nom, method_aux);
	}

	@Override
	public String toString() {
		return "INFOCLASSE [type=" + type + ", \n----methodes=" + methodes+"\n---fin methodes\n" + "]";
	}
	
	
}
