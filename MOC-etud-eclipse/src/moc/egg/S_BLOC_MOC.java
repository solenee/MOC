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
public class S_BLOC_MOC {
LEX_MOC scanner;
  S_BLOC_MOC() {
    }
  S_BLOC_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle16() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_INSTS_MOC x_3 = new S_INSTS_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_16(x_3);
    x_2.analyser(LEX_MOC.token_aco);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_acf);
  }
private void action_auto_inh_16(S_INSTS_MOC x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","BLOC -> aco INSTS acf ;"});
}
  }
  public void analyser () throws Exception {
    regle16 () ;
  }
  }
