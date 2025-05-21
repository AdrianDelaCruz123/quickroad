package repositorios;

public class Sesion {
    private static String usuarioSesion = null;

    
    public static void setUsuarioActual(String usuario) {
        usuarioSesion = usuario;
    }

    public static String getUsuarioActual() {
        return usuarioSesion;
    }
    
    public static boolean estaLogueado() {
        return usuarioSesion != null;
    }
    
    public static void cerrarSesion() {
    	usuarioSesion = null;
    }
}


