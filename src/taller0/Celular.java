package taller0;

public class Celular {
    public String marca;
    public int bateria = 0;
    public boolean prendido;
    
    public void encender(){
        prendido = true;
    }
    
    public void apagar(){
        prendido = false;
    }
    
    public void cargarBateria(){
        bateria++;
        System.out.println("Cargando... Porcentaje actual: " + bateria+"%");
    }
    
}
