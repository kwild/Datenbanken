import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.*;

public class HelferAnlegen extends JFrame {       /*   @pid int,
	   @eMail nvarchar(30),
	   @vorname nvarchar(25),
	   @nachname nvarchar(25),
	   @tel nvarchar(20),
	   @handy nvarchar(30),
	   @gemeinde int,
	   @adresse int,
	   @Straße nvarchar(50),
	   @PLZ int,
	   @Hausnummer nvarchar(5),
	   @AId int,
	   @Stadt nvarchar(20)*/
	                                         
	   
	JLabel PId = new JLabel();
	JLabel eMail = new JLabel();
	JLabel vorname = new JLabel();
	JLabel nachname = new JLabel();
	JLabel tel = new JLabel();
	JLabel handy = new JLabel();
	JLabel gemeinde = new JLabel();
	JLabel adresse = new JLabel();
	JLabel Straße = new JLabel();
	JLabel PLZ = new JLabel();
	JLabel Hausnummer = new JLabel();
	JLabel AId = new JLabel();
	JLabel Stadt = new JLabel();
	 
	
	JTextField PId1 = new JTextField(null);
	JTextField eMail1 = new JTextField();
	JTextField vorname1 = new JTextField();
	JTextField nachname1 = new JTextField();
	JTextField tel1 = new JTextField();
	JTextField handy1 = new JTextField();
	JTextField gemeinde1 = new JTextField();
	JTextField adresse1 = new JTextField();
	JTextField Straße1 = new JTextField();
	JTextField PLZ1 = new JTextField();
	JTextField Hausnummer1 = new JTextField();
	JTextField AId1 = new JTextField(null);
	JTextField Stadt1 = new JTextField();
	 

   public HelferAnlegen(){
	   super("Helfer Anlegen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(13,2));
		this.setSize(400,400);
	   
	  PId.setText("PId");
	  eMail.setText("EMail");
	  vorname.setText("Vorname");
	  nachname.setText("Nachname");
	  tel.setText("Tel");
	  handy.setText("Handy");
	  gemeinde.setText("Gemeinde");
	  adresse.setText("Adresse");
	  Straße.setText("Straße");
	  PLZ.setText("PLZ");
	  Hausnummer.setText("Hausnummer");
	  AId.setText("AId");
	  Stadt.setText("Stadt");
	  
	  
	  //this.getContentPane().add ( PId ) ;
	  //this.getContentPane().add ( PId1 ) ;
	 // this.getContentPane().add ( AId ) ;
     // this.getContentPane().add ( AId1 ) ;
	 
	  this.getContentPane().add ( vorname ) ;
	  this.getContentPane().add ( vorname1 ) ;
	  this.getContentPane().add ( nachname ) ;
	  this.getContentPane().add ( nachname1 ) ;
	  this.getContentPane().add ( tel ) ;
	  this.getContentPane().add ( tel1 ) ;
	  this.getContentPane().add (handy ) ;
	  this.getContentPane().add ( handy1 ) ;
	  this.getContentPane().add ( eMail ) ;
	  this.getContentPane().add ( eMail1 ) ;
	  this.getContentPane().add ( gemeinde ) ;
	  this.getContentPane().add ( gemeinde1 ) ;
	  this.getContentPane().add ( adresse ) ;
	  this.getContentPane().add ( adresse1 ) ;
	  this.getContentPane().add ( Stadt ) ;
	  this.getContentPane().add ( Stadt1 ) ;
	  this.getContentPane().add ( Straße ) ;
	  this.getContentPane().add ( Straße1 ) ;
	  this.getContentPane().add ( Hausnummer ) ;
	  this.getContentPane().add ( Hausnummer1 ) ;
	  this.getContentPane().add ( PLZ ) ;
	  this.getContentPane().add ( PLZ1 ) ;
	  
	  
   }
   
   public static void main (String...args){
	   HelferAnlegen he = new HelferAnlegen();
	   he.setVisible(true);
   }
}

