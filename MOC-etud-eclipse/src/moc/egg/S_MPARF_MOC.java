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
public class S_MPARF_MOC {
LEX_MOC scanner;
  S_MPARF_MOC() {
    }
  S_MPARF_MOC(LEX_MOC scanner, boolean eval) {
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
  DTYPE att_tAny;
  PARAMETRES att_params;
  PARAMETRES att_hparams;
  IMachine att_machine;
  String att_nom;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  int att_hadr;
  TDS att_htdspar;
  DTYPE att_tChar;
  DTYPE att_tBool;
  TDS att_tdspar;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle86() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_PTYPE_MOC x_4 = new S_PTYPE_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_86(x_2, x_4, x_5);
    x_2.analyser(LEX_MOC.token_ident);
    x_3.analyser(LEX_MOC.token_dpts);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_ident);
if  (att_eval)      action_parametres_86(x_2, x_4, x_5);
if  (att_eval)      action_adresse_86(x_2, x_4, x_5);
  }
  private void regle85() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_ident);
if  (att_eval)      action_parametres_85(x_2);
if  (att_eval)      action_adresse_85(x_2);
  }
private void action_parametres_86(T_MOC x_2, S_PTYPE_MOC x_4, T_MOC x_5) throws Exception {
try {
// locales
PARAMETRES loc_p;
INFOVAR loc_i;
TDS loc_t;
// instructions
loc_i= new INFOVAR(x_4.att_type,  new Emplacement(this.att_hadr, this.att_regLB));
loc_p=this.att_hparams;
loc_p.inserer(x_4.att_type);
this.att_params=loc_p;
loc_t=this.att_htdspar;
if ((loc_t.chercherLocalement(x_5.att_txt)==null)){
loc_t.inserer(x_5.att_txt, loc_i);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_param_exists, MOCMessages.param_exists,new Object[]{""+x_5.att_txt});

}
this.att_tdspar=loc_t;
this.att_nom=x_2.att_txt+":";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres","MPARF -> ident dpts PTYPE ident1 #parametres #adresse ;"});
}
  }
private void action_adresse_86(T_MOC x_2, S_PTYPE_MOC x_4, T_MOC x_5) throws Exception {
try {
// locales
int loc_taille;
// instructions
loc_taille=x_4.att_type.getTaille();
this.att_adr=this.att_hadr-loc_taille;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","MPARF -> ident dpts PTYPE ident1 #parametres #adresse ;"});
}
  }
private void action_parametres_85(T_MOC x_2) throws Exception {
try {
// instructions
this.att_params=this.att_hparams;
this.att_tdspar=this.att_htdspar;
this.att_nom=x_2.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres","MPARF -> ident #parametres #adresse ;"});
}
  }
private void action_adresse_85(T_MOC x_2) throws Exception {
try {
// instructions
this.att_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","MPARF -> ident #parametres #adresse ;"});
}
  }
private void action_auto_inh_86(T_MOC x_2, S_PTYPE_MOC x_4, T_MOC x_5) throws Exception {
try {
// instructions
x_4.att_tInt=this.att_tInt;
x_4.att_tChar=this.att_tChar;
x_4.att_tPointeurNull=this.att_tPointeurNull;
x_4.att_tVoid=this.att_tVoid;
x_4.att_tString=this.att_tString;
x_4.att_regLB=this.att_regLB;
x_4.att_tAny=this.att_tAny;
x_4.att_tBool=this.att_tBool;
x_4.att_tNil=this.att_tNil;
x_4.att_tds=this.att_tds;
x_4.att_tds_classe=this.att_tds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","MPARF -> ident dpts PTYPE ident1 #parametres #adresse ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_ident : // 265
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MOC.token_ident : // 265
            regle85 () ;
          break ;
          case LEX_MOC.token_aco : // 223
            regle85 () ;
          break ;
          case LEX_MOC.token_dpts : // 251
            regle86 () ;
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
