package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;



public class RepositorioUsuario {
	
	
	public static boolean verificarUsuario(String usuario, String password){
		String query = "SELECT * FROM camionero WHERE nombre=? AND contraseña=?";
		
		try (PreparedStatement preparedStatement = ConectorBD.conexion.prepareStatement(query)) {
			
			preparedStatement.setString(1, usuario);
			preparedStatement.setString(2, password);
            
			ResultSet resultSet = preparedStatement.executeQuery(); 
			if (resultSet.next()) {  
			    String bloqueado = resultSet.getString("estado");
			    if ("BLOQUEADO".equalsIgnoreCase(bloqueado)) {
			        JOptionPane.showMessageDialog(null, "El usuario " + usuario + " está bloqueado");
			        return false;
			    }
			    return true;
			}

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
	
	public static boolean verificarEstadoUsuario(String usuario, String password){
		String query = "SELECT * FROM camionero WHERE nombre=? AND contraseña=? AND tipo='ADMIN'";
		
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
		
	public static boolean bloquearUsuario(String dni) {
        String query = "UPDATE camionero SET estado = 'BLOQUEADO' WHERE dni = ?";
        try (PreparedStatement preparedStatement = ConectorBD.conexion.prepareStatement(query)) {
        	preparedStatement.setString(1, dni);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al bloquear usuario: " + e.getMessage());
            return false;
        }
    }
	public static boolean desbloquearUsuario(String dni) {
        String query = "UPDATE camionero SET estado = 'DESBLOQUEADO' WHERE dni = ?";
        try (PreparedStatement preparedStatement = ConectorBD.conexion.prepareStatement(query)) {
        	preparedStatement.setString(1, dni);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al desbloquear usuario: " + e.getMessage());
            return false;
        }
    }

    public static boolean eliminarUsuario(String id) {
        String query = "DELETE FROM camionero WHERE dni = ?";
        try (PreparedStatement preparedStatement = ConectorBD.conexion.prepareStatement(query)) {
        	preparedStatement.setString(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al eliminar usuario: " + e.getMessage());
            return false;
        }
    }

}

