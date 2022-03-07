package eva1_9_memoria_heap;

/**
 * @author José Sebastian López Ibarra
 * Wednesday March 02 2022
 */

public class EVA1_9_MEMORIA_HEAP {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int i = 5;
        Test obj1 = new Test();
        System.out.println(obj1); // Dirección guardada en memoria
        System.out.println(obj1.value); // Acceder a las propiedades del objeto
        Test obj2 = new Test();
        System.out.println(obj2); // Dirección guardada en memoria
        System.out.println(obj2.value); // Acceder a las propiedades del objeto
        obj2 = null; // Eliminar la referencia
        System.out.println(obj2.value);
    }
    
}

class Test{
    int value = 100;    
}
