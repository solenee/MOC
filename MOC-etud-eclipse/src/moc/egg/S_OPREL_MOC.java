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
public class S_OPREL_MOC {
LEX_MOC scanner;
  S_OPREL_MOC() {
    }
  S_OPREL_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MOC att_scanner;
  private void regle37() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_eg);
  }
  private void regle38() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_neg);
  }
  private void regle35() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_infeg);
  }
  private void regle36() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_supeg);
  }
  private void regle33() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_inf);
  }
  private void regle34() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_sup);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_inf : // 41
        regle33 () ;
      break ;
      case LEX_MOC.token_sup : // 43
        regle34 () ;
      break ;
      case LEX_MOC.token_infeg : // 42
        regle35 () ;
      break ;
      case LEX_MOC.token_supeg : // 44
        regle36 () ;
      break ;
      case LEX_MOC.token_eg : // 45
        regle37 () ;
      break ;
      case LEX_MOC.token_neg : // 46
        regle38 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
