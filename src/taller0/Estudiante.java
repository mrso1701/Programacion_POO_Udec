package taller0;

public class Estudiante {
    public String nombre;
    public String codigo;  // El código suele ser String por si lleva letras o ceros al inicio
    public int semestre;

    // Constructor vacío (Obligatorio para el Ejercicio 6)
    public Estudiante() {
    }

    // Constructor con parámetros (Para ejercicios anteriores)
    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        
        
    }
    
    public void mostrarInformacion() {
        System.out.println("--- Información del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
}
