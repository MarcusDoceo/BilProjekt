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
public class Växlingspedal implements Pedaler{
    
    public Bil bil;
    private boolean pressed;
    
    public Växlingspedal(Bil bil) {
        this.bil = bil;
        pressed = false;
    }

    @Override
    public void Pressa() {
        pressed = !pressed;
        
        if (pressed) {
            System.out.println("Kopplingen är nere");
        } else {
            System.out.println("Kopplingen är uppe");
        }
    }
    
    public boolean GetPressed() {
        return pressed;
    }
    
}
