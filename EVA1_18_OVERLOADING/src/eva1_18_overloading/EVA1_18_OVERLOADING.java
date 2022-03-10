package eva1_18_overloading;

/**
 *
 * @author José Sebastian López Ibarra
 * Thursday March 10 2022
 */

public class EVA1_18_OVERLOADING {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Test obj1 = new Test();
        System.out.println(obj1);
        System.out.println(54);
        System.out.println("\nRectangle area of 15m x 20m: " + calcArea(15, 20) + "m\n");
        System.out.println("Triangle area of 4m x 3m: " + calcArea(4.0, 3.0, 1) + "m\n");
        System.out.println("Triangle area of 4m x 3m: " + calcArea(1, 4.0, 3.0) + "m\n");
        System.out.println("Cirlcle area of 6m radio: " + calcArea(6) + "m\n");
        System.out.println("Circle area of 6m radio: " + calcArea(6.0) + "m\n");
    }
    
    // Calculate the area of a rectangle
    public static double calcArea(double large, double widht) {
        return large * widht;        
    }
    
    // Calculate the area of a triangle
    public static double calcArea(double base, double height, int isTriangle) {
        System.out.println("Double");
        return (base * height) / 2;        
    }
    
    // Calculate the area of a triangle
    public static double calcArea(int isTriangle, double base, double height) {
        System.out.println("Int");
        return (base * height) / 2;        
    }
    
    // Calculate the area of a circle
    public static double calcArea(double radio) {
        System.out.println("Double");
        return Math.PI * Math.pow(radio, 2);
    }
    
    // Calculate the area of a circle with int numbers
    public static double calcArea(int radio) {
        System.out.println("Int");
        return Math.PI * Math.pow(radio, 2);
    }
    
}

class Test {
    
}
