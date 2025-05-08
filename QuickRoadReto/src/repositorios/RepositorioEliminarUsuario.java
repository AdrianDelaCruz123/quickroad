package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositorioEliminarUsuario {
		public static void  eliminarUsuario(String dni) {
			String query = "DELETE FROM camionero WHERE dni = ?";
			try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)){
				sentencia.setString(1, dni);
				int resultSet = sentencia.executeUpdate(); 
				if (resultSet > 0) {
					System.out.println("¡Usuario eliminado con exito!");
				} else {
					System.out.println("Hubo un error al eliminar el usuario.");
				}
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Ocurrió un error.");
			}
			
			
			
			

		}
}
