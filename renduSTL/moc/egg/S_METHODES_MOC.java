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
public class S_METHODES_MOC {
LEX_MOC scanner;
  S_METHODES_MOC() {
    }
  S_METHODES_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_classe;
  Register att_regLB;
  TDS att_stds_classe;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  Emplacement att_emplNull;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  DTYPE att_tBool;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle75() throws Exception {

    //declaration
    S_METHODE_MOC x_3 = new S_METHODE_MOC(scanner,att_eval) ;
    S_METHODES_MOC x_5 = new S_METHODES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_75(x_3, x_5);
if  (att_eval)      action_init_75(x_3, x_5);
    x_3.analyser() ;
if  (att_eval)      action_tds_classe_75(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_stds_classe_75(x_3, x_5);
if  (att_eval)      action_gen_75(x_3, x_5);
  }
  private void regle74() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_stds_classe_74();
if  (att_eval)      action_gen_74();
  }
private void action_tds_classe_75(S_METHODE_MOC x_3, S_METHODES_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tds_classe=x_3.att_stds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_classe","METHODES -> #init METHODE #tds_classe METHODES1 #stds_classe #gen ;"});
}
  }
private void action_auto_inh_75(S_METHODE_MOC x_3, S_METHODES_MOC x_5) throws Exception {
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
x_3.att_tBool=this.att_tBool;
x_5.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_5.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_fonction=this.att_tds_fonction;
x_3.att_classe=this.att_classe;
x_5.att_classe=this.att_classe;
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_emplNull=this.att_emplNull;
x_5.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","METHODES -> #init METHODE #tds_classe METHODES1 #stds_classe #gen ;"});
}
  }
private void action_gen_75(S_METHODE_MOC x_3, S_METHODES_MOC x_5) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","METHODES -> #init METHODE #tds_classe METHODES1 #stds_classe #gen ;"});
}
  }
private void action_gen_74() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","METHODES -> #stds_classe #gen ;"});
}
  }
private void action_init_75(S_METHODE_MOC x_3, S_METHODES_MOC x_5) throws Exception {
try {
// instructions
x_3.att_tds_classe=this.att_tds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#init","METHODES -> #init METHODE #tds_classe METHODES1 #stds_classe #gen ;"});
}
  }
private void action_stds_classe_75(S_METHODE_MOC x_3, S_METHODES_MOC x_5) throws Exception {
try {
// instructions
this.att_stds_classe=x_5.att_stds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds_classe","METHODES -> #init METHODE #tds_classe METHODES1 #stds_classe #gen ;"});
}
  }
private void action_stds_classe_74() throws Exception {
try {
// instructions
this.att_stds_classe=this.att_tds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds_classe","METHODES -> #stds_classe #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_fin : // 78
        regle74 () ;
      break ;
      case LEX_MOC.token_plus : // 65
        regle75 () ;
      break ;
      case LEX_MOC.token_moins : // 66
        regle75 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
