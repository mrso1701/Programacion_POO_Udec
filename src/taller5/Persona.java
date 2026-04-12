package taller5;


public class Persona {
    // Atributo privado: Solo visible en esta clase
    private String nombre;
    
    // Atributo de paquete (default)
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
