package taller0;


public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public Producto(){}

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public static void crearProductoBasico(){}
    
    public void mostrarProducto() {
        System.out.println("--- Informacion del producto ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
    
    public void vender(int cantidad) {
    // Validación: si hay suficientes productos en stock
    if (cantidad <= stock) {
        stock -= cantidad;
    } else {
        System.out.println("No hay suficiente stock para la venta");
       }
    }
    
    public void restablecer(int cantidad){
        stock += cantidad;
    }
}
