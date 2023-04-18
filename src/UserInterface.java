import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.WindowConstants;



class UserInterface {
public class UserInterface {

    char icon_A010;
    char text_A010;
    String[] Sting_A010;
    char icon_A020;
    char text_A020;
    String[] Sting_A020;
    char icon_A030;
    char text_A030;
    String[] Sting_A030;
    char icon_A040;
    char text_A040;
    String[] Sting_A410;
    char icon_R111;
    char text_R111;
    String[] Sting_R111;
    char icon_R121;
    char text_R121;
    String[] Sting_R121;
    char icon_R131;
    char text_R131;
    String[] Sting_R131;
    char icon_R141;
    char text_R141;
    String[] Sting_R141;
    char icon_R151;
    char text_R151;
    String[] Sting_R151;
    char icon_R211;
    char text_R211;
    String[] Sting_R211;
    char icon_R221;
    char text_R221;
    String[] Sting_R221;
    char icon_R231;
    char text_R231;
    String[] Sting_R231;
    char icon_R241;
    char text_R241;
    String[] Sting_R241;
    char icon_R251;
    char text_R251;
    String[] Sting_R251;
    char icon_R112;
    char text_R112;
    String[] Sting_R112;
    char icon_R122;
    char text_R122;
    String[] Sting_R122;
    char icon_R132;
    char text_R132;
    String[] Sting_R132;
    char icon_R142;
    char text_R142;
    String[] Sting_R142;
    char icon_R152;
    char text_R152;
    String[] Sting_R152;
    char icon_R212;
    char text_R212;
    String[] Sting_R212;
    char icon_R222;
    char text_R222;
    String[] Sting_R222;
    char icon_R232;
    char text_R232;
    String[] Sting_R232;
    char icon_R242;
    char text_R242;
    String[] Sting_R242;
    char icon_R252;
    char text_R252;
    String[] Sting_R252;

    // Anfang Attribute
    private JButton Feld1 = new JButton();
    private ImageIcon Feld1Icon = new ImageIcon(getClass().getResource(Icon_R151));
    private JButton jButton2 = new JButton();
    private ImageIcon jButton2Icon = new ImageIcon(getClass().getResource(Icon_R141));
    private JButton jButton3 = new JButton();
    private ImageIcon jButton3Icon = new ImageIcon(getClass().getResource(Icon_R131));
    private JButton jButton4 = new JButton();
    private ImageIcon jButton4Icon = new ImageIcon(getClass().getResource(Icon_R121));
    private JButton jButton5 = new JButton();
    private ImageIcon jButton5Icon = new ImageIcon(getClass().getResource(Icon_R111));
    private JButton jButton6 = new JButton();
    private ImageIcon jButton6Icon = new ImageIcon(getClass().getResource(Icon_R21));
    private JButton jButton7 = new JButton();
    private ImageIcon jButton7Icon = new ImageIcon(getClass().getResource(Icon_R241));
    private JButton jButton8 = new JButton();
    private ImageIcon jButton8Icon = new ImageIcon(getClass().getResource(Icon_R231));
    private JButton jButton9 = new JButton();
    private ImageIcon jButton9Icon = new ImageIcon(getClass().getResource(Icon_R221));
    private JButton jButton10 = new JButton();
    private ImageIcon jButton1Icon = new ImageIcon(getClass().getResource("images/1442941.png"));
    private ImageIcon jButton10Icon = new ImageIcon(getClass().getResource(Icon_R211));
    private JButton jButton11 = new JButton();
    private ImageIcon jButton11Icon = new ImageIcon(getClass().getResource(Icon_R152));
    private JButton jButton12 = new JButton();
    private ImageIcon jButton12Icon = new ImageIcon(getClass().getResource(Icon_R142));
    private JButton jButton13 = new JButton();
    private ImageIcon jButton13Icon = new ImageIcon(getClass().getResource(Icon_R132));
    private JButton jButton14 = new JButton();
    private ImageIcon jButton14Icon = new ImageIcon(getClass().getResource(Icon_R122));
    private JButton jButton15 = new JButton();
    private ImageIcon jButton15Icon = new ImageIcon(getClass().getResource(Icon_R112));
    private JButton jButton16 = new JButton();
    private ImageIcon jButton16Icon = new ImageIcon(getClass().getResource(Icon_R252));
    private JButton jButton17 = new JButton();
    private ImageIcon jButton17Icon = new ImageIcon(getClass().getResource(Icon_R242));
    private JButton jButton18 = new JButton();
    private ImageIcon jButton18Icon = new ImageIcon(getClass().getResource(Icon_R232));
    private JButton jButton19 = new JButton();
    private ImageIcon jButton19Icon = new ImageIcon(getClass().getResource(Icon_R222));
    private JButton jButton20 = new JButton();
    private ImageIcon jButton20Icon = new ImageIcon(getClass().getResource(Icon_R212));
    private JLabel lDieRegale = new JLabel();
    private JButton jButton26 = new JButton();
    private ImageIcon jButton26Icon = new ImageIcon(getClass().getResource(Icon_A003));
    private JButton jButton27 = new JButton();
    private ImageIcon jButton27Icon = new ImageIcon(getClass().getResource(Icon_A004));
    private JButton jButton31 = new JButton();
    private ImageIcon jButton31Icon = new ImageIcon(getClass().getResource("images/Download.png"));
    private JTextField tfTfGeld_Stand = new JTextField();
    private JButton jButton32 = new JButton();
    private ImageIcon jButton32Icon = new ImageIcon(getClass().getResource("images/communityIcon_1xze9c84ru571.png"));
    private JButton jButton25 = new JButton();
    private JButton jButton28 = new JButton();
    private JButton jButton29 = new JButton();
    private JLabel lVerschrotten = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton33 = new JButton();
    private ImageIcon jButton33Icon = new ImageIcon(getClass().getResource("images/1442941.png"));
    private JButton jButton34 = new JButton();
    private ImageIcon jButton34Icon = new ImageIcon(getClass().getResource("images/1442941.png"));
    private JButton jButton35 = new JButton();
    private ImageIcon jButton35Icon = new ImageIcon(getClass().getResource("images/1442941.png"));
    // Ende Attribute

