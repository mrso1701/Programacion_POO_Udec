package taller0;


public class CuentaBancaria {
    String numeroCuenta;
    String titular;
    double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para mostrar el estado de la cuenta
    public void mostrarSaldo() {
        System.out.println("Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo Actual: $" + saldo);
    }
}
