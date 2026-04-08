package taller0;

public class Rectangulo {
    
    double base;
    double altura;
    
    
    public double calcularArea(){
      return base*altura; 
        
    }
    
    public double calcularPerimetro(){
        return  2*(base+altura);
        
    }
    
   public void mostrarResultado(){
       System.out.println("--- Datos del Rectángulo ---");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("----------------------------");
   }
}
