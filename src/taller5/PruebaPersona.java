package taller5;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona p = new Persona("Andres", 18);

        // Intento de acceso a atributo privado
        // System.out.println(p.nombre); 
        // ERROR: nombre tiene acceso privado en Persona 

        // Acceso a atributo de paquete (default)
        System.out.println("Edad (acceso default): " + p.edad); // Funciona

        // Acceso al nombre mediante métodos públicos
        System.out.println("Nombre (vía getter): " + p.getNombre());
    }
    
}
