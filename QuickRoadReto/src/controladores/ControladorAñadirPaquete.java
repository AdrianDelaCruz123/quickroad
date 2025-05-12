package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import repositorios.RepositorioAñadirUsuario;
import vistas.VistaAñadirPaquete;
import vistas.VistaLogin;
import vistas.VistaPaquetes;
import vistas.VistaRegistrar;

public class ControladorAñadirPaquete {
	private VistaAñadirPaquete vista;
	
	public ControladorAñadirPaquete(VistaAñadirPaquete vista) {
		this.vista = vista;
		
		
		this.vista.getBtnAñadir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         	    String idVia = vista.getIdViaje().getText(); 
         	    String idRem = vista.getIdRemitente().getText();
         	    String idDest = vista.getIdDestinatario().getText();
         	    String desc = vista.getDescripcion().getText();
         	    String pes = vista.getPeso().getText();
         	    String alt = vista.getAlto().getText();
         	    String anc = vista.getAncho().getText();
         	    String fechRec = vista.getFechaRecogida().getText();
         	    String fechEnt = vista.getFechaEntrega().getText();
         	    String est = vista.getEstado().getText();
         	   if (!repositorios.VerificarViaje.existeViaje(idVia)) {
         		    javax.swing.JOptionPane.showMessageDialog(
         		        vista, "El ID de viaje no existe. Introduce uno válido.");
         		    return; 
         		}


         	   try {
         		    LocalDate fechaRecogida = LocalDate.parse(fechRec);
         		    LocalDate fechaEntrega = LocalDate.parse(fechEnt);

         		    if (!fechaEntrega.isAfter(fechaRecogida)) {
         		        javax.swing.JOptionPane.showMessageDialog(null, "La fecha de entrega debe ser posterior a la fecha de recogida.");
         		        return;
         		    }
         		} catch (DateTimeParseException ex) {
         		    javax.swing.JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Usa el formato: AAAA-MM-DD");
         		    return;
         		}

         	    repositorios.RepositorioAñadirPaquete.añadirPaquete(idVia, idRem, idDest, desc, pes, alt, anc, fechRec, fechEnt, est);
         	    vista.dispose();
         	   	VistaPaquetes v = new VistaPaquetes(); 
         	   	ControladorVistaPaquetes c=new ControladorVistaPaquetes(v);
				c.iniciar();
            	
            }
        });
		this.vista.getAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaPaquetes v = new VistaPaquetes(); 
            	ControladorVistaPaquetes c=new ControladorVistaPaquetes(v);
				c.iniciar();
            	
            }
        });
		
	}

	public void iniciar() {
	   vista.setVisible(true);
	}
}
