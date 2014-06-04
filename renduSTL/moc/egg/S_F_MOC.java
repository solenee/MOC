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
public class S_F_MOC {
LEX_MOC scanner;
  S_F_MOC() {
    }
  S_F_MOC(LEX_MOC scanner, boolean eval) {
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
  INFOCLASSE glob_93_ic;
  DTYPE glob_62_type;
  INFOMETHODE glob_93_im;
  INFOCLASSE glob_94_ic;
  INFOMETHODE glob_94_im;
  INFOFONCTION glob_61_i;
  private void regle92() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_super);
if  (att_eval)      action_type_92();
if  (att_eval)      action_gen_92();
  }
  private void regle91() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_self);
if  (att_eval)      action_type_91();
if  (att_eval)      action_gen_91();
  }
  private void regle90() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_chaineo);
if  (att_eval)      action_type_90(x_2);
if  (att_eval)      action_aSupprimer_90(x_2);
  }
  private void regle62() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_ident);
if  (att_eval)      action_gen_62(x_2);
if  (att_eval)      action_getType_62(x_2);
if  (att_eval)      action_estAffectable_62(x_2);
  }
  private void regle88() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_yes);
if  (att_eval)      action_type_88();
if  (att_eval)      action_gen_88();
  }
  private void regle63() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_F_MOC x_3 = new S_F_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_63(x_3);
    x_2.analyser(LEX_MOC.token_mult);
    x_3.analyser() ;
if  (att_eval)      action_getType_63(x_3);
if  (att_eval)      action_estAffectable_63(x_3);
if  (att_eval)      action_adresse_63(x_3);
  }
  private void regle89() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_no);
if  (att_eval)      action_type_89();
if  (att_eval)      action_gen_89();
  }
  private void regle60() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_TYPE_MOC x_3 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    S_F_MOC x_5 = new S_F_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_60(x_3, x_5);
    x_2.analyser(LEX_MOC.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_parf);
    x_5.analyser() ;
if  (att_eval)      action_verifCast_60(x_3, x_5);
if  (att_eval)      action_getType_60(x_3, x_5);
if  (att_eval)      action_estAffectable_60(x_3, x_5);
if  (att_eval)      action_gen_60(x_3, x_5);
  }
  private void regle61() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_ARGS_MOC x_5 = new S_ARGS_MOC(scanner,att_eval) ;
    T_MOC x_6 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_61(x_2, x_5);
    x_2.analyser(LEX_MOC.token_ident);
    x_3.analyser(LEX_MOC.token_paro);
if  (att_eval)      action_params_61(x_2, x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MOC.token_parf);
if  (att_eval)      action_gen_61(x_2, x_5);
if  (att_eval)      action_getType_61(x_2, x_5);
if  (att_eval)      action_estAffectable_61(x_2, x_5);
  }
  private void regle87() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_nil);
if  (att_eval)      action_getType_87();
if  (att_eval)      action_estAffectable_87();
if  (att_eval)      action_gen_87();
  }
  private void regle93() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_F_MOC x_3 = new S_F_MOC(scanner,att_eval) ;
    S_MARGS_MOC x_5 = new S_MARGS_MOC(scanner,att_eval) ;
    T_MOC x_6 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_93(x_3, x_5);
    x_2.analyser(LEX_MOC.token_cro);
    x_3.analyser() ;
if  (att_eval)      action_params_93(x_3, x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MOC.token_crf);
if  (att_eval)      action_bonappel_type_initCorrect_93(x_3, x_5);
if  (att_eval)      action_gen_93(x_3, x_5);
  }
  private void regle58() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_null);
if  (att_eval)      action_getType_58();
if  (att_eval)      action_estAffectable_58();
if  (att_eval)      action_gen_58();
  }
  private void regle94() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_MARGS_MOC x_5 = new S_MARGS_MOC(scanner,att_eval) ;
    T_MOC x_6 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_94(x_3, x_5);
    x_2.analyser(LEX_MOC.token_cro);
    x_3.analyser(LEX_MOC.token_identc);
if  (att_eval)      action_params_94(x_3, x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MOC.token_crf);
if  (att_eval)      action_bonappel_type_94(x_3, x_5);
if  (att_eval)      action_gen_94(x_3, x_5);
  }
  private void regle59() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_E_MOC x_4 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_59(x_4);
    x_2.analyser(LEX_MOC.token_paro);