    public class UI() {
        // Frame-Initialisierung
        super();
        framesetDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int frameWidth = 1200;
        int frameHeight = 780;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("UI");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten

        Feld1.setBounds(50, 45, 147, 65);
        Feld1.setText(Text_1);
        Feld1.setMargin(new Insets(2, 2, 2, 2));
        Feld1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Feld1_ActionPerformed(evt);
            }
        });
        Feld1.setBackground(new Color(0x404040));
        Feld1.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        Feld1.setIcon(Feld1Icon);
        cp.add(Feld1);
        cp.setBackground(new Color(0x404040));
        jButton2.setBounds(50, 108, 147, 65);
        jButton2.setText(Text_2);
        jButton2.setMargin(new Insets(2, 2, 2, 2));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2_ActionPerformed(evt);
            }
        });
        jButton2.setBackground(new Color(0x404040));
        jButton2.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        cp.add(jButton2);
        jButton3.setBounds(50, 171, 147, 65);
        jButton3.setText(Text_3);
        jButton3.setMargin(new Insets(2, 2, 2, 2));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3_ActionPerformed(evt);
            }
        });
        jButton3.setBackground(new Color(0x404040));
        jButton3.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        cp.add(jButton3);
        jButton4.setBounds(50, 234, 147, 65);
        jButton4.setText(Text_4);
        jButton4.setMargin(new Insets(2, 2, 2, 2));
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4_ActionPerformed(evt);
            }
        });
        jButton4.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        jButton4.setBackground(new Color(0x404040));
        cp.add(jButton4);
        jButton5.setBounds(50, 297, 147, 65);
        jButton5.setText(Text_5);
        jButton5.setMargin(new Insets(2, 2, 2, 2));
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5_ActionPerformed(evt);
            }
        });
        jButton5.setBackground(new Color(0x404040));


        jButton5.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        cp.add(jButton5);
        jButton6.setBounds(197, 45, 147, 65);
        jButton7.setBounds(197, 108, 147, 65);
        jButton8.setBounds(197, 171, 147, 65);
        jButton9.setBounds(197, 234, 147, 65);
        jButton10.setBounds(197, 297, 147, 65);
        jButton6.setText(Text_6);
        jButton6.setMargin(new Insets(2, 2, 2, 2));
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6_ActionPerformed(evt);
            }
        });
        jButton6.setBackground(new Color(0x404040));


        jButton6.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        cp.add(jButton6);
        jButton7.setText(Text_1);
        jButton7.setMargin(new Insets(2, 2, 2, 2));
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7_ActionPerformed(evt);
            }
        });
        jButton7.setBackground(new Color(0x404040));


        jButton7.setBorderPainted(false);
        jButton7.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        cp.add(jButton7);
        jButton8.setText(Text_8);
        jButton8.setMargin(new Insets(2, 2, 2, 2));
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8_ActionPerformed(evt);
            }
        });
        jButton8.setBackground(new Color(0x404040));


        jButton8.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        cp.add(jButton8);
        jButton9.setText(Text_9);
        jButton9.setMargin(new Insets(2, 2, 2, 2));
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9_ActionPerformed(evt);
            }
        });
        jButton9.setBackground(new Color(0x404040));


        jButton9.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        cp.add(jButton9);
        jButton10.setText(Text_10);
        jButton10.setMargin(new Insets(2, 2, 2, 2));
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10_ActionPerformed(evt);
            }
        });
        jButton10.setBackground(new Color(0x404040));


        jButton10.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        cp.add(jButton10);

        jButton11.setBounds(414, 45, 147, 65);
        jButton12.setBounds(414, 108, 147, 65);
        jButton13.setBounds(414, 171, 147, 65);
        jButton14.setBounds(414, 234, 147, 65);
        jButton15.setBounds(414, 297, 147, 65);
        jButton16.setBounds(561, 45, 147, 65);
        jButton17.setBounds(561, 108, 147, 65);
        jButton18.setBounds(561, 171, 147, 65);
        jButton19.setBounds(561, 234, 147, 65);
        jButton20.setBounds(561, 297, 147, 65);
        jButton11.setText(Text_11);
        jButton11.setMargin(new Insets(2, 2, 2, 2));
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11_ActionPerformed(evt);
            }
        });
        cp.add(jButton11);
        jButton12.setText(Text_12);
        jButton12.setMargin(new Insets(2, 2, 2, 2));
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton12_ActionPerformed(evt);
            }
        });
        cp.add(jButton12);
        jButton13.setText(Text_13);
        jButton13.setMargin(new Insets(2, 2, 2, 2));
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton13_ActionPerformed(evt);
            }
        });
        cp.add(jButton13);
        jButton14.setText(Text_14);
        jButton14.setMargin(new Insets(2, 2, 2, 2));
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton14_ActionPerformed(evt);
            }
        });
        cp.add(jButton14);
        jButton15.setText(Text_15);
        jButton15.setMargin(new Insets(2, 2, 2, 2));
        jButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton15_ActionPerformed(evt);
            }
        });
        cp.add(jButton15);
        jButton16.setText(Text_16);
        jButton16.setMargin(new Insets(2, 2, 2, 2));
        jButton16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton16_ActionPerformed(evt);
            }
        });
        jButton16.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
        cp.add(jButton16);
        jButton17.setText(Text_17);
        jButton17.setMargin(new Insets(2, 2, 2, 2));
        jButton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton17_ActionPerformed(evt);
            }
        });
        cp.add(jButton17);
        jButton18.setText(Text_18);
        jButton18.setMargin(new Insets(2, 2, 2, 2));
        jButton18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton18_ActionPerformed(evt);
            }
        });
        cp.add(jButton18);
        jButton19.setText(Text_19);
        jButton19.setMargin(new Insets(2, 2, 2, 2));
        jButton19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton19_ActionPerformed(evt);
            }
        });
        cp.add(jButton19);
        jButton20.setText(Text_20);
        jButton20.setMargin(new Insets(2, 2, 2, 2));
        jButton20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton20_ActionPerformed(evt);
            }
        });
        cp.add(jButton20);
        lDieRegale.setBounds(49, 14, 654, 20);
        lDieRegale.setText("Die Regale");
        lDieRegale.setCursor(new Cursor(Cursor.W_RESIZE_CURSOR));
        cp.add(lDieRegale);
        public void actionPerformed(ActionEvent evt) {
            jButton26_ActionPerformed(evt);
        }
    });
    public void actionPerformed(ActionEvent evt) {
        jButton27_ActionPerformed(evt);
    }
};
public void actionPerformed(ActionEvent evt) {
        jButton28_ActionPerformed(evt);
        }
        };
