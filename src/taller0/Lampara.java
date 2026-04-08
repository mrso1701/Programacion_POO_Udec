package taller0;

public class Lampara { // CORRECCIÓN: Devolvemos el nombre y apertura
    public String marca;
    public boolean encendida;
    
    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public void mostrarEstado() {
        if (encendida == true) {
            System.out.println("Encendida");
        } else {
            System.out.println("Apagada");
        }
    }
} // CORRECCIÓN: Devolvemos la llave de cierre
