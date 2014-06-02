package moc.type;

public class ANY extends POINTEUR {

	public ANY() {
		super("id", 1);
	}

	public boolean compareTo(DTYPE autre) {
		if (autre instanceof POINTEUR) 
			return ((POINTEUR) autre).type instanceof CLASSE;
		return false;
	}

	public boolean castableTo(DTYPE autre) {
		return compareTo(autre);
	}

}
