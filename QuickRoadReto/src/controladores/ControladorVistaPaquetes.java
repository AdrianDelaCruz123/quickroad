package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Clases.Camion;
import Clases.Paquete;
import repositorios.Sesion;
import vistas.VistaAñadirPaquete;
import vistas.VistaBienvenidaEmpleado;
import vistas.VistaCamion;
import vistas.VistaCamiones;
import vistas.VistaLogin;
import vistas.VistaPaquete;
import vistas.VistaPaquetes;

public class ControladorVistaPaquetes {
	private VistaPaquetes vista;

	public ControladorVistaPaquetes(VistaPaquetes vista) {
		this.vista = vista;

		this.vista.getBtnSalir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaBienvenidaEmpleado v = new VistaBienvenidaEmpleado(); 
            	ControlerBienvenidaEmpleado c = new ControlerBienvenidaEmpleado(v);
				c.iniciar();
            }
        });
		this.vista.getBotonAñadirProductos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaAñadirPaquete v = new VistaAñadirPaquete(); 
            	ControladorAñadirPaquete c = new ControladorAñadirPaquete(v);
				c.iniciar();
            }
        });
		this.vista.getJlistProductos().addListSelectionListener(e -> {

			if (!e.getValueIsAdjusting()) {
				Paquete paquetes = this.vista.getJlistProductos().getSelectedValue();
				VistaPaquete v = new VistaPaquete(paquetes);
				ControladorVistaPaquete c = new ControladorVistaPaquete(v);
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
