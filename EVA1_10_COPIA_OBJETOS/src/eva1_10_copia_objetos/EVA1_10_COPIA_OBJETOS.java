package eva1_10_copia_objetos;

/**
 * @author José Sebastian López Ibarra
 * Thursday March 03 2022
 */
public class EVA1_10_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("        OBJ1");
        Test obj1 = new Test();
        System.out.println("Object address: " + obj1);
        
        System.out.println("\n  -- Values --");
        obj1.x = 100; // Value of obj1
        System.out.println("Value of x = " + obj1.x);
        Test backrest = obj1; // Backrest of obj1
        System.out.println("Value of x in backrest = " + backrest.x);
        
        // Modify the backrest
        System.out.println("\n    -- Modify the backrest --");
        backrest.x = 0;
        System.out.println("Value of x in obj1 = " + obj1.x);
        System.out.println("Value of x in backrest = " + backrest.x);
        
        // Print memory address
        System.out.println("\n    -- Print memory address --");
        System.out.println("obj1: " + obj1);
        System.out.println("backrest: " + backrest);
        
        // Comparation
        System.out.println("\n    -- Comparation --");
        if(obj1 == backrest){
            System.out.println("Are the same objects.");
        } else {
            System.out.println("Are different objects.");
        }
        
        System.out.println("\n      OBJ2");
        Test obj2 = new Test();
        System.out.println("Object address: " + obj2);
        
        System.out.println("\n  -- Values --");
        obj2.x = 100; // Value of obj2
        System.out.println("Value of x = " + obj2.x);
        Test backrest2 = new Test(); // New object = backrest2
        backrest2.x = obj2.x;
        System.out.println("Value of x in backrest = " + backrest2.x);
        
        // Modify the backrest
        System.out.println("\n  -- Modify the backrest --");
        backrest2.x = 0;
        System.out.println("Value of x in obj1 = " + obj2.x);
        System.out.println("Value of x in backrest = " + backrest2.x);
        
        // Print memory address
        System.out.println("\n  -- Print memory address --");
        System.out.println("obj1: " + obj2);
        System.out.println("backrest: " + backrest2);
        
        // Comparation
        System.out.println("\n  -- Comparation -- ");
        if(obj2 == backrest2){
            System.out.println("Are the same objects.");
        } else {
            System.out.println("Are different objects.");
        }
    }
    
}

class Test{
    public int x;
}
