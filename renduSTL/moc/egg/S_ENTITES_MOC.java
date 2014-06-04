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
public class S_ENTITES_MOC {
LEX_MOC scanner;
  S_ENTITES_MOC() {
    }
  S_ENTITES_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  DTYPE att_tNil;
  TDS att_tds_classe;
  TDS att_stds_fonction;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  Emplacement att_emplNull;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  int att_hadr;
  DTYPE att_tChar;
  DTYPE att_tBool;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle68() throws Exception {

    //declaration
    S_IMPLEMENTATION_MOC x_3 = new S_IMPLEMENTATION_MOC(scanner,att_eval) ;
    S_ENTITES_MOC x_5 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_68(x_3, x_5);
if  (att_eval)      action_htds_classe_68(x_3, x_5);
    x_3.analyser() ;
if  (att_eval)      action_tds_classe_68(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_tds_fonction_68(x_3, x_5);
if  (att_eval)      action_gen_68(x_3, x_5);
  }
  private void regle1() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_tds_fonction_1();
if  (att_eval)      action_aff_1();
if  (att_eval)      action_gen_1();
  }
  private void regle3() throws Exception {

    //declaration
    S_FONCTION_MOC x_3 = new S_FONCTION_MOC(scanner,att_eval) ;
    S_ENTITES_MOC x_5 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_3(x_3, x_5);
if  (att_eval)      action_initClass_3(x_3, x_5);
    x_3.analyser() ;
if  (att_eval)      action_tds_fonction_3(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_stds_fonction_3(x_3, x_5);
if  (att_eval)      action_gen_3(x_3, x_5);
  }
  private void regle2() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    S_ENTITES_MOC x_5 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_2(x_4, x_5);
    x_2.analyser(LEX_MOC.token_asm);
if  (att_eval)      action_tds_2(x_4, x_5);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
    x_5.analyser() ;
if  (att_eval)      action_tds_fonction_2(x_4, x_5);
if  (att_eval)      action_gen_2(x_4, x_5);
  }
private void action_initClass_3(S_FONCTION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
x_3.att_classe=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#initClass","ENTITES -> #initClass FONCTION #tds_fonction ENTITES1 #stds_fonction #gen ;"});
}
  }
private void action_tds_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tds=this.att_tds;
x_4.att_tds_asm=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","ENTITES -> asm #tds ASM ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_auto_inh_68(S_IMPLEMENTATION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
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
x_5.att_hadr=this.att_hadr;
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_emplNull=this.att_emplNull;
x_5.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ENTITES -> #htds_classe IMPLEMENTATION #tds_classe ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_stds_fonction_3(S_FONCTION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
this.att_stds_fonction=x_5.att_stds_fonction;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds_fonction","ENTITES -> #initClass FONCTION #tds_fonction ENTITES1 #stds_fonction #gen ;"});
}
  }
private void action_auto_inh_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
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
x_5.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_classe=this.att_tds_classe;
x_5.att_hadr=this.att_hadr;
x_5.att_machine=this.att_machine;
x_5.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ENTITES -> asm #tds ASM ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_auto_inh_3(S_FONCTION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
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
x_3.att_tds_classe=this.att_tds_classe;
x_5.att_tds_classe=this.att_tds_classe;
x_3.att_hadr=this.att_hadr;
x_5.att_hadr=this.att_hadr;
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_emplNull=this.att_emplNull;
x_5.att_emplNull=this.att_emplNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ENTITES -> #initClass FONCTION #tds_fonction ENTITES1 #stds_fonction #gen ;"});
}
  }
private void action_aff_1() throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#aff","ENTITES -> #tds_fonction #aff #gen ;"});
}
  }
private void action_gen_3(S_FONCTION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> #initClass FONCTION #tds_fonction ENTITES1 #stds_fonction #gen ;"});
}
  }
private void action_gen_1() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> #tds_fonction #aff #gen ;"});
}
  }
private void action_gen_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genCodeInLine(x_4.att_code_asm)+x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> asm #tds ASM ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_gen_68(S_IMPLEMENTATION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> #htds_classe IMPLEMENTATION #tds_classe ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_tds_fonction_68(S_IMPLEMENTATION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
this.att_stds_fonction=x_5.att_stds_fonction;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_fonction","ENTITES -> #htds_classe IMPLEMENTATION #tds_classe ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_tds_fonction_1() throws Exception {
try {
// instructions
this.att_stds_fonction=this.att_tds_fonction;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_fonction","ENTITES -> #tds_fonction #aff #gen ;"});
}
  }
private void action_tds_fonction_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
this.att_stds_fonction=x_5.att_stds_fonction;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_fonction","ENTITES -> asm #tds ASM ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_tds_classe_68(S_IMPLEMENTATION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
if ((x_3.att_stds_classe==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Warning, MOCMessages.Warning,new Object[]{""+"IMPLEMENTATION^stds_classe dans ENTITES-> ... est null"});

}

x_5.att_tds_classe=x_3.att_stds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_classe","ENTITES -> #htds_classe IMPLEMENTATION #tds_classe ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_tds_fonction_3(S_FONCTION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tds_fonction=x_3.att_stds_fonction;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_fonction","ENTITES -> #initClass FONCTION #tds_fonction ENTITES1 #stds_fonction #gen ;"});
}
  }
private void action_htds_classe_68(S_IMPLEMENTATION_MOC x_3, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
x_3.att_tds_classe=this.att_tds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#htds_classe","ENTITES -> #htds_classe IMPLEMENTATION #tds_classe ENTITES1 #tds_fonction #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.EOF :
        regle1 () ;
      break ;
      case LEX_MOC.token_asm : // 53
        regle2 () ;
      break ;
      case LEX_MOC.token_void : // 52
        regle3 () ;
      break ;
      case LEX_MOC.token_int : // 54
        regle3 () ;
      break ;
      case LEX_MOC.token_char : // 55
        regle3 () ;
      break ;
      case LEX_MOC.token_identc : // 88
        regle3 () ;
      break ;
      case LEX_MOC.token_bool : // 80
        regle3 () ;
      break ;
      case LEX_MOC.token_id : // 76
        regle3 () ;
      break ;
      case LEX_MOC.token_classe : // 77
        regle68 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
