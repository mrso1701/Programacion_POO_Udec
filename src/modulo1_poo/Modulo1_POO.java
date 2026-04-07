package modulo1_poo;

import taller0.*;

public class Modulo1_POO {

    public static void main(String[] args) {
       
    }    
    
     public static void ejecutarBloque1() {
        System.out.println("\n--- [OBJETOS] ---");
        
        System.out.println("\n--- CLASE ESTUDIANTE ---");
        Estudiante est1 = new Estudiante(); 
        
        // Asignación manual
        est1.nombre = "Andrés David Rodríguez";
        est1.codigo = "750241000";
        est1.semestre = 3;
        
        // MOSTRAR INFO 
        est1.mostrarInformacion();
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE VEHÍCULO ---");
    
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
        
     }
}
