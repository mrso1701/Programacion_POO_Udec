package taller1;

public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    //constructor por defecto que asigne valores predeterminados 
    public Libro() {
        this.titulo = "Titulo no asignado";
        this.autor = "Autor no asignado";
        this.numeroPaginas = 0;
    }

    //constructor parametrizado que permita asignar valores específicos 
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos para mostrar los detalles del libro 
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Libro ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
    }
}
