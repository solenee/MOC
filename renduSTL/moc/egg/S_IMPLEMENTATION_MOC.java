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
public class S_IMPLEMENTATION_MOC {
LEX_MOC scanner;
  S_IMPLEMENTATION_MOC() {
    }
  S_IMPLEMENTATION_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  TDS att_stds_classe;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  Emplacement att_emplNull;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  DTYPE att_tBool;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  CLASSE glob_69_classe;
  private void regle69() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_SUPER_MOC x_5 = new S_SUPER_MOC(scanner,att_eval) ;
    T_MOC x_6 = new T_MOC(scanner ) ;
    S_ATTRIBUTS_MOC x_8 = new S_ATTRIBUTS_MOC(scanner,att_eval) ;
    T_MOC x_9 = new T_MOC(scanner ) ;
    S_METHODES_MOC x_11 = new S_METHODES_MOC(scanner,att_eval) ;
    T_MOC x_14 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_69(x_3, x_5, x_8, x_11);
    x_2.analyser(LEX_MOC.token_classe);
    x_3.analyser(LEX_MOC.token_identc);
if  (att_eval)      action_hclasse_fille_69(x_3, x_5, x_8, x_11);
    x_5.analyser() ;
    x_6.analyser(LEX_MOC.token_aco);
if  (att_eval)      action_hattributs_69(x_3, x_5, x_8, x_11);
    x_8.analyser() ;
    x_9.analyser(LEX_MOC.token_acf);
if  (att_eval)      action_tds_classe_69(x_3, x_5, x_8, x_11);
    x_11.analyser() ;
if  (att_eval)      action_stds_classe_69(x_3, x_5, x_8, x_11);
if  (att_eval)      action_genTV_69(x_3, x_5, x_8, x_11);
    x_14.analyser(LEX_MOC.token_fin);
if  (att_eval)      action_aff_69(x_3, x_5, x_8, x_11);
  }
private void action_auto_inh_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_11) throws Exception {
try {
// instructions
x_8.att_tInt=this.att_tInt;
x_11.att_tInt=this.att_tInt;
x_8.att_tChar=this.att_tChar;
x_11.att_tChar=this.att_tChar;
x_8.att_tPointeurNull=this.att_tPointeurNull;
x_11.att_tPointeurNull=this.att_tPointeurNull;
x_8.att_tVoid=this.att_tVoid;
x_11.att_tVoid=this.att_tVoid;
x_8.att_tString=this.att_tString;
x_11.att_tString=this.att_tString;
x_8.att_regLB=this.att_regLB;
x_11.att_regLB=this.att_regLB;
x_8.att_tBool=this.att_tBool;
x_11.att_tBool=this.att_tBool;
x_8.att_tNil=this.att_tNil;
x_11.att_tNil=this.att_tNil;
x_5.att_tds=this.att_tds;
x_8.att_tds=this.att_tds;
x_11.att_tds=this.att_tds;
x_11.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_classe=this.att_tds_classe;
x_8.att_tds_classe=this.att_tds_classe;
x_8.att_machine=this.att_machine;
x_11.att_machine=this.att_machine;
x_8.att_emplNull=this.att_emplNull;
x_11.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe METHODES #stds_classe #genTV fin #aff ;"});
}
  }
private void action_genTV_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_11) throws Exception {
try {
// locales
INFO loc_ic;
TDS loc_tdsM;
String loc_genTv;
// instructions
loc_ic=x_11.att_stds_classe.chercherLocalement(x_3.att_txt);
loc_genTv="";
if (loc_ic instanceof INFOCLASSE ){
loc_tdsM=((INFOCLASSE)loc_ic).listeMethodes();
loc_genTv=this.att_machine.genTv(x_3.att_txt, loc_tdsM);
((INFOCLASSE)loc_ic).setTv("_"+x_3.att_txt+"_methode");
}

this.att_code=x_11.att_code+loc_genTv;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#genTV","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe METHODES #stds_classe #genTV fin #aff ;"});
}
  }
private void action_hattributs_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_11) throws Exception {
try {
// locales
LCHAMPS loc_lc;
CHAMP loc_c;
DTYPE loc_tc;
// instructions
loc_lc=x_5.att_attributs;
x_8.att_hattributs=x_5.att_attributs;
loc_c=loc_lc.get(loc_lc.size());
loc_tc=loc_c.getType();
x_8.att_hdep=loc_c.getDep()+loc_tc.getTaille();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#hattributs","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe METHODES #stds_classe #genTV fin #aff ;"});
}
  }
private void action_aff_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_11) throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#aff","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe METHODES #stds_classe #genTV fin #aff ;"});
}
  }
private void action_stds_classe_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_11) throws Exception {
try {
// instructions
if ((x_11.att_stds_classe==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+"METHODES^stds_classe dans IMPLEMENTATIONS-> ... est null"});

}
else {
this.att_stds_classe=x_11.att_stds_classe;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds_classe","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe METHODES #stds_classe #genTV fin #aff ;"});
}
  }
private void action_tds_classe_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_11) throws Exception {
try {
// locales
String loc_nom_classe;
INFO loc_i;
INFOCLASSE loc_iclasse;
INFOCLASSE loc_iclasse_mere;
CLASSE loc_classe_mere;
LCHAMPS loc_att;
TDS loc_tdsC;
// instructions
loc_tdsC=null;
loc_nom_classe=x_3.att_txt;
if ((this.att_tds_classe==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+this.att_tds_classe+" est null"});

}

loc_i=this.att_tds_classe.chercherLocalement(loc_nom_classe);
if ((loc_i!=null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Class_exist, MOCMessages.Class_exist,new Object[]{""+loc_nom_classe});

}
else {
loc_att=x_8.att_attributs;
glob_69_classe= new CLASSE(loc_nom_classe, loc_att, x_5.att_classe_mere);
loc_iclasse= new INFOCLASSE(glob_69_classe, x_5.att_iclasse_mere);
loc_tdsC=this.att_tds_classe;
loc_tdsC.inserer(loc_nom_classe, loc_iclasse);
if ((loc_tdsC==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+"tdsC dans IMPLEMENTATIONS -> ... ; est null"});

}

x_11.att_tds_classe=loc_tdsC;
x_11.att_classe=loc_nom_classe;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_classe","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe METHODES #stds_classe #genTV fin #aff ;"});
}
  }
private void action_hclasse_fille_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_11) throws Exception {
try {
// instructions
x_5.att_hclasse_fille=x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#hclasse_fille","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe METHODES #stds_classe #genTV fin #aff ;"});
}
  }
  public void analyser () throws Exception {
    regle69 () ;
  }
  }
