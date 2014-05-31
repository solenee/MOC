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
public class S_PTYPE_MOC {
LEX_MOC scanner;
  S_PTYPE_MOC() {
    }
  S_PTYPE_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  DTYPE att_tNil;
  TDS att_tds_classe;
  boolean att_eval;
  DTYPE att_tAny;
  DTYPE att_type;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  DTYPE att_tBool;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle82() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_TYPE_MOC x_3 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_82(x_3);
    x_2.analyser(LEX_MOC.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_parf);
if  (att_eval)      action_type_82(x_3);
  }
private void action_type_82(S_TYPE_MOC x_3) throws Exception {
try {
// instructions
this.att_type=x_3.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#type","PTYPE -> paro TYPE parf #type ;"});
}
  }
private void action_auto_inh_82(S_TYPE_MOC x_3) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_3.att_tAny=this.att_tAny;
x_3.att_tBool=this.att_tBool;
x_3.att_tNil=this.att_tNil;
x_3.att_tds=this.att_tds;
x_3.att_tds_classe=this.att_tds_classe;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","PTYPE -> paro TYPE parf #type ;"});
}
  }
  public void analyser () throws Exception {
    regle82 () ;
  }
  }
