package taller0;

public class Estudiante {
    public String nombre;
    public String codigo;  // El código suele ser String por si lleva letras o ceros al inicio
    public int semestre;

    
    public Estudiante(){}

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }
    
    
    public void mostrarInformacion() {
        System.out.println("--- Informacion del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
    
    public void cambiarSemestre(int nuevoSemestre) {
        semestre = nuevoSemestre;
    }
}
