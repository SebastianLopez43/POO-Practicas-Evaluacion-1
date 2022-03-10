package eva1_13_access_modifiers;
import Cars_without_motor.Bycicle;

/**
 * @author José Sebastian López Ibarra
 * Friday March 04 2022
 */

public class EVA1_13_ACCESS_MODIFIERS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Kia");
        Bycicle bic1 = new Bycicle();
        car1.printMessage();
    }
    
}
