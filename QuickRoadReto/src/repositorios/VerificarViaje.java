package repositorios;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VerificarViaje {
	public static boolean existeViaje(String idVia) {
	    String sql = "SELECT 1 FROM viaje WHERE id_viaje = ?";
	    try (PreparedStatement ps = ConectorBD.conexion.prepareStatement(sql)) {
	        ps.setString(1, idVia);
	        return ps.executeQuery().next(); 
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	        return false;
	    }
	}

}
