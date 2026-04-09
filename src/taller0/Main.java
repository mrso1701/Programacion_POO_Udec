package taller0;

public class Main {

    
    public static void main(String[] args) {
        ejecutarBloqueB();
    }
    
    public static void ejecutarBloqueB(){
        System.out.println("\n=== BLOQUE B: CONSTRUCCION DE OBJETOS ===");

        // Ejercicio 6: Asignación manual
        System.out.println("\n--- Ejercicio 6: Estudiante (Asignacion Manual) ---");
        Estudiante est1 = new Estudiante();
        est1.nombre = "Andres David Rodriguez";
        est1.codigo = "750241000";
        est1.semestre = 3;
        est1.mostrarInformacion();

        // Ejercicio 7: Dos objetos Vehiculo
        System.out.println("\n--- Ejercicio 7: Dos Vehículos con datos diferentes ---");
        Coche v1 = new Coche();
        v1.marca = "Mazda"; 
        v1.modelo = "3"; 
        v1.velocidadActual = 60.0;
        
        Coche v2 = new Coche();
        v2.marca = "Toyota"; 
        v2.modelo = "Hilux"; 
        v2.velocidadActual = 20.0;
        
        v1.mostrarEstado();
        v2.mostrarEstado();

        // Ejercicio 8: Tres objetos Producto (Estado distinto)
        System.out.println("\n--- Ejercicio 8: Tres Productos (Mismo molde, distinto estado) ---");
        Producto p1 = new Producto("Teclado", 150000, 5);
        Producto p2 = new Producto("Mouse", 80000, 10);
        Producto p3 = new Producto("Monitor", 900000, 3);
        
        p1.mostrarProducto();
        p2.mostrarProducto();
        p3.mostrarProducto();

        // Ejercicio 9: Mutabilidad de Mascota
        System.out.println("\n--- Ejercicio 9: Cambiando estado de Mascota (Edad) ---");
        Mascota miMascota = new Mascota();
        miMascota.nombre = "Frodo";
        miMascota.edad = 1; // Primer estado
        System.out.print("Estado inicial: "); 
        miMascota.mostrarMascota();
        
        miMascota.edad = 2; // Cambio 1
        miMascota.edad = 4; // Cambio 2
        System.out.print("Estado final: "); 
        miMascota.mostrarMascota();

        // Ejercicio 10: Independencia en CuentaBancaria
        System.out.println("\n--- Ejercicio 10: Independencia de valores en Cuentas ---");
        CuentaBancaria cuentaA = new CuentaBancaria("001", "Andres", 500000);
        CuentaBancaria cuentaB = new CuentaBancaria("002", "Isabella", 1200000);
        
        cuentaA.mostrarSaldo();
        cuentaB.mostrarSaldo();
    }
    
    public static void ejecutarBloqueD() {
    System.out.println("\n=== BLOQUE D: CONCEPTOS Y ABSTRACCIÓN ===");

    // EJERCICIO 19: Explicación de Clase vs Objeto
    System.out.println("\n--- Ejercicio 19: Concepto Estudiante ---");
    Estudiante est1 = new Estudiante("Andres Rodriguez", "750241", 3);
    /* * EXPLICACIÓN:
     * 'Estudiante' es una CLASE porque es el molde o plano que define la estructura 
     * (atributos como nombre, codigo) que tendrán todos los alumnos.
     * 'est1' es un OBJETÓ porque es una instancia real con datos específicos 
     * que ocupa un espacio en la memoria RAM.
     */
    est1.mostrarInformacion();

    // EJERCICIO 20: Tres objetos de la misma clase
    System.out.println("\n--- Ejercicio 20: Tres objetos de Producto ---");
    Producto p1 = new Producto("Teclado", 50.0, 10);
    Producto p2 = new Producto("Mouse", 25.0, 20);
    Producto p3 = new Producto("Monitor", 300.0, 5);

    /*
     * CONCLUSIÓN EJERCICIO 20:
     * COMPARTEN: La estructura (atributos nombre, precio, stock) y el comportamiento (métodos).
     * SE DIFERENCIAN: En su ESTADO. Cada uno tiene valores distintos y una identidad única.
     */
    p1.mostrarProducto(); p2.mostrarProducto(); p3.mostrarProducto();

    // EJERCICIO 21: Atributo igual, demás distintos
    System.out.println("\n--- Ejercicio 21: Atributos compartidos vs distintos ---");
    Coche c1 = new Coche();
    c1.marca = "Toyota"; 
    c1.modelo = "Corolla"; 
    c1.velocidadActual = 0;
    
    Coche c2 = new Coche();
    c2.marca = "Toyota"; 
    c2.modelo = "Hilux"; 
    c2.velocidadActual = 80;
    // Ambos comparten la MARCA ("Toyota"), pero son modelos y estados distintos.
    c1.mostrarEstado();
    c2.mostrarEstado();

    // EJERCICIO 22: Clase Libro y Conclusión
    System.out.println("\n--- Ejercicio 22: Clase Libro ---");
    Libro l1 = new Libro("Cien años de soledad", "Gabo", 496);
    Libro l2 = new Libro("El Resplandor", "Stephen King", 447);
    Libro l3 = new Libro("Rayuela", "Julio Cortázar", 600);
    Libro l4 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

    /*
     * CONCLUSIÓN FINAL:
     * La clase 'Libro' es una plantilla porque describe qué es un libro de forma genérica.
     * Los objetos (l1, l2, l3, l4) son casos concretos porque representan libros reales
     * con títulos y autores que podemos manipular en el sistema.
     */
    l1.mostrarInfo(); l2.mostrarInfo(); l3.mostrarInfo(); l4.mostrarInfo();
}
    