if  (att_eval)      action_lire_resultat_59(x_4);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_parf);
if  (att_eval)      action_getType_59(x_4);
if  (att_eval)      action_estAffectable_59(x_4);
if  (att_eval)      action_adresse_59(x_4);
if  (att_eval)      action_gen_59(x_4);
  }
  private void regle54() throws Exception {

    //declaration
    S_OPUN_MOC x_2 = new S_OPUN_MOC(scanner,att_eval) ;
    S_F_MOC x_3 = new S_F_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_54(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_verifType_54(x_2, x_3);
if  (att_eval)      action_getType_54(x_2, x_3);
if  (att_eval)      action_estAffectable_54(x_2, x_3);
if  (att_eval)      action_adresse_54(x_2, x_3);
if  (att_eval)      action_gen_54(x_2, x_3);
  }
  private void regle53() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_caractere);
if  (att_eval)      action_getType_53(x_2);
if  (att_eval)      action_estAffectable_53(x_2);
if  (att_eval)      action_gen_53(x_2);
  }
  private void regle52() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_entier);
if  (att_eval)      action_getType_52(x_2);
if  (att_eval)      action_estAffectable_52(x_2);
if  (att_eval)      action_gen_52(x_2);
  }
private void action_verifCast_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
if (!(x_5.att_type.castableTo(x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_13, MOCMessages.B_13,new Object[]{""+"Impossible de caster"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifCast","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen ;"});
}
  }
private void action_gen_62(T_MOC x_2) throws Exception {
try {
// locales
TDS loc_t;
INFO loc_iTemp;
INFO loc_classeEnglobante;
DTYPE loc_p;
DTYPE loc_c;
CHAMP loc_champAttribut;
// instructions
loc_t=this.att_tds;
loc_iTemp=loc_t.chercherGlobalement(x_2.att_txt);
if ((loc_iTemp==null)){
loc_classeEnglobante=this.att_tds.chercherGlobalement("self");
if ((loc_classeEnglobante==null)){
loc_classeEnglobante=this.att_tds.chercherGlobalement("init");
}

if ((loc_classeEnglobante!=null)){
if (loc_classeEnglobante instanceof INFOVAR ){
loc_p=((INFOVAR)loc_classeEnglobante).getType();
if (loc_p instanceof POINTEUR ){
loc_c=((POINTEUR)loc_p).getType();
if (loc_c instanceof CLASSE ){
System.out.print(""+"\n tds classe \n");
System.out.print(""+((CLASSE)loc_c));
loc_champAttribut=((CLASSE)loc_c).isAttribut(x_2.att_txt);
if (loc_champAttribut==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_16, MOCMessages.B_16,new Object[]{""+"la variable n existe pas :"+x_2.att_txt});

}
else {
glob_62_type=loc_champAttribut.getType();
System.out.print(""+("\ndep : "+x_2.att_txt+" : "+loc_champAttribut.getDep()+"\n"));
this.att_code=this.att_machine.genComment("acces a l attribut  "+x_2.att_txt)+this.att_machine.genLire("", 1, ((INFOVAR)loc_classeEnglobante).getEmpl())+this.att_machine.genAdrField(loc_champAttribut.getDep());
this.att_adresse=null;
this.att_est_adresse=true;
}
}

}

}

}

}
else {
if (loc_iTemp instanceof INFOVAR ){
glob_62_type=((INFOVAR)loc_iTemp).getType();
this.att_code=this.att_machine.genComment("acces a "+x_2.att_txt);
this.att_adresse=((INFOVAR)loc_iTemp).getEmpl();
this.att_est_adresse=false;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_17, MOCMessages.B_17,new Object[]{""+" c est pas une variable ca"});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> ident #gen #getType #estAffectable ;"});
}
  }
private void action_lire_resultat_59(S_E_MOC x_4) throws Exception {
try {
// instructions
x_4.att_lire_resultat=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#lire_resultat","F -> paro #lire_resultat E parf #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_gen_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// locales
INFO loc_in;
PARAMETRES loc_p;
// instructions
loc_in=this.att_tds_fonction.chercherLocalement(x_2.att_txt);
if ((loc_in==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_14, MOCMessages.B_14,new Object[]{""+"la fonction appelee n existe pas "});

}
else {
if (loc_in instanceof INFOFONCTION ){
glob_61_i=((INFOFONCTION)loc_in);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_17, MOCMessages.B_17,new Object[]{""+" c est pas une fonction"});


}
loc_p=glob_61_i.getParametres();
if ((!(loc_p.compareTo(x_5.att_params)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_15, MOCMessages.B_15,new Object[]{""+" parametres d'appel erronés"});

}
else {
this.att_code=this.att_machine.genComment("empilement des parametres")+x_5.att_code+this.att_machine.genCall(x_2.att_txt);
this.att_est_adresse=false;
this.att_adresse=null;
}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> ident paro #params ARGS parf #gen #getType #estAffectable ;"});
}
  }
private void action_gen_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genComment("cast en "+x_3.att_type.getNom()+"de -- ")+x_5.att_code+this.att_machine.genComment("-- : valeur castee");
this.att_est_adresse=x_5.att_est_adresse;
this.att_adresse=x_5.att_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen ;"});
}
  }
private void action_getType_63(S_F_MOC x_3) throws Exception {
try {
// instructions
if (x_3.att_type instanceof POINTEUR ){
this.att_type=((POINTEUR)x_3.att_type).getType();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_18, MOCMessages.B_18,new Object[]{""+" c est pas un pointeur"});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> mult F1 #getType #estAffectable #adresse ;"});
}
  }
private void action_aSupprimer_90(T_MOC x_2) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genComment(x_2.att_txt);
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#aSupprimer","F -> chaineo #type #aSupprimer ;"});
}
  }
