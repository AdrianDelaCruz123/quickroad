package repositorios;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CambiarEstadoViaje {
	public static boolean  cambiarNoIniciado( String id) {
		
		String query = "UPDATE viaje SET estado ='No_iniciado' WHERE id_viaje = ?";
		try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)){
			sentencia.setString(1, id);
			

			int resultSet = sentencia.executeUpdate(); 
			if (resultSet > 0) {
				return true;
			} else {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Ocurrió un error.");
			return false;
		}

	}
	public static boolean  cambiarFinalizado( String id) {
		String query = "UPDATE viaje SET estado ='En_transito' WHERE id_viaje = ?";
		try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)){
			sentencia.setString(1, id);
	

			int resultSet = sentencia.executeUpdate(); 
			if (resultSet > 0) {
				return true;
			} else {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Ocurrió un error.");
			return false;
		}

	}
	public static boolean  cambiarEnTransito( String id) {
		String query = "UPDATE viaje SET estado ='Finalizado' WHERE id_viaje = ?";
		try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)){
			sentencia.setString(1, id);
	

			int resultSet = sentencia.executeUpdate(); 
			if (resultSet > 0) {
				return true;
			} else {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Ocurrió un error.");
			return false;
		}

	}
}