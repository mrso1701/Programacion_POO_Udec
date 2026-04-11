package taller3;

public class UsoCorrectoStatic {
    private String nombre;
    
    // Atributo estatico
    private static String nombreInstitucion = "Universidad de Cartagena";

    public UsoCorrectoStatic(String nombre) {
        this.nombre = nombre;
    }

    // Correccion: El metodo estatico solo accede a atributos estaticos
    public static void mostrarInstitucion() {
        System.out.println("Institucion: " + nombreInstitucion);
    }

    // Metodo de instancia para mostrar el nombre (Uso correcto)
    public void mostrarNombre() {
        System.out.println("Nombre del estudiante: " + this.nombre);
    }
}
