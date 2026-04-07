package taller0;


public class Producto {
    String nombre;
    double precio;
    int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Disponibles: " + stock);
    }
}
