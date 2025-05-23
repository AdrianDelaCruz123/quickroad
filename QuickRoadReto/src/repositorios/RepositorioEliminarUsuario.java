package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositorioEliminarUsuario {
    public static boolean eliminarUsuario(String dni) {
        try {
            String obtenerIdQuery = "SELECT id_camionero FROM camionero WHERE dni = ?";
            int idCamionero = -1;
            try (PreparedStatement obtenerIdStmt = ConectorBD.conexion.prepareStatement(obtenerIdQuery)) {
                obtenerIdStmt.setString(1, dni);
                ResultSet rs = obtenerIdStmt.executeQuery();
                if (rs.next()) {
                    idCamionero = rs.getInt("id_camionero");
                } else {
                    System.out.println("No se encontró un camionero con el DNI proporcionado.");
                    return false;
                }
            }
            String checkViajesQuery = "SELECT COUNT(*) FROM viaje WHERE id_camionero = ?";
            try (PreparedStatement checkStmt = ConectorBD.conexion.prepareStatement(checkViajesQuery)) {
                checkStmt.setInt(1, idCamionero);
                ResultSet rs = checkStmt.executeQuery();
                rs.next();
                int cantidadViajes = rs.getInt(1);

                if (cantidadViajes > 0) {
                    System.out.println("No se puede eliminar el camionero: tiene " + cantidadViajes + " viaje(s) asignado(s).");
                    return false;
                }
            }
            String deleteQuery = "DELETE FROM camionero WHERE dni = ?";
            try (PreparedStatement deleteStmt = ConectorBD.conexion.prepareStatement(deleteQuery)) {
                deleteStmt.setString(1, dni);
                int filasAfectadas = deleteStmt.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("¡Usuario eliminado con éxito!");
                    return true;
                } else {
                    System.out.println("No se pudo eliminar el usuario.");
                    return false;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error durante el proceso de eliminación.");
            return false;
        }
    }
}
