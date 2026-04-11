
package taller3;

public class Coche {
    private String modelo;
    private String marca;
     static int contadorCoches = 0;

    public Coche(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        contadorCoches++;
    }
    
    public static void mostrarContador(){
        System.out.println("Coches creados: " + contadorCoches);
    }
    
    public void mostrarDetalles() {
        System.out.println("Coche: " + marca + " " + modelo);
    }
}
