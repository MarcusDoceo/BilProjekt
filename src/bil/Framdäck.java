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
public class Framdäck extends Däck {
    
    public Framdäck(String fälgFärg, String fälgDesign) {
        super(fälgFärg, fälgDesign);
    }
    
    public void Svänga(String dir) {
        System.out.println("Framdäcket svänger åt "+ dir);
    }
}
