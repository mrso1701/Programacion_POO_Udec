package taller3;

public class Persona {
    private String nombre; // Atributo de instancia (no estatico)

    // Metodo estatico
    public static void modificarNombre(String nuevoNombre) {
        // ERROR: No se puede acceder a un atributo no estatico desde un contexto estatico
        // this.nombre = nuevoNombre; 
        this.nombre = nuevoNombre;
        
    }
}
