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
public class S_PARFS_MOC {
LEX_MOC scanner;
  S_PARFS_MOC() {
    }
  S_PARFS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle6() throws Exception {

    //declaration
    S_PARF_MOC x_2 = new S_PARF_MOC(scanner,att_eval) ;
    S_PARFSX_MOC x_3 = new S_PARFSX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_6(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle5() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_6(S_PARF_MOC x_2, S_PARFSX_MOC x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","PARFS -> PARF PARFSX ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_parf : // 26
        regle5 () ;
      break ;
      case LEX_MOC.token_void : // 34
        regle6 () ;
      break ;
      case LEX_MOC.token_int : // 36
        regle6 () ;
      break ;
      case LEX_MOC.token_char : // 37
        regle6 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
