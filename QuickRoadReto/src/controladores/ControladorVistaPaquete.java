package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import repositorios.Sesion;
import vistas.VistaCamion;
import vistas.VistaLogin;
import vistas.VistaPaquete;

public class ControladorVistaPaquete {
	private VistaPaquete vista;

	public ControladorVistaPaquete(VistaPaquete vista) {
		this.vista = vista;

		this.vista.getAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            }
        });
		this.vista.getBotonDescargar().addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String cont = vista.getIdPaquete().getText() + "\n"
		                             + vista.getDescripcion().getText() + "\n"
		                             + vista.getPeso().getText() + "\n"
		                             + vista.getAlto().getText() + "\n"
		                             + vista.getAncho().getText() + "\n"
		                             + vista.getFechaRecogida().getText() + "\n"
		                             + vista.getFechaEntrega().getText() + "\n"
		                             + vista.getEstado().getText();

		            String nom = "InformacionPaquete.txt";
		            
		            BufferedWriter w = new BufferedWriter(new FileWriter(nom));
		            w.write(cont);
		            w.close();

		            JOptionPane.showMessageDialog(null, "Paquete descargado en: " + nom);
		        } catch (IOException ex) {
		            JOptionPane.showMessageDialog(null, "Error al descargar la informacion del paquete: " + ex.getMessage());
		        }
		    }
		});

	}
	
	

	public void iniciar() {
		if (!Sesion.estaLogueado()) {
		    JOptionPane.showMessageDialog(null, "Debes iniciar sesión primero.");
		    VistaLogin login = new VistaLogin(); 
		    ControlerLogin c = new ControlerLogin(login);
		    c.iniciar();
		    vista.dispose();
		    return;
		}
		
		vista.setVisible(true);
	}
}
