package repositorios;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Clases.Usuario;
import Clases.Viaje;

public class RepositorioViaje {

    public static List<Viaje> obtenerTodos() {
    	String query = "SELECT * FROM viaje";
    	List<Viaje> lista = new ArrayList<>();		
    	try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)) {

			ResultSet resultSet = sentencia.executeQuery();

			while (resultSet.next()) {
				String id = resultSet.getString("id_viaje");
                String origen = resultSet.getString("ciudad_origen");
                String destino = resultSet.getString("ciudad_destino");
                String fechaSalida = resultSet.getString("fecha_salida");
                String fechaLlegada = resultSet.getString("fecha_llegada");
                String estado = resultSet.getString("estado");

                Viaje v = new Viaje(id, origen, destino, fechaSalida, fechaLlegada, estado);
                lista.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
    }
    public static boolean insertarViaje(Viaje viaje) {
    	String query = "INSERT INTO viaje (id_viaje, ciudad_origen, ciudad_destino, fecha_salida, fecha_llegada, estado) VALUES (?, ?, ?, ?, ?, ?)";
    	try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)) {

    		sentencia.setString(1, viaje.getId());
    		sentencia.setString(2, viaje.getOrigen());
    		sentencia.setString(3, viaje.getDestino());
    		sentencia.setString(4, viaje.getFechaSalida());
    		sentencia.setString(5, viaje.getFechaLlegada());
    		sentencia.setString(6, viaje.getEstado());
    		sentencia.executeUpdate();
        	return true;
		} catch (SQLException e) {
			e.printStackTrace();
            return false;
		}
    }
}
