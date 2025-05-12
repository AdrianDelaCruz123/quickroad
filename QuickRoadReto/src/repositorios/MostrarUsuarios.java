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
				String dni = rs.getString("dni");
				int telefono = rs.getInt("telefono");
				String tipo = rs.getString("tipo");
				String direccion= rs.getString("direccion");
				String contraseña= rs.getString("contraseña");
				String estado= rs.getString("estado");

				

				Usuario u = new Usuario(nombre, dni, telefono, direccion, contraseña,tipo,estado);
				listaUsuarios.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaUsuarios;
	}

	public static ArrayList<Usuario> buscarPorNombre(String textoBusqueda) {

		String query = "SELECT * from camionero WHERE nombre LIKE ?";
		ArrayList<Usuario> listaProductos = new ArrayList<Usuario>();
		
		try (PreparedStatement stmt = ConectorBD.conexion.prepareStatement(query)) {
		
			stmt.setString(1, "%" + textoBusqueda + "%");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String dni = rs.getString("dni");
				int telefono = rs.getInt("telefono");
				String tipo = rs.getString("tipo");
				String direccion= rs.getString("direccion");
				String contraseña= rs.getString("contraseña");
				String estado= rs.getString("estado");
				
				Usuario u = new Usuario(nombre, dni, telefono, direccion, contraseña,tipo,estado);
				
				listaProductos.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaProductos;
	}
}
