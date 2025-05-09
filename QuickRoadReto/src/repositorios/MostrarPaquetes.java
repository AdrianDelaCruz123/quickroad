package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Clases.Camion;
import Clases.Paquete;

public class MostrarPaquetes {
	public static ArrayList<Paquete> MostrarPaquetes() {
		String query = "SELECT * FROM quickroad.paquete";
		ArrayList<Paquete> listaProductos = new ArrayList<Paquete>();
		try (PreparedStatement stmt = ConectorBD.conexion.prepareStatement(query)) {

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				 int idPaquete = rs.getInt("id_paquete");
				String decripcion = rs.getString("descripcion");
				double peso = rs.getDouble("peso_kg");
				double alto= rs.getDouble("alto_cm");
				double ancho = rs.getDouble("ancho_cm");
				String fecharecogida = rs.getString("fecha_recogida");
				String fechaEntrega= rs.getString("fecha_entrega_real");
				String estado= rs.getString("estado");
				

				Paquete p = new Paquete(idPaquete, decripcion, peso, alto, ancho,fecharecogida,fechaEntrega, estado);
				listaProductos.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaProductos;
	}
}
