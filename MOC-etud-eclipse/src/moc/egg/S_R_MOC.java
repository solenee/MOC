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
public class S_R_MOC {
LEX_MOC scanner;
  S_R_MOC() {
    }
  S_R_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle39() throws Exception {

    //declaration
    S_T_MOC x_2 = new S_T_MOC(scanner,att_eval) ;
    S_RX_MOC x_3 = new S_RX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_39(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_39(S_T_MOC x_2, S_RX_MOC x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","R -> T RX ;"});
}
  }
  public void analyser () throws Exception {
    regle39 () ;
  }
  }
