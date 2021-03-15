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
public class Gaspedal implements Pedaler{
    
    public Bil bil;
    
    public Gaspedal(Bil bil) {
        this.bil = bil;
    }

    @Override
    public void Pressa() {
        for(Backdäck i: bil.backdäck) {
            i.Spinna();
        }
    }
    
}
