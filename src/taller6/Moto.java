package taller6;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetalles() {
        // Acceso permitido por herencia (protected)
        System.out.println("Tipo: " + tipo + " | Marca: " + marca + " | Cilindrada: " + cilindrada);
    }
}
