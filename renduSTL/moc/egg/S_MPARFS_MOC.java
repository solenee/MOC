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
public class S_MPARFS_MOC {
LEX_MOC scanner;
  S_MPARFS_MOC() {
    }
  S_MPARFS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_eval;
  PARAMETRES att_params;
  PARAMETRES att_hparams;
  IMachine att_machine;
  Emplacement att_emplNull;
  String att_nom;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  int att_hadr;
  int att_last_adr;
  TDS att_htdspar;
  DTYPE att_tChar;
  DTYPE att_typeClasse;
  DTYPE att_tBool;
  TDS att_tdspar;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle83() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_parametres_83();
if  (att_eval)      action_last_adr_83();
  }
  private void regle84() throws Exception {

    //declaration
    S_MPARF_MOC x_2 = new S_MPARF_MOC(scanner,att_eval) ;
    S_MPARFS_MOC x_4 = new S_MPARFS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_84(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_parametres1_84(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_parametres2_84(x_2, x_4);
if  (att_eval)      action_last_adr_84(x_2, x_4);
  }
private void action_parametres2_84(S_MPARF_MOC x_2, S_MPARFS_MOC x_4) throws Exception {
try {
// instructions
this.att_params=x_4.att_params;
this.att_tdspar=x_4.att_tdspar;
this.att_nom=x_2.att_nom+x_4.att_nom;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres2","MPARFS -> MPARF #parametres1 MPARFS1 #parametres2 #last_adr ;"});
}
  }
private void action_last_adr_84(S_MPARF_MOC x_2, S_MPARFS_MOC x_4) throws Exception {
try {
// instructions
this.att_last_adr=x_4.att_last_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#last_adr","MPARFS -> MPARF #parametres1 MPARFS1 #parametres2 #last_adr ;"});
}
  }
private void action_auto_inh_84(S_MPARF_MOC x_2, S_MPARFS_MOC x_4) throws Exception {
try {
// instructions
x_2.att_typeClasse=this.att_typeClasse;
x_4.att_typeClasse=this.att_typeClasse;
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
x_2.att_tBool=this.att_tBool;
x_4.att_tBool=this.att_tBool;
x_2.att_tNil=this.att_tNil;
x_4.att_tNil=this.att_tNil;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_2.att_tds_classe=this.att_tds_classe;
x_4.att_tds_classe=this.att_tds_classe;
x_2.att_hparams=this.att_hparams;
x_2.att_htdspar=this.att_htdspar;
x_2.att_hadr=this.att_hadr;
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_emplNull=this.att_emplNull;
x_4.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","MPARFS -> MPARF #parametres1 MPARFS1 #parametres2 #last_adr ;"});
}
  }
private void action_last_adr_83() throws Exception {
try {
// instructions
this.att_last_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#last_adr","MPARFS -> #parametres #last_adr ;"});
}
  }
private void action_parametres1_84(S_MPARF_MOC x_2, S_MPARFS_MOC x_4) throws Exception {
try {
// instructions
x_4.att_hparams=x_2.att_params;
x_4.att_htdspar=x_2.att_tdspar;
x_4.att_hadr=x_2.att_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres1","MPARFS -> MPARF #parametres1 MPARFS1 #parametres2 #last_adr ;"});
}
  }
private void action_parametres_83() throws Exception {
try {
// instructions
this.att_params=this.att_hparams;
this.att_tdspar=this.att_htdspar;
this.att_nom="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#parametres","MPARFS -> #parametres #last_adr ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_aco : // 45
        regle83 () ;
      break ;
      case LEX_MOC.token_ident : // 87
        regle84 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
