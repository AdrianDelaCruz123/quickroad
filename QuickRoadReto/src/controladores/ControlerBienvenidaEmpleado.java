package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import repositorios.RepositorioAñadirUsuario;
import repositorios.Sesion;
import vistas.VistaActualizarDatos;
import vistas.VistaBienvenidaEmpleado;
import vistas.VistaLogin;

public class ControlerBienvenidaEmpleado {
	private VistaBienvenidaEmpleado vista;

	public ControlerBienvenidaEmpleado(VistaBienvenidaEmpleado vista) {
		this.vista = vista;
		
		if (!Sesion.estaLogueado()) {
		    JOptionPane.showMessageDialog(null, "Debes iniciar sesión primero.");
		    new VistaLogin().setVisible(true);
		    vista.dispose(); 
		    return;
		}
		
		this.vista.getAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaLogin v = new VistaLogin(); 
            	ControlerLogin c=new ControlerLogin(v);
				c.iniciar();
            }
        });
		
	}
	

	public void iniciar() {
	   vista.setVisible(true);
	}
}
