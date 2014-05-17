package moc.gc;


/**
 * La machine TAM et ses fonctions de generation
 * @author marcel
 *
 */
public class MTAM extends AbstractMachine {

	@Override
	public String getSuffixe() {
		return "tam";
	}
	
	@Override
	public String genFree(int size) {
		return "\tPOP(0) " + size + "\n";
	}
	
	@Override
	public String genComment(String c) {
		return "\t; " + c + "\n";
	}

	@Override
	public String genCodeInLine(String c) {
		return genComment("code in inline : start") + c + genComment("code in inline : end");
	}
	
	// counter to generate unique labels
	private static int cpt = -1;

	/** Generate a unique label
	 * 
	 * @return the label
	 */
	@Override
	public String genLabel() {
		cpt++;
		return "label" + cpt+" :";
	}
	
	@Override
	public String genIf(String codeCondition, String codeThen, String codeElse) {
		String code;
		String labelEndIf = genLabel();
		// check the condition
		code = genComment("if") + codeCondition + "\tJUMPIF(0) ";
		/*if (codeElse == "") {
			code += labelEndIf + "\n"
					+ genComment("then") + codeThen + "\n";
		} else {*/
			String labelElse = genLabel();
			code += labelElse + "\n"
					+ genComment("then") +   codeThen + "\n" + "\tJUMP " + labelEndIf + "\n" 
					+ genComment("else") + labelElse + "\n" + codeElse + "\n";
		//}
		code += labelEndIf + "\n" + genComment("end if");
		return code;
	}

	@Override
	public String genDeclaration(String ident, int taille) {
		return genComment("declaration sans initialisation de "+ident+ " de taille "+taille)
				+ "\tPUSH "+taille+"\n"; 
	}

	@Override
	public String genDefinition(String ident, int taille, String initCode) {
		return genComment("declaration avec initialisation de "+ident+ "de taille "+taille)
				+ initCode;
	}

	@Override
	public String genOpUnaire(String codeOp, String codeFacteur) {
		return codeFacteur +
				"\tSUBR "+codeOp+"\n";
	}

	@Override
	public String genIMoins(String codeFacteur) {
		return genOpUnaire("INeg", codeFacteur);
	}

	@Override
	public String genBNegation(String codeFacteur) {
		return genOpUnaire("BNeg", codeFacteur);
	}

	@Override
	public String genEntier(String c) {
		return "\tLOADL "+c+genComment("entier");
	}

	@Override
	public String genCaractere(String c) {
		return "\tLOADL "+c+genComment("caractere");
	}

	@Override
	public String genCall(String etiquette) {
		return genComment("Appel de" + etiquette) + "\tCALL(SB) _" + etiquette + "\n";
	}

	@Override
	public String genAffectation(String etiquette) {
		return genComment(etiquette);
	}

	@Override
	public String genFonction(String etiquette, String code) {
		return "_" + etiquette + ":\n" 
				+ code + "\n";
	}

	@Override
	public String genRetour(int tailleparams, int tailleretour,
			String codeValeur) {
		return genComment("retour")
				+ codeValeur + 
				"\tRETURN (" + tailleparams + ") "+ tailleretour + "\n"
				+ genComment("fin retour");
	}

	@Override
	public String genString(String c) {
		return "\tLOADL "+c+genComment("chaine de caractere");
	}

	@Override
	public String genOpBinaire(String codegauche, String codeOp,
			String codedroite) {
		return codegauche + codedroite + "\tSUBR "+codeOp+"\n";
	}

	@Override
	public String genIMultiplication() {
		return "IMul";
	}
	
	@Override
	public String genIDivision() {
		return "IDiv";
	}

	@Override
	public String genIModulo() {
		return "IMod";
	}

	@Override
	public String genIEt() {
		return "IAdd";
	}

}
