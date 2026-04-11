package taller2;

public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto que llama al constructor con dos parámetros 
    public Estudiante() {
        this("Andres", 18); // Uso de this() para invocar al otro constructor 
    }

    // Constructor con dos parámetros 
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; // Diferenciando atributo de parámetro 
        this.edad = edad;
    }

    // Método para imprimir los detalles 
    public void mostrarEstudiante() {
        System.out.println("Estudiante: " + this.nombre);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("---------------------------");
    }
}
