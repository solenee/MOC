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
public class S_AFFX_MOC {
LEX_MOC scanner;
  S_AFFX_MOC() {
    }
  S_AFFX_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle29() throws Exception {

    //declaration
    //appel
  }
  private void regle28() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_A_MOC x_3 = new S_A_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_28(x_3);
    x_2.analyser(LEX_MOC.token_affect);
    x_3.analyser() ;
  }
private void action_auto_inh_28(S_A_MOC x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","AFFX -> affect A ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_affect : // 31
        regle28 () ;
      break ;
      case LEX_MOC.token_pv : // 30
        regle29 () ;
      break ;
      case LEX_MOC.token_virg : // 29
        regle29 () ;
      break ;
      case LEX_MOC.token_parf : // 26
        regle29 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
