package taller1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // --- 1. OBJETO LIBRO (Ingreso por consola) ---
        System.out.println("--- Registro de Libro ---");
        System.out.print("Ingrese titulo: ");
        String titulo = entrada.nextLine();
        System.out.print("Ingrese autor: ");
        String autor = entrada.nextLine();
        System.out.print("Ingrese numero de paginas: ");
        int paginas = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        Libro libro1 = new Libro(titulo, autor, paginas);

        // --- 2. OBJETO CUENTA BANCARIA (Uso de constructor sobrecargado) ---
        System.out.println("\n--- Registro de Cuenta Bancaria ---");
        System.out.print("Ingrese numero de cuenta: ");
        String numCuenta = entrada.nextLine();
        System.out.print("Ingrese tipo de cuenta (Ahorros/Corriente): ");
        String tipo = entrada.nextLine();
        
        // Usamos el constructor de dos parametros del Ejercicio 2
        CuentaBancaria cuenta1 = new CuentaBancaria(numCuenta, tipo);

        // --- 3. OBJETO ESTUDIANTE (Uso de constructor por defecto) ---
        // Aqui no pedimos datos para demostrar el uso del constructor sin parametros
        Estudiante estudiante1 = new Estudiante();

        // --- MOSTRAR DETALLES USANDO toString() ---
        System.out.println("\n=== RESUMEN DE OBJETOS CREADOS ===");
        System.out.println(libro1.toString());
        System.out.println(cuenta1.toString());
        System.out.println(estudiante1.toString());

        entrada.close();
    }
    
}
