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
public class S_PROGRAMME_MOC {
LEX_MOC scanner;
  S_PROGRAMME_MOC() {
    }
  S_PROGRAMME_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  MOCSourceFile att_source;
  boolean att_eval;
  LEX_MOC att_scanner;
  Emplacement glob_0_emplPNull;
  IMachine glob_0_machine;
  POINTEUR glob_0_tPNull;
  String glob_0_leCode;
  private void regle0() throws Exception {

    //declaration
    S_ENTITES_MOC x_7 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_initType_0(x_7);
if  (att_eval)      action_init_0(x_7);
if  (att_eval)      action_initCode_0(x_7);
if  (att_eval)      action_tds_0(x_7);
if  (att_eval)      action_adresse_0(x_7);
    x_7.analyser() ;
if  (att_eval)      action_main_0(x_7);
if  (att_eval)      action_gen_0(x_7);
  }
private void action_initCode_0(S_ENTITES_MOC x_7) throws Exception {
try {
// instructions
glob_0_emplPNull= new Emplacement(0,  new Register("SB", 0));
x_7.att_emplNull=glob_0_emplPNull;
glob_0_leCode=glob_0_machine.genComment("code de lancement du programme")+glob_0_machine.genEspaceNull()+glob_0_machine.genCallMain()+glob_0_machine.genFinProgramme();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#initCode","PROGRAMME -> #initType #init #initCode #tds #adresse ENTITES #main #gen ;"});
}
  }
private void action_gen_0(S_ENTITES_MOC x_7) throws Exception {
try {
// locales
// instructions
glob_0_leCode=glob_0_leCode+glob_0_machine.genComment("code source du programme\n\n\n")+x_7.att_code;
glob_0_machine.writeCode(this.att_source.getFileName(), glob_0_leCode);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","PROGRAMME -> #initType #init #initCode #tds #adresse ENTITES #main #gen ;"});
}
  }
private void action_main_0(S_ENTITES_MOC x_7) throws Exception {
try {
// locales
INFO loc_i;
// instructions
loc_i=x_7.att_stds_fonction.chercherLocalement("main");
if ((loc_i==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_NO_MAIN, MOCMessages.NO_MAIN,new Object[]{""+""});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#main","PROGRAMME -> #initType #init #initCode #tds #adresse ENTITES #main #gen ;"});
}
  }
private void action_tds_0(S_ENTITES_MOC x_7) throws Exception {
try {
// locales
// instructions
x_7.att_tds=null;
x_7.att_tds_fonction= new TDS();
x_7.att_tds_classe= new TDS();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","PROGRAMME -> #initType #init #initCode #tds #adresse ENTITES #main #gen ;"});
}
  }
private void action_init_0(S_ENTITES_MOC x_7) throws Exception {
try {
// instructions
glob_0_machine=this.att_source.getMachine();
if (glob_0_machine==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_NO_MACH, MOCMessages.NO_MACH,new Object[]{""+this.att_source.getMachName()});

}
else {
x_7.att_machine=glob_0_machine;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#init","PROGRAMME -> #initType #init #initCode #tds #adresse ENTITES #main #gen ;"});
}
  }
private void action_adresse_0(S_ENTITES_MOC x_7) throws Exception {
try {
// instructions
x_7.att_hadr=0;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","PROGRAMME -> #initType #init #initCode #tds #adresse ENTITES #main #gen ;"});
}
  }
private void action_initType_0(S_ENTITES_MOC x_7) throws Exception {
try {
// instructions
x_7.att_tInt= new DTYPE("int", 1);
x_7.att_tChar= new DTYPE("char", 1);
x_7.att_tString= new DTYPE("string", 1);
x_7.att_tPointeurNull= new POINTEURNULL();
x_7.att_tVoid= new DTYPE("void", 0);
x_7.att_regLB= new Register("LB", 0);
x_7.att_tNil= new OBJETNIL();
x_7.att_tBool= new DTYPE("bool", 1);
glob_0_tPNull= new POINTEURNULL();
x_7.att_tPointeurNull=glob_0_tPNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#initType","PROGRAMME -> #initType #init #initCode #tds #adresse ENTITES #main #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_asm : // 53
        regle0 () ;
      break ;
      case LEX_MOC.token_void : // 52
        regle0 () ;
      break ;
      case LEX_MOC.token_int : // 54
        regle0 () ;
      break ;
      case LEX_MOC.token_char : // 55
        regle0 () ;
      break ;
      case LEX_MOC.token_identc : // 88
        regle0 () ;
      break ;
      case LEX_MOC.token_bool : // 80
        regle0 () ;
      break ;
      case LEX_MOC.token_id : // 76
        regle0 () ;
      break ;
      case LEX_MOC.token_classe : // 77
        regle0 () ;
      break ;
      case LEX_MOC.EOF :
        regle0 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
