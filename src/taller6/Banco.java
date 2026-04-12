package taller6;

public class Banco {
    // Propiedad protegida: Esto es una mala práctica para datos financieros
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para mostrar el saldo de forma controlada
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}
