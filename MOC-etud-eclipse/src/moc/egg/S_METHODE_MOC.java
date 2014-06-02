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
public class S_METHODE_MOC {
LEX_MOC scanner;
  S_METHODE_MOC() {
    }
  S_METHODE_MOC(LEX_MOC scanner, boolean eval) {
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
  private void regle76() throws Exception {

    //declaration
    S_QUAL_MOC x_2 = new S_QUAL_MOC(scanner,att_eval) ;
    S_PTYPE_MOC x_3 = new S_PTYPE_MOC(scanner,att_eval) ;
    S_MPARFS_MOC x_6 = new S_MPARFS_MOC(scanner,att_eval) ;
    S_BLOC_MOC x_10 = new S_BLOC_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_76(x_2, x_3, x_6, x_10);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_params_76(x_2, x_3, x_6, x_10);
if  (att_eval)      action_adresse_76(x_2, x_3, x_6, x_10);
    x_6.analyser() ;
if  (att_eval)      action_tds_76(x_2, x_3, x_6, x_10);
if  (att_eval)      action_tds_classe_76(x_2, x_3, x_6, x_10);
if  (att_eval)      action_aSupprimer_76(x_2, x_3, x_6, x_10);
    x_10.analyser() ;
  }
private void action_auto_inh_76(S_QUAL_MOC x_2, S_PTYPE_MOC x_3, S_MPARFS_MOC x_6, S_BLOC_MOC x_10) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_6.att_tInt=this.att_tInt;
x_10.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_6.att_tChar=this.att_tChar;
x_10.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_6.att_tPointeurNull=this.att_tPointeurNull;
x_10.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_6.att_tVoid=this.att_tVoid;
x_10.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_6.att_tString=this.att_tString;
x_10.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_6.att_regLB=this.att_regLB;
x_10.att_regLB=this.att_regLB;
x_3.att_tAny=this.att_tAny;
x_6.att_tAny=this.att_tAny;
x_10.att_tAny=this.att_tAny;
x_3.att_tBool=this.att_tBool;
x_6.att_tBool=this.att_tBool;
x_10.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_6.att_tNil=this.att_tNil;
x_10.att_tNil=this.att_tNil;
x_2.att_tds=this.att_tds;
x_3.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
x_10.att_tds_fonction=this.att_tds_fonction;
x_2.att_tds_classe=this.att_tds_classe;
x_3.att_tds_classe=this.att_tds_classe;
x_6.att_tds_classe=this.att_tds_classe;
x_6.att_machine=this.att_machine;
x_10.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","METHODE -> QUAL PTYPE #params #adresse MPARFS #tds #tds_classe #aSupprimer BLOC ;"});
}
  }
private void action_tds_classe_76(S_QUAL_MOC x_2, S_PTYPE_MOC x_3, S_MPARFS_MOC x_6, S_BLOC_MOC x_10) throws Exception {
try {
// locales
INFO loc_i;
INFOCLASSE loc_ic;
INFOMETHODE loc_im;
TDS loc_tdsC;
// instructions
loc_tdsC=this.att_tds_classe;
loc_im= new INFOMETHODE(x_3.att_type, x_6.att_params, x_2.att_qual, 0, this.att_classe);
loc_i=loc_tdsC.chercherLocalement(this.att_classe);
if ((loc_tdsC==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+"tdsC1 dans METHODES -> QUAL ... ; est null"});

}

if (loc_i instanceof INFOCLASSE ){
loc_ic=((INFOCLASSE)loc_i);
loc_ic.inserer(x_6.att_nom, loc_im);
loc_tdsC.inserer(this.att_classe, loc_ic);
if ((loc_tdsC==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+"tdsC2 dans METHODES -> QUAL ... ; est null"});

}

x_10.att_tds_classe=loc_tdsC;
this.att_stds_classe=loc_tdsC;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_InterneTDSClasse, MOCMessages.InterneTDSClasse,new Object[]{""+"tds_classe ne doit contenir que des INFOCLASSE"});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_classe","METHODE -> QUAL PTYPE #params #adresse MPARFS #tds #tds_classe #aSupprimer BLOC ;"});
}
  }
private void action_tds_76(S_QUAL_MOC x_2, S_PTYPE_MOC x_3, S_MPARFS_MOC x_6, S_BLOC_MOC x_10) throws Exception {
try {
// instructions
x_10.att_tds=x_6.att_tdspar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","METHODE -> QUAL PTYPE #params #adresse MPARFS #tds #tds_classe #aSupprimer BLOC ;"});
}
  }
private void action_params_76(S_QUAL_MOC x_2, S_PTYPE_MOC x_3, S_MPARFS_MOC x_6, S_BLOC_MOC x_10) throws Exception {
try {
// locales
INFO loc_i;
// instructions
x_6.att_hparams= new PARAMETRES();
x_6.att_htdspar= new TDS(this.att_tds);
if ((!(x_2.att_qual))){
loc_i=this.att_tds_classe.chercherLocalement(this.att_classe);
loc_i= new INFOVAR( new POINTEUR(loc_i.getType()),  new Emplacement((-(1)), this.att_regLB));
x_6.att_htdspar.inserer("self", loc_i);
}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","METHODE -> QUAL PTYPE #params #adresse MPARFS #tds #tds_classe #aSupprimer BLOC ;"});
}
  }
private void action_aSupprimer_76(S_QUAL_MOC x_2, S_PTYPE_MOC x_3, S_MPARFS_MOC x_6, S_BLOC_MOC x_10) throws Exception {
try {
// instructions
x_10.att_typeRet=null;
x_10.att_htailleparams=0;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#aSupprimer","METHODE -> QUAL PTYPE #params #adresse MPARFS #tds #tds_classe #aSupprimer BLOC ;"});
}
  }
private void action_adresse_76(S_QUAL_MOC x_2, S_PTYPE_MOC x_3, S_MPARFS_MOC x_6, S_BLOC_MOC x_10) throws Exception {
try {
// locales
Integer loc_n;
// instructions
if ((!(x_2.att_qual))){
loc_n=-(2);
}
else {
loc_n=-(1);
}
x_6.att_hadr=loc_n;
x_10.att_hadr=3;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","METHODE -> QUAL PTYPE #params #adresse MPARFS #tds #tds_classe #aSupprimer BLOC ;"});
}
  }
  public void analyser () throws Exception {
    regle76 () ;
  }
  }
