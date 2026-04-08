package taller0;

public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    // Método para calcular el valor total del item
    public double calcularValorTotal() {
        return cantidad * precioUnitario;
    }
}
