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
}
