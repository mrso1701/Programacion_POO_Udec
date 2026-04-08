package taller0;

public class Ventilador {
    public String marca; 
    public int velocidad = 1;
    public boolean encendido;
    
    public void encender(){
        // ERROR: Al poner "boolean" aquí, creamos una variable nueva
        // que solo existe dentro de este método.
        boolean encendido = true; 
        System.out.println("Variable local cambiada, pero el atributo no.");
        velocidad = 1;
    }
    
     public void apagar(){
        encendido = true;
        velocidad = 0;
    }
     
    public void subirVelocidad(){
        velocidad++;
    }
}
