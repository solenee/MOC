package moc.tds;

import moc.type.DTYPE;

public class INFOMETHODE extends INFOFONCTION {

	protected boolean isclassmethod; // true si de classe, false si d'instance
	protected Integer numero;
	protected String classe;
	
	public INFOMETHODE(DTYPE r, boolean isclassmethod, Integer numero) {
		super(r);
		this.isclassmethod = isclassmethod;
		this.numero = numero;
	}
	
	public INFOMETHODE(DTYPE r, boolean isclassmethod, Integer numero, String classe) {
		super(r);
		this.isclassmethod = isclassmethod;
		this.numero = numero;
		this.classe = classe;
	}

	public INFOMETHODE(DTYPE r, PARAMETRES params, boolean isclassmethod, Integer numero) {
		super(r, params);
		this.isclassmethod = isclassmethod;
		this.numero = numero;
	}
	
	public INFOMETHODE(DTYPE r, PARAMETRES params, boolean isclassmethod, Integer numero, String classe) {
		super(r, params);
		this.isclassmethod = isclassmethod;
		this.numero = numero;
		this.classe = classe;
	}

	public boolean isClassMethod() {
		return isclassmethod;
	}

	public void setIsClassMethod(boolean isclassmethod) {
		this.isclassmethod = isclassmethod;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "INFOMETHODE [isclassmethod=" + isclassmethod + ", numero="
				+ numero + ", classe=" + classe + "]";
	}

	
}
