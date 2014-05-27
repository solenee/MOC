package moc.type;

public class POINTEUR extends DTYPE {
	private DTYPE type;

	public POINTEUR(DTYPE t) {
		super("pointeur", 1);
		type = t;
	}

	public DTYPE getType() {
		return type;
	}
	
	// Pointeur p.conformsTo(B) <=> p = b est ok ie b=null ou b=nil ou *p et *b compatibles
	public boolean compareTo(DTYPE autre) {
		if (autre instanceof POINTEUR)
			if ( (autre instanceof POINTEURNULL) || (autre instanceof OBJETNIL) )
				return true;
			else
				return type.compareTo(((POINTEUR) autre).type);
		else if (autre.nom.equals("int")){
			return true;
		}
		return false;
	}

	public boolean castableTo(DTYPE autre) {
		if (autre instanceof POINTEUR)
			return type.castableTo(((POINTEUR) autre).type);
		return false;
	}



	public String toString(){
		return super.toString() + " sur type = " + type;
	}


}
