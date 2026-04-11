package taller1;


public class Estudiante {
    String nombre;
    int edad;
    String curso;

    // Constructor por defecto con valores genéricos
    public Estudiante() {
        this.nombre = "Estudiante Genérico";
        this.edad = 0;
        this.curso = "Sin asignar";
    }

    // Constructor que acepta nombre y edad 
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin asignar";
    }

    // Constructor que acepta todos los parámetros usando this() 
    public Estudiante(String nombre, int edad, String curso) {
        // Llamada al constructor de dos parámetros 
        this(nombre, edad); 
        this.curso = curso;
    }

    // Metodo para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
}
