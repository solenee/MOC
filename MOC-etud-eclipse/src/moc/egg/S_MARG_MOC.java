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
public class S_MARG_MOC {
LEX_MOC scanner;
  S_MARG_MOC() {
    }
  S_MARG_MOC(LEX_MOC scanner, boolean eval) {
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
  private void regle98() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_ident);
if  (att_eval)      action_parametres_98(x_2);
  }
  private void regle97() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_E_MOC x_5 = new S_E_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_97(x_2, x_5);
    x_2.analyser(LEX_MOC.token_ident);
    x_3.analyser(LEX_MOC.token_dpts);
if  (att_eval)      action_lire_resultat_97(x_2, x_5);
    x_5.analyser() ;
if  (att_eval)      action_parametres_97(x_2, x_5);
  }
private void action_parametres_97(T_MOC x_2, S_E_MOC x_5) throws Exception {
try {
// instructions
this.att_hparams.inserer(x_5.att_type);
this.att_params=this.att_hparams;
this.att_nom=x_2.att_txt+":";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres","MARG -> ident dpts #lire_resultat E #parametres ;"});
}
  }
private void action_parametres_98(T_MOC x_2) throws Exception {
try {
// instructions
this.att_params=this.att_hparams;
this.att_nom=x_2.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres","MARG -> ident #parametres ;"});
}
  }
private void action_auto_inh_97(T_MOC x_2, S_E_MOC x_5) throws Exception {
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
x_5.att_tds=this.att_tds;
x_5.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_classe=this.att_tds_classe;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","MARG -> ident dpts #lire_resultat E #parametres ;"});
}
  }
private void action_lire_resultat_97(T_MOC x_2, S_E_MOC x_5) throws Exception {
try {
// instructions
x_5.att_lire_resultat=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#lire_resultat","MARG -> ident dpts #lire_resultat E #parametres ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_ident : // 1193
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MOC.token_dpts : // 1179
            regle97 () ;
          break ;
          case LEX_MOC.token_ident : // 1193
            regle98 () ;
          break ;
          case LEX_MOC.token_crf : // 1181
            regle98 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MOC.token_ident);
        }
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
