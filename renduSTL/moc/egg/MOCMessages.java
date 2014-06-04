package moc.egg;
import java.util.ResourceBundle;
import mg.egg.eggc.runtime.libjava.messages.NLS;
public class MOCMessages extends NLS {
  private static final long serialVersionUID = 1L;
  private static final String BUNDLE_NAME = "moc.MOC";
  private MOCMessages() {
  // Do not instantiate
  }
  static {
  NLS.initializeMessages(BUNDLE_NAME, moc.egg.MOCMessages.class);
  }
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
  public static ResourceBundle getResourceBundle() {
  return RESOURCE_BUNDLE;
  }		

  public static  String Class_exist;
  public static  String IllegalSelf;
  public static  String classe_inexistante;
  public static  String Warning;
  public static  String ErreurInterneTDS_self;
  public static  String MOC_expected_token;
  public static  String IllegalSuper;
  public static  String mauvais_parametres;
  public static  String NonAffectable;
  public static  String B_22;
  public static  String B_21;
  public static  String B_20;
  public static  String pas_classe;
  public static  String pas_methode;
  public static  String OneRootClass;
  public static  String InterneInfoClasse;
  public static  String NO_MAIN;
  public static  String NO_MACH;
  public static  String param_exists;
  public static  String methode_inexistante;
  public static  String B_18;
  public static  String pas_methode_instance;
  public static  String InterneTDSClasse;
  public static  String B_17;
  public static  String B_16;
  public static  String B_15;
  public static  String B_14;
  public static  String B_13;
  public static  String pas_methode_classe;
  public static  String MOC_unexpected_token;
  public static  String MOC_expected_eof;
  public static  String UnknownClass;
  public static  String pas_pointeur;
  public static  String B_6;
  public static  String Att_exist;
  public static  String pas_instance;
  public static  String InterneInfoclasse;
  public static  String B_04;
  public static  String B_03;
  public static  String B_02;
  public static  String Interne_adresse;
  public static  String B_01;
  public static  String MultipleOrphanClasses;
  public static  String B_233;
  }
