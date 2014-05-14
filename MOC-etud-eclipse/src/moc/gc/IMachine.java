package moc.gc;

import moc.compiler.MOCException;

/**
 * Cette interface décrit une machine cible. A compléter, selon votre modèle
 * 
 * @author marcel
 * 
 */
public interface IMachine {
	/**
	 * Suffixe du fichier cible (.tam par exemple)
	 * 
	 * @return
	 */
	String getSuffixe();

	/**
	 * Ecrit le code dans un fichier à partir du nom du fichier source et du
	 * suffixe
	 * 
	 * @param fileName
	 * @param code
	 * @throws MOCException
	 */
	void writeCode(String fileName, String code) throws MOCException;
	
	/**
	 * Generate the code to free a specific size of space into the the stack
	 * 
	 * @param size size of the space to free
	 * @throws MOCException
	 */
	public String genFree(int size);

	/**
	 * Generate a specified comment
	 * 
	 * @param c the comment
	 * @throws MOCException
	 */
	public String genComment(String c);
	
	/**
	 * Insert ASM code in line
	 * 
	 * @param c code to insert
	 * @throws MOCException
	 */
	public String genCodeInLine(String c);
	
	/**
	 * Generate a label
	 * @throws MOCException
	 */
	public String genLabel();
	
	/**
	 * Generate a "if then ..."
	 * 
	 * @param codeCondition
	 * @param codeThen
	 * @param codeElse vaut "" s'il n'y a pas de else
	 * @throws MOCException
	 */
	public String genIf(String codeCondition, String codeThen, String codeElse);
	
	/**
	 * Generate a variable declaration without initialization
	 * 
	 * @param ident identifier of the declared variable
	 * @param taille size of the variable
	 * @throws MOCException
	 */
	public String genDeclaration(String ident, int taille);
	
	/**
	 * Generate a variable declaration with an initialization
	 * 
	 * @param ident identifier of the declared variable
	 * @param taille size of the variable
	 * @param initCode initialization code
	 * @throws MOCException
	 */
	public String genDeclarationInitialisee(String ident, int taille, String initCode);
	
	
	
	
}