private void action_getType_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// instructions
this.att_type=glob_61_i.getRetour();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> ident paro #params ARGS parf #gen #getType #estAffectable ;"});
}
  }
private void action_getType_62(T_MOC x_2) throws Exception {
try {
// instructions
this.att_type=glob_62_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> ident #gen #getType #estAffectable ;"});
}
  }
private void action_getType_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
this.att_type=x_3.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen ;"});
}
  }
private void action_estAffectable_87() throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> nil #getType #estAffectable #gen ;"});
}
  }
private void action_params_93(S_F_MOC x_3, S_MARGS_MOC x_5) throws Exception {
try {
// instructions
x_5.att_hparams= new PARAMETRES();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","F -> cro F1 #params MARGS crf #bonappel_type_initCorrect #gen ;"});
}
  }
private void action_params_94(T_MOC x_3, S_MARGS_MOC x_5) throws Exception {
try {
// instructions
x_5.att_hparams= new PARAMETRES();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","F -> cro identc #params MARGS crf #bonappel_type #gen ;"});
}
  }
private void action_adresse_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_est_adresse=x_3.att_est_adresse;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","F -> OPUN F1 #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_getType_59(S_E_MOC x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> paro #lire_resultat E parf #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_getType_58() throws Exception {
try {
// instructions
this.att_type=this.att_tPointeurNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> null #getType #estAffectable #gen ;"});
}
  }
private void action_getType_52(T_MOC x_2) throws Exception {
try {
// instructions
this.att_type=this.att_tInt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> entier #getType #estAffectable #gen ;"});
}
  }
private void action_adresse_59(S_E_MOC x_4) throws Exception {
try {
// instructions
this.att_est_adresse=x_4.att_est_adresse;
this.att_adresse=x_4.att_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","F -> paro #lire_resultat E parf #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_getType_53(T_MOC x_2) throws Exception {
try {
// instructions
this.att_type=this.att_tChar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> caractere #getType #estAffectable #gen ;"});
}
  }
private void action_getType_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_type=x_3.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> OPUN F1 #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_bonappel_type_initCorrect_93(S_F_MOC x_3, S_MARGS_MOC x_5) throws Exception {
try {
// locales
DTYPE loc_t;
DTYPE loc_t2;
POINTEUR loc_p;
CLASSE loc_c;
INFO loc_i;
INFO loc_i2;
TDS loc_tds;
PARAMETRES loc_params;
INFOCLASSE loc_ic_type;
// instructions
glob_93_im=null;
loc_t=x_3.att_type;
if (loc_t instanceof POINTEUR ){
loc_p=((POINTEUR)loc_t);
loc_t2=loc_p.getType();
if (loc_t2 instanceof CLASSE ){
loc_c=((CLASSE)loc_t2);
loc_i=this.att_tds_classe.chercherLocalement(loc_c.getNomClasse());
if ((loc_i==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_classe_inexistante, MOCMessages.classe_inexistante,new Object[]{""+loc_c.getNomClasse()});

}
else {
if (loc_i instanceof INFOCLASSE ){
glob_93_ic=((INFOCLASSE)loc_i);
loc_tds=glob_93_ic.getMethodes();
loc_i2=loc_tds.chercherGlobalement(x_5.att_nom);
if ((loc_i2==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_methode_inexistante, MOCMessages.methode_inexistante,new Object[]{""+loc_c.getNomClasse(), ""+x_5.att_nom});

}
else {
if (loc_i2 instanceof INFOMETHODE ){
glob_93_im=((INFOMETHODE)loc_i2);
if ((x_5.att_nom.equals("init"))){
if (loc_i instanceof INFOCLASSE ){
loc_ic_type=((INFOCLASSE)loc_i);
this.att_type= new POINTEUR(loc_ic_type.getType());
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+loc_c.getNomClasse()+" n'a pas d'INFOCLASSE"});


}
}
else {
this.att_type=glob_93_im.getRetour();
}
this.att_affectable=false;
loc_params=glob_93_im.getParametres();
if ((glob_93_im.isClassMethod())){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_pas_methode_instance, MOCMessages.pas_methode_instance,new Object[]{""+loc_c.getNomClasse(), ""+x_5.att_nom});

}

if ((!(loc_params.compareTo(x_5.att_params)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_mauvais_parametres, MOCMessages.mauvais_parametres,new Object[]{""+loc_c.getNomClasse(), ""+x_5.att_nom});

}

}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_pas_methode, MOCMessages.pas_methode,new Object[]{""+"ceci n'est pas une methode"});


}
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_pas_classe, MOCMessages.pas_classe,new Object[]{""+"ceci n'est pas une classe"});


}
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_pas_instance, MOCMessages.pas_instance,new Object[]{""+"ceci n'est pas une instance de classe"});


}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_pas_pointeur, MOCMessages.pas_pointeur,new Object[]{""+"ceci n'est pas un pointeur"});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#bonappel_type_initCorrect","F -> cro F1 #params MARGS crf #bonappel_type_initCorrect #gen ;"});
}
  }
