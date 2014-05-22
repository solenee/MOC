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
public class S_ARGS_MOC {
LEX_MOC scanner;
  S_ARGS_MOC() {
    }
  S_ARGS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  boolean att_eval;
  String att_code;
  PARAMETRES att_hparams;
  PARAMETRES att_params;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle64() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_params_64();
if  (att_eval)      action_gen_64();
  }
  private void regle65() throws Exception {

    //declaration
    S_E_MOC x_2 = new S_E_MOC(scanner,att_eval) ;
    S_ARGSX_MOC x_4 = new S_ARGSX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_65(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_params1_65(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_params2_65(x_2, x_4);
if  (att_eval)      action_gen_65(x_2, x_4);
  }
private void action_auto_inh_65(S_E_MOC x_2, S_ARGSX_MOC x_4) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_4.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_4.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_4.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_4.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_4.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_4.att_regLB=this.att_regLB;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_2.att_tds_fonction=this.att_tds_fonction;
x_4.att_tds_fonction=this.att_tds_fonction;
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ARGS -> E #params1 ARGSX #params2 #gen ;"});
}
  }
private void action_params1_65(S_E_MOC x_2, S_ARGSX_MOC x_4) throws Exception {
try {
// locales
PARAMETRES loc_par;
// instructions
loc_par=this.att_hparams;
loc_par.inserer(x_2.att_type);
x_4.att_hparams=loc_par;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params1","ARGS -> E #params1 ARGSX #params2 #gen ;"});
}
  }
private void action_params_64() throws Exception {
try {
// instructions
this.att_params=this.att_hparams;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","ARGS -> #params #gen ;"});
}
  }
private void action_params2_65(S_E_MOC x_2, S_ARGSX_MOC x_4) throws Exception {
try {
// instructions
this.att_params=x_4.att_params;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params2","ARGS -> E #params1 ARGSX #params2 #gen ;"});
}
  }
private void action_gen_65(S_E_MOC x_2, S_ARGSX_MOC x_4) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genComment("empilement des parametres")+x_4.att_code+this.att_machine.genComment("parametre de sous-programme")+x_2.att_code+this.att_machine.genComment("charger le parametre ?");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ARGS -> E #params1 ARGSX #params2 #gen ;"});
}
  }
private void action_gen_64() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ARGS -> #params #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_parf : // 656
        regle64 () ;
      break ;
      case LEX_MOC.token_entier : // 685
        regle65 () ;
      break ;
      case LEX_MOC.token_caractere : // 686
        regle65 () ;
      break ;
      case LEX_MOC.token_plus : // 677
        regle65 () ;
      break ;
      case LEX_MOC.token_moins : // 678
        regle65 () ;
      break ;
      case LEX_MOC.token_non : // 684
        regle65 () ;
      break ;
      case LEX_MOC.token_null : // 669
        regle65 () ;
      break ;
      case LEX_MOC.token_paro : // 655
        regle65 () ;
      break ;
      case LEX_MOC.token_ident : // 688
        regle65 () ;
      break ;
      case LEX_MOC.token_mult : // 680
        regle65 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
