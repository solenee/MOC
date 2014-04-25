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
public class S_INSTS_MOC {
LEX_MOC scanner;
  S_INSTS_MOC() {
    }
  S_INSTS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle17() throws Exception {

    //declaration
    //appel
  }
  private void regle18() throws Exception {

    //declaration
    S_INST_MOC x_2 = new S_INST_MOC(scanner,att_eval) ;
    S_INSTS_MOC x_3 = new S_INSTS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_18(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_18(S_INST_MOC x_2, S_INSTS_MOC x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INSTS -> INST INSTS1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_acf : // 28
        regle17 () ;
      break ;
      case LEX_MOC.token_void : // 34
        regle18 () ;
      break ;
      case LEX_MOC.token_int : // 36
        regle18 () ;
      break ;
      case LEX_MOC.token_char : // 37
        regle18 () ;
      break ;
      case LEX_MOC.token_entier : // 55
        regle18 () ;
      break ;
      case LEX_MOC.token_chaine : // 57
        regle18 () ;
      break ;
      case LEX_MOC.token_caractere : // 56
        regle18 () ;
      break ;
      case LEX_MOC.token_plus : // 47
        regle18 () ;
      break ;
      case LEX_MOC.token_moins : // 48
        regle18 () ;
      break ;
      case LEX_MOC.token_non : // 54
        regle18 () ;
      break ;
      case LEX_MOC.token_null : // 39
        regle18 () ;
      break ;
      case LEX_MOC.token_paro : // 25
        regle18 () ;
      break ;
      case LEX_MOC.token_ident : // 58
        regle18 () ;
      break ;
      case LEX_MOC.token_mult : // 50
        regle18 () ;
      break ;
      case LEX_MOC.token_aco : // 27
        regle18 () ;
      break ;
      case LEX_MOC.token_si : // 32
        regle18 () ;
      break ;
      case LEX_MOC.token_retour : // 38
        regle18 () ;
      break ;
      case LEX_MOC.token_asm : // 35
        regle18 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
