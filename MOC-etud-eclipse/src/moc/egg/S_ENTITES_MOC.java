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
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle1() throws Exception {

    //declaration
    //appel
  }
  private void regle3() throws Exception {

    //declaration
    S_FONCTION_MOC x_2 = new S_FONCTION_MOC(scanner,att_eval) ;
    S_ENTITES_MOC x_3 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_3(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
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
if  (att_eval)      action_gen_2(x_4, x_5);
  }
private void action_gen_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> asm #tds ASM ENTITES1 #gen ;"});
}
  }
private void action_tds_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
x_4.att_tds_asm=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","ENTITES -> asm #tds ASM ENTITES1 #gen ;"});
}
  }
private void action_auto_inh_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ENTITES -> asm #tds ASM ENTITES1 #gen ;"});
}
  }
private void action_auto_inh_3(S_FONCTION_MOC x_2, S_ENTITES_MOC x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ENTITES -> FONCTION ENTITES1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.EOF :
        regle1 () ;
      break ;
      case LEX_MOC.token_asm : // 35
        regle2 () ;
      break ;
      case LEX_MOC.token_void : // 34
        regle3 () ;
      break ;
      case LEX_MOC.token_int : // 36
        regle3 () ;
      break ;
      case LEX_MOC.token_char : // 37
        regle3 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
