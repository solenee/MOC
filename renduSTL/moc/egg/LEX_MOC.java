package moc.egg;
import java.util.Arrays;
import mg.egg.eggc.runtime.libjava.EGGException;
import mg.egg.eggc.runtime.libjava.messages.NLS;
import mg.egg.eggc.runtime.libjava.lex.LEXICAL4;
import mg.egg.eggc.runtime.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.runtime.libjava.problem.IProblemReporter;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import mg.egg.eggc.runtime.libjava.problem.ProblemSeverities;
import moc.compiler.*;
import moc.tds.*;
import moc.type.*;
import moc.gc.*;
import java.util.*;
public class LEX_MOC extends LEXICAL4  {
 public static final int EOF = 0 ;
 public static final int token_sinon = 1 ;
 public static final int token_void = 2 ;
 public static final int token_mod = 3 ;
 public static final int token_mult = 4 ;
 public static final int token_eg = 5 ;
 public static final int token_null = 6 ;
 public static final int token_fin = 7 ;
 public static final int token_ident = 8 ;
 public static final int token_div = 9 ;
 public static final int token_yes = 10 ;
 public static final int token_pv = 11 ;
 public static final int token_int = 12 ;
 public static final int token_aco = 13 ;
 public static final int token_inf = 14 ;
 public static final int token_acf = 15 ;
 public static final int token_identc = 16 ;
 public static final int token_ou = 17 ;
 public static final int token_id = 18 ;
 public static final int token_bool = 19 ;
 public static final int token_no = 20 ;
 public static final int token_chaineo = 21 ;
 public static final int token_moins = 22 ;
 public static final int token_neg = 23 ;
 public static final int token_dpts = 24 ;
 public static final int token_caractere = 25 ;
 public static final int token_chaine = 26 ;
 public static final int token_affect = 27 ;
 public static final int token_retour = 28 ;
 public static final int token_asm = 29 ;
 public static final int token_virg = 30 ;
 public static final int token_entier = 31 ;
 public static final int token_self = 32 ;
 public static final int token_si = 33 ;
 public static final int token_paro = 34 ;
 public static final int token_cro = 35 ;
 public static final int token_classe = 36 ;
 public static final int token_sup = 37 ;
 public static final int token_separateur = 38 ;
 public static final int token_comm = 39 ;
 public static final int token_parf = 40 ;
 public static final int token_crf = 41 ;
 public static final int token_super = 42 ;
 public static final int token_nil = 43 ;
 public static final int token_supeg = 44 ;
 public static final int token_plus = 45 ;
 public static final int token_non = 46 ;
 public static final int token_infeg = 47 ;
 public static final int token_char = 48 ;
 public static final int token_et = 49 ;
  static final int token_autre = 50 ;
  public static final String[][] tokenImages = {
    {"<EOF>"} ,{"sinon"},
{"void"},
{"mod"},
{"mult"},
{"eg"},
{"null"},
{"fin"},
    {"ident"} ,
{"div"},
{"yes"},
{"pv"},
{"int"},
{"aco"},
{"inf"},
{"acf"},
    {"identc"} ,
{"ou"},
{"id"},
{"bool"},
{"no"},
    {"chaineo"} ,
{"moins"},
{"neg"},
{"dpts"},
    {"caractere"} ,
    {"chaine"} ,
{"affect"},
{"retour"},
{"asm"},
{"virg"},
    {"entier"} ,
{"self"},
{"si"},
{"paro"},
{"cro"},
{"classe"},
{"sup"},
    {"separateur"} ,
    {"comm"} ,
{"parf"},
{"crf"},
{"super"},
{"nil"},
{"supeg"},
{"plus"},
{"non"},
{"infeg"},
{"char"},
{"et"},
  } ;
  private int [] separateurs = { 
token_separateur
, token_comm
    } ;
  public int[] getSeparateurs(){
    return separateurs;
    }
  private int [] comments = { 
    } ;
  public int[] getComments(){
    return comments;
    }
  private int le_comment = -1;
  public int getComment(){
    return le_comment;
    }
  public LEX_MOC(IProblemReporter pr, LEX_CONTEXTE lc, int k) {
    super(pr, lc,k);
    dernier_accepte = 0 ;
    analyseur = new JLEX_MOC();
  }
  public void setSource ( LEXICAL4 scanner) throws EGGException{
    scanner.analyseur.toContext(scanner.contexte);
    analyseur.fromContext(scanner.contexte);
  }
  public void setReader ( LEXICAL4 scanner) {
    scanner.analyseur.setReader(scanner.contexte.source);
  }
  public void accepter_sucre ( int t ) throws EGGException {
    if ( fenetre[0].code == t ) {
      dernier_accepte = fenetre[0].ligne ;
      recovery = false;
      decaler () ;
    }else {
      _interrompre(IProblem.Syntax,getBeginLine(), IMOCMessages.id_MOC_expected_token, MOCMessages.MOC_expected_token,new Object[]{fenetre[0].getNom(), Arrays.asList(tokenImages[t])});
    }
  }
  public void accepter_fds() throws EGGException {
    lit ( 1 ) ;
    if ( fenetre[0].code != EOF ) {
      _interrompre(IProblem.Syntax,getBeginLine(), IMOCMessages.id_MOC_expected_token, MOCMessages.MOC_expected_eof, new Object[]{fenetre[0].getNom()});
      }
     else {
      dernier_accepte = fenetre[0].ligne ;
      }
    }
  public int ligneDepart () {
    return getBeginLine() + getEndLine() ;
    }
  public void _interrompre (int cat,  int line, int id,  String c , Object [] m )  {
      //recovery = true;
      recovery = false;
      contexte.errors++;
        problemReporter.handle(cat, id,line  , NLS.bind(c,m), getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Error,m);
    }
    public void _signaler ( int cat, int line, int id, String c , Object [] m )  {
        problemReporter.handle(cat , id, line  , NLS.bind(c,m),getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Warning,m);
    }
  }