private void action_type_92() throws Exception {
try {
// locales
INFO loc_in;
INFOVAR loc_i;
DTYPE loc_t2;
POINTEUR loc_type_self;
DTYPE loc_t;
CLASSE loc_classe_self;
// instructions
this.att_affectable=false;
loc_in=this.att_tds.chercherGlobalement("self");
if ((loc_in==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_IllegalSuper, MOCMessages.IllegalSuper,new Object[]{""+"utilisation illegale de super : hors d'une methode (d'instance ?)"});

}
else {
if (loc_in instanceof INFOVAR ){
loc_i=((INFOVAR)loc_in);
loc_t=loc_i.getType();
if (loc_t instanceof POINTEUR ){
loc_type_self=((POINTEUR)loc_t);
loc_t2=loc_type_self.getType();
if (loc_t2 instanceof CLASSE ){
loc_classe_self=((CLASSE)loc_t2);
this.att_type= new POINTEUR(loc_classe_self.getClasseMere());
}

}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_ErreurInterneTDS_self, MOCMessages.ErreurInterneTDS_self,new Object[]{""+"self devrait etre de type POINTEUR"});


}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_ErreurInterneTDS_self, MOCMessages.ErreurInterneTDS_self,new Object[]{""+"self devrait etre dans la TDS de la methode en tant que variable!"});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","F -> super #type #gen ;"});
}
  }
private void action_params_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// instructions
x_5.att_hparams= new PARAMETRES();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","F -> ident paro #params ARGS parf #gen #getType #estAffectable ;"});
}
  }
private void action_auto_inh_63(S_F_MOC x_3) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_3.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_3.att_tds_classe=this.att_tds_classe;
x_3.att_machine=this.att_machine;
x_3.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> mult F1 #getType #estAffectable #adresse ;"});
}
  }
private void action_bonappel_type_94(T_MOC x_3, S_MARGS_MOC x_5) throws Exception {
try {
// locales
DTYPE loc_t;
POINTEUR loc_p;
INFO loc_i;
INFO loc_i2;
TDS loc_tds;
PARAMETRES loc_params;
// instructions
loc_i=this.att_tds_classe.chercherLocalement(x_3.att_txt);
if ((loc_i==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_classe_inexistante, MOCMessages.classe_inexistante,new Object[]{""+x_3.att_txt});

}
else {
if (loc_i instanceof INFOCLASSE ){
glob_94_ic=((INFOCLASSE)loc_i);
loc_tds=glob_94_ic.getMethodes();
loc_i2=loc_tds.chercherGlobalement(x_5.att_nom);
if ((loc_i2==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_methode_inexistante, MOCMessages.methode_inexistante,new Object[]{""+x_3.att_txt, ""+x_5.att_nom});

}
else {
if (loc_i2 instanceof INFOMETHODE ){
glob_94_im=((INFOMETHODE)loc_i2);
this.att_type=glob_94_im.getRetour();
this.att_affectable=false;
loc_params=glob_94_im.getParametres();
if ((!(glob_94_im.isClassMethod()))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_pas_methode_classe, MOCMessages.pas_methode_classe,new Object[]{""+x_3.att_txt, ""+x_5.att_nom});

}

if ((!(loc_params.compareTo(x_5.att_params)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_mauvais_parametres, MOCMessages.mauvais_parametres,new Object[]{""+x_3.att_txt, ""+x_5.att_nom});

}

}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_pas_methode, MOCMessages.pas_methode,new Object[]{""+"ceci n'est pas une methode"});


}
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_pas_classe, MOCMessages.pas_classe,new Object[]{""+"ceci n'est pas une classe"});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#bonappel_type","F -> cro identc #params MARGS crf #bonappel_type #gen ;"});
}
  }
