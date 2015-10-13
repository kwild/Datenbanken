import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class SachbearbeiterAnlegen extends JFrame { 
	
	JLabel Straße = new JLabel();
	JLabel PLZ = new JLabel();
	JLabel Hausnummer = new JLabel();
	JLabel AId = new JLabel();
	JLabel Stadt = new JLabel();
	JLabel PId = new JLabel();
	JLabel eMail = new JLabel();
	JLabel Vorname = new JLabel();
	JLabel Nachname = new JLabel();
	JLabel Tel = new JLabel();
	JLabel Handy = new JLabel();
	JLabel SId = new JLabel();
	JLabel GId = new JLabel();
	JLabel aktiv = new JLabel();
	JLabel Ebene = new JLabel();
	 
	
	JTextField Straße1 = new JTextField();
	JTextField PLZ1 = new JTextField();
	JTextField Hausnummer1 = new JTextField();
	JTextField AId1 = new JTextField(null);
	JTextField Stadt1 = new JTextField();
	JTextField PId1 = new JTextField(null);
	JTextField eMail1 = new JTextField();
	JTextField Vorname1 = new JTextField();
	JTextField Nachname1 = new JTextField();
	JTextField Tel1 = new JTextField();
	JTextField SId1 = new JTextField(null);
	JTextField GId1 = new JTextField(null);
	JTextField aktiv1 = new JTextField();
	JTextField Ebene1 = new JTextField();
 

   public SachbearbeiterAnlegen(){
	   super("Sachbearbeiter Anlegen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(16,2));
		this.setSize(400,400);
	   
	  Straße.setText("Straße");
	  PLZ.setText("PLZ");
	  Hausnummer.setText("Hausnummer");
	  AId.setText("AId");
	  Stadt.setText("Stadt");
	  PId.setText("PId");
	  eMail.setText("EMail");
	  Vorname.setText("Vorname");
	  Nachname.setText("Nachname");
	  Tel.setText("Tel");
	  SId.setText("SId");  
	  GId.setText("GId");
	  aktiv.setText("activ");
	  Ebene.setText("Ebene");
	 
	  
	  // this.getContentPane().add ( SId ) ;
	  // this.getContentPane().add ( SId1 ) ;
	  // this.getContentPane().add ( GId ) ;
	  // this.getContentPane().add ( GId1 ) ;
	  // this.getContentPane().add ( AId ) ;
	  // this.getContentPane().add ( AId1 ) ;
	  this.getContentPane().add (Vorname ) ;
	  this.getContentPane().add (Vorname1 ) ;
	  this.getContentPane().add (Nachname ) ;
	  this.getContentPane().add (Nachname1 ) ;
	  this.getContentPane().add ( Stadt ) ;
	  this.getContentPane().add ( Stadt1 ) ;
	  this.getContentPane().add ( Straße ) ;
	  this.getContentPane().add ( Straße1 ) ;
	  this.getContentPane().add ( Hausnummer ) ;
	  this.getContentPane().add ( Hausnummer1 ) ;
	  this.getContentPane().add ( PLZ ) ;
	  this.getContentPane().add ( PLZ1 ) ;
	  this.getContentPane().add ( Tel ) ;
	  this.getContentPane().add ( Tel1 ) ;
	  this.getContentPane().add ( eMail ) ;
	  this.getContentPane().add ( eMail1 ) ;
      this.getContentPane().add (aktiv ) ;
	  this.getContentPane().add (aktiv1) ;
	  this.getContentPane().add (Ebene ) ;
	  this.getContentPane().add (Ebene1) ;
	  
	  
	 
	 
	  
   }
   
   public static void main (String...args){
	   SachbearbeiterAnlegen sa = new SachbearbeiterAnlegen();
	   sa.setVisible(true);
   }

}
