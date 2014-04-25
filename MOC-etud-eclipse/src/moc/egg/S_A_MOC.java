package moc.egg;
import moc.compiler.*;
import moc.tds.*;
import moc.type.*;
import moc.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_A_MOC {
LEX_MOC scanner;
  S_A_MOC() {
    }
  S_A_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle30() throws Exception {

    //declaration
    S_R_MOC x_2 = new S_R_MOC(scanner,att_eval) ;
    S_AX_MOC x_3 = new S_AX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_30(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_30(S_R_MOC x_2, S_AX_MOC x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","A -> R AX ;"});
}
  }
  public void analyser () throws Exception {
    regle30 () ;
  }
  }
