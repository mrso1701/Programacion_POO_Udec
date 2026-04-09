package taller0;

public class Main {

    
    public static void main(String[] args) {
        ejecutarBloqueB();
    }
    
    public static void ejecutarEstudiante(){
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
    }
    
    public static void ejecutarVehiculo(){
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
    }
    
    public static void ejecutarProducto(){
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
    }
    
    public static void ejecutarMascota(){
        System.out.println("\n--- CLASE MASCOTA ---");
        
        Mascota mascota = new Mascota();
        
        mascota.nombre = "Frodo";
        mascota.especie = "Pomerania";
        mascota.edad = 4;
        
        mascota.mostrarMascota();
        
        // CORRECCIÓN: Construimos (instanciamos) el objeto
        Mascota miMascota = new Mascota(); 
    
        miMascota.nombre = "Luna";
        miMascota.especie = "Gato";
    
        miMascota.mostrarMascota();
        
        
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
        CuentaBancaria ct1 = new CuentaBancaria("001", "Andres Rodríguez", 500.0);
        CuentaBancaria ct2 = new CuentaBancaria("002", "María García", 1200.50);
        CuentaBancaria ct3 = new CuentaBancaria("003", "Juan Pérez", 0.0);

         // Mostramos la información de las tres para verificar
         ct1.mostrarSaldo();
         ct2.mostrarSaldo();
         ct3.mostrarSaldo();
    }
    
    public static void ejecutarLibro(){
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
     libroA.titulo = "Cronica de una muerte anunciada";
     libroA.autor = "Gabriel García Márquez";
     libroA.paginas = 150;

     
     // Pasamos todos los datos de una vez dentro de los paréntesis
     Libro libroB = new Libro("Rayuela", "Julio Cortázar", 600);

     // Mostramos ambos en la consola para verificar que se guardaron bien
     libroA.mostrarInfo();
     libroB.mostrarInfo();
     
     
     // Prueba Ejercicio 33: Constructor Copia 
     Libro original = new Libro("La Voragine", "José Eustasio Rivera", 300);
     // Creamos la copia pasando el objeto 'original' como argumento
     Libro copia = new Libro(original);

     System.out.println("--- Datos del Libro Original ---");
     original.mostrarInfo();
     
     System.out.println("--- Datos del Libro Copia ---");
     copia.mostrarInfo();
     
    }
    
    public static void ejecutarCurso(){
     System.out.println("\n--- CLASE CURSO ---");
     //EJERCICIO 42
     Curso curso1 = new Curso();
     curso1.nombre = "Programacion Orientada a Objetos";
     curso1.codigo = "POO101";
     curso1.creditos = 4;

     Curso curso2 = new Curso();
     curso2.nombre = "Calculo Vectorial";
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
    }
    
    public static void ejecutarCelular(){
        
// EJERCICIO 47: Uso correcto con instanciación
     Celular miCelular = new Celular(); // <--- CORRECCIÓN: Ahora el objeto sí existe

     miCelular.marca = "Samsung";
     miCelular.encender(); // Ahora funciona perfectamente
    }
    
    public static void ejecutarPedido(){
        System.out.println("\n========= CLASE PEDIDO =========");
     // EJERCICIO 69: Creación de cinco objetos diferentes
     /* * EJERCICIO 70: SUSTENTACIÓN TÉCNICA
     * * 1. CLASE SELECCIONADA: Pedido (Relacionada con el contexto de negocio).
     * * 2. OBJETOS INSTANCIADOS: 
     * Se crearon 5 objetos (pedido1, pedido2, pedido3, pedido4, pedido5) que representan mesas reales 
     * en un restaurante con diferentes platos y estados de pago.
     * * 3. ATRIBUTOS:
     * - numeroMesa: Identificador entero de la ubicación.
     * - platoPrincipal: Cadena de texto con el nombre del pedido.
     * - precio: Valor decimal que representa el costo del plato.
     * - pagado: Valor booleano que define si la cuenta fue saldada.
     * * 4. COMPORTAMIENTOS:
     * - marcarComoPagado(): Cambia el estado interno del objeto a verdadero.
     * - mostrarDetalles(): Imprime en consola la información completa del objeto.
     */
        
        Pedido pedido1 = new Pedido();
        pedido1.numeroMesa = 5; 
        pedido1.platoPrincipal = "Pizza Pepperoni"; 
        pedido1.precio = 25000; 
        pedido1.pagado = false;

        // Objeto 2
        Pedido pedido2 = new Pedido();
        pedido2.numeroMesa = 2; 
        pedido2.platoPrincipal = "Hamburguesa Doble"; 
        pedido2.precio = 18500; 
        pedido2.pagado = true;

        // Objeto 3
        Pedido pedido3 = new Pedido();
        pedido3.numeroMesa = 10; 
        pedido3.platoPrincipal = "Desgranado Familiar"; 
        pedido3.precio = 35000; 
        pedido3.pagado = false;

        // Objeto 4
        Pedido pedido4 = new Pedido();
        pedido4.numeroMesa = 4; 
        pedido4.platoPrincipal = "Perro Caliente"; 
        pedido4.precio = 12000; 
        pedido4.pagado = true;

        // Objeto 5 
        Pedido pedido5 = new Pedido();
        pedido5.numeroMesa = 8; 
        pedido5.platoPrincipal = "Salchipapa Especial"; 
        pedido5.precio = 22000; 
        pedido5.pagado = false;

        // Llamada al método para cada objeto
        pedido1.mostrarDetalles();
        pedido2.mostrarDetalles();
        pedido3.mostrarDetalles();
        pedido4.mostrarDetalles();
        pedido5.mostrarDetalles();
    }
    
    public static void ejecutarTemperatura(){
        System.out.println("============== CLASE TEMPERATURA ============");
        // EJERCICIO 71
        // Ahora creamos el objeto y pasamos el valor de una vez
        Temperatura t1 = new Temperatura(25.0);
        t1.mostrarResultado();
        
        Temperatura t2 = new Temperatura(10.0);
        t2.mostrarResultado();
    }
    
    public static void ejecutarAvion(){
        System.out.println("\n============== CLASE AVION ================");
        // Prueba Ejercicio 72 (Fábrica)
        Avion miAvion = Avion.crearAvionComercial("Avianca", "Bogotá");
        miAvion.mostrarInfo();
    }
    
    public static void ejecutarUsuarioSistema(){
        System.out.println("\n================= CLASE USUARIO SISTEMA =================");
        UsuarioSistema user1 = new UsuarioSistema("andres_dev", "1234");
        UsuarioSistema userClonado = new UsuarioSistema(user1); // Se copia user1
    
        System.out.println("--- Usuarios ---");
        user1.mostrarUsuario();
        userClonado.mostrarUsuario();
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
}
