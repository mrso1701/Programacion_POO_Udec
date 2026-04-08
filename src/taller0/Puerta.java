package taller0;

public class Puerta {
    public String material;
    public boolean abierta;
    
    public void abrir(){
        abierta = true;
    }
    
     public void cerrar(){
        abierta = false;
    }
     
    public void mostrarEstado(){
        if (abierta == true) {
            System.out.println("La puerta esta abierta");
        }
        else{
            System.out.println("La puerta esta cerrada");
        }
    }
}
