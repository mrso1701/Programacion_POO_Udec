package taller0;

public class ProyectoSoftware {
    String titulo;
    String lenguajeProgramacion;
    double porcentajeProgreso;

    public void registrarAvance(double avance) {
        porcentajeProgreso += avance;
    }
}
