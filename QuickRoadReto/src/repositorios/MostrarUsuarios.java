package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Clases.Camion;
import Clases.Paquete;
import Clases.Usuario;

public class MostrarUsuarios {
	public static ArrayList<Usuario> MostrarPaquetes() {
		String query = "SELECT * FROM quickroad.camionero";
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		try (PreparedStatement stmt = ConectorBD.conexion.prepareStatement(query)) {

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellidos");
				String dni = rs.getString("dni");
				int telefono = rs.getInt("telefono");
				String tipo = rs.getString("tipo");
				String direccion= rs.getString("direccion");
				String contraseña= rs.getString("contraseña");
				

				Usuario p = new Usuario(nombre, dni, telefono, direccion, contraseña,tipo);
				listaUsuarios.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaUsuarios;
	}
}
