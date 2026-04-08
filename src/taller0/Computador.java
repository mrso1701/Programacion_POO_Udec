package taller0;

public class Computador {
    public String procesador;
    public int ram;
    public double precio;

    public void mostrarEspecificaciones() {
        System.out.println("======== ESPECIFICIACIONES DEL COMPUTADOR ========");
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram);
        System.out.println("Precio: " +"$"+precio);
    }
    
    /*La diferencia radica en la existencia física y la asignación de memoria. 
    El plano conceptual (la clase Computador) 
    es solo una definición lógica escrita en código; 
    no ocupa espacio en la memoria RAM del sistema 
    ni puede realizar tareas, ya que es solo una idea de 
    cómo debe ser un computador. Por otro lado, una máquina concreta 
    (el objeto o instancia) es la materialización de ese plano. Cuando usamos new Computador(),
    reservamos un espacio real en la memoria donde los atributos dejan de ser etiquetas y pasan a tener
    valores reales, permitiendo que el programa interactúe con ella*/
}
