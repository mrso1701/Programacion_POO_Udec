package Prueba;
import vehiculos.*;
public class Prueba {

    public static void main(String[] args) {
        // ERROR DE COMPILACIÓN:
        // Vehiculo v = new Vehiculo("Terrestre"); 
        
        // Explicación: No podemos instanciar Vehiculo porque su clase
        // y su constructor tienen acceso default, lo que los hace 
        // invisibles fuera del paquete 'vehiculos'.
    }
    
}