private void action_type_90(T_MOC x_2) throws Exception {
try {
// instructions
this.att_type=null;
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","F -> chaineo #type #aSupprimer ;"});
}
  }
private void action_type_91() throws Exception {
try {
// locales
INFO loc_in;
INFOVAR loc_i;
// instructions
this.att_affectable=false;
loc_in=this.att_tds.chercherGlobalement("self");
if ((loc_in==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_IllegalSelf, MOCMessages.IllegalSelf,new Object[]{""+"utilisation illegale de self : hors d'une methode"});

}
else {
if (loc_in instanceof INFOVAR ){
loc_i=((INFOVAR)loc_in);
this.att_type=loc_i.getType();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_ErreurInterneTDS_self, MOCMessages.ErreurInterneTDS_self,new Object[]{""+"self devrait etre dans la TDS de la methode en tant que variable!"});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","F -> self #type #gen ;"});
}
  }
private void action_gen_59(S_E_MOC x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> paro #lire_resultat E parf #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_gen_88() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genBoolean(true);
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> yes #type #gen ;"});
}
  }
private void action_gen_58() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genComment("pointeur null")+this.att_machine.genPushAdresse(this.att_emplNull);
this.att_est_adresse=true;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> null #getType #estAffectable #gen ;"});
}
  }
private void action_gen_87() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genComment("objet nil")+this.att_machine.genPushAdresse(this.att_emplNull);
this.att_est_adresse=true;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> nil #getType #estAffectable #gen ;"});
}
  }
private void action_auto_inh_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tInt=this.att_tInt;
x_5.att_tChar=this.att_tChar;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tVoid=this.att_tVoid;
x_5.att_tString=this.att_tString;
x_5.att_regLB=this.att_regLB;
x_5.att_tBool=this.att_tBool;
x_5.att_tNil=this.att_tNil;
x_5.att_tds=this.att_tds;
x_5.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_classe=this.att_tds_classe;
x_5.att_machine=this.att_machine;
x_5.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> ident paro #params ARGS parf #gen #getType #estAffectable ;"});
}
  }
private void action_auto_inh_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_5.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_5.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_5.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_5.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_5.att_regLB=this.att_regLB;
x_3.att_tBool=this.att_tBool;
x_5.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_5.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_5.att_tds_fonction=this.att_tds_fonction;
x_3.att_tds_classe=this.att_tds_classe;
x_5.att_tds_classe=this.att_tds_classe;
x_5.att_machine=this.att_machine;
x_5.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen ;"});
}
  }
private void action_adresse_63(S_F_MOC x_3) throws Exception {
try {
// locales
Emplacement loc_adr_du_pointeur;
String loc_leCode;
// instructions
loc_leCode=this.att_machine.genComment("adresse d'affectation inexistante 6");
loc_adr_du_pointeur=x_3.att_adresse;
if (!(x_3.att_est_adresse)){
if (loc_adr_du_pointeur!=null){
loc_leCode=x_3.att_code+this.att_machine.genReadMem(loc_adr_du_pointeur, x_3.att_type.getTaille());
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Interne_adresse, MOCMessages.Interne_adresse,new Object[]{""+"adresse d'affectation inexistante 5"});

}
}
else {
loc_leCode=x_3.att_code+this.att_machine.genReadIndirectMem(x_3.att_type.getTaille());
}
this.att_code=this.att_machine.genVerificationPointeur(loc_leCode, this.att_emplNull);
this.att_est_adresse=true;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","F -> mult F1 #getType #estAffectable #adresse ;"});
}
  }
private void action_gen_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// locales
Emplacement loc_adr_droite;
String loc_codedroit;
// instructions
loc_adr_droite=x_3.att_adresse;
if (loc_adr_droite==null){
loc_codedroit=x_3.att_code;
}
else {
loc_codedroit=x_3.att_code+this.att_machine.genReadMem(loc_adr_droite, x_3.att_type.getTaille());
}
if (x_2.att_code==""){
this.att_code=loc_codedroit;
}
else {
this.att_code=this.att_machine.genOpUnaire(x_2.att_code, loc_codedroit);
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> OPUN F1 #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_gen_52(T_MOC x_2) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genEntier(x_2.att_txt);
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> entier #getType #estAffectable #gen ;"});
}
  }
