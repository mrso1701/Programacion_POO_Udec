package taller0;


public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    
    public void mostrarProducto() {
        System.out.println("--- Informacion del producto ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}
