package modulo1_poo;

import taller0.*;

public class Modulo1_POO {

    public static void main(String[] args) {
       ejecutarBloque();
    }    
    
     public static void ejecutarBloque() {
        System.out.println("\n--- [OBJETOS] ---");
        
        System.out.println("\n--- CLASE ESTUDIANTE ---");
        Estudiante est1 = new Estudiante(); 
        
        // Asignación manual
        est1.nombre = "Andres David Rodriguez";
        est1.codigo = "750241000";
        est1.semestre = 3;
        
        
        // MOSTRAR INFO 
        est1.mostrarInformacion();
        
        // EJERCICIO 19: Explicación de Clase vs Objeto
        // "Estudiante" es una clase porque es el molde, plantilla o plano que define 
        // qué atributos (nombre, código) y métodos tendrá cualquier estudiante.
        // "est" (o est1) es un objeto porque es una instancia concreta y real creada 
        // a partir de ese molde, con datos específicos en la memoria.
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE VEHICULO ---");
    
        // Instanciamos el vehículo 
        Coche carro1 = new Coche(); 
    
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.velocidadActual = 32.0;
         System.out.println("Vehiculo 1: ");
        carro1.mostrarEstado();
        
        Coche carro2 = new Coche(); 
    
        carro2.marca = "Mazda";
        carro2.modelo = "3";
        carro2.velocidadActual = 74.6;
         System.out.println("\nVehiculo 2: ");
        carro2.mostrarEstado();
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE PRODUCTO ---");
        
        Producto prod1 = new Producto();
        
        prod1.nombre = "Asus TUFF GAMING";
        prod1.precio = 3000000.0;
        prod1.stock = 12;
        
        prod1.mostrarProducto();
        
        Producto prod2 = new Producto();
        
        prod2.nombre = "Impresora EPSON";
        prod2.precio = 1500000.0;
        prod2.stock = 4;
        
        prod2.mostrarProducto();
        
        Producto prod3 = new Producto();
        
        prod3.nombre = "Asus TUFF GAMING";
        prod3.precio = 3000000.0;
        prod3.stock = 12;
        
        prod3.mostrarProducto();
        
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE MASCOTA ---");
        
        Mascota mascota = new Mascota();
        
        mascota.nombre = "Frodo";
        mascota.especie = "Pomerania";
        mascota.edad = 4;
        
        mascota.mostrarMascota();
        
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE CUENTA BANCARIA ---");
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        cuenta1.numeroCuenta = "14300545";
        cuenta1.titular = "Andres Rodriguez";
        cuenta1.saldo = 3400000;
        
        cuenta1.mostrarSaldo();
        
        CuentaBancaria cuenta2 = new CuentaBancaria();
        
        cuenta2.numeroCuenta = "49951293";
        cuenta2.titular = "Alejandro Rodriguez";
        cuenta2.saldo = 12000000;
        
        cuenta2.mostrarSaldo();
     }
}
