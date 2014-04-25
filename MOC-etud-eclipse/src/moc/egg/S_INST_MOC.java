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
public class S_INST_MOC {
LEX_MOC scanner;
  S_INST_MOC() {
    }
  S_INST_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle26() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MOC.token_asm);
if  (att_eval)      action_tds_26(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_gen_26(x_4);
  }
  private void regle25() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_E_MOC x_3 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_25(x_3);
    x_2.analyser(LEX_MOC.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_pv);
  }
  private void regle19() throws Exception {

    //declaration
    S_TYPE_MOC x_2 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_AFFX_MOC x_4 = new S_AFFX_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_19(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_ident);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_pv);
  }
  private void regle22() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_E_MOC x_4 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    S_BLOC_MOC x_6 = new S_BLOC_MOC(scanner,att_eval) ;
    S_SIX_MOC x_7 = new S_SIX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_22(x_4, x_6, x_7);
    x_2.analyser(LEX_MOC.token_si);
    x_3.analyser(LEX_MOC.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_parf);
    x_6.analyser() ;
    x_7.analyser() ;
  }
  private void regle20() throws Exception {

    //declaration
    S_E_MOC x_2 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_20(x_2);
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_pv);
  }
  private void regle21() throws Exception {

    //declaration
    S_BLOC_MOC x_2 = new S_BLOC_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_21(x_2);
    x_2.analyser() ;
  }
private void action_tds_26(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INST -> asm #tds ASM #gen ;"});
}
  }
private void action_auto_inh_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> TYPE ident AFFX pv ;"});
}
  }
private void action_auto_inh_20(S_E_MOC x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> E pv ;"});
}
  }
private void action_auto_inh_21(S_BLOC_MOC x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> BLOC ;"});
}
  }
private void action_gen_26(ASM x_4) throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> asm #tds ASM #gen ;"});
}
  }
private void action_auto_inh_25(S_E_MOC x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> retour E pv ;"});
}
  }
private void action_auto_inh_22(S_E_MOC x_4, S_BLOC_MOC x_6, S_SIX_MOC x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> si paro E parf BLOC SIX ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_void : // 34
        regle19 () ;
      break ;
      case LEX_MOC.token_int : // 36
        regle19 () ;
      break ;
      case LEX_MOC.token_char : // 37
        regle19 () ;
      break ;
      case LEX_MOC.token_entier : // 55
        regle20 () ;
      break ;
      case LEX_MOC.token_chaine : // 57
        regle20 () ;
      break ;
      case LEX_MOC.token_caractere : // 56
        regle20 () ;
      break ;
      case LEX_MOC.token_plus : // 47
        regle20 () ;
      break ;
      case LEX_MOC.token_moins : // 48
        regle20 () ;
      break ;
      case LEX_MOC.token_non : // 54
        regle20 () ;
      break ;
      case LEX_MOC.token_null : // 39
        regle20 () ;
      break ;
      case LEX_MOC.token_paro : // 25
        regle20 () ;
      break ;
      case LEX_MOC.token_ident : // 58
        regle20 () ;
      break ;
      case LEX_MOC.token_mult : // 50
        regle20 () ;
      break ;
      case LEX_MOC.token_aco : // 27
        regle21 () ;
      break ;
      case LEX_MOC.token_si : // 32
        regle22 () ;
      break ;
      case LEX_MOC.token_retour : // 38
        regle25 () ;
      break ;
      case LEX_MOC.token_asm : // 35
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
