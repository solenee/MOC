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
public class S_ARGS_MOC {
LEX_MOC scanner;
  S_ARGS_MOC() {
    }
  S_ARGS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_eval;
  DTYPE att_tAny;
  String att_code;
  PARAMETRES att_params;
  PARAMETRES att_hparams;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  DTYPE att_tBool;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle64() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_params_64();
if  (att_eval)      action_gen_64();
  }
  private void regle65() throws Exception {

    //declaration
    S_E_MOC x_3 = new S_E_MOC(scanner,att_eval) ;
    S_ARGSX_MOC x_5 = new S_ARGSX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_65(x_3, x_5);
if  (att_eval)      action_lire_resultat_65(x_3, x_5);
    x_3.analyser() ;
if  (att_eval)      action_params1_65(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_params2_65(x_3, x_5);
if  (att_eval)      action_gen_65(x_3, x_5);
  }
private void action_auto_inh_65(S_E_MOC x_3, S_ARGSX_MOC x_5) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_5.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_5.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_5.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_5.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_5.att_regLB=this.att_regLB;
x_3.att_tAny=this.att_tAny;
x_5.att_tAny=this.att_tAny;
x_3.att_tBool=this.att_tBool;
x_5.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_5.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_fonction=this.att_tds_fonction;
x_3.att_tds_classe=this.att_tds_classe;
x_5.att_tds_classe=this.att_tds_classe;
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ARGS -> #lire_resultat E #params1 ARGSX #params2 #gen ;"});
}
  }
private void action_params1_65(S_E_MOC x_3, S_ARGSX_MOC x_5) throws Exception {
try {
// locales
PARAMETRES loc_par;
// instructions
loc_par=this.att_hparams;
loc_par.inserer(x_3.att_type);
x_5.att_hparams=loc_par;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params1","ARGS -> #lire_resultat E #params1 ARGSX #params2 #gen ;"});
}
  }
private void action_params_64() throws Exception {
try {
// instructions
this.att_params=this.att_hparams;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","ARGS -> #params #gen ;"});
}
  }
private void action_params2_65(S_E_MOC x_3, S_ARGSX_MOC x_5) throws Exception {
try {
// instructions
this.att_params=x_5.att_params;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params2","ARGS -> #lire_resultat E #params1 ARGSX #params2 #gen ;"});
}
  }
private void action_lire_resultat_65(S_E_MOC x_3, S_ARGSX_MOC x_5) throws Exception {
try {
// instructions
x_3.att_lire_resultat=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#lire_resultat","ARGS -> #lire_resultat E #params1 ARGSX #params2 #gen ;"});
}
  }
private void action_gen_65(S_E_MOC x_3, S_ARGSX_MOC x_5) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genComment("empilement des parametres")+x_5.att_code+this.att_machine.genComment("parametre de sous-programme")+x_3.att_code+this.att_machine.genComment("charger le parametre ?");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ARGS -> #lire_resultat E #params1 ARGSX #params2 #gen ;"});
}
  }
private void action_gen_64() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ARGS -> #params #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_parf : // 4939
        regle64 () ;
      break ;
      case LEX_MOC.token_entier : // 4979
        regle65 () ;
      break ;
      case LEX_MOC.token_caractere : // 4980
        regle65 () ;
      break ;
      case LEX_MOC.token_plus : // 4960
        regle65 () ;
      break ;
      case LEX_MOC.token_moins : // 4961
        regle65 () ;
      break ;
      case LEX_MOC.token_non : // 4967
        regle65 () ;
      break ;
      case LEX_MOC.token_null : // 4952
        regle65 () ;
      break ;
      case LEX_MOC.token_paro : // 4938
        regle65 () ;
      break ;
      case LEX_MOC.token_ident : // 4982
        regle65 () ;
      break ;
      case LEX_MOC.token_mult : // 4963
        regle65 () ;
      break ;
      case LEX_MOC.token_nil : // 4953
        regle65 () ;
      break ;
      case LEX_MOC.token_yes : // 4977
        regle65 () ;
      break ;
      case LEX_MOC.token_no : // 4978
        regle65 () ;
      break ;
      case LEX_MOC.token_chaineo : // 4984
        regle65 () ;
      break ;
      case LEX_MOC.token_self : // 4974
        regle65 () ;
      break ;
      case LEX_MOC.token_super : // 4976
        regle65 () ;
      break ;
      case LEX_MOC.token_cro : // 4969
        regle65 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
