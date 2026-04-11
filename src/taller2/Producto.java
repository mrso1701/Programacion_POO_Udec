package taller2;


public class Producto {
    private String nombre;
    private double precio;

    // Constructor que usa "this"
    public Producto(String nombre, double precio) {
        this.nombre = nombre; // this.nombre es el atributo, nombre es el parametro
        this.precio = precio; // this.precio es el atributo, precio es el parametro
    }

    // Metodo para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Detalles del Producto:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("---------------------------");
    }
}
