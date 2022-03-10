package eva1_15_temp_formules;
import java.util.Scanner;

/**
 *
 * @author José Sebastian López Ibarra
 * Tuesday March 08 2022
 */

public class EVA1_15_TEMP_FORMULES {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Variables 
        double cel, far, kel, farenheit_c, kelvin_c, celsius_f, kelvin_f, celsius_k, farenheit_k;
        
        // input method
        Scanner input = new Scanner(System.in);
        
        // Enter values
        System.out.println("Enter a value in °C: ");
        cel = input.nextDouble();
        System.out.println("Enter a value in °F: ");
        far = input.nextDouble();
        System.out.println("Enter a value in °K: ");
        kel = input.nextDouble();
        
        // Celsius to Farenheit and Kelvin
        farenheit_c = tempFormules.calculeFaren_C(cel);
        kelvin_c = tempFormules.calculeKel_C(cel);
        System.out.println("\nValue in Celsius = " + cel + "°C.\nConverted to Farenheit = " + farenheit_c + "°F.\nConverted to Kelvin = " + kelvin_c + "°K.");
        
        // Farenheit to Celsius and Kelvin
        celsius_f = tempFormules.calculeCel_F(far);
        kelvin_f = tempFormules.calculeKel_F(far);
        System.out.println("\nValue in Farenheit = " + far + "°F.\nConverted to Celsius = " + celsius_f + "°C.\nConverted to Kelvin = " + kelvin_f + "°K.");
        
        // Kelvin to Celsius and Farenheit
        celsius_k =  tempFormules.calculeCel_K(kel);
        farenheit_k=  tempFormules.calculeFar_K(kel);
        System.out.println("\nValue in Kelvin = " + kel + "°F.\nConverted to Celsius = " + celsius_k + "°C.\nConverted to Farenheit = " + farenheit_k + "°F.");
    }
    
}

class tempFormules {
    // Celsius to Farenheit
    public static double calculeFaren_C(double c){
        double f;
        f = 1.8 * c  + 32;
        return f;
    }
    // Celsius to Kelvin
    public static double calculeKel_C(double c){
        double k;
        k = c + 273;
        return k;
    }
    
    // Farenheit to Celsius
    public static double calculeCel_F(double f){
        double c;
        c = (f - 32) * (5/9);
        return c;
    }
    // Farenheit to Kelvin
    public static double calculeKel_F(double f){
        double k;
        k = (f - 32) * (5/9) + 273.15;
        return k;
    }
    
    // Kelvin to Celsius
    public static double calculeCel_K(double k){
        double c;
        c = k - 273.15;
        return c;
    }
    // Kelvin to Farenheit
    public static double calculeFar_K(double k){
        double f;
        f = (k - 273.15) * (9/5) + 32;
        return f;
    }
}