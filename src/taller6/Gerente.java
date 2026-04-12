package taller6;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        // Acceso directo a "nombre" y "salario" por ser protected en la superclase
        System.out.println("Gerente: " + nombre + " | Departamento: " + departamento + " | Salario: " + salario);
    }
}
