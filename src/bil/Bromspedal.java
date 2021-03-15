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
public class Bromspedal implements Pedaler {
    
    public Bil bil;
    
    public Bromspedal(Bil bil) {
        this.bil = bil;
    }

    @Override
    public void Pressa() {
        for(Däck i: bil.allaDäck){
            i.Stanna();
        }
    }
    
}
