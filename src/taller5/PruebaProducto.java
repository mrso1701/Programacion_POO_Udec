package taller5;

public class PruebaProducto {

    public static void main(String[] args) {
        
        Producto miProducto = new Producto("Smartphone", 800.0, 20);
        
        System.out.println("--- Información Inicial ---");
        miProducto.mostrarInfo();

        // Modificando atributos directamente (Permitido por ser el mismo paquete)
        miProducto.stock = 25;
        miProducto.precio = 750.0;

        System.out.println("\n--- Información Actualizada ---");
        miProducto.mostrarInfo();
    }
    
}
