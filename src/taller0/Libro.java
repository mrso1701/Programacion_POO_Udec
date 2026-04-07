
package taller0;


public class Libro {
    public String titulo;
    public String autor;
    public int paginas;
    
    public Libro(){}

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void mostrarInfo(){
        System.out.println("--- INFORMACION DEL LIBRO ---");
        System.out.println("Titulo:" + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " +paginas);
    }
}