private void action_gen_89() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genBoolean(false);
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> no #type #gen ;"});
}
  }
private void action_gen_53(T_MOC x_2) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genCaractere(x_2.att_txt);
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> caractere #getType #estAffectable #gen ;"});
}
  }
private void action_estAffectable_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> ident paro #params ARGS parf #gen #getType #estAffectable ;"});
}
  }
private void action_getType_87() throws Exception {
try {
// instructions
this.att_type=this.att_tNil;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> nil #getType #estAffectable #gen ;"});
}
  }
private void action_estAffectable_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
this.att_affectable=x_5.att_affectable;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen ;"});
}
  }
private void action_estAffectable_63(S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_affectable=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> mult F1 #getType #estAffectable #adresse ;"});
}
  }
private void action_estAffectable_62(T_MOC x_2) throws Exception {
try {
// instructions
this.att_affectable=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> ident #gen #getType #estAffectable ;"});
}
  }
private void action_type_89() throws Exception {
try {
// instructions
this.att_type=this.att_tBool;
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","F -> no #type #gen ;"});
}
  }
private void action_type_88() throws Exception {
try {
// instructions
this.att_type=this.att_tBool;
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","F -> yes #type #gen ;"});
}
  }
private void action_auto_inh_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_3.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_3.att_tds_classe=this.att_tds_classe;
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_2.att_emplNull=this.att_emplNull;
x_3.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> OPUN F1 #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_verifType_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
if (!(x_3.att_type.isOperable())){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_20, MOCMessages.B_20,new Object[]{""+"Les operations ne peuvent etre faites que sur les entiers"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifType","F -> OPUN F1 #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_auto_inh_93(S_F_MOC x_3, S_MARGS_MOC x_5) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_5.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_5.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_5.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_5.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_5.att_regLB=this.att_regLB;
x_3.att_tBool=this.att_tBool;
x_5.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_5.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_fonction=this.att_tds_fonction;
x_3.att_tds_classe=this.att_tds_classe;
x_5.att_tds_classe=this.att_tds_classe;
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_emplNull=this.att_emplNull;
x_5.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> cro F1 #params MARGS crf #bonappel_type_initCorrect #gen ;"});
}
  }
private void action_auto_inh_94(T_MOC x_3, S_MARGS_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tInt=this.att_tInt;
x_5.att_tChar=this.att_tChar;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tVoid=this.att_tVoid;
x_5.att_tString=this.att_tString;
x_5.att_regLB=this.att_regLB;
x_5.att_tBool=this.att_tBool;
x_5.att_tNil=this.att_tNil;
x_5.att_tds=this.att_tds;
x_5.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_classe=this.att_tds_classe;
x_5.att_machine=this.att_machine;
x_5.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> cro identc #params MARGS crf #bonappel_type #gen ;"});
}
  }
private void action_gen_91() throws Exception {
try {
// locales
TDS loc_t;
INFO loc_i;
// instructions
loc_t=this.att_tds;
loc_i=loc_t.chercherGlobalement("self");
if (loc_i instanceof INFOVAR ){
if ((((INFOVAR)loc_i)==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_16, MOCMessages.B_16,new Object[]{""+" vous n etes pas dans une instance"});

}
else {
if (loc_i instanceof INFOVAR ){
this.att_code=this.att_machine.genComment("acces a self");
this.att_adresse=((INFOVAR)loc_i).getEmpl();
this.att_est_adresse=false;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_17, MOCMessages.B_17,new Object[]{""+" c est pas une variable ca"});


}
}
}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> self #type #gen ;"});
}
  }
private void action_gen_93(S_F_MOC x_3, S_MARGS_MOC x_5) throws Exception {
try {
// locales
String loc_tComment;
// instructions
loc_tComment=this.att_machine.genComment("je passe par laaaaa");
this.att_code=loc_tComment+x_5.att_code+this.att_machine.genLire("", x_3.att_type.getTaille(), x_3.att_adresse)+this.att_machine.genCallMethod(x_5.att_nom, x_3.att_adresse, glob_93_im.getNumero()-1);
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> cro F1 #params MARGS crf #bonappel_type_initCorrect #gen ;"});
}
  }
