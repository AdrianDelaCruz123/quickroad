package repositorios;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepositorioAñadirPaquete {
	public static void  añadirPaquete( String idViaje,String idRemitente, String idDestinatario,String descripcion, String peso,String alto, String ancho, String fechaRecogida, String fechaEntrega, String Estado) {
		String query = "INSERT INTO paquete (id_viaje, id_remitente, id_destinatario, descripcion, peso_kg, alto_cm, ancho_cm, fecha_recogida, fecha_entrega_real, estado) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (PreparedStatement sentencia = ConectorBD.conexion.prepareStatement(query)){
			sentencia.setString(1, idViaje);
			sentencia.setString(2, idRemitente);
			sentencia.setString(3, idDestinatario);
			sentencia.setString(4, descripcion);
			sentencia.setString(5, peso);
			sentencia.setString(6, alto);
			sentencia.setString(7, ancho);
			sentencia.setString(8, fechaRecogida);
			sentencia.setString(9, fechaEntrega);
			sentencia.setString(10, Estado);

			int resultSet = sentencia.executeUpdate(); 
			if (resultSet > 0) {
				System.out.println("¡Paquete registrado con exito!");
			} else {
				System.out.println("Hubo un error al registrar el usuario.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Ocurrió un error.");
		}
		
		
		
		

	}
}
