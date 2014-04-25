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
public class S_TX_MOC {
LEX_MOC scanner;
  S_TX_MOC() {
    }
  S_TX_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle47() throws Exception {

    //declaration
    //appel
  }
  private void regle46() throws Exception {

    //declaration
    S_OPMUL_MOC x_2 = new S_OPMUL_MOC(scanner,att_eval) ;
    S_F_MOC x_3 = new S_F_MOC(scanner,att_eval) ;
    S_TX_MOC x_4 = new S_TX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_46(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
private void action_auto_inh_46(S_OPMUL_MOC x_2, S_F_MOC x_3, S_TX_MOC x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","TX -> OPMUL F TX1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_mult : // 50
        regle46 () ;
      break ;
      case LEX_MOC.token_div : // 51
        regle46 () ;
      break ;
      case LEX_MOC.token_mod : // 52
        regle46 () ;
      break ;
      case LEX_MOC.token_et : // 53
        regle46 () ;
      break ;
      case LEX_MOC.token_plus : // 47
        regle47 () ;
      break ;
      case LEX_MOC.token_moins : // 48
        regle47 () ;
      break ;
      case LEX_MOC.token_ou : // 49
        regle47 () ;
      break ;
      case LEX_MOC.token_inf : // 41
        regle47 () ;
      break ;
      case LEX_MOC.token_sup : // 43
        regle47 () ;
      break ;
      case LEX_MOC.token_infeg : // 42
        regle47 () ;
      break ;
      case LEX_MOC.token_supeg : // 44
        regle47 () ;
      break ;
      case LEX_MOC.token_eg : // 45
        regle47 () ;
      break ;
      case LEX_MOC.token_neg : // 46
        regle47 () ;
      break ;
      case LEX_MOC.token_affect : // 31
        regle47 () ;
      break ;
      case LEX_MOC.token_virg : // 29
        regle47 () ;
      break ;
      case LEX_MOC.token_parf : // 26
        regle47 () ;
      break ;
      case LEX_MOC.token_pv : // 30
        regle47 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