private void action_gen_92() throws Exception {
try {
// locales
TDS loc_t;
INFO loc_i;
// instructions
loc_t=this.att_tds;
loc_i=loc_t.chercherGlobalement("super");
if (loc_i instanceof INFOVAR ){
if ((((INFOVAR)loc_i)==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_16, MOCMessages.B_16,new Object[]{""+" vous n etes pas dans une instance"});

}
else {
if (loc_i instanceof INFOVAR ){
this.att_code=this.att_machine.genComment("acces a self");
this.att_adresse=((INFOVAR)loc_i).getEmpl();
this.att_est_adresse=false;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_17, MOCMessages.B_17,new Object[]{""+" c est pas une variable ca"});


}
}
}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> super #type #gen ;"});
}
  }
private void action_gen_94(T_MOC x_3, S_MARGS_MOC x_5) throws Exception {
try {
// locales
String loc_instance;
DTYPE loc_c;
// instructions
if (x_5.att_nom.equals("init")){
this.att_code=this.att_machine.genComment("je passe par init");
loc_c=glob_94_ic.getType();
if (loc_c instanceof CLASSE ){
loc_instance=this.att_machine.genMallocInstance(((CLASSE)loc_c).getTaille());
System.out.print(""+("zozi "+glob_94_ic.getTv()));
this.att_code=x_5.att_code+this.att_machine.genPushAdresse(glob_94_ic.getTv())+loc_instance+this.att_machine.genCallMethod(x_5.att_nom, glob_94_ic.getTv(), glob_94_im.getNumero()-1);
}

}
else {
this.att_code=this.att_machine.genComment("je passe pas init");
loc_c=glob_94_ic.getType();
System.out.print(""+("zizo "+glob_94_ic.getTv()));
this.att_code=x_5.att_code+this.att_machine.genCallMethod(x_5.att_nom, glob_94_ic.getTv(), glob_94_im.getNumero()-1);
}
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> cro identc #params MARGS crf #bonappel_type #gen ;"});
}
  }
private void action_estAffectable_52(T_MOC x_2) throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> entier #getType #estAffectable #gen ;"});
}
  }
private void action_auto_inh_59(S_E_MOC x_4) throws Exception {
try {
// instructions
x_4.att_tInt=this.att_tInt;
x_4.att_tChar=this.att_tChar;
x_4.att_tPointeurNull=this.att_tPointeurNull;
x_4.att_tVoid=this.att_tVoid;
x_4.att_tString=this.att_tString;
x_4.att_regLB=this.att_regLB;
x_4.att_tBool=this.att_tBool;
x_4.att_tNil=this.att_tNil;
x_4.att_tds=this.att_tds;
x_4.att_tds_fonction=this.att_tds_fonction;
x_4.att_tds_classe=this.att_tds_classe;
x_4.att_machine=this.att_machine;
x_4.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> paro #lire_resultat E parf #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_estAffectable_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> OPUN F1 #verifType #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_estAffectable_53(T_MOC x_2) throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> caractere #getType #estAffectable #gen ;"});
}
  }
private void action_estAffectable_59(S_E_MOC x_4) throws Exception {
try {
// instructions
this.att_affectable=x_4.att_affectable;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> paro #lire_resultat E parf #getType #estAffectable #adresse #gen ;"});
}
  }
