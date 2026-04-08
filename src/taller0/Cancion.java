package taller0;


public class Cancion {
    public String titulo;
    public String artista;
    public double duracion;
    
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracion + " minutos");
    }
}