public void actionPerformed(ActionEvent evt) {
        jButton29_ActionPerformed(evt);
        };
        jButton26.setBounds(120, 590, 395, 57);
        jButton27.setBounds(120, 646, 395, 57);
        jButton26.setText(Text_A3);
        jButton26.setMargin(new Insets(2, 2, 2, 2));
        jButton26.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton26_ActionPerformed(evt);
        }
        });
        jButton26.setIcon(jButton26Icon);
        cp.add(jButton26);
        jButton27.setText(Text_A4);
        jButton27.setMargin(new Insets(2, 2, 2, 2));
        jButton27.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton27_ActionPerformed(evt);
        }
        });
        jButton27.setIcon(jButton27Icon);
        cp.add(jButton27);
public void actionPerformed(ActionEvent evt) {
        jButton28_ActionPerformed(evt);
        }
        });
public void actionPerformed(ActionEvent evt) {
        jButton29_ActionPerformed(evt);
        }
        });
        Autfrag1.setBounds(120, 478, 395, 57);
        Auftrag2.setBounds(120, 534, 395, 57);
        jButton24.setBounds(512, 478, 67, 57);
public void actionPerformed(ActionEvent evt) {
        jButton30_ActionPerformed(evt);
        }
        });
        jButton31.setBounds(894, 168, 75, 73);
        jButton31.setText("");
        jButton31.setMargin(new Insets(2, 2, 2, 2));
        jButton31.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton31_ActionPerformed(evt);
        }
        });
        tfTfGeld_Stand.setBounds(775, 569, 166, 20);
        jButton32.setBounds(942, 568, 64, 64);
        jButton32.setText("");
        jButton32.setMargin(new Insets(2, 2, 2, 2));
        jButton32.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton32_ActionPerformed(evt);
        }
        });
        jButton32.setIcon(jButton32Icon);
        cp.add(jButton32);
        jButton24.setIcon(jButton24Icon);
        jButton24.setText("");
        jButton25.setBounds(512, 534, 67, 57);
        jButton25.setText("");
        jButton25.setMargin(new Insets(2, 2, 2, 2));
        jButton25.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton25_ActionPerformed(evt);
        }
        });
        cp.add(jButton25);
        jButton28.setBounds(512, 590, 67, 57);
        jButton29.setBounds(512, 646, 67, 57);
        jButton28.setText("");
        jButton28.setMargin(new Insets(2, 2, 2, 2));
        jButton28.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton28_ActionPerformed(evt);
        }
        });
        cp.add(jButton28);
        jButton29.setText("");
        jButton29.setMargin(new Insets(2, 2, 2, 2));
        jButton29.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton29_ActionPerformed(evt);
        }
        });
        cp.add(jButton29);
        jButton31.setIcon(jButton31Icon);
        lVerschrotten.setBounds(978, 190, 110, 20);
        lVerschrotten.setText("Verschrotten");
        lVerschrotten.setBackground(Color.RED);
        lVerschrotten.setOpaque(true);
        cp.add(lVerschrotten);
        Autfrag1.setText(Text_A1);
        Auftrag2.setText(Text_A2);
        Auftrag2.setIcon(Icon_A002);
        Autfrag1.setIcon(Icon_A001);
        tfTfGeld_Stand.setText(Geld_Stand);
        jButton1.setBounds(63, 478, 59, 57);
        jButton1.setText("");
        jButton1.setMargin(new Insets(2, 2, 2, 2));
        jButton1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton1_ActionPerformed(evt);
        }
        });
        jButton1.setIcon(jButton1Icon);
        cp.add(jButton1);
        jButton33.setBounds(63, 534, 59, 57);
        jButton33.setText("");
        jButton33.setMargin(new Insets(2, 2, 2, 2));
        jButton33.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton33_ActionPerformed(evt);
        }
        });
        jButton33.setIcon(jButton33Icon);
        cp.add(jButton33);
        jButton34.setBounds(63, 590, 59, 57);
        jButton35.setBounds(63, 646, 59, 57);
        jButton34.setText("");
        jButton34.setMargin(new Insets(2, 2, 2, 2));
        jButton34.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton34_ActionPerformed(evt);
        }
        });
        jButton34.setIcon(jButton34Icon);
        cp.add(jButton34);
        jButton35.setText("");
        jButton35.setMargin(new Insets(2, 2, 2, 2));
        jButton35.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        jButton35_ActionPerformed(evt);
        }
        });
        jButton35.setIcon(jButton35Icon);
        jButton35.setToolTipText("");
        cp.add(jButton35);
        jButton24.addChangeListener(new ChangeListener() {
public void stateChanged(ChangeEvent evt) {
        jButton24_StateChanged(evt);
        }
        });
        Autfrag1.addChangeListener(new ChangeListener() {
public void stateChanged(ChangeEvent evt) {
        Autfrag1_StateChanged(evt);
        }
        });
        Auftrag2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
        Auftrag2_ActionPerformed(evt);
        }
        });
        // Ende Komponenten

        setVisible(true);
        } // end of public UI

