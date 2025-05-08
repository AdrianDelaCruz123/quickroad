package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Clases.Camion;
import repositorios.Sesion;
import vistas.VistaBienvenidaEmpleado;
import vistas.VistaCamion;
import vistas.VistaCamiones;
import vistas.VistaLogin;

public class ControladorVistaCamiones {
	private VistaCamiones vista;

	public ControladorVistaCamiones(VistaCamiones vista) {
		this.vista = vista;

		this.vista.getAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaLogin v = new VistaLogin(); 
            	ControlerLogin c = new ControlerLogin(v);
				c.iniciar();
            }
        });
		this.vista.getAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaLogin v = new VistaLogin(); 
            	ControlerLogin c = new ControlerLogin(v);
				c.iniciar();
            }
        });
		this.vista.getJlistProductos().addListSelectionListener(e -> {

			if (!e.getValueIsAdjusting()) {
				Camion camionSeleccionado = this.vista.getJlistProductos().getSelectedValue();
				VistaCamion v = new VistaCamion(camionSeleccionado);
				ControladorVistaCamion c = new ControladorVistaCamion(v);
				c.iniciar();
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
