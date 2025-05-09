package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

         	    repositorios.RepositorioAñadirPaquete.añadirPaquete(idVia, idRem, idDest, desc, pes, alt, anc, fechRec, fechEnt, est);
            	
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
