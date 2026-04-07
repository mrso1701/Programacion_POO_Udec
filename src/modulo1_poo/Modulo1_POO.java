package modulo1_poo;

import taller0.*;

public class Modulo1_POO {

    public static void main(String[] args) {
       
    }    
    
     public static void ejecutarBloque1() {
        System.out.println("\n--- [OBJETOS] ---");
        
        System.out.println("\n--- CLASE ESTUDIANTE ---");
        Estudiante estudiante = new Estudiante(); 
        
        // Asignación manual
        estudiante.nombre = "Andrés David Rodríguez";
        estudiante.codigo = "750241000";
        estudiante.semestre = 3;
        
        // MOSTRAR INFO 
        estudiante.mostrarInformacion();
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE VEHÍCULO ---");
    
        // Instanciamos el vehículo 
        Coche miCarro = new Coche("Toyota", "Prado", 80.5);
    
         // Mostramos la información
        miCarro.mostrarEstado();
     }
}