// Anfang Methoden

public static void UI(String[] args) {
        new UI();
        } // end of main

public void Feld1_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 5;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 5;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of Feld1_ActionPerformed

public void jButton2_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 4;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 4;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton2_ActionPerformed

public void jButton3_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 3;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 3;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton3_ActionPerformed

public void jButton4_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 2;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 2;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton4_ActionPerformed

public void jButton5_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 1;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 1;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton5_ActionPerformed

public void jButton6_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 5;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 5;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton6_ActionPerformed

public void jButton7_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 4;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 4;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton7_ActionPerformed

public void jButton8_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 3;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 3;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton8_ActionPerformed

public void jButton9_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 2;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 2;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton9_ActionPerformed

public void jButton10_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 1;
        Feld_z1 = 1;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 1;
        Feld_z2 = 1;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton10_ActionPerformed

public void jButton11_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 5;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 5;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton11_ActionPerformed

public void jButton12_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 4;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 4;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton12_ActionPerformed

public void jButton13_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 3;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 3;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton13_ActionPerformed

public void jButton14_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 2;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 2;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton14_ActionPerformed

public void jButton15_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 1;
        Feld_y1 = 1;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 1;
        Feld_y2 = 1;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton15_ActionPerformed

public void jButton16_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 5;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 5;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton16_ActionPerformed

