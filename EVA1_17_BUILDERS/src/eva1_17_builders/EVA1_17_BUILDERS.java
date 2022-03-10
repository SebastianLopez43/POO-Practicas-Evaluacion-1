
package eva1_17_builders;

/**
 *
 * @author José Sebastian López Ibarra
 * Wednesday March 09 2022
 */

public class EVA1_17_BUILDERS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Person per1 = new Person();
        System.out.println("Name: " + per1.getName());
        System.out.println("Age: " + per1.getAge());
        
        Person per2 = new Person();
        System.out.println("Name: " + per2.getName());
        System.out.println("Age: " + per2.getAge());
        
        Person per3 = new Person("Horacio Buenavista", 32);
        System.out.println("Name: " + per3.getName());
        System.out.println("Age: " + per3.getAge());
    }   
}

class Person {
    private String name;
    private int age;
    
    // Default Builder. Does not receive arguments
    // Initialize values
    public Person() {
        System.out.println("Creating the object.");
        name = "Osvaldo Loera";
        age = 29;
    }
    
    // Distinguish with arguments   
    // Methods Overloading
    public Person(String name, int age) {
        System.out.println("\nCreating the object with the builder that accept values.");
        this.name = name;
        this.age = age;
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