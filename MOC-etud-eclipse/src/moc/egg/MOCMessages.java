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

  public static  String MOC_expected_eof;
  public static  String MOC_unexpected_token;
  public static  String NO_MACH;
  public static  String MOC_expected_token;
  }