public void jButton17_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 4;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 4;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton17_ActionPerformed

public void jButton18_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 3;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 3;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton18_ActionPerformed

public void jButton19_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 2;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 2;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton19_ActionPerformed

public void jButton20_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 2;
        Feld_y1 = 1;
        Feld_z1 = 2;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 2;
        Feld_y2 = 1;
        Feld_z2 = 2;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton20_ActionPerformed

public void jButton26_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        if (Pos_1 = ""){
        Feld_x1 = 0;
        Feld_y1 = 3;
        Feld_z1 = 0;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 0;
        Feld_y2 = 3;
        Feld_z2 = 0;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton26_ActionPerformed

public void jButton27_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 0;
        Feld_y1 = 4;
        Feld_z1 = 0;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 0;
        Feld_y2 = 4;
        Feld_z2 = 0;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of jButton27_ActionPerformed

public void jButton28_ActionPerformed(ActionEvent evt) {
        Geld_Stand = Geld_Stand - String_A3[6];
        Icon_A003 = "";
        Text_A3 = "";
        if Geld_Stand <= 0{
        system.out.print("Du hast verlohren")
        }
        } // end of jButton28_ActionPerformed

public void jButton29_ActionPerformed(ActionEvent evt) {
        Geld_Stand = Geld_Stand - String_A4[6];
        Icon_A004 = "";
        Text_A4 = "";
        if Geld_Stand <= 0{
        system.out.print("Du hast verlohren")
        }
        } // end of jButton29_ActionPerformed


public void jButton31_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Feld_y1 != 1 && icon_Pos_1 != "") {
        System.out.println("nur gegenst�nde auf der untersten Ebene K�nnen verschrottet werden.")
        }else {
        concet("icon_R" Feld_x1 Feld_y1 Feld_z1) = "";
        concet("text_R" Feld_x1 Feld_y1 Feld_z1) = "";
        concet("String_R" Feld_x1 Feld_y1 Feld_z1) = "";
        Geld_Stand = Geld_Stand - 300;
        }

        } // end of jButton31_ActionPerformed

public void jButton32_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        Bilanz();
        } // end of jButton32_ActionPerformed

public void jButton25_ActionPerformed(ActionEvent evt) {
        Geld_Stand = Geld_Stand - String_A2[6];
        Icon_A002 = "";
        Text_A2 = "";
        if Geld_Stand <= 0{
        system.out.print("Du hast verlohren")
        }
        } // end of jButton25_ActionPerformed

