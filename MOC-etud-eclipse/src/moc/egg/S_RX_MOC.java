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
public class S_RX_MOC {
LEX_MOC scanner;
  S_RX_MOC() {
    }
  S_RX_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle41() throws Exception {

    //declaration
    //appel
  }
  private void regle40() throws Exception {

    //declaration
    S_OPADD_MOC x_2 = new S_OPADD_MOC(scanner,att_eval) ;
    S_T_MOC x_3 = new S_T_MOC(scanner,att_eval) ;
    S_RX_MOC x_4 = new S_RX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_40(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
private void action_auto_inh_40(S_OPADD_MOC x_2, S_T_MOC x_3, S_RX_MOC x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","RX -> OPADD T RX1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_plus : // 47
        regle40 () ;
      break ;
      case LEX_MOC.token_moins : // 48
        regle40 () ;
      break ;
      case LEX_MOC.token_ou : // 49
        regle40 () ;
      break ;
      case LEX_MOC.token_inf : // 41
        regle41 () ;
      break ;
      case LEX_MOC.token_sup : // 43
        regle41 () ;
      break ;
      case LEX_MOC.token_infeg : // 42
        regle41 () ;
      break ;
      case LEX_MOC.token_supeg : // 44
        regle41 () ;
      break ;
      case LEX_MOC.token_eg : // 45
        regle41 () ;
      break ;
      case LEX_MOC.token_neg : // 46
        regle41 () ;
      break ;
      case LEX_MOC.token_affect : // 31
        regle41 () ;
      break ;
      case LEX_MOC.token_virg : // 29
        regle41 () ;
      break ;
      case LEX_MOC.token_parf : // 26
        regle41 () ;
      break ;
      case LEX_MOC.token_pv : // 30
        regle41 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
