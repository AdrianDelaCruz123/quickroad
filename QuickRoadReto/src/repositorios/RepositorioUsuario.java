package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class RepositorioUsuario {
	
	
	public static boolean verificarUsuario(String usuario, String password){
		String query = "SELECT * FROM camionero WHERE nombre=? AND contraseña=?";
		
		try (PreparedStatement preparedStatement = ConectorBD.conexion.prepareStatement(query)) {
			
			preparedStatement.setString(1, usuario);
			preparedStatement.setString(2, password);
            
			ResultSet resultSet = preparedStatement.executeQuery(); 
			if (resultSet.next()) {
		         	return true;
			}
		} catch (SQLException e) {
			System.out.println("Hubo un error");
			e.printStackTrace();
		}
		//Desde aqui se conectara a la BD y hara la consulta pertinente para verificar que 
		// el usuario este registrado.
		return false;
	}
		
    

}

