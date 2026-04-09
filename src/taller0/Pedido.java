
package taller0;

public class Pedido {
    public int numeroMesa;
    public String platoPrincipal;
    public double precio;
    public boolean pagado;

    // Método para cambiar el estado
    public void marcarComoPagado() {
        pagado = true;
    }
    
    public Pedido(){
        
    }
    
    public Pedido(int numeroMesa, String platoPrincipal, double precio, boolean pagado) {
        this.numeroMesa = numeroMesa;
        this.platoPrincipal = platoPrincipal;
        this.precio = precio;
        this.pagado = pagado;
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
