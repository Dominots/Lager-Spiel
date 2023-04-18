import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;



class Bilanz{
public static class Bilanz {
    // Anfang Attribute
    JTable BilazTab = new JTable(100, 4);
    private DefaultTableModel BilazTabModel = (DefaultTableModel) BilazTab.getModel();
    private JScrollPane BilazTabScrollPane = new JScrollPane(BilazTab);
    // Ende Attribute

    public Bilanz() {
        // Frame-Initialisierung
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 1200;
        int frameHeight = 780;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Bilanz");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten

        cp.setBackground(new Color(0x3F3F3F));
        BilazTabScrollPane.setBounds(31, 1, 1100, 780);
        BilazTab.getColumnModel().getColumn(0).setHeaderValue("Aufgabe");
        BilazTab.getColumnModel().getColumn(1).setHeaderValue("Verbuchung");
        BilazTab.getColumnModel().getColumn(2).setHeaderValue("Kontostand");
        BilazTab.getColumnModel().getColumn(3).setHeaderValue("Umsatz");
        cp.add(BilazTabScrollPane);
        // Ende Komponenten

        setVisible(true);
    } // end of public Bilanz

// Anfang Methoden
}}