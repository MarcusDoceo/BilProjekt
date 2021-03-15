/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bil;

/**
 *
 * @author Marcus
 */
public class Ratt {
    private boolean krockkudde;
    public Bil bil;
    
    public Ratt(Bil bil, boolean krockkudde){
        this.bil = bil;
        this.krockkudde = krockkudde;
    }
    
    public void Rotera(String dir) {
        for(Framdäck i: bil.framdäck){
            i.Svänga(dir);
        }
    }
}
