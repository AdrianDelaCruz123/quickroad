package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import repositorios.RepositorioAñadirUsuario;
import repositorios.Sesion;
import vistas.VistaActualizarDatos;
import vistas.VistaBienvenidaEmpleado;
import vistas.VistaCamiones;
import vistas.VistaLogin;
import vistas.VistaPaquete;
import vistas.VistaPaquetes;
import vistas.VistaViajesCamionero;

public class ControlerBienvenidaEmpleado {
	private VistaBienvenidaEmpleado vista;

	public ControlerBienvenidaEmpleado(VistaBienvenidaEmpleado vista) {
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
		this.vista.getPaquete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaPaquetes v = new VistaPaquetes(); 
            	ControladorVistaPaquetes c = new ControladorVistaPaquetes(v);
				c.iniciar();
            }
        });
		this.vista.getCamiones().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaCamiones v = new VistaCamiones(); 
            	ControladorVistaCamiones c = new ControladorVistaCamiones(v);
				c.iniciar();
            }
        });
		this.vista.getViajes().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaViajesCamionero v = new VistaViajesCamionero(); 
            	ControladorViajesCamionero c = new ControladorViajesCamionero(v);
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
