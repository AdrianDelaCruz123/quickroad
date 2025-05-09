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
import vistas.VistaUsuarios;

public class ControlerUsuarios {
	private VistaUsuarios vista;

	public ControlerUsuarios(VistaUsuarios vista) {
		this.vista = vista;

		this.vista.getAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaBienvenidaEmpleado v = new VistaBienvenidaEmpleado(); 
            	ControlerBienvenidaEmpleado c = new ControlerBienvenidaEmpleado(v);
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

