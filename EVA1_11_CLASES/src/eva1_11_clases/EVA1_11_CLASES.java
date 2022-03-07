package eva1_11_clases;

/**
 * @author José Sebastian López Ibarra
 * Thursday March 03 2022
 */

public class EVA1_11_CLASES {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Persona{ // Implementation
    // Class Attributes
    private String ID, name;
    private int age;

    public String getID() {
        return ID;
    }
    // this = este
    // Prompter -> Actual object
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}