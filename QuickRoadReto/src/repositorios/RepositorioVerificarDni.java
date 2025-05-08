package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Clases.Usuario;
import vistas.VistaLogin;

public class RepositorioVerificarDni {
	public static boolean verificarUsuario(String dni){
		String query = "SELECT * FROM camionero WHERE dni=?";
		
		try (PreparedStatement preparedStatement = ConectorBD.conexion.prepareStatement(query)) {
			
			preparedStatement.setString(1, dni);
            
			ResultSet resultSet = preparedStatement.executeQuery(); 
			if (resultSet.next()) {
		         	return true;
			}
		} catch (SQLException e) {
			System.out.println("Hubo un error");
			e.printStackTrace();
		}
		
		return false;
	}
	public static void VerificarDNI(VistaLogin vista, Usuario usu) {
	    // Create a DNI verification dialog or use the existing interface
	    String dni;
	    boolean dniValido = false;
	    
	    do {
	        // You can either get the DNI from a text field or create a dialog
	        dni = vista.getTxtUsuario().getText(); // Assuming you use the usuario field for DNI
	        
	        if (dni.length() != 9) {
	            // Show error message - could be in a label or dialog
	            JOptionPane.showMessageDialog(vista, "Error. Introduce un DNI válido (9 caracteres).", 
	                                         "Error de validación", JOptionPane.ERROR_MESSAGE);
	        } else {
	            // Verify DNI format (8 digits followed by a letter)
	            String numero = dni.substring(0, 8);
	            String letra = dni.substring(8, 9).toUpperCase();
	            
	            try {
	                int numDNI = Integer.parseInt(numero);
	                // Additional validation could check if the letter matches the expected letter for that number
	                // For a simple validation, we'll just verify it's 8 digits and a letter
	                if (letra.matches("[A-Z]")) {
	                    usu.setDni(dni);
	                    dniValido = true;
	                } else {
	                    JOptionPane.showMessageDialog(vista, "El último carácter debe ser una letra.",
	                                                 "Error de validación", JOptionPane.ERROR_MESSAGE);
	                }
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(vista, "Los primeros 8 caracteres deben ser números.",
	                                             "Error de validación", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    } while (!dniValido);
	}



}

