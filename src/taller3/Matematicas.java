package taller3;

public class Matematicas {
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Metodo estatico para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Metodo estatico para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Metodo estatico para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division por cero.");
            return 0;
        }
        return a / b;
    }
}
