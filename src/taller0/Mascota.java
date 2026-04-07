
package taller0;


public class Mascota {
    // Atributos: Estado de la mascota
    public String nombre;
    public String especie;
    public int edad;


    public void mostrarMascota() {
        System.out.println("--- Informacion de la mascota ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios() {
        edad += 1;
    }
}
