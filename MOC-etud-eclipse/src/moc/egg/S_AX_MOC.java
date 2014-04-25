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
public class S_AX_MOC {
LEX_MOC scanner;
  S_AX_MOC() {
    }
  S_AX_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle31() throws Exception {

    //declaration
    S_OPREL_MOC x_2 = new S_OPREL_MOC(scanner,att_eval) ;
    S_R_MOC x_3 = new S_R_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_31(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle32() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_31(S_OPREL_MOC x_2, S_R_MOC x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","AX -> OPREL R ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_inf : // 41
        regle31 () ;
      break ;
      case LEX_MOC.token_sup : // 43
        regle31 () ;
      break ;
      case LEX_MOC.token_infeg : // 42
        regle31 () ;
      break ;
      case LEX_MOC.token_supeg : // 44
        regle31 () ;
      break ;
      case LEX_MOC.token_eg : // 45
        regle31 () ;
      break ;
      case LEX_MOC.token_neg : // 46
        regle31 () ;
      break ;
      case LEX_MOC.token_affect : // 31
        regle32 () ;
      break ;
      case LEX_MOC.token_virg : // 29
        regle32 () ;
      break ;
      case LEX_MOC.token_parf : // 26
        regle32 () ;
      break ;
      case LEX_MOC.token_pv : // 30
        regle32 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
