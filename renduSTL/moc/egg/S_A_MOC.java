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
public class S_A_MOC {
LEX_MOC scanner;
  S_A_MOC() {
    }
  S_A_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_est_adresse;
  boolean att_affectable;
  Emplacement att_adresse;
  Register att_regLB;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_type;
  Emplacement att_emplNull;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  DTYPE att_tBool;
  TDS att_tds;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  private void regle30() throws Exception {

    //declaration
    S_R_MOC x_2 = new S_R_MOC(scanner,att_eval) ;
    S_AX_MOC x_5 = new S_AX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_30(x_2, x_5);
    x_2.analyser() ;
if  (att_eval)      action_hcode_30(x_2, x_5);
if  (att_eval)      action_hadresse_30(x_2, x_5);
    x_5.analyser() ;
if  (att_eval)      action_verifType_30(x_2, x_5);
if  (att_eval)      action_getType_30(x_2, x_5);
if  (att_eval)      action_estAffectable_30(x_2, x_5);
if  (att_eval)      action_adresse_30(x_2, x_5);
if  (att_eval)      action_gen_30(x_2, x_5);
  }
private void action_gen_30(S_R_MOC x_2, S_AX_MOC x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","A -> R #hcode #hadresse AX #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_verifType_30(S_R_MOC x_2, S_AX_MOC x_5) throws Exception {
try {
// instructions
if (!(x_5.att_vide)){
if (!(x_2.att_type.isOperable())){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_20, MOCMessages.B_20,new Object[]{""+"Les operations ne peuvent etre faites que sur les entiers"});

}

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifType","A -> R #hcode #hadresse AX #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_adresse_30(S_R_MOC x_2, S_AX_MOC x_5) throws Exception {
try {
// instructions
this.att_est_adresse=x_5.att_est_adresse;
this.att_adresse=x_5.att_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","A -> R #hcode #hadresse AX #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_estAffectable_30(S_R_MOC x_2, S_AX_MOC x_5) throws Exception {
try {
// instructions
if (x_5.att_vide){
this.att_affectable=x_2.att_affectable;
}
else {
this.att_affectable=false;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","A -> R #hcode #hadresse AX #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_getType_30(S_R_MOC x_2, S_AX_MOC x_5) throws Exception {
try {
// instructions
if (x_5.att_vide){
this.att_type=x_2.att_type;
}
else {
this.att_type=this.att_tInt;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","A -> R #hcode #hadresse AX #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_auto_inh_30(S_R_MOC x_2, S_AX_MOC x_5) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_5.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_5.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_5.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_5.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_5.att_regLB=this.att_regLB;
x_2.att_tBool=this.att_tBool;
x_5.att_tBool=this.att_tBool;
x_2.att_tNil=this.att_tNil;
x_5.att_tNil=this.att_tNil;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_2.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_fonction=this.att_tds_fonction;
x_2.att_tds_classe=this.att_tds_classe;
x_5.att_tds_classe=this.att_tds_classe;
x_2.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_2.att_emplNull=this.att_emplNull;
x_5.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","A -> R #hcode #hadresse AX #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_hadresse_30(S_R_MOC x_2, S_AX_MOC x_5) throws Exception {
try {
// instructions
x_5.att_hest_adresse=x_2.att_est_adresse;
x_5.att_hadresse=x_2.att_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#hadresse","A -> R #hcode #hadresse AX #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_hcode_30(S_R_MOC x_2, S_AX_MOC x_5) throws Exception {
try {
// instructions
x_5.att_hcode=x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#hcode","A -> R #hcode #hadresse AX #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle30 () ;
  }
  }