public void jButton1_ActionPerformed(ActionEvent evt) {
        if Icon_A001 = "" {
        while j < 7 {
        String_A1[j] = Tabbelle[i][j];
        text_A1 = concet("Das" Tabbelle[i][2] "von" Tabbelle[i][3] "der Unterkatigorie von" Tabbelle[i][4] Tabbelle[i][5] "kann f�r" Tabbelle[i][6] "ausgef�hrt werden.");
        Icon_A001 = concet(Tabbelle[i][3]"_"Tabbelle[i][4]"_"Tabbelle[i][5]".png");
        }
        }
        } // end of jButton1_ActionPerformed

public void jButton33_ActionPerformed(ActionEvent evt) {
        if Icon_A002 = "" {
        while j < 7 {
        String_A2[j] = Tabbelle[i][j];
        text_A2 = concet("Das" Tabbelle[i][2] "von" Tabbelle[i][3] "der Unterkatigorie von" Tabbelle[i][4] Tabbelle[i][5] "kann f�r" Tabbelle[i][6] "ausgef�hrt werden.");
        Icon_A002 = concet(Tabbelle[i][3]"_"Tabbelle[i][4]"_"Tabbelle[i][5]".png");
        }
        }
        } // end of jButton33_ActionPerformed

public void jButton34_ActionPerformed(ActionEvent evt) {
        if Icon_A003 = "" {
        while j < 7 {
        String_A3[j] = Tabbelle[i][j];
        text_A3 = concet("Das" Tabbelle[i][2] "von" Tabbelle[i][3] "der Unterkatigorie von" Tabbelle[i][4] Tabbelle[i][5] "kann f�r" Tabbelle[i][6] "ausgef�hrt werden.");
        Icon_A003 = concet(Tabbelle[i][3]"_"Tabbelle[i][4]"_"Tabbelle[i][5]".png");
        }
        }
        } // end of jButton34_ActionPerformed

public void jButton35_ActionPerformed(ActionEvent evt) {
        if Icon_A004 = "" {
        while j < 7 {
        String_A4[j] = Tabbelle[i][j];
        text_A4 = concet("Das" Tabbelle[i][2] "von" Tabbelle[i][3] "der Unterkatigorie von" Tabbelle[i][4] Tabbelle[i][5] "kann f�r" Tabbelle[i][6] "ausgef�hrt werden.");
        Icon_A004 = concet(Tabbelle[i][3]"_"Tabbelle[i][4]"_"Tabbelle[i][5]".png");
        }
        }
        } // end of jButton35_ActionPerformed

public void jButton24_StateChanged(ChangeEvent evt) {
        Geld_Stand = Geld_Stand - String_A1[6];
        Icon_A001 = "";
        Text_A1 = "";
        if Geld_Stand <= 0{
        system.out.print("Du hast verlohren")
        }

        } // end of jButton24_StateChanged

public void Autfrag1_StateChanged(ChangeEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 0;
        Feld_y1 = 1;
        Feld_z1 = 0;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 0;
        Feld_y2 = 1;
        Feld_z2 = 0;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of Autfrag1_StateChanged

public void Auftrag2_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf�gen
        if (Pos_1 = ""){
        Feld_x1 = 0;
        Feld_y1 = 2;
        Feld_z1 = 0;
        text_Pos_1 = concet("text_A" Feld_x1 Feld_y1 Feld_z1);
        icon_Pos_1 =  concet("icon_A" Feld_x1 Feld_y1 Feld_z1);
        String_Pos_1 =  concet("Sting_A" Feld_x1 Feld_y1 Feld_z1);
        Flag_io_1 = "x";
        } else {
        Feld_x2 = 0;
        Feld_y2 = 2;
        Feld_z2 = 0;
        Flag_io_2  = "x";
        text_Pos_1 = concet("text_A" Feld_x2 Feld_y2 Feld_z2);
        icon_Pos_1 =  concet("icon_A" Feld_x2 Feld_y2 Feld_z2);
        String_Pos_1 =  concet("Sting_A" Feld_x2 Feld_y2 Feld_z2);}
        Perform();
        } // end of Auftrag2_ActionPerformed

        // Ende Methoden
        } // end of class UI
        }