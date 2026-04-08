package taller0;

public class Empleado {
    public String nombre;
    public String cargo;
    public double salario;

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " +"$"+salario);
    }
    
    /*Es mejor modelar un Empleado con clases y objetos en lugar 
    de variables sueltas porque permite 
    agrupar todos los datos relacionados en una sola entidad 
   lógica. Si usáramos variables sueltas 
   (como String nombre1, String nombre2, etc.), 
    el código se volvería desordenado, difícil de mantener
    y propenso a errores al intentar relacionar un dato con otro. 
    Al usar una clase, creamos una plantilla reutilizable que garantiza 
    que cada empleado tenga la misma estructura y comportamiento, f
    acilitando la organización y escalabilidad del programa."*/
}