package taller0;

public class Temperatura {
    double celsius;
    
    // CONSTRUCTOR CON PARÁMETROS
    public Temperatura(double celsius) {
        this.celsius = celsius;
    }
    
    
    // Método para convertir a Fahrenheit
    public double obtenerFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
    
    public void mostrarResultado() {
        System.out.println(celsius + "°C equivalen a " + obtenerFahrenheit() + "°F");
    }
}