private void action_estAffectable_58() throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> null #getType #estAffectable #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_entier : // 84
        regle52 () ;
      break ;
      case LEX_MOC.token_caractere : // 85
        regle53 () ;
      break ;
      case LEX_MOC.token_plus : // 65
        regle54 () ;
      break ;
      case LEX_MOC.token_moins : // 66
        regle54 () ;
      break ;
      case LEX_MOC.token_non : // 72
        regle54 () ;
      break ;
      case LEX_MOC.token_null : // 57
        regle58 () ;
      break ;
      case LEX_MOC.token_paro : // 43
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MOC.token_entier : // 84
            regle59 () ;
          break ;
          case LEX_MOC.token_caractere : // 85
            regle59 () ;
          break ;
          case LEX_MOC.token_plus : // 65
            regle59 () ;
          break ;
          case LEX_MOC.token_moins : // 66
            regle59 () ;
          break ;
          case LEX_MOC.token_non : // 72
            regle59 () ;
          break ;
          case LEX_MOC.token_null : // 57
            regle59 () ;
          break ;
          case LEX_MOC.token_paro : // 43
            regle59 () ;
          break ;
          case LEX_MOC.token_ident : // 87
            regle59 () ;
          break ;
          case LEX_MOC.token_mult : // 68
            regle59 () ;
          break ;
          case LEX_MOC.token_nil : // 58
            regle59 () ;
          break ;
          case LEX_MOC.token_yes : // 82
            regle59 () ;
          break ;
          case LEX_MOC.token_no : // 83
            regle59 () ;
          break ;
          case LEX_MOC.token_chaineo : // 89
            regle59 () ;
          break ;
          case LEX_MOC.token_self : // 79
            regle59 () ;
          break ;
          case LEX_MOC.token_super : // 81
            regle59 () ;
          break ;
          case LEX_MOC.token_cro : // 74
            regle59 () ;
          break ;
          case LEX_MOC.token_void : // 52
            regle60 () ;
          break ;
          case LEX_MOC.token_int : // 54
            regle60 () ;
          break ;
          case LEX_MOC.token_char : // 55
            regle60 () ;
          break ;
          case LEX_MOC.token_identc : // 88
            regle60 () ;
          break ;
          case LEX_MOC.token_bool : // 80
            regle60 () ;
          break ;
          case LEX_MOC.token_id : // 76
            regle60 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MOC.token_paro);
        }
      break ;
      case LEX_MOC.token_ident : // 87
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MOC.token_paro : // 43
            regle61 () ;
          break ;
          case LEX_MOC.token_mult : // 68
            regle62 () ;
          break ;
          case LEX_MOC.token_div : // 69
            regle62 () ;
          break ;
          case LEX_MOC.token_mod : // 70
            regle62 () ;
          break ;
          case LEX_MOC.token_et : // 71
            regle62 () ;
          break ;
          case LEX_MOC.token_ident : // 87
            regle62 () ;
          break ;
          case LEX_MOC.token_crf : // 75
            regle62 () ;
          break ;
          case LEX_MOC.token_plus : // 65
            regle62 () ;
          break ;
          case LEX_MOC.token_moins : // 66
            regle62 () ;
          break ;
          case LEX_MOC.token_ou : // 67
            regle62 () ;
          break ;
          case LEX_MOC.token_inf : // 59
            regle62 () ;
          break ;
          case LEX_MOC.token_sup : // 61
            regle62 () ;
          break ;
          case LEX_MOC.token_infeg : // 60
            regle62 () ;
          break ;
          case LEX_MOC.token_supeg : // 62
            regle62 () ;
          break ;
          case LEX_MOC.token_eg : // 63
            regle62 () ;
          break ;
          case LEX_MOC.token_neg : // 64
            regle62 () ;
          break ;
          case LEX_MOC.token_affect : // 49
            regle62 () ;
          break ;
          case LEX_MOC.token_virg : // 47
            regle62 () ;
          break ;
          case LEX_MOC.token_pv : // 48
            regle62 () ;
          break ;
          case LEX_MOC.token_parf : // 44
            regle62 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MOC.token_ident);
        }
      break ;
      case LEX_MOC.token_mult : // 68
        regle63 () ;
      break ;
      case LEX_MOC.token_nil : // 58
        regle87 () ;
      break ;
      case LEX_MOC.token_yes : // 82
        regle88 () ;
      break ;
      case LEX_MOC.token_no : // 83
        regle89 () ;
      break ;
      case LEX_MOC.token_chaineo : // 89
        regle90 () ;
      break ;
      case LEX_MOC.token_self : // 79
        regle91 () ;
      break ;
      case LEX_MOC.token_super : // 81
        regle92 () ;
      break ;
      case LEX_MOC.token_cro : // 74
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MOC.token_entier : // 84
            regle93 () ;
          break ;
          case LEX_MOC.token_caractere : // 85
            regle93 () ;
          break ;
          case LEX_MOC.token_plus : // 65
            regle93 () ;
          break ;
          case LEX_MOC.token_moins : // 66
            regle93 () ;
          break ;
          case LEX_MOC.token_non : // 72
            regle93 () ;
          break ;
          case LEX_MOC.token_null : // 57
            regle93 () ;
          break ;
          case LEX_MOC.token_paro : // 43
            regle93 () ;
          break ;
          case LEX_MOC.token_ident : // 87
            regle93 () ;
          break ;
          case LEX_MOC.token_mult : // 68
            regle93 () ;
          break ;
          case LEX_MOC.token_nil : // 58
            regle93 () ;
          break ;
          case LEX_MOC.token_yes : // 82
            regle93 () ;
          break ;
          case LEX_MOC.token_no : // 83
            regle93 () ;
          break ;
          case LEX_MOC.token_chaineo : // 89
            regle93 () ;
          break ;
          case LEX_MOC.token_self : // 79
            regle93 () ;
          break ;
          case LEX_MOC.token_super : // 81
            regle93 () ;
          break ;
          case LEX_MOC.token_cro : // 74
            regle93 () ;
          break ;
          case LEX_MOC.token_identc : // 88
            regle94 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MOC.token_cro);
        }
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
