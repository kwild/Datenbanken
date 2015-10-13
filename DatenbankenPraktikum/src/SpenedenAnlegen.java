import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SpenedenAnlegen extends JFrame{
	/*@SId int,
	@Name nvarchar(30),
	@Anzahl int,
	@GId int,
	@PId int,
	@eMail nvarchar(30),
	@Vorname nvarchar(25),
	@Nachname nvarchar(25),
	@Tel nvarchar(20),
	@Handy nvarchar(30)
	   */
	 
	 
 
	JLabel Vorname = new JLabel();
	JLabel Nachname = new JLabel();
	JLabel Tel = new JLabel();
	JLabel Handy = new JLabel();
	JLabel eMail = new JLabel();
	JLabel Name = new JLabel();
	JLabel Anzahl = new JLabel();
	
	JTextField Vorname1 = new JTextField();
	JTextField Nachname1 = new JTextField();
	JTextField Tel1 = new JTextField();
	JTextField Handy1 = new JTextField(null);
	JTextField eMail1 = new JTextField();
	JTextField Name1 = new JTextField(null);
	JTextField Anzahl1 = new JTextField();
	
    public SpenedenAnlegen(){
    	super("Spende Anlegen");
  		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		this.setLayout(new GridLayout(7,2));
  		this.setSize(400,400);
  	   
  	  Vorname.setText("Vorname");
  	  Nachname.setText("Nachname");
  	  Tel.setText("Tel");
  	  Handy.setText("Handy");
  	  eMail.setText("eMail");
  	  Name.setText("Name");
  	  Anzahl.setText("Anzahl");
  	  
  	  
  	  this.getContentPane().add ( Name ) ;
	  this.getContentPane().add ( Name1 ) ;
	  this.getContentPane().add (Anzahl ) ;
	  this.getContentPane().add (Anzahl1);
  	  this.getContentPane().add (Vorname ) ;
	  this.getContentPane().add (Vorname1 ) ;
	  this.getContentPane().add (Nachname ) ;
	  this.getContentPane().add (Nachname1 ) ;
	  this.getContentPane().add (Tel ) ;
	  this.getContentPane().add (Tel1 ) ;
	  this.getContentPane().add ( Handy ) ;
	  this.getContentPane().add ( Handy1 ) ;
	  this.getContentPane().add (eMail ) ;
	  this.getContentPane().add (eMail1 ) ;
	  
  	  
    	
    }
    
    public void main (String...args){
    	SpenedenAnlegen sp= new SpenedenAnlegen();
    	sp.setVisible (true);
    	
    }
}
