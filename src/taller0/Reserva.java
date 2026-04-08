package taller0;

public class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;
  
    public void confirmar() {
        activa = true;
    }

    public void cancelar() {
        activa = false;
    }
}
