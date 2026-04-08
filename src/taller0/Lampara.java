package taller0;

// ERROR: He eliminado la declaración de la clase adrede
// public class Lampara {
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
// } <--- También borré esta llave
