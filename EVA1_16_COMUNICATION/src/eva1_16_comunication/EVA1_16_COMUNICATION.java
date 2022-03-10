package eva1_16_comunication;

/**
 *
 * @author José Sebastian López Ibarra
 * Wednesday March 09 2022
 */

public class EVA1_16_COMUNICATION {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Interaction of classes trough objects
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        objA.setValueA(8);
        objB.setValueB(3);
        System.out.println("Value of A = " + objA.getValueA());
        System.out.println("Value of B = " + objB.getValueB());
    }
    
}

class ClassA {
    private int valueA;

    // Interface - Messages. Means of interaction of objects and outside.
    public int getValueA() {
        return valueA;
    }
    public void setValueA(int valueA) {
        this.valueA = valueA;
    }
    
}

class ClassB {
    private int valueB;

    public int getValueB() {
        return valueB;
    }
    public void setValueB(int valueB) {
        this.valueB = valueB;
    }
    
}