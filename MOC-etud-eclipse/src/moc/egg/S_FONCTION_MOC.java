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
public class S_FONCTION_MOC {
LEX_MOC scanner;
  S_FONCTION_MOC() {
    }
  S_FONCTION_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle4() throws Exception {

    //declaration
    S_TYPE_MOC x_2 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    S_PARFS_MOC x_5 = new S_PARFS_MOC(scanner,att_eval) ;
    T_MOC x_6 = new T_MOC(scanner ) ;
    S_BLOC_MOC x_7 = new S_BLOC_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_4(x_2, x_3, x_5, x_7);
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_ident);
    x_4.analyser(LEX_MOC.token_paro);
    x_5.analyser() ;
    x_6.analyser(LEX_MOC.token_parf);
    x_7.analyser() ;
  }
private void action_auto_inh_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_5, S_BLOC_MOC x_7) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","FONCTION -> TYPE ident paro PARFS parf BLOC ;"});
}
  }
  public void analyser () throws Exception {
    regle4 () ;
  }
  }
