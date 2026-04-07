package modulo1_poo;

import taller0.*;

public class Modulo1_POO {

    public static void main(String[] args) {
       
    }    
    
     public static void ejecutarBloque1() {
        System.out.println("\n--- [BLOQUE A: RECONOCIMIENTO DE CLASES] ---");
        Estudiante estudiante = new Estudiante(); 
        
        // Asignación manual
        estudiante.nombre = "Andrés David Rodríguez";
        estudiante.codigo = "750241000";
        estudiante.semestre = 3;

        // MOSTRAR INFO 
        estudiante.mostrarInformacion();
     }
}
