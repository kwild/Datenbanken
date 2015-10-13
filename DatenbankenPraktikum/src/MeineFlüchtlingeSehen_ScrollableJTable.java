package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MeineFlüchtlingeSehen_ScrollableJTable extends javax.swing.JFrame{
	public MeineFlüchtlingeSehen_ScrollableJTable(){
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("Flüchtlinge anzeigen");
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setPreferredSize(new Dimension(1750, 400));
        
        String[] spaltenbeschriftung = {"PersonId", "Vorname", "Nachname", "Original Vorname", "Original Nachname", "Geschlecht", "Geburtsdatum", "Telefonnummer", "Handynummer", "E-Mail", "Antragsstatus", "Aufenthaltsland", "Wunschland"};
        
        String[][] FDaten = new String[20][13];
		for(int i = 0; i < FDaten.length; i++){
			for(int j = 0; j < FDaten[i].length; j++){
				FDaten[i][j] = "Hallo";
			}
		}
        JTable table = new JTable(FDaten, spaltenbeschriftung);
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 15));
        
        JScrollPane pane = new JScrollPane(table);
        mainPanel.add(pane, BorderLayout.CENTER);
        
        
        JPanel panel = new ScrollableJTable();
        panel.setOpaque(true);
        
        
        
        this.setContentPane(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MeineFlüchtlingeSehen_ScrollableJTable test = new MeineFlüchtlingeSehen_ScrollableJTable();

    }
}
