
 
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import java.sql.SQLException;

import javax.swing.*;
 
 
public class SachbearbeiterMainGUI extends JFrame{
    private JButton FlüchtlingAnlegen;
    private JButton HelferAnlegen;
    private JButton SachbearbeiterAnlegen;
    private JButton UnterkunftAnlegen;
    private JButton MeineFlüchtlingeSehen;
    private JButton AngeboteAnzeigen;
 
    private JLabel Überschrift;
     
    private JPanel buttonGroup;
 
    public SachbearbeiterMainGUI() {
        super("Flüchtling anlegen");
        //setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        this.setLayout(new BorderLayout(0,5));
 
        FlüchtlingAnlegen = new JButton("Neuen Flüchtling Anlegen");
        HelferAnlegen = new JButton("Neuen Helfer Anlegen");
        SachbearbeiterAnlegen = new JButton("Neuen Sachbearbeiter Anlegen");
        UnterkunftAnlegen = new JButton("Neue Unterkunft Anlegen");
        MeineFlüchtlingeSehen = new JButton("Meine Flüchtlinge Sehen");
        AngeboteAnzeigen = new JButton("Alle Angebote Anzeigen");
        
         
 
        // Listener für Buttons
        FlüchtlingAnlegen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                 
            }   
        });
        HelferAnlegen.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
        });
        SachbearbeiterAnlegen.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sachbearbeiter Anlegen"); 
                 
            }
             
        });
        UnterkunftAnlegen.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
        });
        MeineFlüchtlingeSehen.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                /*SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        ScrollableJTable.showFrame();
                    }
                });*/
                new MeineFlüchtlingeSehen_ScrollableJTable();
                 
            }
             
        });
        AngeboteAnzeigen.addActionListener(new ActionListener(){
        	@Override
            public void actionPerformed(ActionEvent e) {
                
                try {
					new AngeboteAnzeigen();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                 
            }
        });
         
        // Labels erzeugen
        Überschrift = new JLabel("Neuen Flüchtling anlegen: ");
 
        // Label zentrieren
        Überschrift.setHorizontalAlignment(JLabel.CENTER);
 
 
        getContentPane().add(BorderLayout.PAGE_START, Überschrift);
         
         
        buttonGroup = new JPanel(new GridLayout(4,1));
         
        buttonGroup.add(HelferAnlegen);
        buttonGroup.add(SachbearbeiterAnlegen);
        buttonGroup.add(UnterkunftAnlegen);
        buttonGroup.add(MeineFlüchtlingeSehen);
        buttonGroup.add(AngeboteAnzeigen);
 
        getContentPane().add(BorderLayout.CENTER, buttonGroup);
         
        pack();
         
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
 
    }
 
    public static void main(String[] args) {
        SachbearbeiterMainGUI bl = new SachbearbeiterMainGUI();
        bl.setVisible(true);
    }
 
}
