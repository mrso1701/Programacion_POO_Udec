package taller4;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Metodo acelerar con validacion
    // Solo incrementa la velocidad si el valor es positivo
    public void acelerar(double incremento) {
        if (incremento > 0) { 
            this.velocidadMaxima += incremento;
            System.out.println("Velocidad incrementada. Nueva velocidad maxima: " + this.velocidadMaxima);
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    // Getters para visualizar los datos 
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
