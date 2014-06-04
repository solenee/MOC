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
public class S_SUPER_MOC {
LEX_MOC scanner;
  S_SUPER_MOC() {
    }
  S_SUPER_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  CLASSE att_classe_mere;
  INFOCLASSE att_iclasse_mere;
  TDS att_tds_classe;
  boolean att_eval;
  LCHAMPS att_attributs;
  String att_hclasse_fille;
  TDS att_tds;
  LEX_MOC att_scanner;
  private void regle70() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_attributs_herites_70();
if  (att_eval)      action_classe_70();
  }
  private void regle71() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_dpts);
    x_3.analyser(LEX_MOC.token_identc);
if  (att_eval)      action_classe_attributs_herites_71(x_3);
  }
private void action_classe_attributs_herites_71(T_MOC x_3) throws Exception {
try {
// locales
INFO loc_i;
INFOCLASSE loc_iclasse;
DTYPE loc_t;
CLASSE loc_classe;
// instructions
if ((this.att_hclasse_fille.equals("NSObject"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_OneRootClass, MOCMessages.OneRootClass,new Object[]{""+this.att_hclasse_fille+"n'a pas de classe parente : c'est la racine"});

}
else {
loc_i=this.att_tds_classe.chercherLocalement(x_3.att_txt);
if ((loc_i==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_UnknownClass, MOCMessages.UnknownClass,new Object[]{""+x_3.att_txt});

}
else {
if (loc_i instanceof INFOCLASSE ){
loc_iclasse=((INFOCLASSE)loc_i);
loc_t=loc_iclasse.getType();
if (loc_t instanceof CLASSE ){
loc_classe=((CLASSE)loc_t);
this.att_classe_mere=loc_classe;
this.att_iclasse_mere=loc_iclasse;
this.att_attributs=loc_classe.getAttributs();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_InterneInfoclasse, MOCMessages.InterneInfoclasse,new Object[]{""+"INFOCLASSE.getType()doit retourner une CLASSE"});


}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_InterneTDSClasse, MOCMessages.InterneTDSClasse,new Object[]{""+"tds_classe ne doit contenir que des INFOCLASSE"});


}
}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#classe_attributs_herites","SUPER -> dpts identc #classe_attributs_herites ;"});
}
  }
private void action_attributs_herites_70() throws Exception {
try {
// locales
CHAMP loc_tv;
LCHAMPS loc_attributs;
// instructions
if ((!(this.att_hclasse_fille.equals("NSObject")))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_MultipleOrphanClasses, MOCMessages.MultipleOrphanClasses,new Object[]{""+this.att_hclasse_fille+"doit au moins heriter de NSObject"});

}
else {
loc_attributs= new LCHAMPS();
loc_tv= new CHAMP("tv",  new POINTEUR(null), 1);
loc_attributs.inserer(loc_tv);
this.att_attributs=loc_attributs;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#attributs_herites","SUPER -> #attributs_herites #classe ;"});
}
  }
private void action_classe_70() throws Exception {
try {
// instructions
this.att_classe_mere=null;
this.att_iclasse_mere=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#classe","SUPER -> #attributs_herites #classe ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_aco : // 1151
        regle70 () ;
      break ;
      case LEX_MOC.token_dpts : // 1179
        regle71 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
