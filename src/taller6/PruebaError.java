package taller6;

public class PruebaError {

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Terrestre", "Toyota");

        // ERROR DE COMPILACIÓN:
        // System.out.println(v.tipo); 
        // Explicación: 'tipo' es protected. Como PruebaProtected no es 
        // una subclase de Vehiculo ni está en el mismo paquete, no tiene acceso.
    }
    
}
