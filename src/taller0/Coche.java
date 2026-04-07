package taller0;

public class Coche {
    String marca;
    String modelo;
    String color;

    // Constructor: Inicializa el objeto
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

  
    public void mostrarDetalles() {
        System.out.println("Coche: " + marca + " " + modelo + " | Color: " + color);
    }
}
