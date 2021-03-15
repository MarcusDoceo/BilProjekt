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
public class Växelspak {
    private String gearPosition;
    public Bil bil;
    
    //Konstruktor
    public Växelspak(Bil bil) {
        gearPosition = "1";
        this.bil = bil;
    }
    
    public void Växla(String input){
        //Kontrollera om kopplinspedalen är nertryckt
        if ( !bil.växlingspedal.GetPressed() ) {
            System.out.println("Växling misslyckades; kopplingen är inte nere.");
            return;
        }
        
        //Konvertering till Int
        int nummer;
        
        try {
            nummer = Integer.parseInt(input);
        } catch(NumberFormatException e) {
            nummer = 0;
        }

        //Kontrollera input, att input är mellan 1-5 eller bokstaven R
        if (input.toUpperCase().equals("R") || ( nummer > 0 && nummer <= 5 )) {
            //Sätt nytt värde till Attributet
            System.out.println("Växlat till " + input);
            gearPosition = input;
        } else {
            System.out.println("Felaktig input till växlingen.");
        }
        
    }
}
