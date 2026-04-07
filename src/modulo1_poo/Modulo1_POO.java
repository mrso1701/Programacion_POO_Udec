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
        Coche miCarro = new Coche("Toyota", "Prado", 80.5);
    
         // Mostramos la información
        miCarro.mostrarEstado();
     }
}
