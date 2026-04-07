
package taller0;


public class Mascota {
    // Atributos: Estado de la mascota
    String nombre;
    String especie;
    int edad;

    // Constructor: Inicializa los datos al crear la mascota
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarMascota() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
    }
}
