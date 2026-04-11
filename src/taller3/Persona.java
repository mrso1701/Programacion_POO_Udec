package taller3;

public class Persona {
    private String nombre; // Atributo de instancia (no estatico)

    // Metodo static que intenta acceder a un atributo no estatico
    public static void metodoConError() {
        // System.out.println(this.nombre); 
        // ERROR DE COMPILACIÓN: No se puede usar 'this' ni atributos de instancia
        // en un contexto estático porque 'static' pertenece a la clase y no al objeto[cite: 375, 379].
    }

    // Código corregido
    public void metodoCorrecto() {
        System.out.println("Nombre: " + this.nombre); // Aquí sí funciona porque es un método de instancia[cite: 404].
    }
}
