
package taller0;

public class Pedido {
    int numeroMesa;
    String platoPrincipal;
    double precio;
    boolean pagado;

    // Método para cambiar el estado
    public void marcarComoPagado() {
        pagado = true;
    }

    // Método para mostrar la información 
    public void mostrarDetalles() {
        System.out.print("Mesa: " + numeroMesa + " | Plato: " + platoPrincipal + " | Total: $" + precio);
        
        if (pagado == true) {
            System.out.println(" | Estado: Pagado");
        } else {
            System.out.println(" | Estado: Pendiente");
        }
    }
}
