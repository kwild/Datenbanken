import java.awt.GridLayout;

import javax.swing.*;


public class FlüchtlingAnlegen extends JFrame {
	JLabel FId = new JLabel();
	JLabel Geschlecht = new JLabel();
	JLabel Pass = new JLabel();
	JLabel Geburtsdatum = new JLabel();
	JLabel registriert = new JLabel();
	JLabel Unterkunft = new JLabel();
	JLabel Einzugsdatum = new JLabel();
	JLabel Wunschland = new JLabel();
	JLabel OriginalNachname = new JLabel();
	JLabel OriginalVorname = new JLabel();
	JLabel Aufenhaltsland = new JLabel();
	JLabel GeburtsdatumV = new JLabel();
	JLabel Antragsstatus = new JLabel();
	JLabel kommtAus = new JLabel();
	JLabel Thema = new JLabel();
	JLabel Date = new JLabel();
	JLabel Sprache = new JLabel();
	JLabel Sprachniveau = new JLabel();
	JLabel Qid = new JLabel();
	JLabel Bezeichnung = new JLabel();
	JLabel Art = new JLabel();
	
	
	JTextField FId1 = new JTextField();
	JTextField Geschlecht1 = new JTextField();
	JTextField Pass1 = new JTextField();
	JTextField Geburtsdatum1 = new JTextField();
	JTextField registriert1 = new JTextField();
	JTextField Unterkunft1 = new JTextField();
	JTextField Einzugsdatum1 = new JTextField();
	JTextField Wunschland1 = new JTextField();
	JTextField OriginalNachname1 = new JTextField();
	JTextField OriginalVorname1 = new JTextField();
	JTextField Aufenhaltsland1 = new JTextField();
	JTextField GeburtsdatumV1 = new JTextField();
	JTextField Antragsstatus1 = new JTextField();
	JTextField kommtAus1 = new JTextField();
	JTextField Thema1 = new JTextField();
	JTextField Date1 = new JTextField();
	JTextField Sprache1 = new JTextField();
	JTextField Sprachniveau1 = new JTextField();
	JTextField Qid1 = new JTextField();
	JTextField Bezeichnung1 = new JTextField();
	JTextField Art1 = new JTextField();

   public FlüchtlingAnlegen(){
	   super("Flüchtling Anlegen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(23,2));
		this.setSize(800, 800);
	   
	  FId.setText("FId");
	  Geschlecht.setText("Geschlecht");
	  Pass.setText("Pass");
	  Geburtsdatum.setText("Geburtsdatum");
	  registriert.setText("registriert");
	  Unterkunft.setText("Unterkunft");
	  Einzugsdatum.setText("Einzugsdatum");
	  Wunschland.setText("Wuschland");
	  OriginalNachname.setText("OriginalNachname");
	  OriginalVorname.setText("OriginalVorname");
	  Aufenhaltsland.setText("Aufenhaltsland");  
	  GeburtsdatumV.setText("GeburtsdaumV");
	  Antragsstatus.setText("Antragsstatus");
	  kommtAus.setText("kommtAus");
	  Thema.setText("Thema");
	  Date.setText("Date");
	  Sprache.setText("Sprache");
	  Sprachniveau.setText("Sprachniveau");
	  Qid.setText("Qid");
	  Bezeichnung.setText("Bezeichnung");
	  Art.setText("Art");
	  
	  this.getContentPane().add ( FId ) ;
	  this.getContentPane().add ( FId1 ) ;
	  this.getContentPane().add ( Geschlecht ) ;
	  this.getContentPane().add ( Geschlecht1 ) ;
	  this.getContentPane().add ( Pass ) ;
	  this.getContentPane().add ( Pass1 ) ;
	  this.getContentPane().add ( Geburtsdatum ) ;
	  this.getContentPane().add ( Geburtsdatum1 ) ;
	  this.getContentPane().add ( registriert ) ;
	  this.getContentPane().add ( registriert1 ) ;
	  this.getContentPane().add ( Unterkunft ) ;
	  this.getContentPane().add ( Unterkunft1 ) ;
	  this.getContentPane().add ( Einzugsdatum ) ;
	  this.getContentPane().add ( Einzugsdatum1 ) ;
	  this.getContentPane().add ( Wunschland ) ;
	  this.getContentPane().add ( Wunschland1 ) ;
	  this.getContentPane().add ( OriginalNachname ) ;
	  this.getContentPane().add ( OriginalNachname1 ) ;
	  this.getContentPane().add ( OriginalVorname ) ;
	  this.getContentPane().add ( OriginalVorname1 ) ;
	  this.getContentPane().add ( Aufenhaltsland ) ;
	  this.getContentPane().add ( Aufenhaltsland1 ) ;
	  this.getContentPane().add ( GeburtsdatumV ) ;
	  this.getContentPane().add ( GeburtsdatumV1 ) ;
	  this.getContentPane().add ( Antragsstatus ) ;
	  this.getContentPane().add ( Antragsstatus1 ) ;
	  this.getContentPane().add ( kommtAus ) ;
	  this.getContentPane().add ( kommtAus1 ) ;
	  this.getContentPane().add (Thema  ) ;
	  this.getContentPane().add ( Thema1 ) ;
	  this.getContentPane().add (Date  ) ;
	  this.getContentPane().add ( Date1 ) ;
	  this.getContentPane().add ( Sprache  ) ;
	  this.getContentPane().add ( Sprache1 ) ;
	  this.getContentPane().add ( Sprachniveau ) ;
	  this.getContentPane().add ( Sprachniveau1 ) ;
	  this.getContentPane().add ( Qid ) ;
	  this.getContentPane().add ( Qid1 ) ;
	  this.getContentPane().add ( Bezeichnung) ;
	  this.getContentPane().add ( Bezeichnung1) ;
	  this.getContentPane().add ( Art) ;
	  this.getContentPane().add (Art1) ;
	  
	  
	 
	 
	  pack();
   }
   
   public static void main (String...args){
	   FlüchtlingAnlegen fa = new FlüchtlingAnlegen();
	   fa.setVisible(true);
   }
}



/*   @FId int,
@Geschlecht nvarchar(1),
@Pass nvarchar(4),
@Geburtsdatum date,
@registriert int,
@Unterkunft int,
@Einzugsdatum date,
@Wunschland nvarchar(30),
@OriginalNachname nvarchar(50),
@OriginalVorname nvarchar(50),
@Aufenthaltsland nvarchar(50),
@GeburtsdatumV nvarchar(1),
@Antragsstatus nvarchar(30),
@kommtAus int
 @sid int,
	   @thema nvarchar(50),
	   @date date,
	   @sprache nvarchar(50),
	   @sprachniveau nvarchar(11),
	   @schreibniveau nvarchar(11),
	   @leseniveau nvarchar(11),
	   @qid int,
	   @bezeichnung nvarchar(50),
	   @art nvarchar(50)*/