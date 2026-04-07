package taller0;

public class Coche {
    public String marca;
    public String modelo;
    public double velocidadActual; 

  
    public void mostrarEstado() {
        System.out.println("--- Información del Coche ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad actual: " + velocidadActual);
    }
}
