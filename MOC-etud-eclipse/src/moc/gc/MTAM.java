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
		return "\tPOP(0)" + size + "\n";
	}
	
	@Override
	public String genComment(String c) {
		return "; " + c + "\n";
	}

	@Override
	public String genCodeInLine(String c) {
		return genComment("code in inline : start\n") + c + genComment("code in inline : end\n");
	}
	
	// counter to generate unique labels
	private static int cpt = 0;

	/** Generate a unique label
	 * 
	 * @return the label
	 */
	public String genEtiq() {
		return "label" + cpt++;
	}
	
	@Override
	public String genLabel() {
		throw new RuntimeException("Undefined method");
	}

	@Override
	public String genIf(String codeCondition, String codeThen, String codeElse) {
		String code;
		String labelEndIf = genLabel();
		// check the condition
		code = genComment("\t; if\n") + codeCondition + "\n" + "\tJUMPIF(0) ";
		if (codeElse == "") {
			code += labelEndIf + "\n"
					+ genComment("\t; then\n") + codeThen + "\n";
		} else {
			String labelElse = genLabel();
			code += labelElse + "\n"
					+ genComment("\t; then\n") +   codeThen + "\n" + "\tJUMP " + labelEndIf + "\n" 
					+ genComment("\t; else\n") + labelElse + "\n" + codeElse + "\n";
		}
		code += labelEndIf + "\n" + "\t; end if\n";
		return code;
	}


}
