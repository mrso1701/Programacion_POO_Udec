package taller0;

public class Estudiante {
    public String nombre;
    public String codigo;  // El código suele ser String por si lleva letras o ceros al inicio
    public int semestre;

    
    
    public void mostrarInformacion() {
        System.out.println("--- Información del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
}
