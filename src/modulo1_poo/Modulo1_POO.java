package modulo1_poo;

import taller0.*;

public class Modulo1_POO {

    public static void main(String[] args) {
       ejecutarBloque();
    }    
    
     public static void ejecutarBloque() {
        System.out.println("\n--- [OBJETOS] ---");
        
        System.out.println("\n--- CLASE ESTUDIANTE ---");
        Estudiante est1 = new Estudiante(); 
        
        // Asignación manual
        est1.nombre = "Andres David Rodriguez";
        est1.codigo = "750241000";
        est1.semestre = 3;
        
         /* EJERCICIO 19: Explicación de Clase vs Objeto
        "Estudiante" es una clase porque es el molde, plantilla o plano que define 
        qué atributos (nombre, código) y métodos tendrá cualquier estudiante.
        "est" (o est1) es un objeto porque es una instancia concreta y real creada 
        a partir de ese molde, con datos específicos en la memoria.*/
        
        // MOSTRAR INFO 
        est1.mostrarInformacion();
        
        Estudiante est2 = new Estudiante(); 
        
        est2.nombre = "Isabella Yepes";
        est2.codigo = "123050345";
        est2.semestre = 6;
        est2.mostrarInformacion();
        
        Estudiante est3 = new Estudiante("Rafael Maldonado","499450123");
        est3.mostrarInformacion();
        
        Estudiante est4 = new Estudiante("Alejandor Rodriguez", "39359498",5);
        est4.mostrarInformacion();
        
         Mascota miPerro = new Mascota();
         miPerro.nombre = "Firulais";
         
         est1.acariciarMascota(miPerro);

        // ERROR: Intentar acceder a los datos de 'miPerro' 
        // como si fueran globales o sin usar la variable correcta.
     
             
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE VEHICULO ---");
    
        // Instanciamos el vehículo 
        Coche carro1 = new Coche(); 
    
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.velocidadActual = 32.0;
         System.out.println("Vehiculo 1: ");
        carro1.mostrarEstado();
        
        Coche carro2 = new Coche(); 
    
        carro2.marca = "Mazda";
        carro2.modelo = "3";
        carro2.velocidadActual = 74.6;
        System.out.println("\nVehiculo 2: ");
        carro2.mostrarEstado();
        
        
        Coche carro3 = new Coche();
        carro3.marca = "Mazda";     // Atributo IGUAL
        carro3.modelo = "3";        // Distinto
        carro3.velocidadActual = 0; // Distinto
        carro3.mostrarEstado();
        
        Coche carro4 = new Coche();
        carro4.marca = "Mazda";     // Atributo IGUAL
        carro4.modelo = "CX-5";     // Distinto
        carro4.velocidadActual = 80;// Distinto
        carro4.mostrarEstado();
         
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE PRODUCTO ---");
        
        Producto prod1 = new Producto();
        
        prod1.nombre = "Asus TUFF GAMING";
        prod1.precio = 3000000.0;
        prod1.stock = 12;
        
        prod1.mostrarProducto();
        
        Producto prod2 = new Producto();
        
        prod2.nombre = "Impresora EPSON";
        prod2.precio = 1500000.0;
        prod2.stock = 4;
        
        prod2.mostrarProducto();
        
        Producto prod3 = new Producto();
        
        prod3.nombre = "Asus TUFF GAMING";
        prod3.precio = 3000000.0;
        prod3.stock = 12;
        
        prod3.mostrarProducto();
        
        // EJERCICIO 20: Tres objetos de una misma clase
        Producto p4 = new Producto();
        p4.nombre = "Celular";
        p4.precio = 1500.0;
        p4.stock = 5;

        Producto p5 = new Producto();
        p5.nombre = "Teclado";
        p5.precio = 50.0;
        p5.stock = 20;

        Producto p6 = new Producto();
        p6.nombre = "Monitor";
        p6.precio = 300.0;
        p6.stock = 10;
        
        
        // EJERCICIO 26: Probando constructores en Producto

         // 1. Usando el constructor vacío
         Producto p7 = new Producto();
         p7.nombre = "Mouse Gamer";
         p7.precio = 25.0;
         p7.stock = 15;

         // 2. Usando el constructor con parámetros (Más rápido)
         Producto p8 = new Producto("Monitor 4K", 350.0, 8);

         // Imprimimos ambos
        prod1.mostrarProducto();
        prod2.mostrarProducto();

     /*EXPLICACIÓN EJERCICIO 20:
     Qué comparten: Los tres objetos comparten la misma CLASE (Producto), 
     lo que significa que tienen los mismos atributos (nombre, precio, stock) 
     y los mismos métodos (vender, reabastecer).
     En qué se diferencian: Se diferencian en su ESTADO. Cada objeto tiene 
     valores distintos en sus atributos y ocupa un lugar único en la memoria.*/
     
       //Ejercicio 31
       
       Producto productoBasico = Producto.crearProductoBasico("Lapiz");
       Producto productoBasico2 = Producto.crearProductoBasico("Licuadora");
       
       productoBasico.mostrarProducto();
       productoBasico2.mostrarProducto();
               
        
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE MASCOTA ---");
        
        // ERROR: El estudiante definió la clase Mascota, 
        // pero aquí en el Main el código está vacío o solo hay comentarios.
    
        // Se olvidó de: Mascota miMascota = new Mascota();
        
        
        
        ////////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE CUENTA BANCARIA ---");
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        cuenta1.numeroCuenta = "14300545";
        cuenta1.titular = "Andres Rodriguez";
        cuenta1.saldo = 3400000;
        
        cuenta1.mostrarSaldo();
        
        CuentaBancaria cuenta2 = new CuentaBancaria();
        
        cuenta2.numeroCuenta = "49951293";
        cuenta2.titular = "Alejandro Rodriguez";
        cuenta2.saldo = 12000000;
        
        cuenta2.mostrarSaldo();
        
        //Ejercicio 28
        CuentaBancaria ct1 = new CuentaBancaria("001", "Andrés Rodríguez", 500.0);
        CuentaBancaria ct2 = new CuentaBancaria("002", "María García", 1200.50);
        CuentaBancaria ct3 = new CuentaBancaria("003", "Juan Pérez", 0.0);

         // Mostramos la información de las tres para verificar
         ct1.mostrarSaldo();
         ct2.mostrarSaldo();
         ct3.mostrarSaldo();
        
        //////////////////////////////////////////////////////////////////
        System.out.println("\n--- CLASE LIBRO ---");
        Libro l1 = new Libro();
        l1.titulo = "Cien años de soledad";
        l1.autor = "Gabriel García Márquez";
        l1.paginas = 496;

       Libro l2 = new Libro();
       l2.titulo = "El resplandor";
       l2.autor = "Stephen King";
       l2.paginas = 447;

       Libro l3 = new Libro();
       l3.titulo = "Don Quijote de la Mancha";
       l3.autor = "Miguel de Cervantes";
       l3.paginas = 1032;

       Libro l4 = new Libro();
       l4.titulo = "El principito";
       l4.autor = "Antoine de Saint-Exupéry";
       l4.paginas = 96;

       // Mostramos los objetos en consola
       l1.mostrarInfo();
       l2.mostrarInfo();
       l3.mostrarInfo();
       l4.mostrarInfo();
       

       // CONCLUSIÓN DEL EJERCICIO:
     /*La clase 'Libro' actúa como plantilla porque define la estructura común 
   (todos los libros tienen título, autor y páginas) sin representar a ninguno en particular. 
   Los objetos (l1, l2, l3, l4) son casos concretos porque existen en la memoria 
   con datos reales, permitiendo que el programa maneje información específica de cada obra.*/
     
     //EJERCICIO 25
     // Primero creamos el objeto "en blanco" y luego le asignamos datos uno por uno
     Libro libroA = new Libro(); 
     libroA.titulo = "Crónica de una muerte anunciada";
     libroA.autor = "Gabriel García Márquez";
     libroA.paginas = 150;

     
     // Pasamos todos los datos de una vez dentro de los paréntesis
     Libro libroB = new Libro("Rayuela", "Julio Cortázar", 600);

     // Mostramos ambos en la consola para verificar que se guardaron bien
     libroA.mostrarInfo();
     libroB.mostrarInfo();
     
     
     // Prueba Ejercicio 33: Constructor Copia 
     Libro original = new Libro("La Vorágine", "José Eustasio Rivera", 300);
     // Creamos la copia pasando el objeto 'original' como argumento
     Libro copia = new Libro(original);

     System.out.println("--- Datos del Libro Original ---");
     original.mostrarInfo();
     
     System.out.println("--- Datos del Libro Copia ---");
     copia.mostrarInfo();
     
     ////////////////////////////////////////////////////////////////////////////////
     System.out.println("\n--- CLASE CURSO ---");
     //EJERCICIO 42
     Curso curso1 = new Curso();
     curso1.nombre = "Programación Orientada a Objetos";
     curso1.codigo = "POO101";
     curso1.creditos = 4;

     Curso curso2 = new Curso();
     curso2.nombre = "Cálculo Vectorial";
     curso2.codigo = "MAT202";
     curso2.creditos = 3;
     
     curso1.mostrarDetalles();
     curso2.mostrarDetalles();
     /*"Aunque curso1 y curso2 tienen datos distintos (
     uno es de Programación y otro de Cálculo ambos pertenecen
     a la misma clase Curso porque comparten la misma 
     naturaleza y estructura. La clase
     define el "qué es" (un curso con nombre, código y créditos), 
     mientras que los objetos definen el "quién es" (la información específica).*/
     
     /////////////////////////////////////////////////////////////////////////////
     System.out.println("====== CLASE CELULAR ======");
     
     // EJERCICIO 47: Uso correcto con instanciación
     Celular miCelular = new Celular(); // <--- CORRECCIÓN: Ahora el objeto sí existe

     miCelular.marca = "Samsung";
     miCelular.encender(); // Ahora funciona perfectamente
     }
}
