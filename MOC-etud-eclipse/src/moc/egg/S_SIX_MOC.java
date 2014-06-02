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
public class S_SIX_MOC {
LEX_MOC scanner;
  S_SIX_MOC() {
    }
  S_SIX_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_eval;
  DTYPE att_typeRet;
  DTYPE att_tAny;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  int att_htailleparams;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  int att_hadr;
  DTYPE att_tChar;
  boolean att_isRet;
  DTYPE att_tBool;
  TDS att_tds;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  private void regle23() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_BLOC_MOC x_5 = new S_BLOC_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_23(x_5);
    x_2.analyser(LEX_MOC.token_sinon);
if  (att_eval)      action_tds_23(x_5);
if  (att_eval)      action_passeTypeRet_23(x_5);
    x_5.analyser() ;
if  (att_eval)      action_isReturn_23(x_5);
if  (att_eval)      action_gen_23(x_5);
  }
  private void regle24() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_isReturn_24();
if  (att_eval)      action_gen_24();
  }
private void action_passeTypeRet_23(S_BLOC_MOC x_5) throws Exception {
try {
// instructions
x_5.att_typeRet=this.att_typeRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#passeTypeRet","SIX -> sinon #tds #passeTypeRet BLOC #isReturn #gen ;"});
}
  }
private void action_isReturn_23(S_BLOC_MOC x_5) throws Exception {
try {
// instructions
this.att_isRet=x_5.att_isRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","SIX -> sinon #tds #passeTypeRet BLOC #isReturn #gen ;"});
}
  }
private void action_isReturn_24() throws Exception {
try {
// instructions
this.att_isRet=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","SIX -> #isReturn #gen ;"});
}
  }
private void action_gen_24() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","SIX -> #isReturn #gen ;"});
}
  }
private void action_gen_23(S_BLOC_MOC x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","SIX -> sinon #tds #passeTypeRet BLOC #isReturn #gen ;"});
}
  }
private void action_tds_23(S_BLOC_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","SIX -> sinon #tds #passeTypeRet BLOC #isReturn #gen ;"});
}
  }
private void action_auto_inh_23(S_BLOC_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tInt=this.att_tInt;
x_5.att_tChar=this.att_tChar;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tVoid=this.att_tVoid;
x_5.att_tString=this.att_tString;
x_5.att_regLB=this.att_regLB;
x_5.att_tAny=this.att_tAny;
x_5.att_tBool=this.att_tBool;
x_5.att_tNil=this.att_tNil;
x_5.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_classe=this.att_tds_classe;
x_5.att_hadr=this.att_hadr;
x_5.att_htailleparams=this.att_htailleparams;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","SIX -> sinon #tds #passeTypeRet BLOC #isReturn #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_sinon : // 5748
        regle23 () ;
      break ;
      case LEX_MOC.token_void : // 5749
        regle24 () ;
      break ;
      case LEX_MOC.token_int : // 5751
        regle24 () ;
      break ;
      case LEX_MOC.token_char : // 5752
        regle24 () ;
      break ;
      case LEX_MOC.token_identc : // 5785
        regle24 () ;
      break ;
      case LEX_MOC.token_bool : // 5777
        regle24 () ;
      break ;
      case LEX_MOC.token_id : // 5773
        regle24 () ;
      break ;
      case LEX_MOC.token_entier : // 5781
        regle24 () ;
      break ;
      case LEX_MOC.token_caractere : // 5782
        regle24 () ;
      break ;
      case LEX_MOC.token_plus : // 5762
        regle24 () ;
      break ;
      case LEX_MOC.token_moins : // 5763
        regle24 () ;
      break ;
      case LEX_MOC.token_non : // 5769
        regle24 () ;
      break ;
      case LEX_MOC.token_null : // 5754
        regle24 () ;
      break ;
      case LEX_MOC.token_paro : // 5740
        regle24 () ;
      break ;
      case LEX_MOC.token_ident : // 5784
        regle24 () ;
      break ;
      case LEX_MOC.token_mult : // 5765
        regle24 () ;
      break ;
      case LEX_MOC.token_nil : // 5755
        regle24 () ;
      break ;
      case LEX_MOC.token_yes : // 5779
        regle24 () ;
      break ;
      case LEX_MOC.token_no : // 5780
        regle24 () ;
      break ;
      case LEX_MOC.token_chaineo : // 5786
        regle24 () ;
      break ;
      case LEX_MOC.token_self : // 5776
        regle24 () ;
      break ;
      case LEX_MOC.token_super : // 5778
        regle24 () ;
      break ;
      case LEX_MOC.token_cro : // 5771
        regle24 () ;
      break ;
      case LEX_MOC.token_aco : // 5742
        regle24 () ;
      break ;
      case LEX_MOC.token_si : // 5747
        regle24 () ;
      break ;
      case LEX_MOC.token_retour : // 5753
        regle24 () ;
      break ;
      case LEX_MOC.token_asm : // 5750
        regle24 () ;
      break ;
      case LEX_MOC.token_acf : // 5743
        regle24 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
