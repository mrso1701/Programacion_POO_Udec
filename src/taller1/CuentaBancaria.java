package taller1;

public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    //Constructor por defecto 
    public CuentaBancaria() {
        this.numeroCuenta = "0000000000";
        this.saldo = 0.0;
        this.tipoCuenta = "No definido";
    }

    //Constructor parametrizado con dos parametros 
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0; // Saldo inicial por defecto
    }

    //Constructor sobrecargado con tres parametros 
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Metodo para mostrar los detalles 
    public void mostrarInformacion() {
        System.out.println("Numero de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("---------------------------");
    }
}
