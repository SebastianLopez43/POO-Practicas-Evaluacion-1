package eva1_7_memoria_1;

/**
 * @author José Sebastian López Ibarra
 * Monday February 28 2022
 */

public class EVA1_7_MEMORIA_1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int value = 5;
        String str = "Hello";
        Test obj = new Test();
        
        System.out.println("Value: " + value);
        System.out.println("String: " + str);
        System.out.println("Object: " + obj);
        
    }
    
}

class Test{
    public void greet(){
        System.out.println("Hello World!!");
    }
}