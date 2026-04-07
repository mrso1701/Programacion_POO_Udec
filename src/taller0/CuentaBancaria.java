package taller0;


public class CuentaBancaria {
    public String numeroCuenta;
    public String titular;
    public double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

   
    
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
    
    public void retirar(double valor) {
    // Solo restamos si el saldo es mayor o igual a lo que queremos sacar
    if (saldo >= valor) {
        saldo -= valor;
    } else {
        System.out.println("Saldo insuficiente");
    }
    }
}
