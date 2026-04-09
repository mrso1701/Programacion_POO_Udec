package taller0;

public class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public Avion(String aerolinea, String destino, int pasajeros) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }
    

    // Método para abordar pasajeros
    public void abordar(int cantidad) {
        pasajeros += cantidad;
    }
    
    public static Avion crearAvionComercial(String aerolinea, String destino) {
        return new Avion(aerolinea, destino, 0);
    }
    
    public void mostrarInfo() {
        System.out.println("Avión de " + aerolinea + " con destino a " + destino);
    }
}
