package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Clases.Camion;
import Clases.Paquete;
import Clases.Usuario;

public class MostrarCamion {
	public static ArrayList<Camion> mostrarCamiones() {
		String query = "SELECT * FROM quickroad.camion";
		ArrayList<Camion> listaProductos = new ArrayList<Camion>();
		try (PreparedStatement stmt = ConectorBD.conexion.prepareStatement(query)) {

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String mat = rs.getString("matricula");
				String mod = rs.getString("modelo");
				String marc = rs.getString("marca");
				String año = rs.getString("anio_fabricacion");
				double capacidad = rs.getDouble("capacidad_kg");
				String estado = rs.getString("estado");

				Camion c = new Camion(mat, mod, marc, año, capacidad, estado);
				listaProductos.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaProductos;
	}
	
	public static ArrayList<Camion> buscarPorNombre(String textoBusqueda) {

		String query = "SELECT * from camion WHERE matricula LIKE ?";
		ArrayList<Camion> listaCamiones = new ArrayList<Camion>();
		
		try (PreparedStatement stmt = ConectorBD.conexion.prepareStatement(query)) {
		
			stmt.setString(1, "%" + textoBusqueda + "%");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String mat = rs.getString("matricula");
				String mod = rs.getString("modelo");
				String marc = rs.getString("marca");
				String año = rs.getString("anio_fabricacion");
				double capacidad = rs.getDouble("capacidad_kg");
				String estado = rs.getString("estado");
				
				Camion c = new Camion(mat, mod, marc, año, capacidad, estado);
				
				listaCamiones.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCamiones;
	}
	
}
