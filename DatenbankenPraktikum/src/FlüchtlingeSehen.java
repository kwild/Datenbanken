package GUI;

import java.awt.GridLayout;

import javax.swing.*;

public class FlüchtlingeSehen extends JFrame{
	
	String[][] FDaten;
	
	public FlüchtlingeSehen(){
		super("Flüchtlinge anzeigen");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FDaten = new String[4][13];
		for(int i = 0; i < FDaten.length; i++){
			for(int j = 0; j < FDaten[i].length; j++){
				FDaten[i][j] = "Hallo";
			}
		}
		
		
		this.setLayout(new GridLayout(0,FDaten[0].length, 0, 0));
		
		JLabel id = new JLabel("PersonId");
		JLabel vorname = new JLabel("Vorname");
		JLabel nachname = new JLabel("Nachname");
		JLabel origVorname = new JLabel("Original Vorname");
		JLabel origNachname = new JLabel("Original Nachname");
		JLabel geschlecht = new JLabel("Geschelcht");
		JLabel geburtsdatum = new JLabel("Geburtsdatum");
		JLabel tel = new JLabel("Telefonnummer");
		JLabel handy = new JLabel("Handynummer");
		JLabel mail = new JLabel("E-Mail");
		JLabel antrag = new JLabel("Antragsstatus");
		JLabel aufenthaltsland = new JLabel("Aufenthaltsland");
		JLabel wunschland = new JLabel("Wunschland");
		
		JLabel[][] inhalt = new JLabel[FDaten.length][FDaten[0].length];
		
		for(int i = 0; i < FDaten.length; i++){
			for(int j = 0; j < FDaten[i].length; j++){
				inhalt[i][j] = new JLabel(FDaten[i][j]);
			}
		}
		
		this.add(id);
		this.add(vorname);
		this.add(nachname);
		this.add(origVorname);
		this.add(origNachname);
		this.add(geschlecht);
		this.add(geburtsdatum);
		this.add(tel);
		this.add(handy);
		this.add(mail);
		this.add(antrag);
		this.add(aufenthaltsland);
		this.add(wunschland);
		
		for(int i = 0; i < FDaten.length; i++){
			for(int j = 0; j < FDaten[i].length; j++){
				this.add(inhalt[i][j]);
			}
		}
		
		pack();
		
		this.setSize(1500, 500);
		this.setLocationRelativeTo(null);

		
	}
	
	public static void main(String[] args) {
		FlüchtlingeSehen bl = new FlüchtlingeSehen();
		bl.setVisible(true);
	}

}
