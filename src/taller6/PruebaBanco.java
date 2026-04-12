package taller6;

public class PruebaBanco {

    public static void main(String[] args) {
        Banco cuenta = new Banco(1000.0);
        
        // Acceso directo permitido por estar en el mismo paquete
        cuenta.saldo = 0.0; // Hackeo exitoso
        
        System.out.println("Después del ataque:");
        cuenta.mostrarSaldo();
    }
    
}
