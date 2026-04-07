package taller0;

public class Coche {
    public String marca;
    public String modelo;
    public double velocidadActual; // Usamos double por si la velocidad tiene decimales

    // Constructor para inicializar el vehículo
    public Coche(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

  
    public void mostrarEstado() {
        System.out.println("--- Información del Coche ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + velocidadActual);
    }
}
