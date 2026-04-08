package taller0;


public class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    // Método para calcular la definitiva (promedio)
    public double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarReporte() {
        double definitiva = calcularDefinitiva();
        System.out.println("Asignatura: " + asignatura);
        System.out.println("La definitiva es: " + definitiva);
    }
}
