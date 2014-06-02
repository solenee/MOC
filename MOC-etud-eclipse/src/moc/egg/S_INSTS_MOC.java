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
  int att_adr;
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
  private void regle17() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_isReturn_17();
if  (att_eval)      action_adr_17();
if  (att_eval)      action_gen_17();
  }
  private void regle18() throws Exception {

    //declaration
    S_INST_MOC x_3 = new S_INST_MOC(scanner,att_eval) ;
    S_INSTS_MOC x_6 = new S_INSTS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_18(x_3, x_6);
if  (att_eval)      action_passeType_18(x_3, x_6);
    x_3.analyser() ;
if  (att_eval)      action_tds_18(x_3, x_6);
if  (att_eval)      action_adresse_18(x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_isReturn_18(x_3, x_6);
if  (att_eval)      action_adr_18(x_3, x_6);
if  (att_eval)      action_gen_18(x_3, x_6);
  }
private void action_gen_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_6.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_adr_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
this.att_adr=x_6.att_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adr","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_auto_inh_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_6.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_6.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_6.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_6.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_6.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_6.att_regLB=this.att_regLB;
x_3.att_tAny=this.att_tAny;
x_6.att_tAny=this.att_tAny;
x_3.att_tBool=this.att_tBool;
x_6.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_6.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_6.att_tds_fonction=this.att_tds_fonction;
x_3.att_tds_classe=this.att_tds_classe;
x_6.att_tds_classe=this.att_tds_classe;
x_3.att_hadr=this.att_hadr;
x_3.att_htailleparams=this.att_htailleparams;
x_6.att_htailleparams=this.att_htailleparams;
x_3.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_gen_17() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INSTS -> #isReturn #adr #gen ;"});
}
  }
private void action_adr_17() throws Exception {
try {
// instructions
this.att_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adr","INSTS -> #isReturn #adr #gen ;"});
}
  }
private void action_adresse_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
x_6.att_hadr=x_3.att_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_tds_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
x_6.att_tds=x_3.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_isReturn_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
this.att_isRet=x_3.att_isRet||x_6.att_isRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_isReturn_17() throws Exception {
try {
// instructions
this.att_isRet=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INSTS -> #isReturn #adr #gen ;"});
}
  }
private void action_passeType_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
x_3.att_typeRet=this.att_typeRet;
x_6.att_typeRet=this.att_typeRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#passeType","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_acf : // 4941
        regle17 () ;
      break ;
      case LEX_MOC.token_void : // 4947
        regle18 () ;
      break ;
      case LEX_MOC.token_int : // 4949
        regle18 () ;
      break ;
      case LEX_MOC.token_char : // 4950
        regle18 () ;
      break ;
      case LEX_MOC.token_identc : // 4983
        regle18 () ;
      break ;
      case LEX_MOC.token_bool : // 4975
        regle18 () ;
      break ;
      case LEX_MOC.token_id : // 4971
        regle18 () ;
      break ;
      case LEX_MOC.token_entier : // 4979
        regle18 () ;
      break ;
      case LEX_MOC.token_caractere : // 4980
        regle18 () ;
      break ;
      case LEX_MOC.token_plus : // 4960
        regle18 () ;
      break ;
      case LEX_MOC.token_moins : // 4961
        regle18 () ;
      break ;
      case LEX_MOC.token_non : // 4967
        regle18 () ;
      break ;
      case LEX_MOC.token_null : // 4952
        regle18 () ;
      break ;
      case LEX_MOC.token_paro : // 4938
        regle18 () ;
      break ;
      case LEX_MOC.token_ident : // 4982
        regle18 () ;
      break ;
      case LEX_MOC.token_mult : // 4963
        regle18 () ;
      break ;
      case LEX_MOC.token_nil : // 4953
        regle18 () ;
      break ;
      case LEX_MOC.token_yes : // 4977
        regle18 () ;
      break ;
      case LEX_MOC.token_no : // 4978
        regle18 () ;
      break ;
      case LEX_MOC.token_chaineo : // 4984
        regle18 () ;
      break ;
      case LEX_MOC.token_self : // 4974
        regle18 () ;
      break ;
      case LEX_MOC.token_super : // 4976
        regle18 () ;
      break ;
      case LEX_MOC.token_cro : // 4969
        regle18 () ;
      break ;
      case LEX_MOC.token_aco : // 4940
        regle18 () ;
      break ;
      case LEX_MOC.token_si : // 4945
        regle18 () ;
      break ;
      case LEX_MOC.token_retour : // 4951
        regle18 () ;
      break ;
      case LEX_MOC.token_asm : // 4948
        regle18 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