    public static void ejecutarBloqueE() {
    System.out.println("\n=== BLOQUE E: CONSTRUCTORES ===");

    // Ejercicio 25: Dos formas de crear un Libro
    System.out.println("\n--- Ejercicio 25: Instanciando Libros ---");
    Libro libroVacio = new Libro(); // Constructor vacío
    libroVacio.titulo = "La Voragine";
    
    Libro libroParam = new Libro("Rayuela", "Julio Cortazar", 600); // Con parámetros
    
    libroVacio.mostrarInfo();
    libroParam.mostrarInfo();

    // Ejercicio 26: Instanciando Productos
    System.out.println("\n--- Ejercicio 26: Instanciando Productos ---");
    Producto pVacio = new Producto();
    pVacio.nombre = "Mouse";
    pVacio.precio = 200.0;
    pVacio.stock = 3;
    
    Producto pParam = new Producto("Teclado Gamer", 150.0, 10);
    
    pVacio.mostrarProducto();
    pParam.mostrarProducto();

    // Ejercicio 28: Tres cuentas bancarias
    System.out.println("\n--- Ejercicio 28: Creacion masiva de Cuentas ---");
    CuentaBancaria c1 = new CuentaBancaria("001", "Andres Rodríguez", 5000.0);
    CuentaBancaria c2 = new CuentaBancaria("002", "Juan Perez", 1200.0);
    CuentaBancaria c3 = new CuentaBancaria("003", "María Lopez", 3500.0);

    c1.mostrarSaldo();
    c2.mostrarSaldo();
    c3.mostrarSaldo();
   }
    
    public static void ejecutarBloqueF() {
    System.out.println("\n=== BLOQUE F: DIVERSIDAD DE CONSTRUCCION ===");

    // Ejercicio 30: Tres formas de Estudiante
    System.out.println("\n--- Ejercicio 30: Sobrecarga en Estudiante ---");
    Estudiante e1 = new Estudiante();
    Estudiante e2 = new Estudiante("Andres Rodriguez", "750241");
    Estudiante e3 = new Estudiante("Isabella Yepes", "123050", 6);
    
    e1.mostrarInformacion();
    e2.mostrarInformacion();
    e3.mostrarInformacion();

    // Ejercicio 32: Metodo Fabrica en Producto
    System.out.println("\n--- Ejercicio 32: Metodo Fabrica (Static Factory) ---");
    Producto pb1 = Producto.crearProductoBasico("Lapiz");
    Producto pb2 = Producto.crearProductoBasico("Borrador");
    
    pb1.mostrarProducto();
    pb2.mostrarProducto();

    // Ejercicio 34: Constructor Copia en Libro
    System.out.println("\n--- Ejercicio 34: Constructor Copia ---");
    Libro original = new Libro("Cien anos de soledad", "Gabo", 496);
    Libro copia = new Libro(original); // Aqui se usa el constructor copia
    
    System.out.println("Original:"); original.mostrarInfo();
    System.out.println("Copia:"); copia.mostrarInfo();
  }
    
    public static void ejecutarBloqueH() {
    System.out.println("\n=== BLOQUE H: EJERCICIOS ARGUMENTATIVOS ===");

    // Ejercicio 42
    Curso c1 = new Curso();
    c1.nombre = "Programacion Orientada a Objetos";
    Curso c2 = new Curso();
    c2.nombre = "Calculo Vectorial";
    
    System.out.println("Cursos creados: " + c1.nombre + " y " + c2.nombre);

    // Ejercicio 44
    Paciente p1 = new Paciente();
    p1.nombre = "Andres Rodriguez";
    System.out.println("Paciente instanciado: " + p1.nombre);
}
}
