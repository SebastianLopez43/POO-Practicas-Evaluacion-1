package eva1_14_static;

/**
 *
 * @author José Sebastian López Ibarra
 * Monday March 07 2022
 */

public class EVA1_14_STATIC {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /* Instanciar clase
        MathFormules areaForm = new MathFormules();
        double area = areaForm.calculeCirculeArea(8);
        System.out.println("Circle Area: " + area);
        */
        double circleA = MathFormules.calculeCirculeArea(8);
        System.out.println("Circle Area: " + circleA);
        double triangleA = MathFormules.calculeTriangleArea(8, 13);
        System.out.println("Triangle Area: " + triangleA);
        MathFormules obj1 = new MathFormules();
        obj1.printMessage();
    }
    
}

class MathFormules{
    // Circle Area
    public static double calculeCirculeArea(double radio){
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    // Triangle Area
    public static double calculeTriangleArea (double base, double height){;
        double area;
        area = (base * height) / 2.0;
        return area;
    }
    // Print Message
    public void printMessage (){
        System.out.println("Hello World!!");
    }
}