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
public class S_TX_MOC {
LEX_MOC scanner;
  S_TX_MOC() {
    }
  S_TX_MOC(LEX_MOC scanner, boolean eval) {
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
  private void regle47() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_extension_47();
if  (att_eval)      action_adresse_47();
if  (att_eval)      action_gen_47();
  }
  private void regle46() throws Exception {

    //declaration
    S_OPMUL_MOC x_2 = new S_OPMUL_MOC(scanner,att_eval) ;
    S_F_MOC x_3 = new S_F_MOC(scanner,att_eval) ;
    S_TX_MOC x_7 = new S_TX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_46(x_2, x_3, x_7);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_verifType_46(x_2, x_3, x_7);
if  (att_eval)      action_hcode_46(x_2, x_3, x_7);
if  (att_eval)      action_hadresse_46(x_2, x_3, x_7);
    x_7.analyser() ;
if  (att_eval)      action_extension_46(x_2, x_3, x_7);
if  (att_eval)      action_adresse_46(x_2, x_3, x_7);
if  (att_eval)      action_gen_46(x_2, x_3, x_7);
  }
private void action_verifType_46(S_OPMUL_MOC x_2, S_F_MOC x_3, S_TX_MOC x_7) throws Exception {
try {
// instructions
if (!(x_3.att_type.isOperable())){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_20, MOCMessages.B_20,new Object[]{""+"Les operations ne peuvent etre faites que sur les entiers"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifType","TX -> OPMUL F #verifType #hcode #hadresse TX1 #extension #adresse #gen ;"});
}
  }
private void action_hadresse_46(S_OPMUL_MOC x_2, S_F_MOC x_3, S_TX_MOC x_7) throws Exception {
try {
// instructions
x_7.att_hest_adresse=false;
x_7.att_hadresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#hadresse","TX -> OPMUL F #verifType #hcode #hadresse TX1 #extension #adresse #gen ;"});
}
  }
private void action_adresse_47() throws Exception {
try {
// instructions
this.att_est_adresse=this.att_hest_adresse;
this.att_adresse=this.att_hadresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","TX -> #extension #adresse #gen ;"});
}
  }
private void action_adresse_46(S_OPMUL_MOC x_2, S_F_MOC x_3, S_TX_MOC x_7) throws Exception {
try {
// instructions
this.att_est_adresse=x_7.att_est_adresse;
this.att_adresse=x_7.att_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","TX -> OPMUL F #verifType #hcode #hadresse TX1 #extension #adresse #gen ;"});
}
  }
private void action_extension_47() throws Exception {
try {
// instructions
this.att_vide=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#extension","TX -> #extension #adresse #gen ;"});
}
  }
private void action_extension_46(S_OPMUL_MOC x_2, S_F_MOC x_3, S_TX_MOC x_7) throws Exception {
try {
// instructions
this.att_vide=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#extension","TX -> OPMUL F #verifType #hcode #hadresse TX1 #extension #adresse #gen ;"});
}
  }
private void action_hcode_46(S_OPMUL_MOC x_2, S_F_MOC x_3, S_TX_MOC x_7) throws Exception {
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
x_7.att_hcode=this.att_machine.genOpBinaire(loc_codegauche, x_2.att_code, loc_codedroit);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#hcode","TX -> OPMUL F #verifType #hcode #hadresse TX1 #extension #adresse #gen ;"});
}
  }
private void action_auto_inh_46(S_OPMUL_MOC x_2, S_F_MOC x_3, S_TX_MOC x_7) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_7.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_7.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_7.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_7.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_7.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_7.att_regLB=this.att_regLB;
x_3.att_tAny=this.att_tAny;
x_7.att_tAny=this.att_tAny;
x_3.att_tBool=this.att_tBool;
x_7.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_7.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_7.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_7.att_tds_fonction=this.att_tds_fonction;
x_3.att_tds_classe=this.att_tds_classe;
x_7.att_tds_classe=this.att_tds_classe;
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","TX -> OPMUL F #verifType #hcode #hadresse TX1 #extension #adresse #gen ;"});
}
  }
private void action_gen_46(S_OPMUL_MOC x_2, S_F_MOC x_3, S_TX_MOC x_7) throws Exception {
try {
// instructions
this.att_code=x_7.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","TX -> OPMUL F #verifType #hcode #hadresse TX1 #extension #adresse #gen ;"});
}
  }
private void action_gen_47() throws Exception {
try {
// instructions
this.att_code=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","TX -> #extension #adresse #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_mult : // 1174
        regle46 () ;
      break ;
      case LEX_MOC.token_div : // 1175
        regle46 () ;
      break ;
      case LEX_MOC.token_mod : // 1176
        regle46 () ;
      break ;
      case LEX_MOC.token_et : // 1177
        regle46 () ;
      break ;
      case LEX_MOC.token_plus : // 1171
        regle47 () ;
      break ;
      case LEX_MOC.token_moins : // 1172
        regle47 () ;
      break ;
      case LEX_MOC.token_ou : // 1173
        regle47 () ;
      break ;
      case LEX_MOC.token_inf : // 1165
        regle47 () ;
      break ;
      case LEX_MOC.token_sup : // 1167
        regle47 () ;
      break ;
      case LEX_MOC.token_infeg : // 1166
        regle47 () ;
      break ;
      case LEX_MOC.token_supeg : // 1168
        regle47 () ;
      break ;
      case LEX_MOC.token_eg : // 1169
        regle47 () ;
      break ;
      case LEX_MOC.token_neg : // 1170
        regle47 () ;
      break ;
      case LEX_MOC.token_affect : // 1155
        regle47 () ;
      break ;
      case LEX_MOC.token_virg : // 1153
        regle47 () ;
      break ;
      case LEX_MOC.token_pv : // 1154
        regle47 () ;
      break ;
      case LEX_MOC.token_parf : // 1150
        regle47 () ;
      break ;
      case LEX_MOC.token_ident : // 1193
        regle47 () ;
      break ;
      case LEX_MOC.token_crf : // 1181
        regle47 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
