package taller2;

public class EjemploError {
    private String detalle;

    public EjemploError(String detalle) {
        this.detalle = detalle;
    }

    // No usamos "this" aqui porque los metodos estaticos no conocen al objeto actual
    public static void informacionEstatica() {
        System.out.println("Este es un metodo estatico. No puede usar 'this'.");
    }

    // Metodo de instancia (Uso correcto de this)
    public void mostrarDetalle() {
        System.out.println("Detalle: " + this.detalle);
    }
}
