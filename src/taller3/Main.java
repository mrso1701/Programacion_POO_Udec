package taller3;

public class Main {

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        // Llamada a los metodos usando el nombre de la clase
        System.out.println("Suma: " + Matematicas.sumar(num1, num2));
        System.out.println("Resta: " + Matematicas.restar(num1, num2));
        System.out.println("Multiplicacion: " + Matematicas.multiplicar(num1, num2));
        System.out.println("Division: " + Matematicas.dividir(num1, num2));
    }
    
}
