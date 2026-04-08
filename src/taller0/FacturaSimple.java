package taller0;


public class FacturaSimple {
    public int numero;
    public String cliente;
    public double valor;
    
    public static double aplicarDescuento(double valor) {
        return valor * 0.90;
    }
    
    public void imprimirFactura() {
        System.out.println("===== FACTURA SIMPLE ====");
        System.out.println("Nro: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor: $" + valor);
        System.out.println("Valor con descuento: $" + aplicarDescuento(valor));
        System.out.println("-----------------------");
    }
}
