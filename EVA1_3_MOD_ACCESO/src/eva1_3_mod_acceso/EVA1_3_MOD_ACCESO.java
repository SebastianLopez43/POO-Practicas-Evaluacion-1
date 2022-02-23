package eva1_3_mod_acceso;

/**
 *
 * @author José Sebastian López Ibarra
 * Lunes 21 de febrero de 2022
 */

public class EVA1_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person per1 = new Person();
        per1.setID("21550362");
        per1.setName("José Sebastian López Ibarra");
        per1.setAge(18);
        System.out.println("No. Control: #" + per1.getID());
        System.out.println("Nombre: " + per1.getName());
        System.out.println("Edad: " + per1.getAge() + " años\n");
        
        Person per2 = new Person();
        per2.setID("21550832");
        per2.setName("Gabriel Alonso Hernández Rojas");
        per2.setAge(18);
        System.out.println("No. Control: #" + per2.getID());
        System.out.println("Nombre: " + per2.getName());
        System.out.println("Edad: " + per2.getAge() + " años\n");
    }
}    
    class Person{
        // Atributtes / Properties (variables)
        private String ID, name;        
        private int age;
        //public int age;
        
        // Behavior (methods)
        /*
        Para leer y modificar los atributos, usamos
        los métodos de lectura/escritura.
        */
        
        // Read valors -> get
        public String getID(){
            return ID;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        
        // Assign valors -> set
        public void setID(String value){
            ID = value;
        }
        public void setName(String value){
            name = value;
        }
        public void setAge(int value){
            age = value;
        }
    }

