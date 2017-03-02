/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author flori
 */
public class Methoden {

    public static String wo_ist_dieser_key(tspoFile file, String key) {
        String zeilenummer = " ";

        DefaultTableModel model = (DefaultTableModel) file.getDaten().getModel();
        JTable table = file.getDaten();

        for (int i = 0; i < table.getRowCount(); i++) {
            if (file.po) {
                if (model.getValueAt(i, 2) == key) {
                    zeilenummer = (String) model.getValueAt(i, 0);
                } else if (model.getValueAt(i, 1) == key) {
                    zeilenummer = (String) model.getValueAt(i, 0);
                }
            } else if (file.ts) {
                if (model.getValueAt(i, 3) == key) {
                    zeilenummer = (String) model.getValueAt(i, 0);
                } else if (model.getValueAt(i, 2) == key) {
                    zeilenummer = (String) model.getValueAt(i, 0);
                }
            }

        }
        return zeilenummer;
    }

    public static void vergleiche(String sel_vgl_krit, JTable jTable_vgl_translation, LinkedList<tspoFile> tspofiles, JLabel jLabel5, String[] sel_files) {
        tspoFile file1 = new tspoFile();
        DefaultTableModel TabmodelFile1 = new DefaultTableModel();
        tspoFile file2 = new tspoFile();
        DefaultTableModel TabmodelFile2 = new DefaultTableModel();

        String keytab1 = "";
        String valuetab1 = "";
        String keytab2 = "";
        String valuetab2 = "";

        LinkedList<String> fKeys1 = new LinkedList<>();
        LinkedList<String> fKeys2 = new LinkedList<>();

        LinkedList<String> fValues1 = new LinkedList<>();
        LinkedList<String> fValues2 = new LinkedList<>();

        int count = 0;

        for (tspoFile file : tspofiles) {
            if (file.getFile_name().equals(sel_files[0])) {
                file1 = file;
                TabmodelFile1 = (DefaultTableModel) file1.getDaten().getModel();
            } else if (file.getFile_name().equals(sel_files[1])) {
                file2 = file;
                TabmodelFile2 = (DefaultTableModel) file2.getDaten().getModel();
            }
        }

        switch (sel_vgl_krit) {
            case "Änderungen herrvorheben":

                jTable_vgl_translation.setModel(new DefaultTableModel(new String[]{
                    "Änderung", "von", "in Datei", "in der Zeile"}, 0));

                jLabel5.setText("Veränderungen von " + file1.getFile_name() + " und " + file2.getFile_name() + ".");

                while (true) {
                    if (count < TabmodelFile1.getRowCount() || count < TabmodelFile2.getRowCount()) {

                        if (file1.po) {
                            if (count < TabmodelFile1.getRowCount()) {
                                keytab1 = (String) TabmodelFile1.getValueAt(count, 1);
                                valuetab1 = (String) TabmodelFile1.getValueAt(count, 2);
                            } else {
                                keytab1 = "";
                                valuetab1 = "";
                            }
                        } else if (file1.ts) {
                            if (count < TabmodelFile1.getRowCount()) {
                                keytab1 = (String) TabmodelFile1.getValueAt(count, 2);
                                valuetab1 = (String) TabmodelFile1.getValueAt(count, 3);
                            } else {
                                keytab1 = "";
                                valuetab1 = "";
                            }
                        }

                        if (file2.po) {
                            if (count < TabmodelFile2.getRowCount()) {
                                keytab2 = (String) TabmodelFile2.getValueAt(count, 1);
                                valuetab2 = (String) TabmodelFile2.getValueAt(count, 2);
                            } else {
                                keytab2 = "";
                                valuetab2 = "";
                            }
                        } else if (file2.ts) {
                            if (count < TabmodelFile2.getRowCount()) {
                                keytab2 = (String) TabmodelFile2.getValueAt(count, 2);
                                valuetab2 = (String) TabmodelFile2.getValueAt(count, 3);
                            } else {
                                keytab2 = "";
                                valuetab2 = "";
                            }
                        }

                        if ((!keytab1.equals(keytab2)) || (!keytab2.equals(keytab1))) {
                            fKeys1.add(keytab1);
                            fKeys2.add(keytab2);

                        }

                        if ((!valuetab1.equals(valuetab2)) || (!valuetab2.equals(valuetab1))) {
                            fValues1.add(valuetab1);
                            fValues2.add(valuetab2);
                        }

                    } else {
                        break;
                    }

                    count++;
                }

                if (fKeys1.isEmpty() || fKeys2.isEmpty()) {
                    jLabel5.setText("Keine Unterschiede gefunden!");
                } else {

                    for (String string : fKeys1) {
                        if (!fKeys2.contains(string)) {
                            if (!string.isEmpty() || string == null) {
                                ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string, "key", file1.getFile_name(), Methoden.wo_ist_dieser_key(file1, string)});
                            }

                        }
                    }

                    for (String string : fKeys2) {
                        if (!fKeys1.contains(string)) {
                            if (!string.isEmpty() || string == null) {
                                ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string, "key", file2.getFile_name(), Methoden.wo_ist_dieser_key(file2, string)});

                            }
                        }
                    }
                }

                if (!fValues1.isEmpty() || !fValues2.isEmpty()) {

                    for (String string : fValues1) {
                        if (!fValues2.contains(string)) {

                            if (!string.isEmpty() || string == null) {
                                ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string, "value", file1.getFile_name(), Methoden.wo_ist_dieser_key(file1, string)});
                            }
                        }
                    }

                    for (String string : fValues2) {
                        if (!fValues1.contains(string)) {

                            if (!string.isEmpty() || string == null) {
                                ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string, "value", file2.getFile_name(), Methoden.wo_ist_dieser_key(file2, string)});
                            }
                        }
                    }
                }
                break;

            case "Fehlende Keys":
                jTable_vgl_translation.setModel(new DefaultTableModel(new String[]{
                    "Fehlende Keys", "in Datei", "in der Zeile"}, 0));

                jLabel5.setText("Keys die nur in " + file1.getFile_name() + " oder nur in " + file2.getFile_name() + " existieren");

                while (true) {
                    if (count < TabmodelFile1.getRowCount() || count < TabmodelFile2.getRowCount()) {

                        if (file1.po) {
                            if (count < TabmodelFile1.getRowCount()) {
                                keytab1 = (String) TabmodelFile1.getValueAt(count, 1);
                                valuetab1 = (String) TabmodelFile1.getValueAt(count, 2);
                            } else {
                                keytab1 = "";
                                valuetab1 = "";
                            }
                        } else if (file1.ts) {
                            if (count < TabmodelFile1.getRowCount()) {
                                keytab1 = (String) TabmodelFile1.getValueAt(count, 2);
                                valuetab1 = (String) TabmodelFile1.getValueAt(count, 3);
                            } else {
                                keytab1 = "";
                                valuetab1 = "";
                            }
                        }

                        if (file2.po) {
                            if (count < TabmodelFile2.getRowCount()) {
                                keytab2 = (String) TabmodelFile2.getValueAt(count, 1);
                                valuetab2 = (String) TabmodelFile2.getValueAt(count, 2);
                            } else {
                                keytab2 = "";
                                valuetab2 = "";
                            }
                        } else if (file2.ts) {
                            if (count < TabmodelFile2.getRowCount()) {
                                keytab2 = (String) TabmodelFile2.getValueAt(count, 2);
                                valuetab2 = (String) TabmodelFile2.getValueAt(count, 3);
                            } else {
                                keytab2 = "";
                                valuetab2 = "";
                            }
                        }

                        if ((!keytab1.equals(keytab2)) || (!keytab2.equals(keytab1))) {
                            fKeys1.add(keytab1);
                            fKeys2.add(keytab2);

                        }

                    } else {
                        break;
                    }

                    count++;
                }

                if (fKeys1.isEmpty() || fKeys2.isEmpty()) {
                    jLabel5.setText("Keine Unterschiede gefunden!");
                } else {

                    for (String string : fKeys1) {
                        if (!fKeys2.contains(string)) {
                            if (!string.isEmpty() || string == null) {
                                ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string, file1.getFile_name(), Methoden.wo_ist_dieser_key(file1, string)});

                            }
                        }
                    }

                    for (String string : fKeys2) {
                        if (!fKeys1.contains(string)) {
                            if (!string.isEmpty() || string == null) {
                                ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string, file2.getFile_name(), Methoden.wo_ist_dieser_key(file2, string)});
                            }
                        }
                    }
                }

                break;
        }
    }
    
    public static void exportiere_unterschiede(String filename,JTable data) {
        DefaultTableModel dataTabelModel=(DefaultTableModel)data.getModel();
        String ausgString="";
        if(!filename.endsWith(".csv")){
            filename=filename+".csv";
        }
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(new File(filename)));
            for(int ic=0;ic<dataTabelModel.getColumnCount();ic++){
                    bw.write(dataTabelModel.getColumnName(ic)+";");
                  
            }   
            
            bw.newLine();
              
            for(int ir=0;ir<dataTabelModel.getRowCount();ir++){
                ausgString="";
                for(int ic=0;ic<dataTabelModel.getColumnCount();ic++){
                    if(ausgString.isEmpty()){
                        ausgString=(String) dataTabelModel.getValueAt(ir,ic);
                    }else{
                         ausgString=ausgString+";"+(String) dataTabelModel.getValueAt(ir,ic);
                    }
                }   
                 bw.flush();
                 bw.write(ausgString);
                 bw.newLine();
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Methoden.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
