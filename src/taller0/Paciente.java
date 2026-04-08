package taller0;

public class Paciente {
    public String nombre;
    public int edad;
    public String diagnostico;

    public void mostrarPaciente() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Diagnostico: " + diagnostico);
    }
    
    /*Aunque en la práctica ambas frases terminan en la creación de un 
    objeto en Java, tienen enfoques distintos. "Crear un paciente" es una 
    idea del dominio del negocio o del mundo real; se refiere al acto de registrar a 
    una persona que necesita atención médica. Por otro lado, "instanciar la clase Paciente"
    es un término puramente técnico de POO; se refiere al proceso mecánico de usar la 
    palabra reservada new para reservar memoria y ejecutar un constructor. La relación es que 
    la 'instanciación' es la herramienta técnica que usamos para lograr la 
    "creación" del concepto que necesitamos en nuestro programa.*/
}
