package taller0;


public class CuentaBancaria {
    public String numeroCuenta;
    public String titular;
    public double saldo;

   

    // Método para mostrar el estado de la cuenta
    public void mostrarSaldo() {
         System.out.println("--- Informacion de la cuenta ---");
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" +saldo);
    }
    
    
    public void consignar(double valor) {
        saldo += valor; 
    }
}
