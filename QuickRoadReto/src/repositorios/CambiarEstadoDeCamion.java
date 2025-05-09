package repositorios;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CambiarEstadoDeCamion {
	public static void  cambiarActivo( String matricula) {
		
		String[] partes = matricula.split(": ");
		String valor = partes[1]; // Esto será "1234ABC"
		String query = "UPDATE camion SET estado ='ACTIVO' WHERE matricula = ?";
		try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)){
			sentencia.setString(1, valor);
			

			int resultSet = sentencia.executeUpdate(); 
			if (resultSet > 0) {
				System.out.println("¡Ahora el camion esta activo!");
			} else {
				System.out.println("Hubo un error al cambiar el estado del camion");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Ocurrió un error.");
		}

	}
	public static void  cambiarInactivo( String matricula) {
		String[] partes = matricula.split(": ");
		String valor = partes[1]; // Esto será "1234ABC"
		String query = "UPDATE camion SET estado = 'INACTIVO' WHERE matricula = ?";
		try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)){
			sentencia.setString(1, valor);
	

			int resultSet = sentencia.executeUpdate(); 
			if (resultSet > 0) {
				System.out.println("¡Ahora el camion esta inactivo!");
			} else {
				System.out.println("Hubo un error al cambiar el estado del camion");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Ocurrió un error.");
		}

	}
	public static void  cambiarMantenimiento( String matricula) {
		String[] partes = matricula.split(": ");
		String valor = partes[1]; // Esto será "1234ABC"
		String query = "UPDATE camion SET estado = 'MANTENIMIENTO' WHERE matricula = ?";
		try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)){
			sentencia.setString(1, valor);
	

			int resultSet = sentencia.executeUpdate(); 
			if (resultSet > 0) {
				System.out.println("¡Ahora el camion esta en mantenimiento!");
			} else {
				System.out.println("Hubo un error al cambiar el estado del camion");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Ocurrió un error.");
		}

	}
}