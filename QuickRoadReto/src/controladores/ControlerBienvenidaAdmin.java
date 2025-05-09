package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import repositorios.Sesion;
import vistas.VistaBienvenidaAdmin;
import vistas.VistaBienvenidaEmpleado;
import vistas.VistaDarDeBaja;
import vistas.VistaLogin;
import vistas.VistaUsuarios;

public class ControlerBienvenidaAdmin {
	private VistaBienvenidaAdmin vista;

	public ControlerBienvenidaAdmin(VistaBienvenidaAdmin vista) {
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
		this.vista.getVerUsuarios().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaUsuarios v = new VistaUsuarios(); 
            	ControlerUsuarios c = new ControlerUsuarios(v);
				c.iniciar();
            }
        });
		this.vista.getElimUsuario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaDarDeBaja v = new VistaDarDeBaja(); 
				ControlerDarDeBaja c=new ControlerDarDeBaja(v);
				c.iniciar();
            	
            }
        });
		this.vista.getElimUsuario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            	VistaDarDeBaja v = new VistaDarDeBaja(); 
				ControlerDarDeBaja c=new ControlerDarDeBaja(v);
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
