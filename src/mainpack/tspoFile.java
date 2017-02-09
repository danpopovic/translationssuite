/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpack;

import java.io.Serializable;
import javax.swing.JTable;

/**
 *
 * @author flori
 */

//Diese Klasse bezeichnet ein po oder ts file, es
//enthält einen filename und eine JTable in der die 
//Daten enthalten sind und dadurch die Klasse 
// universiel erweiterbar ist.
//zusätzlich sind zwei flags enthalten um heruaszufinden
//welchen Dateityp die Datei hat
public class tspoFile implements Serializable{
    private String file_name;
    private JTable daten=new JTable();
    boolean po;
    boolean ts;
    
    public tspoFile() {
    }

    public tspoFile(String file_name, JTable daten) {
        this.file_name = file_name;
        this.daten = daten;
        if(file_name.endsWith(".po")){
            this.po=true;
            this.ts=false;
        }else if(file_name.endsWith("ts")){
            this.ts=true;
            this.po=false;
        }
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
        if(file_name.endsWith(".po")){
            this.po=true;
            this.ts=false;
        }else if(file_name.endsWith("ts")){
            this.ts=true;
            this.po=false;
        }
    }

    public JTable getDaten() {
        return daten;
    }

    public void setDaten(JTable daten) {
        this.daten = daten;
    }
    
    
}
