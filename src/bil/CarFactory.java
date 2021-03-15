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
public class CarFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bil bil1 = new Bil("Grön", "abc123", true, "Silver", "Stjärna");
        Bil bil2 = new Bil("Röd", "cba321", true, "Svart", "Triangel");
        Bil bil3 = new Bil("Silver", "jej343", true, "Silver", "Kvadrat");
        /*
        bil1.Växla("4");
        bil1.Koppla();
        bil1.Växla("7");
        bil1.Koppla();
        
        bil1.Gasa();
        bil1.Bromsa();
        
        bil1.Styra("Vänster");
        bil1.Styra("Höger");
        */
        System.out.println(Bil.GetCount() + " bilar har skapats."); 
        
        System.out.println(bil2.GetRegNr());
        bil2.SetRegNr("heg135");
        System.out.println(bil2.GetRegNr());
    }
    
}
