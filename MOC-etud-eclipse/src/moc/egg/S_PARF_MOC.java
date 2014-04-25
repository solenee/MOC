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
public class S_PARF_MOC {
LEX_MOC scanner;
  S_PARF_MOC() {
    }
  S_PARF_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle9() throws Exception {

    //declaration
    S_TYPE_MOC x_2 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_ident);
  }
  public void analyser () throws Exception {
    regle9 () ;
  }
  }
