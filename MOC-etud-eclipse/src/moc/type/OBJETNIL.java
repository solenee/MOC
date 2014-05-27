package moc.type;

public class OBJETNIL  extends POINTEUR {	
    
    public OBJETNIL() {
	     super(null);
    }
     
    public boolean compareTo(DTYPE autre) {
    	if (autre instanceof POINTEURNULL)
    		return true;
    	if (CLASSE.estObjet(autre)) //(autre instanceof POINTEUR) && ( ((POINTEUR)autre).getType() instanceof CLASSE) )
    		// autre est un objet
    		return true;
    	return false;
    }

    public boolean castableTo(DTYPE autre) {
    	if ( (autre instanceof POINTEURNULL) | CLASSE.estObjet(autre) )
    		return true;
    	return false;
    }    
} 
