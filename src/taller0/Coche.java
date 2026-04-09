package taller0;

public class Coche {
    public String marca;
    public String modelo;
    public double velocidadActual; 

  
    public void mostrarEstado() {
        System.out.println("--- Informacion del Coche ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad actual: " + velocidadActual);
    }
    
   public void Acelerar(){
        velocidadActual+=10;
    }
    
    public void frenar(){
        //verificacion: si es mayor a 0 que disminiya de 10 en 10
        if (velocidadActual > 0 ) {
            velocidadActual -= 10;
        }
        //verificacion: si es numero negativo se lleva a 0
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }
}
 
