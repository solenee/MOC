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
public class S_TYPE_MOC {
LEX_MOC scanner;
  S_TYPE_MOC() {
    }
  S_TYPE_MOC(LEX_MOC scanner, boolean eval) {
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
  DTYPE att_type;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  DTYPE att_tBool;
  TDS att_tds;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  private void regle81() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_id);
if  (att_eval)      action_type_81();
  }
  private void regle10() throws Exception {

    //declaration
    S_STYPE_MOC x_2 = new S_STYPE_MOC(scanner,att_eval) ;
    S_REFS_MOC x_4 = new S_REFS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_10(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_recapTypePointeur_10(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_creatType_10(x_2, x_4);
  }
private void action_type_81() throws Exception {
try {
// instructions
if ((this.att_tAny==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_UnusableAny, MOCMessages.UnusableAny,new Object[]{""+"declarer la classe NSObject pour avoir acces au type any"});

}
else {
this.att_type=this.att_tAny;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","TYPE -> id #type ;"});
}
  }
private void action_creatType_10(S_STYPE_MOC x_2, S_REFS_MOC x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#creatType","TYPE -> STYPE #recapTypePointeur REFS #creatType ;"});
}
  }
private void action_recapTypePointeur_10(S_STYPE_MOC x_2, S_REFS_MOC x_4) throws Exception {
try {
// instructions
x_4.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#recapTypePointeur","TYPE -> STYPE #recapTypePointeur REFS #creatType ;"});
}
  }
private void action_auto_inh_10(S_STYPE_MOC x_2, S_REFS_MOC x_4) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_2.att_tAny=this.att_tAny;
x_2.att_tBool=this.att_tBool;
x_2.att_tNil=this.att_tNil;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_2.att_tds_classe=this.att_tds_classe;
x_4.att_tds_classe=this.att_tds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","TYPE -> STYPE #recapTypePointeur REFS #creatType ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_void : // 5749
        regle10 () ;
      break ;
      case LEX_MOC.token_int : // 5751
        regle10 () ;
      break ;
      case LEX_MOC.token_char : // 5752
        regle10 () ;
      break ;
      case LEX_MOC.token_identc : // 5785
        regle10 () ;
      break ;
      case LEX_MOC.token_bool : // 5777
        regle10 () ;
      break ;
      case LEX_MOC.token_id : // 5773
        regle81 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
