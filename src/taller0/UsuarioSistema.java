package taller0;

public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    // Método para activar el usuario
    public void activar() {
        activo = true;
    }

    // Método para desactivar el usuario
    public void desactivar() {
        activo = false;
    }
}
