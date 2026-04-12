
package taller5;

class Producto {
    // Atributos de paquete
    String nombre;
    double precio;
    int stock;

    // Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodo con acceso de paquete para mostrar detalles
    void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}
