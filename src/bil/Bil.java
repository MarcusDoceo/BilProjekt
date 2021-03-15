/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bil;

import java.util.ArrayList;

/**
 *
 * @author Marcus
 */
public class Bil {
    //Attributes för the objekt
    private final String färg;
    private String regNr;
    
    //Referenses for other objekts
    public Växelspak växelspak;
    public Ratt ratt;
    public Växlingspedal växlingspedal;
    public Bromspedal bromspedal;
    public Gaspedal gaspedal;
    public ArrayList<Framdäck> framdäck;
    public ArrayList<Backdäck> backdäck;
    public ArrayList<Däck> allaDäck;
    
    //Static attribut
    static private int count=0;
    
    //Konstruktor
    public Bil(String färg, String regNr, boolean krockkudde, String fälgFärg, String fälgDesign) {
        //Tilldela värden till bilens egmna attribut
        this.färg = färg;
        this.regNr = regNr;
        

        
        this.växelspak = new Växelspak(this);
        this.ratt = new Ratt(this, krockkudde);
        this.växlingspedal = new Växlingspedal(this);
        this.bromspedal = new Bromspedal(this);
        this.gaspedal = new Gaspedal(this);
        
        framdäck = new ArrayList<>();
        backdäck = new ArrayList<>();
        allaDäck = new ArrayList<>();
        
        for(int i = 0; i < 2; i++) {
            framdäck.add(new Framdäck(fälgFärg, fälgDesign));
            backdäck.add(new Backdäck(fälgFärg, fälgDesign));
            
            allaDäck.add( framdäck.get(i) );
            allaDäck.add( backdäck.get(i) );
        }
        
        count++;
    }
    
    public void Växla(String input) {
        växelspak.Växla(input);
    }
    
    public void Koppla() {
        växlingspedal.Pressa();
    }
    
    public void Gasa() {
        gaspedal.Pressa();
    }
    
    public void Bromsa() {
        bromspedal.Pressa();
    }
    
    public void Styra(String dir){
        ratt.Rotera(dir);
    }
    
    public void SetRegNr(String regNr) {
        if (regNr.length() == 6 ){
            try {
                int temp = Integer.parseInt( regNr.substring(3, 5) );
            } catch (NumberFormatException e) {
                return;
            }
            
            this.regNr = regNr;
        }
    }
    
    public String GetRegNr() {
        return this.regNr;
    }
    
    static public int GetCount(){
        return count;
    }
}
