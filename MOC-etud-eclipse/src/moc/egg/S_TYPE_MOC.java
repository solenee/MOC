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
public class S_TYPE_MOC {
LEX_MOC scanner;
  S_TYPE_MOC() {
    }
  S_TYPE_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MOC att_scanner;
  private void regle10() throws Exception {

    //declaration
    S_STYPE_MOC x_2 = new S_STYPE_MOC(scanner,att_eval) ;
    S_REFS_MOC x_3 = new S_REFS_MOC(scanner,att_eval) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    regle10 () ;
  }
  }
