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
public class S_MARGS_MOC {
LEX_MOC scanner;
  S_MARGS_MOC() {
    }
  S_MARGS_MOC(LEX_MOC scanner, boolean eval) {
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
  PARAMETRES att_params;
  PARAMETRES att_hparams;
  IMachine att_machine;
  TDS att_tds_fonction;
  String att_nom;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  DTYPE att_tBool;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle95() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_parametres_95();
  }
  private void regle96() throws Exception {

    //declaration
    S_MARG_MOC x_2 = new S_MARG_MOC(scanner,att_eval) ;
    S_MARGS_MOC x_4 = new S_MARGS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_96(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_parametres1_96(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_parametres2_96(x_2, x_4);
  }
private void action_parametres2_96(S_MARG_MOC x_2, S_MARGS_MOC x_4) throws Exception {
try {
// instructions
this.att_params=x_4.att_params;
this.att_nom=x_2.att_nom+x_4.att_nom;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres2","MARGS -> MARG #parametres1 MARGS1 #parametres2 ;"});
}
  }
private void action_parametres1_96(S_MARG_MOC x_2, S_MARGS_MOC x_4) throws Exception {
try {
// instructions
x_4.att_hparams=x_2.att_params;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres1","MARGS -> MARG #parametres1 MARGS1 #parametres2 ;"});
}
  }
private void action_auto_inh_96(S_MARG_MOC x_2, S_MARGS_MOC x_4) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_4.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_4.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_4.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_4.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_4.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_4.att_regLB=this.att_regLB;
x_2.att_tAny=this.att_tAny;
x_4.att_tAny=this.att_tAny;
x_2.att_tBool=this.att_tBool;
x_4.att_tBool=this.att_tBool;
x_2.att_tNil=this.att_tNil;
x_4.att_tNil=this.att_tNil;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_2.att_tds_fonction=this.att_tds_fonction;
x_4.att_tds_fonction=this.att_tds_fonction;
x_2.att_tds_classe=this.att_tds_classe;
x_4.att_tds_classe=this.att_tds_classe;
x_2.att_hparams=this.att_hparams;
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","MARGS -> MARG #parametres1 MARGS1 #parametres2 ;"});
}
  }
private void action_parametres_95() throws Exception {
try {
// instructions
this.att_params=this.att_hparams;
this.att_nom="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres","MARGS -> #parametres ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_crf : // 164
        regle95 () ;
      break ;
      case LEX_MOC.token_ident : // 176
        regle96 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
