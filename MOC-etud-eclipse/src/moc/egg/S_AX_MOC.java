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
public class S_AX_MOC {
LEX_MOC scanner;
  S_AX_MOC() {
    }
  S_AX_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_est_adresse;
  Emplacement att_adresse;
  Register att_regLB;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_vide;
  boolean att_eval;
  DTYPE att_tAny;
  String att_hcode;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_tInt;
  boolean att_hest_adresse;
  DTYPE att_tString;
  DTYPE att_tVoid;
  Emplacement att_hadresse;
  DTYPE att_tChar;
  DTYPE att_tBool;
  TDS att_tds;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  private void regle31() throws Exception {

    //declaration
    S_OPREL_MOC x_2 = new S_OPREL_MOC(scanner,att_eval) ;
    S_R_MOC x_3 = new S_R_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_31(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_verifType_31(x_2, x_3);
if  (att_eval)      action_extension_31(x_2, x_3);
if  (att_eval)      action_adresse_31(x_2, x_3);
if  (att_eval)      action_gen_31(x_2, x_3);
  }
  private void regle32() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_extension_32();
if  (att_eval)      action_adresse_32();
if  (att_eval)      action_gen_32();
  }
private void action_gen_32() throws Exception {
try {
// instructions
this.att_code=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","AX -> #extension #adresse #gen ;"});
}
  }
private void action_extension_32() throws Exception {
try {
// instructions
this.att_vide=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#extension","AX -> #extension #adresse #gen ;"});
}
  }
private void action_gen_31(S_OPREL_MOC x_2, S_R_MOC x_3) throws Exception {
try {
// locales
Emplacement loc_adr_gauche;
Emplacement loc_adr_droite;
String loc_codegauche;
String loc_codedroit;
// instructions
loc_adr_gauche=this.att_hadresse;
if (loc_adr_gauche==null){
loc_codegauche=this.att_hcode;
}
else {
loc_codegauche=this.att_hcode+this.att_machine.genReadMem(loc_adr_gauche, x_3.att_type.getTaille());
}
loc_adr_droite=x_3.att_adresse;
if (loc_adr_droite==null){
loc_codedroit=x_3.att_code;
}
else {
loc_codedroit=x_3.att_code+this.att_machine.genReadMem(loc_adr_droite, x_3.att_type.getTaille());
}
this.att_code=this.att_machine.genOpBinaire(loc_codegauche, x_2.att_code, loc_codedroit);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","AX -> OPREL R #verifType #extension #adresse #gen ;"});
}
  }
private void action_extension_31(S_OPREL_MOC x_2, S_R_MOC x_3) throws Exception {
try {
// instructions
this.att_vide=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#extension","AX -> OPREL R #verifType #extension #adresse #gen ;"});
}
  }
private void action_adresse_32() throws Exception {
try {
// instructions
this.att_est_adresse=this.att_hest_adresse;
this.att_adresse=this.att_hadresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","AX -> #extension #adresse #gen ;"});
}
  }
private void action_adresse_31(S_OPREL_MOC x_2, S_R_MOC x_3) throws Exception {
try {
// instructions
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","AX -> OPREL R #verifType #extension #adresse #gen ;"});
}
  }
private void action_verifType_31(S_OPREL_MOC x_2, S_R_MOC x_3) throws Exception {
try {
// instructions
if (!(x_3.att_type.isOperable())){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_20, MOCMessages.B_20,new Object[]{""+"Les operations ne peuvent etre faites que sur les entiers"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifType","AX -> OPREL R #verifType #extension #adresse #gen ;"});
}
  }
private void action_auto_inh_31(S_OPREL_MOC x_2, S_R_MOC x_3) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_3.att_tAny=this.att_tAny;
x_3.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_3.att_tds_classe=this.att_tds_classe;
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","AX -> OPREL R #verifType #extension #adresse #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_inf : // 5756
        regle31 () ;
      break ;
      case LEX_MOC.token_sup : // 5758
        regle31 () ;
      break ;
      case LEX_MOC.token_infeg : // 5757
        regle31 () ;
      break ;
      case LEX_MOC.token_supeg : // 5759
        regle31 () ;
      break ;
      case LEX_MOC.token_eg : // 5760
        regle31 () ;
      break ;
      case LEX_MOC.token_neg : // 5761
        regle31 () ;
      break ;
      case LEX_MOC.token_affect : // 5746
        regle32 () ;
      break ;
      case LEX_MOC.token_virg : // 5744
        regle32 () ;
      break ;
      case LEX_MOC.token_pv : // 5745
        regle32 () ;
      break ;
      case LEX_MOC.token_parf : // 5741
        regle32 () ;
      break ;
      case LEX_MOC.token_ident : // 5784
        regle32 () ;
      break ;
      case LEX_MOC.token_crf : // 5772
        regle32 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
