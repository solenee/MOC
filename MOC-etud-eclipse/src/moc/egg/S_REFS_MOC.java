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
public class S_REFS_MOC {
LEX_MOC scanner;
  S_REFS_MOC() {
    }
  S_REFS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MOC att_scanner;
  private void regle11() throws Exception {

    //declaration
    //appel
  }
  private void regle12() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_REFS_MOC x_3 = new S_REFS_MOC(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_MOC.token_mult);
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_ident : // 58
        regle11 () ;
      break ;
      case LEX_MOC.token_parf : // 26
        regle11 () ;
      break ;
      case LEX_MOC.token_mult : // 50
        regle12 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
