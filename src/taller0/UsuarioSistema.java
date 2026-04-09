package taller0;

public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;
    
    public UsuarioSistema(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    // CONSTRUCTOR COPIA
    // Recibe otro objeto de la misma clase como parámetro
    public UsuarioSistema(UsuarioSistema otroUsuario) {
        this.nombreUsuario = otroUsuario.nombreUsuario;
        this.clave = otroUsuario.clave;
    }

    public void mostrarUsuario() {
        System.out.println("Usuario: " + nombreUsuario);
    }
    
    // Método para activar el usuario
    public void activar() {
        activo = true;
    }

    // Método para desactivar el usuario
    public void desactivar() {
        activo = false;
    }
}
