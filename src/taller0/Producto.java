package taller0;


public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    
    public void mostrarDetalles() {
        System.out.println("--- Información del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}
