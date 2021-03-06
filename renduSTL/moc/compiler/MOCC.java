package moc.compiler;

import java.io.Serializable;

import mg.egg.eggc.runtime.libjava.ISourceUnit;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import mg.egg.eggc.runtime.libjava.problem.ProblemReporter;
import mg.egg.eggc.runtime.libjava.problem.ProblemRequestor;
import moc.egg.MOC;

/**
 * La classe principale du compilateur MOC engendré Usage MOCC fichier.moc
 * options.
 * 
 * @author marcel
 * 
 */
public class MOCC implements Serializable {
	private static final long serialVersionUID = 1L;

	private static void checkFile(String[] args) throws MOCException {
		if (args.length == 0) {
			throw new MOCException(Messages.getString("MOC.fileError"));
		}
		String a = args[0];
		// verifier l'extension .moc
		int pt = a.lastIndexOf('.');
		if (pt != -1) {
			String ext = a.substring(pt + 1);
			if (!"moc".equals(ext))
				throw new MOCException(Messages.getString("MOC.extError"));
			else {
			}
		} else
			throw new MOCException(Messages.getString("MOC.extError"));
	}

	public static void main(String[] args) {
		try {
			// Il faut au moins le nom du fichier source.
			checkFile(args);
			// Creer le source
			ISourceUnit cu = new MOCSourceFile(args);
			// Gestion des erreurs
			ProblemReporter prp = new ProblemReporter(cu);
			ProblemRequestor prq = new ProblemRequestor();
			System.err.println("Compiling " + cu.getFileName());
			// lancer la compilation.
			MOC compilo = new MOC(prp);
			prq.beginReporting();
			compilo.set_source((MOCSourceFile) cu);
			compilo.set_eval(true);
			compilo.compile(cu);
			// Traiter les erreurs
			for (IProblem problem : prp.getAllProblems())
				prq.acceptProblem(problem);
			prq.endReporting();
			System.err.println(Messages.getString("MOC.ok")); //$NON-NLS-1$
			System.exit(0);
		} catch (MOCException e) {
			// Erreurs internes
			System.err.println(e.getMessage());
			System.exit(1);
		} catch (Exception e) {
			// Autres erreurs
			e.printStackTrace();
			System.exit(1);
		}
	}
}
