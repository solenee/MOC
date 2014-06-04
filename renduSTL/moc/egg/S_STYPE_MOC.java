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
public class S_STYPE_MOC {
LEX_MOC scanner;
  S_STYPE_MOC() {
    }
  S_STYPE_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_tVoid;
  Register att_regLB;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_eval;
  DTYPE att_tChar;
  DTYPE att_tBool;
  DTYPE att_type;
  TDS att_tds;
  DTYPE att_tPointeurNull;
  DTYPE att_tInt;
  LEX_MOC att_scanner;
  DTYPE att_tString;
  private void regle14() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_int);
if  (att_eval)      action_creatType_14();
  }
  private void regle15() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_char);
if  (att_eval)      action_creatType_15();
  }
  private void regle80() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_bool);
if  (att_eval)      action_type_80();
  }
  private void regle79() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_identc);
if  (att_eval)      action_type_79(x_2);
  }
  private void regle13() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_void);
if  (att_eval)      action_creatType_13();
  }
private void action_type_80() throws Exception {
try {
// instructions
this.att_type=this.att_tBool;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","STYPE -> bool #type ;"});
}
  }
private void action_creatType_15() throws Exception {
try {
// instructions
this.att_type=this.att_tChar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#creatType","STYPE -> char #creatType ;"});
}
  }
private void action_creatType_13() throws Exception {
try {
// instructions
this.att_type=this.att_tVoid;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#creatType","STYPE -> void #creatType ;"});
}
  }
private void action_creatType_14() throws Exception {
try {
// instructions
this.att_type=this.att_tInt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#creatType","STYPE -> int #creatType ;"});
}
  }
private void action_type_79(T_MOC x_2) throws Exception {
try {
// locales
INFO loc_in;
INFOCLASSE loc_i;
// instructions
loc_in=this.att_tds_classe.chercherLocalement(x_2.att_txt);
if ((loc_in==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_UnknownClass, MOCMessages.UnknownClass,new Object[]{""+"Classe "+x_2.att_txt+" inconnue"});

}
else {
if (loc_in instanceof INFOCLASSE ){
loc_i=((INFOCLASSE)loc_in);
this.att_type=loc_i.getType();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_InterneInfoClasse, MOCMessages.InterneInfoClasse,new Object[]{""+x_2.att_txt+" n'a pas d'infoclasse"});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","STYPE -> identc #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_void : // 52
        regle13 () ;
      break ;
      case LEX_MOC.token_int : // 54
        regle14 () ;
      break ;
      case LEX_MOC.token_char : // 55
        regle15 () ;
      break ;
      case LEX_MOC.token_identc : // 88
        regle79 () ;
      break ;
      case LEX_MOC.token_bool : // 80
        regle80 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
