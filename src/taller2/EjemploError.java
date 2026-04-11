package taller2;

public class EjemploError {
    private String mensaje = "Hola";

    public static void metodoEstatico() {
        // ERROR: No se puede usar this en un contexto estatico
        System.out.println(this.mensaje);
    }
}
