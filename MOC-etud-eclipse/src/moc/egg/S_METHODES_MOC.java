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
  DTYPE att_tAny;
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
  private void regle75() throws Exception {

    //declaration
    S_METHODE_MOC x_2 = new S_METHODE_MOC(scanner,att_eval) ;
    S_METHODES_MOC x_4 = new S_METHODES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_75(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_tds_classe_75(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_stds_classe_75(x_2, x_4);
  }
  private void regle74() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_stds_classe_74();
  }
private void action_tds_classe_75(S_METHODE_MOC x_2, S_METHODES_MOC x_4) throws Exception {
try {
// instructions
if ((x_2.att_stds_classe==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+"METHODE^stds_classe dans METHODES->METHODE #tds_classe  METHODES #stds_classe;; est null"});

}

x_4.att_tds_classe=x_2.att_stds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_classe","METHODES -> METHODE #tds_classe METHODES1 #stds_classe ;"});
}
  }
private void action_auto_inh_75(S_METHODE_MOC x_2, S_METHODES_MOC x_4) throws Exception {
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
x_2.att_classe=this.att_classe;
x_4.att_classe=this.att_classe;
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","METHODES -> METHODE #tds_classe METHODES1 #stds_classe ;"});
}
  }
private void action_stds_classe_75(S_METHODE_MOC x_2, S_METHODES_MOC x_4) throws Exception {
try {
// instructions
this.att_stds_classe=x_4.att_stds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds_classe","METHODES -> METHODE #tds_classe METHODES1 #stds_classe ;"});
}
  }
private void action_stds_classe_74() throws Exception {
try {
// instructions
if ((this.att_tds_classe==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+"METHODES^tds_classe dans METHODES-> ; est null"});

}

this.att_stds_classe=this.att_tds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds_classe","METHODES -> #stds_classe ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_fin : // 4973
        regle74 () ;
      break ;
      case LEX_MOC.token_plus : // 4960
        regle75 () ;
      break ;
      case LEX_MOC.token_moins : // 4961
        regle75 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
