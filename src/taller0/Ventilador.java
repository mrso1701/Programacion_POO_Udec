package taller0;

public class Ventilador {
    public String marca; 
    public int velocidad = 1;
    public boolean encendido;
    
    public void encender(){
       // CORRECCIÓN: Quitamos el tipo de dato para usar el atributo global
        encendido = true;
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
