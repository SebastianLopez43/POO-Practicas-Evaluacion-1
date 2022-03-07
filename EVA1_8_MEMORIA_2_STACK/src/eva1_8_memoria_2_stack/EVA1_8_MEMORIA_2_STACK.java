package eva1_8_memoria_2_stack;

/**
 * @author José Sebastian López Ibarra
 * Monday February 28 2022
 */

public class EVA1_8_MEMORIA_2_STACK {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Starts Main()");
        A();
        System.out.println("Ends Main()");
    }
    
    public static void A(){
        System.out.println("Starts A()");
        B();
        System.out.println("Ends A()");
    }
    
    public static void B(){
        System.out.println("Starts B()");
        System.out.println("Ends B()");
    }
    
}
