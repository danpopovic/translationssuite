/*
 * To change thi            @Override
            public boolean accept(File f) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getDescription() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }   @Override
    public boolean accept(File f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
s license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpack;

import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author flori
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public String sourceTree;

    public MainFrame() {
        initComponents();
        //Der Tabelle jTable1 ein neues leeres Model zuweisen
        jTable_tab_start.setModel(new DefaultTableModel(new String[]{"Zeilenummer", "id", "Übersetzung"}, 0));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo-hd.png")));

        jFrame_ST.setVisible(false);
        jTabbedPane.setTitleAt(0, "*neu");
        jTabbedPane.setTitleAt(1, "Vergleich");
        jTabbedPane.setEnabledAt(jTabbedPane.indexOfTab("Vergleich"), false);
        
        File st_new = new File("ST.txt");

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(st_new));
            sourceTree = (String) ois.readObject();
            jMenuItem_autosuche.setEnabled(true);

        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jButton_ST_abbr = new javax.swing.JButton();
        jFrame_autosuche = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_translations = new javax.swing.JComboBox<>();
        jButton_autosuche_ok = new javax.swing.JButton();
        jFrame_ST = new javax.swing.JFrame();
        jButton_ST_ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_ST_pfad = new javax.swing.JTextField();
        jCheckBox_STbeibehalten = new javax.swing.JCheckBox();
        jTabbedPane = new javax.swing.JTabbedPane();
        jScrollPane_TabellenTab1 = new javax.swing.JScrollPane();
        jTable_tab_start = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_vgl_translation = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_Vergleichskriterien = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_datei = new javax.swing.JMenu();
        jMenuItem_oeffnen = new javax.swing.JMenuItem();
        jMenuItem_autosuche = new javax.swing.JMenuItem();
        jMenu_menue = new javax.swing.JMenu();
        jMenuItem_vgD = new javax.swing.JMenuItem();
        jMenuItem_vgDST = new javax.swing.JMenuItem();
        jMenu_extras = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogTitle("Übersetzung öffnen");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Übersetzungen (.po,.ts)", "ts","po")
        );
        fileChooser.setToolTipText("");

        jButton_ST_abbr.setText("Abbrechen");
        jButton_ST_abbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ST_abbrActionPerformed(evt);
            }
        });

        jFrame_autosuche.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFrame_autosuche.setResizable(false);

        jLabel2.setText("Folgende Übersetzungen wurden gefunden:");

        jComboBox_translations.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton_autosuche_ok.setText("Übersetzung öffnen!");
        jButton_autosuche_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_autosuche_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame_autosucheLayout = new javax.swing.GroupLayout(jFrame_autosuche.getContentPane());
        jFrame_autosuche.getContentPane().setLayout(jFrame_autosucheLayout);
        jFrame_autosucheLayout.setHorizontalGroup(
            jFrame_autosucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame_autosucheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame_autosucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame_autosucheLayout.createSequentialGroup()
                        .addGroup(jFrame_autosucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_autosuche_ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jComboBox_translations, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jFrame_autosucheLayout.setVerticalGroup(
            jFrame_autosucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame_autosucheLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_translations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_autosuche_ok)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jFrame_ST.setResizable(false);
        jFrame_ST.setSize(new java.awt.Dimension(230, 100));
        jFrame_ST.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame_STWindowOpened(evt);
            }
        });

        jButton_ST_ok.setText("OK");
        jButton_ST_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ST_okActionPerformed(evt);
            }
        });

        jLabel3.setText("Bitte geben sie den Source Tree ein:");

        jTextField_ST_pfad.setName("jTextfield_ST"); // NOI18N

        jCheckBox_STbeibehalten.setText("Für nächsten Programmstart abspeichern");
        jCheckBox_STbeibehalten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_STbeibehaltenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame_STLayout = new javax.swing.GroupLayout(jFrame_ST.getContentPane());
        jFrame_ST.getContentPane().setLayout(jFrame_STLayout);
        jFrame_STLayout.setHorizontalGroup(
            jFrame_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame_STLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_ST_ok)
                    .addComponent(jCheckBox_STbeibehalten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_ST_pfad)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame_STLayout.setVerticalGroup(
            jFrame_STLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame_STLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_ST_pfad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_STbeibehalten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton_ST_ok))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ETA Translation Suite");
        setIconImages(null);

        jTable_tab_start.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane_TabellenTab1.setViewportView(jTable_tab_start);

        jTabbedPane.addTab("tab1", jScrollPane_TabellenTab1);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(400, 400));

        jTable_vgl_translation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable_vgl_translation);

        jLabel1.setText("Verlgleichskriterium");

        jComboBox_Vergleichskriterien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Änderungen herrvorheben", "Fehlende Keys"}));
        jComboBox_Vergleichskriterien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_VergleichskriterienItemStateChanged(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("mit");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Vergleichskriterien, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_Vergleichskriterien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jDesktopPane1);

        jTabbedPane.addTab("tab2", jScrollPane1);

        jMenu_datei.setText("Datei");

        jMenuItem_oeffnen.setText("Übersetzung öffnen");
        jMenuItem_oeffnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_oeffnenActionPerformed(evt);
            }
        });
        jMenu_datei.add(jMenuItem_oeffnen);

        jMenuItem_autosuche.setText("Autosuchen");
        jMenuItem_autosuche.setEnabled(false);
        jMenuItem_autosuche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_autosucheActionPerformed(evt);
            }
        });
        jMenu_datei.add(jMenuItem_autosuche);

        jMenuBar1.add(jMenu_datei);

        jMenu_menue.setText("Menü");

        jMenuItem_vgD.setText("Vergleiche mit Datei");
        jMenuItem_vgD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_vgDActionPerformed(evt);
            }
        });
        jMenu_menue.add(jMenuItem_vgD);

        jMenuItem_vgDST.setText("Vergleiche mit Datei aus Source Tree");
        jMenuItem_vgDST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_vgDSTActionPerformed(evt);
            }
        });
        jMenu_menue.add(jMenuItem_vgDST);

        jMenuBar1.add(jMenu_menue);

        jMenu_extras.setText("Extras");

        jMenuItem2.setText("Source Tree");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_extras.add(jMenuItem2);

        jMenuBar1.add(jMenu_extras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private String manuelleSuche(JTable table) {
        // In dieser Methode wird eine Übersetzungdatei geöffnet, ausgelesen und in die Tabelle jTable1 eingefügt.
        String dateiname="";
        
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            BufferedReader br;
            
            File uebersetzung = fileChooser.getSelectedFile();
            dateiname=uebersetzung.getName();
            
            if (uebersetzung.getAbsolutePath().endsWith(".po")) {
                table.setModel(new DefaultTableModel(new String[]{"Zeilenummer", "id", "Übersetzung"}, 0));

                try {
                    br = new BufferedReader(new FileReader(uebersetzung));
                    int rowcount = 1;

                    while (true) {

                        String s = br.readLine();

                        //String s ist der eingelesene Zeile aus dem selektierten
                        // .po Files, in der folgende if Anwesiung wird geprüft ob
                        // der Strings das Kürzel msid enthält, wenn des stimmt
                        // wird überprüft ob die folgende Zeile des Kürzel msgstr enthält.
                        // Wenn das wieder Stimmt dann wird der String s und der
                        // String next in der jTable1 hinzugefügt
                        if (s != null) {
                            rowcount++;
                            if (s.contains("msgid")) {
                                String next = br.readLine();

                                if (next != null && next.contains("msgstr")) {

                                    s = s.substring(7, s.length() - 1);
                                    next = next.substring(8, next.length() - 1);
                                    ((DefaultTableModel) table.getModel()).addRow(new String[]{Integer.toString(rowcount - 1) + "-" + Integer.toString(rowcount), s, next});
                                }
                            }
                        } else {
                            break;
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (uebersetzung.getAbsolutePath().endsWith(".ts")) {

                table.setModel(new DefaultTableModel(new String[]{"zeilennummer", "filename", "Quelle", "Übersetzung"}, 0));

                try {
                    String pfad = uebersetzung.getAbsolutePath();
                    System.out.println(pfad);
                    Document tsfile = new SAXBuilder().build(pfad);
                    Element ts = tsfile.getRootElement();
                    Element context = ts.getChild("context");
                    List<Element> messages = context.getChildren("message");
                    for (Element e : messages) {
                        ((DefaultTableModel) table.getModel()).addRow(new String[]{
                            e.getChild("location").getAttributeValue("line"),
                            e.getChild("location").getAttributeValue("filename"),
                            e.getChildText("source"),
                            e.getChildText("translation")

                        });
                    }

                } catch (JDOMException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return  dateiname;
    }

    private String autosuche(JTable table) {
        // Hier werden die Übersetzungen in die Table geladen
                jFrame_autosuche.setVisible(true);

        DefaultComboBoxModel<String> uebersetzungen = (DefaultComboBoxModel) jComboBox_translations.getModel();
        String dateiname="";
        
        if (uebersetzungen.getSize() > 0) {
            BufferedReader br;
            File cFile = new File(sourceTree + "//" + uebersetzungen.getSelectedItem());
            dateiname=cFile.getName();
            
            if (cFile.getAbsolutePath().endsWith(".po")) {
                table.setModel(new DefaultTableModel(new String[]{"Zeilenummer", "id", "Übersetzung"}, 0));
                try {
                    br = new BufferedReader(new FileReader(cFile));
                    int rowcount = 1;

                    while (true) {

                        String s = br.readLine();

                        //String s ist der eingelesene Zeile aus dem selektierten
                        // .po Files, in der folgende if Anwesiung wird geprüft ob
                        // der Strings das Kürzel msid enthält, wenn des stimmt
                        // wird überprüft ob die folgende Zeile des Kürzel msgstr enthält.
                        // Wenn das wieder Stimmt dann wird der String s und der
                        // String next in der jTable1 hinzugefügt
                        if (s != null) {
                            rowcount++;
                            if (s.contains("msgid")) {
                                String next = br.readLine();

                                if (next != null && next.contains("msgstr")) {

                                    s = s.substring(7, s.length() - 1);
                                    next = next.substring(8, next.length() - 1);
                                    ((DefaultTableModel) table.getModel()).addRow(new String[]{Integer.toString(rowcount - 1) + "-" + Integer.toString(rowcount), s, next});
                                }
                            }
                        } else {
                            break;
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (cFile.getAbsolutePath().endsWith(".ts")) {

                table.setModel(new DefaultTableModel(new String[]{"zeilennummer", "filename", "Quelle", "Übersetzung"}, 0));

                try {
                    String pfad = cFile.getAbsolutePath();
                    System.out.println(pfad);
                    Document tsfile = new SAXBuilder().build(pfad);
                    Element ts = tsfile.getRootElement();
                    Element context = ts.getChild("context");
                    List<Element> messages = context.getChildren("message");
                    for (Element e : messages) {
                        ((DefaultTableModel) table.getModel()).addRow(new String[]{
                            e.getChild("location").getAttributeValue("line"),
                            e.getChild("location").getAttributeValue("filename"),
                            e.getChildText("source"),
                            e.getChildText("translation")

                        });
                    }

                } catch (JDOMException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        jFrame_autosuche.setVisible(false);
        return dateiname;
    }


    private void jMenuItem_oeffnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_oeffnenActionPerformed
        String dateiname=manuelleSuche(jTable_tab_start);
        
        if(!dateiname.isEmpty()){
            jTabbedPane.setTitleAt(0,dateiname);
        }
    }//GEN-LAST:event_jMenuItem_oeffnenActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //Wenn man auf den Menüeintrag Autosuchen klickt öffnet sich ein kleines Eingabefenster
        jFrame_ST.setVisible(true);
        jFrame_ST.setSize(320, 230);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton_ST_abbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ST_abbrActionPerformed
        // Wenn man abbrechen klickt wird der Source Tree nicht gespeichert 
        jFrame_ST.setVisible(false);
    }//GEN-LAST:event_jButton_ST_abbrActionPerformed

    private void jMenuItem_autosucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_autosucheActionPerformed
        searchST();
    }//GEN-LAST:event_jMenuItem_autosucheActionPerformed

    public void searchST(){
         // Hier wird im Source Tree nach Übersetzungen gesucht
        jFrame_autosuche.setSize(350, 121);
        jFrame_autosuche.setVisible(true); 
        jComboBox_translations.setModel(new DefaultComboBoxModel<String>());

        File sT = new File(sourceTree);
        String[] files = sT.list();

   
        for (String file : files) {
            if (file.endsWith(".po") || file.endsWith(".ts")) {
                ((DefaultComboBoxModel) jComboBox_translations.getModel()).addElement(file);
            }
        }

        if (((DefaultComboBoxModel) jComboBox_translations.getModel()).getSize() == 0) {
            jFrame_autosuche.setVisible(false);
            JOptionPane.showMessageDialog(rootPane, "Es wurden im Source Tree keine Übersetzungen gefunden", "Warnung", JOptionPane.WARNING_MESSAGE);

        }
    }
    
    private void jButton_autosuche_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_autosuche_okActionPerformed
        
        JTable t=new JTable();
        t.setModel(new DefaultTableModel(new String[]{"Zeilenummer", "id", "Übersetzung"}, 0));
        
        String dateiname=autosuche(t);
        System.out.println(t.getColumnCount());
        ScrollPane sp=new ScrollPane();
        sp.add(t);
        t.setFillsViewportHeight(true);
        if(!dateiname.isEmpty()){
            jTabbedPane.addTab(dateiname,sp);
        }
        
    }//GEN-LAST:event_jButton_autosuche_okActionPerformed

    private void jButton_ST_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ST_okActionPerformed
        // Wenn man OK klickt wird der Source Tree gespeichert
        //mithilfe des eingegeben Strings wird ein File ersellt
        //damit ist möglich zu überprüfen ob der sourctree existiert bzw.
        //nicht schreib/lesegeschützt ist
        sourceTree = jTextField_ST_pfad.getText();
        File f = new File(sourceTree);

        if (f.isDirectory() && f.exists() && f.canRead() && f.canWrite()) {
            jFrame_ST.setVisible(false);
            jMenuItem_autosuche.setEnabled(true);

        } else if (!f.isDirectory()) {
            JOptionPane.showMessageDialog(rootPane, "Source Tree ist keine Verzeichniss", "Eingabehler", JOptionPane.ERROR_MESSAGE);
            sourceTree = "";
            jTextField_ST_pfad.setText("");
        } else if (!f.exists()) {
            JOptionPane.showMessageDialog(rootPane, "Source Tree existiert nicht", "Eingabehler", JOptionPane.ERROR_MESSAGE);
            sourceTree = "";
            jTextField_ST_pfad.setText("");
        } else if (!f.canRead()) {
            JOptionPane.showMessageDialog(rootPane, "Source Tree ist lesegeschützt", "Eingabehler", JOptionPane.ERROR_MESSAGE);
            sourceTree = "";
            jTextField_ST_pfad.setText("");
              
        } else if (!f.canWrite()) {
            JOptionPane.showMessageDialog(rootPane, "Source Tree ist schreibgeschützt", "Eingabehler", JOptionPane.ERROR_MESSAGE);
            sourceTree = "";
            jTextField_ST_pfad.setText("");
             
        }

        if (jCheckBox_STbeibehalten.isEnabled()) {
            ObjectOutputStream oos;
            try {
                oos = new ObjectOutputStream(new FileOutputStream("ST.txt"));
                oos.writeObject(sourceTree);
                oos.flush();
                
              

            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            File st_alt = new File("ST.txt");
            st_alt.deleteOnExit();
        }

    }//GEN-LAST:event_jButton_ST_okActionPerformed

    private void jCheckBox_STbeibehaltenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_STbeibehaltenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_STbeibehaltenActionPerformed

    private void jFrame_STWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame_STWindowOpened
       


    }//GEN-LAST:event_jFrame_STWindowOpened

    private void jMenuItem_vgDSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_vgDSTActionPerformed
        searchST();
        jTabbedPane.setEnabledAt(jTabbedPane.indexOfTab("Vergleich"), true);
        
        
    }//GEN-LAST:event_jMenuItem_vgDSTActionPerformed

    private void jMenuItem_vgDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_vgDActionPerformed
        //Vergeich mit Datei die im Filechooser gewählt wurde
        JTable t=new JTable();
        t.setModel(new DefaultTableModel(new String[]{"Zeilenummer", "id", "Übersetzung"}, 0));
        t.setAutoCreateColumnsFromModel(true);
        
        String dateiname=manuelleSuche(t);
        ScrollPane sp=new ScrollPane();
        
        sp.add(t);
        
        if(!dateiname.isEmpty()){
            jTabbedPane.addTab(dateiname,sp);
            vergleiche(t,jTable_tab_start);
        }
        
        
    }//GEN-LAST:event_jMenuItem_vgDActionPerformed

    private void jComboBox_VergleichskriterienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_VergleichskriterienItemStateChanged
        String vglKrit=jComboBox_Vergleichskriterien.getSelectedItem().toString();
        
        switch(vglKrit){
            case "Fehlende Keys":
                vglKrtit1();
                break;
            case "Änderungen herrvorheben":
                vglKrtit2();
                break;
        }
        
    }//GEN-LAST:event_jComboBox_VergleichskriterienItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton_ST_abbr;
    private javax.swing.JButton jButton_ST_ok;
    private javax.swing.JButton jButton_autosuche_ok;
    private javax.swing.JCheckBox jCheckBox_STbeibehalten;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox_Vergleichskriterien;
    private javax.swing.JComboBox<String> jComboBox_translations;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame_ST;
    private javax.swing.JFrame jFrame_autosuche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem_autosuche;
    private javax.swing.JMenuItem jMenuItem_oeffnen;
    private javax.swing.JMenuItem jMenuItem_vgD;
    private javax.swing.JMenuItem jMenuItem_vgDST;
    private javax.swing.JMenu jMenu_datei;
    private javax.swing.JMenu jMenu_extras;
    private javax.swing.JMenu jMenu_menue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane_TabellenTab1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable_tab_start;
    private javax.swing.JTable jTable_vgl_translation;
    private javax.swing.JTextField jTextField_ST_pfad;
    // End of variables declaration//GEN-END:variables

    private void vergleiche(JTable t, JTable jTable_tab_start) {
      
       
    }

    private void vglKrtit1() {
        //Nach Fehlenden Keys suchen
    }

    private void vglKrtit2() {
        //Änderungen hervorheben
        
        
        
    }
}
