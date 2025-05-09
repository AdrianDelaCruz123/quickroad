package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import repositorios.Sesion;
import vistas.VistaCamion;
import vistas.VistaCamiones;
import vistas.VistaLogin;

public class ControladorVistaCamion {
	private VistaCamion vista;

	public ControladorVistaCamion(VistaCamion vista) {
		this.vista = vista;

		this.vista.getAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            }
        });
		
		this.vista.getActivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	repositorios.CambiarEstadoDeCamion.cambiarActivo(vista.getMatricula().getText());
            }
        });
		
		this.vista.getInactivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	repositorios.CambiarEstadoDeCamion.cambiarInactivo(vista.getMatricula().getText());
            }
        });
		
		this.vista.getMantenimiento().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	repositorios.CambiarEstadoDeCamion.cambiarMantenimiento(vista.getMatricula().getText());
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
