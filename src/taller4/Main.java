package taller4;

public class Main {

    public static void main(String[] args) {
        Estudiante est = new Estudiante("Andres", 18, 4.5);

        // Acceso a traves de metodos get
        System.out.println("Nombre: " + est.getNombre());
        
        // Modificacion a traves de metodos set
        est.setNotaPromedio(4.8);
        System.out.println("Nueva Nota: " + est.getNotaPromedio());
    }
    
}
