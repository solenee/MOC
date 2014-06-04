package moc.tds;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TDS extends HashMap<String, INFO> {

	private static final long serialVersionUID = 1L;

	private TDS parente;

	public TDS() {
		this(null);
	}

	public TDS(TDS p) {
		super();
		parente = p;
	}

	public INFO chercherLocalement(String n) {
		return get(n);
	}

	public INFO chercherGlobalement(String n) {
		INFO i = chercherLocalement(n);
		if (i == null)
			if (parente != null)
				return parente.chercherGlobalement(n);
		return i;
	}

	public void inserer(String n, INFO i) {
		put(n, i);
	}

	public String toString() {
		String aff = "---------------debut------\n";
		StringBuffer sb = new StringBuffer();
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s){
			sb.append("; " + e.getKey() + " : " + e.getValue() + '\n');
		
		}
		aff += sb.toString();
		aff += "----------------fin------------ \n\n";
		return aff;
	}

	public TDS getParente() {
		return parente;
	}

	public void setParente(TDS parente) {
		this.parente = parente;
	}
	
	
}