package moc.tds;

import moc.type.DTYPE;

public class INFOMETHODE extends INFOFONCTION {

	protected boolean classmethod; // true si de classe, false si d'instance
	protected Integer numero;
	
	public INFOMETHODE(DTYPE r, boolean classmethod, Integer numero) {
		super(r);
		this.classmethod = classmethod;
		this.numero = numero;
	}

	public INFOMETHODE(DTYPE r, PARAMETRES params, boolean classmethod, Integer numero) {
		super(r, params);
		this.classmethod = classmethod;
		this.numero = numero;
	}

	public boolean isClassmethod() {
		return classmethod;
	}

	public void setClassmethod(boolean classmethod) {
		this.classmethod = classmethod;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
