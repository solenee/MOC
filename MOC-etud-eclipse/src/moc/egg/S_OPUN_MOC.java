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
public class S_OPUN_MOC {
LEX_MOC scanner;
  S_OPUN_MOC() {
    }
  S_OPUN_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MOC att_scanner;
  private void regle58() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_non);
  }
  private void regle57() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_moins);
  }
  private void regle56() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_plus);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_plus : // 47
        regle56 () ;
      break ;
      case LEX_MOC.token_moins : // 48
        regle57 () ;
      break ;
      case LEX_MOC.token_non : // 54
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
