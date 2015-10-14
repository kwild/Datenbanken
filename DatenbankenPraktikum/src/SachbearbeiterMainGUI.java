
 
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import java.sql.SQLException;

import javax.swing.*;
 
 
public class SachbearbeiterMainGUI extends JFrame{
    private JButton FluechtlingAnlegen;
    private JButton HelferAnlegen;
    private JButton SachbearbeiterAnlegen;
    private JButton UnterkunftAnlegen;
    private JButton MeineFluechtlingeSehen;
    private JButton AngeboteAnzeigen;
 
    private JLabel Ueberschrift;
     
    private JPanel buttonGroup;
 
    public SachbearbeiterMainGUI() {
        super("Fluechtling anlegen");
        //setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        this.setLayout(new BorderLayout(0,5));
 
        FluechtlingAnlegen = new JButton("Neuen Fluechtling Anlegen");
        HelferAnlegen = new JButton("Neuen Helfer Anlegen");
        SachbearbeiterAnlegen = new JButton("Neuen Sachbearbeiter Anlegen");
        UnterkunftAnlegen = new JButton("Neue Unterkunft Anlegen");
        MeineFluechtlingeSehen = new JButton("Meine Fluechtlinge Sehen");
        AngeboteAnzeigen = new JButton("Alle Angebote Anzeigen");
        
         
 
        // Listener f�r Buttons
        FluechtlingAnlegen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
            	new FluechtlingAnlegen().main();
                 
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
        MeineFluechtlingeSehen.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                /*SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        ScrollableJTable.showFrame();
                    }
                });*/
                new MeineFluechtlingeSehen_ScrollableJTable();
                 
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
        Ueberschrift = new JLabel("Neuen Fl�chtling anlegen: ");
 
        // Label zentrieren
        Ueberschrift.setHorizontalAlignment(JLabel.CENTER);
 
 
        getContentPane().add(BorderLayout.PAGE_START, Ueberschrift);
         
         
        buttonGroup = new JPanel(new GridLayout(4,1));
        buttonGroup.add(FluechtlingAnlegen);
        buttonGroup.add(HelferAnlegen);
        buttonGroup.add(SachbearbeiterAnlegen);
        buttonGroup.add(UnterkunftAnlegen);
        buttonGroup.add(MeineFluechtlingeSehen);
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
