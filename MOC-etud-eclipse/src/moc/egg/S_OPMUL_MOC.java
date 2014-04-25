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
public class S_OPMUL_MOC {
LEX_MOC scanner;
  S_OPMUL_MOC() {
    }
  S_OPMUL_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MOC att_scanner;
  private void regle48() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_mult);
  }
  private void regle50() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_mod);
  }
  private void regle51() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_et);
  }
  private void regle49() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_div);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_mult : // 50
        regle48 () ;
      break ;
      case LEX_MOC.token_div : // 51
        regle49 () ;
      break ;
      case LEX_MOC.token_mod : // 52
        regle50 () ;
      break ;
      case LEX_MOC.token_et : // 53
        regle51 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
