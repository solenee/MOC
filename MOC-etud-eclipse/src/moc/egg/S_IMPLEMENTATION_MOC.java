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
  DTYPE att_tAny;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_stAny;
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
    S_METHODES_MOC x_12 = new S_METHODES_MOC(scanner,att_eval) ;
    T_MOC x_14 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_69(x_3, x_5, x_8, x_12);
    x_2.analyser(LEX_MOC.token_classe);
    x_3.analyser(LEX_MOC.token_identc);
if  (att_eval)      action_hclasse_fille_69(x_3, x_5, x_8, x_12);
    x_5.analyser() ;
    x_6.analyser(LEX_MOC.token_aco);
if  (att_eval)      action_hattributs_69(x_3, x_5, x_8, x_12);
    x_8.analyser() ;
    x_9.analyser(LEX_MOC.token_acf);
if  (att_eval)      action_tds_classe_69(x_3, x_5, x_8, x_12);
if  (att_eval)      action_stAny_69(x_3, x_5, x_8, x_12);
    x_12.analyser() ;
if  (att_eval)      action_stds_classe_69(x_3, x_5, x_8, x_12);
    x_14.analyser(LEX_MOC.token_fin);
if  (att_eval)      action_aff_69(x_3, x_5, x_8, x_12);
  }
private void action_auto_inh_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_12) throws Exception {
try {
// instructions
x_8.att_tInt=this.att_tInt;
x_12.att_tInt=this.att_tInt;
x_8.att_tChar=this.att_tChar;
x_12.att_tChar=this.att_tChar;
x_8.att_tPointeurNull=this.att_tPointeurNull;
x_12.att_tPointeurNull=this.att_tPointeurNull;
x_8.att_tVoid=this.att_tVoid;
x_12.att_tVoid=this.att_tVoid;
x_8.att_tString=this.att_tString;
x_12.att_tString=this.att_tString;
x_8.att_regLB=this.att_regLB;
x_12.att_regLB=this.att_regLB;
x_8.att_tAny=this.att_tAny;
x_12.att_tAny=this.att_tAny;
x_8.att_tBool=this.att_tBool;
x_12.att_tBool=this.att_tBool;
x_8.att_tNil=this.att_tNil;
x_12.att_tNil=this.att_tNil;
x_5.att_tds=this.att_tds;
x_8.att_tds=this.att_tds;
x_12.att_tds=this.att_tds;
x_12.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_classe=this.att_tds_classe;
x_8.att_tds_classe=this.att_tds_classe;
x_8.att_machine=this.att_machine;
x_12.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe #stAny METHODES #stds_classe fin #aff ;"});
}
  }
private void action_stAny_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_12) throws Exception {
try {
// instructions
if ((x_3.att_txt.equals("NSObject"))){
this.att_stAny= new POINTEUR(glob_69_classe);
}
else {
this.att_stAny=this.att_tAny;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stAny","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe #stAny METHODES #stds_classe fin #aff ;"});
}
  }
private void action_hattributs_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_12) throws Exception {
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
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#hattributs","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe #stAny METHODES #stds_classe fin #aff ;"});
}
  }
private void action_aff_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_12) throws Exception {
try {
// instructions
System.out.print(""+"\n");
System.out.print(""+"\n");
System.out.print(""+"Table des classes visibles par : "+x_3.att_txt+" : ");
System.out.print(""+"chargement...");
System.out.print(""+"\n");
System.out.print(""+this.att_tds_classe);
System.out.print(""+"\n");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#aff","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe #stAny METHODES #stds_classe fin #aff ;"});
}
  }
private void action_stds_classe_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_12) throws Exception {
try {
// instructions
if ((x_12.att_stds_classe==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+"METHODES^stds_classe dans IMPLEMENTATIONS-> ... est null"});

}

this.att_stds_classe=x_12.att_stds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds_classe","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe #stAny METHODES #stds_classe fin #aff ;"});
}
  }
private void action_tds_classe_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_12) throws Exception {
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
loc_nom_classe=x_3.att_txt;
if ((this.att_tds_classe==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+this.att_tds_classe+" est null"});

}

loc_i=this.att_tds_classe.chercherLocalement(loc_nom_classe);
if (loc_i instanceof INFOCLASSE ){
loc_iclasse=((INFOCLASSE)loc_i);
loc_att=x_8.att_attributs;
if ((loc_iclasse!=null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Class_exist, MOCMessages.Class_exist,new Object[]{""+loc_nom_classe});

}
else {
glob_69_classe= new CLASSE(loc_nom_classe, loc_att, x_5.att_classe_mere);
loc_iclasse= new INFOCLASSE(glob_69_classe, x_5.att_iclasse_mere);
loc_tdsC=this.att_tds_classe;
loc_tdsC.inserer(loc_nom_classe, loc_iclasse);
if ((loc_tdsC==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+"tdsC dans IMPLEMENTATIONS -> ... ; est null"});

}

x_12.att_tds_classe=loc_tdsC;
x_12.att_classe=loc_nom_classe;
}
}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_classe","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe #stAny METHODES #stds_classe fin #aff ;"});
}
  }
private void action_hclasse_fille_69(T_MOC x_3, S_SUPER_MOC x_5, S_ATTRIBUTS_MOC x_8, S_METHODES_MOC x_12) throws Exception {
try {
// instructions
x_5.att_hclasse_fille=x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#hclasse_fille","IMPLEMENTATION -> classe identc #hclasse_fille SUPER aco #hattributs ATTRIBUTS acf #tds_classe #stAny METHODES #stds_classe fin #aff ;"});
}
  }
  public void analyser () throws Exception {
    regle69 () ;
  }
  }
