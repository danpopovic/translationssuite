/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpack;

import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author flori
 */
public class Methoden {
    public static String wo_ist_dieser_key(tspoFile file, String key){
        String zeilenummer=" ";
        
        DefaultTableModel model=(DefaultTableModel)file.getDaten().getModel();
        JTable table=file.getDaten();
        
        for(int i = 0;i<table.getRowCount();i++){
            if(file.po){
                if(model.getValueAt(i,2)==key){
                    zeilenummer=(String) model.getValueAt(i, 0);
                }else if(model.getValueAt(i,1)==key){
                    zeilenummer=(String) model.getValueAt(i, 0);
                }
            }else if(file.ts){
                if(model.getValueAt(i,3)==key){
                    zeilenummer=(String) model.getValueAt(i, 0);
                }else if(model.getValueAt(i,2)==key){
                    zeilenummer=(String) model.getValueAt(i, 0);
                }
            }
            
        }
        return zeilenummer;
    }
    
    public static void vergleiche(String sel_vgl_krit,JTable jTable_vgl_translation,LinkedList<tspoFile> tspofiles,JLabel jLabel5,String[] sel_files){
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
        
        int count=0;

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
                    "Änderung"," von ","in Datei","in der Zeile"}, 0));

                jLabel5.setText("Veränderungen von" + file1.getFile_name() + " und " + file2.getFile_name() + ".");

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
                            ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string,file1.getFile_name(),Methoden.wo_ist_dieser_key(file1, string)});
                        }
                    }
                    
                    for (String string : fKeys2) {
                        if (!fKeys1.contains(string)) {
                             ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string,file2.getFile_name(),Methoden.wo_ist_dieser_key(file2, string)});
                        }
                    }
                }
                break;

            case "Fehlende Keys":
                jTable_vgl_translation.setModel(new DefaultTableModel(new String[]{
                    "Fehlende Keys","in Datei","in der Zeile"}, 0));

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
                            ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string,file1.getFile_name(),Methoden.wo_ist_dieser_key(file1, string)});
                        }
                    }
                    
                    for (String string : fKeys2) {
                        if (!fKeys1.contains(string)) {
                             ((DefaultTableModel) jTable_vgl_translation.getModel()).addRow(new String[]{string,file2.getFile_name(),Methoden.wo_ist_dieser_key(file2, string)});
                        }
                    }
                }

                break;
        }
    }
}
