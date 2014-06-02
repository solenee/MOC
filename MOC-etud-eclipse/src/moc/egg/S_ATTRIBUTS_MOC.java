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
public class S_ATTRIBUTS_MOC {
LEX_MOC scanner;
  S_ATTRIBUTS_MOC() {
    }
  S_ATTRIBUTS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_hdep;
  Register att_regLB;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_eval;
  DTYPE att_tAny;
  IMachine att_machine;
  DTYPE att_tInt;
  LCHAMPS att_hattributs;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  DTYPE att_tBool;
  LCHAMPS att_attributs;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle73() throws Exception {

    //declaration
    S_TYPE_MOC x_2 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    S_ATTRIBUTS_MOC x_6 = new S_ATTRIBUTS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_73(x_2, x_3, x_6);
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_ident);
    x_4.analyser(LEX_MOC.token_pv);
if  (att_eval)      action_attributs1_73(x_2, x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_attributs2_73(x_2, x_3, x_6);
  }
  private void regle72() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_attributs_72();
  }
private void action_attributs1_73(S_TYPE_MOC x_2, T_MOC x_3, S_ATTRIBUTS_MOC x_6) throws Exception {
try {
// locales
LCHAMPS loc_lc;
CHAMP loc_c;
// instructions
loc_lc=this.att_hattributs;
loc_c=loc_lc.chercher(x_3.att_txt);
if ((loc_c!=null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Att_exist, MOCMessages.Att_exist,new Object[]{""+x_3.att_txt});

}
else {
loc_c= new CHAMP(x_3.att_txt, x_2.att_type, this.att_hdep);
loc_lc.inserer(loc_c);
x_6.att_hattributs=loc_lc;
}
x_6.att_hdep=this.att_hdep+x_2.att_type.getTaille();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#attributs1","ATTRIBUTS -> TYPE ident pv #attributs1 ATTRIBUTS1 #attributs2 ;"});
}
  }
private void action_auto_inh_73(S_TYPE_MOC x_2, T_MOC x_3, S_ATTRIBUTS_MOC x_6) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_6.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_6.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_6.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_6.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_6.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_6.att_regLB=this.att_regLB;
x_2.att_tAny=this.att_tAny;
x_6.att_tAny=this.att_tAny;
x_2.att_tBool=this.att_tBool;
x_6.att_tBool=this.att_tBool;
x_2.att_tNil=this.att_tNil;
x_6.att_tNil=this.att_tNil;
x_2.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
x_2.att_tds_classe=this.att_tds_classe;
x_6.att_tds_classe=this.att_tds_classe;
x_6.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ATTRIBUTS -> TYPE ident pv #attributs1 ATTRIBUTS1 #attributs2 ;"});
}
  }
private void action_attributs_72() throws Exception {
try {
// instructions
this.att_attributs=this.att_hattributs;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#attributs","ATTRIBUTS -> #attributs ;"});
}
  }
private void action_attributs2_73(S_TYPE_MOC x_2, T_MOC x_3, S_ATTRIBUTS_MOC x_6) throws Exception {
try {
// instructions
this.att_attributs=x_6.att_attributs;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#attributs2","ATTRIBUTS -> TYPE ident pv #attributs1 ATTRIBUTS1 #attributs2 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_acf : // 135
        regle72 () ;
      break ;
      case LEX_MOC.token_void : // 141
        regle73 () ;
      break ;
      case LEX_MOC.token_int : // 143
        regle73 () ;
      break ;
      case LEX_MOC.token_char : // 144
        regle73 () ;
      break ;
      case LEX_MOC.token_identc : // 177
        regle73 () ;
      break ;
      case LEX_MOC.token_bool : // 169
        regle73 () ;
      break ;
      case LEX_MOC.token_id : // 165
        regle73 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
