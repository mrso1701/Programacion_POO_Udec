package taller4;

public class Main {

    public static void main(String[] args) {
        //ESTUDIANTE//////////////////////////
        Estudiante est = new Estudiante("Andres", 18, 4.5);

        // Acceso a traves de metodos get
        System.out.println("Nombre: " + est.getNombre());
        
        // Modificacion a traves de metodos set
        est.setNotaPromedio(4.8);
        System.out.println("Nueva Nota: " + est.getNotaPromedio());
        
        // COCHE//////////////////////////////
        Coche miCoche = new Coche("Mazda", "3", 200.0);
        // Intento de acceso directo (Esto generará error de compilación)
        // System.out.println(miCoche.marca); 
        
        // Uso correcto a traves de metodos
        System.out.println("Coche: " + miCoche.getMarca() + " " + miCoche.getModelo());
        miCoche.acelerar(20.0);
        
        //CLASE A///////////////////////////
        ClaseA objeto = new ClaseA();
        
        // System.out.println(objeto.datoSecreto); 
        // ERROR: datoSecreto tiene acceso privado en ClaseA.
        // Esto sucede porque 'private' limita el alcance a la propia clase
        
    }
    
}
