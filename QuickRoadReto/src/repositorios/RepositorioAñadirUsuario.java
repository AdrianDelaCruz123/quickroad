package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositorioAñadirUsuario {
		public static void  añadirUsuario(String usuario, String contraseña,String apellido, String dni,String telefono, String direccion,String tipo) {
			String query = "INSERT INTO camionero ( nombre, apellidos, dni, telefono, direccion, contraseña, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";
			try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)){
				sentencia.setString(1, usuario);
				sentencia.setString(2, apellido);
				sentencia.setString(3, dni);
				sentencia.setString(4, telefono);
				sentencia.setString(5, direccion);
				sentencia.setString(6, contraseña);
				sentencia.setString(7, tipo);
				int resultSet = sentencia.executeUpdate(); 
				if (resultSet > 0) {
					System.out.println("¡Usuario registrado con exito!");
				} else {
					System.out.println("Hubo un error al registrar el usuario.");
				}
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Ocurrió un error.");
			}
			
			
			
			

		}
}
