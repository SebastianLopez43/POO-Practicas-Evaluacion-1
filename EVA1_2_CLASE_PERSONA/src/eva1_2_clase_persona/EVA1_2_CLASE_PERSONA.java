package eva1_2_clase_persona;

/**
 * @author José Sebastian López Ibarra
 * Miércoles 16 de febrero de 2022
 */

// Declaración
public class EVA1_2_CLASE_PERSONA { // Implementación { }

    /**
     * @param args the command line arguments
     */
    
    // Declaración 
    // Método (acciones)
    public static void main(String[] args) { // Implementación { }
        System.out.println("Hola Mundo!!\n");
        
        // Crear un objeto en Java
        // Instanciación: Crear objetos (Dar memoria) | Java -> new
        
        // Declaración de un identificador (objeto) tipo Persona
        // Declarar                  // Construir
        Persona estudiante = new Persona();
        estudiante.ID = "21550362";
        estudiante.nombre = "José Sebastian López Ibarra";
        estudiante.edad = 19;
        estudiante.imprimirDatos();
        // Concatenación -> Pegar cadenas de texto
        System.out.println("Año de nacimiento: " + estudiante.calcularAñoNacimiento() + "\n");
        
        Persona estudiante2 = new Persona();
        estudiante2.ID = "21550621";
        estudiante2.nombre = "Hector Ramón González Torres";
        estudiante2.edad = 19;
        estudiante2.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante2.calcularAñoNacimiento() + "\n");
        
        Persona estudiante3 = new Persona();
        estudiante3.ID = "20550476";
        estudiante3.nombre = "Javier Alejandro Pérez Márquez";
        estudiante3.edad = 20;
        estudiante3.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante3.calcularAñoNacimiento() + "\n");
    }    
}

// Declaración
class Persona{ // Implementación { }
    // Tipo de datos abstracto
    // Atributos de la clase
    String nombre, ID;
    int edad;
    
    // Comportamiento
    // Método imprimir datos -> Método/función | f(x) = x + 1
    // Valor de retorno + nombre de la función (argumentos);
    
    void imprimirDatos(){ // No regresa valor, no recibe valores
        System.out.println("El nombre es: " + nombre);
        System.out.println("El ID es: " + ID);
        System.out.println("La edad es: " + edad);
    }
    
    // Calcular año de nacimiento
    int calcularAñoNacimiento(){ // Declaración
        int añoNac = 2022 - edad;
        return añoNac;
    }
}