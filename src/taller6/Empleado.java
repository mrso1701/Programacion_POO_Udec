package taller6;

public class Empleado {
    // Atributos protected: Accesibles para las subclases
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " | Salario: " + salario);
    }
}
