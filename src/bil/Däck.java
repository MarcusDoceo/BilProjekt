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
abstract public class Däck {
    //Attributes
    private String fälgFärg;
    private String fälgDesign;
    
    public Däck (String fälgFärg, String fälgDesign) {
        this.fälgFärg = fälgFärg;
        this.fälgDesign = fälgDesign;
    }
    
    public void Stanna() {
        System.out.println("Däcket har stannat!");
    }
}
