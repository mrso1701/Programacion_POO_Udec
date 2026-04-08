package taller0;

public class Semaforo {
    String colorActual;

    // Método para cambiar al siguiente color
    public void cambiarColor() {
        switch (colorActual) {
            case "rojo":
                colorActual = "verde";
                break;
            case "verde":
                colorActual = "amarillo";
                break;
            default:
                colorActual = "rojo";
                break;
        }
        System.out.println("El semáforo ahora está en: " + colorActual);
    }
}
