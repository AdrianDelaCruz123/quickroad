package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import Clases.Viaje;
import repositorios.Sesion;
import vistas.VistaBienvenidaEmpleado;
import vistas.VistaLogin;
import vistas.VistaNuevoViaje;
import vistas.VistaUsuarios;
import vistas.VistaViajes;
import vistas.VistaViajesCamionero;

public class ControladorViajesCamionero {
    private VistaViajesCamionero vista;

    public ControladorViajesCamionero(VistaViajesCamionero vista) {
        this.vista = vista;

        this.vista.getBotonAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 vista.dispose();
                 VistaBienvenidaEmpleado v = new VistaBienvenidaEmpleado();
                 ControlerBienvenidaEmpleado c = new ControlerBienvenidaEmpleado(v);
                 c.iniciar();
            }
        });
        
        this.vista.getBotonNoIniciado().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Viaje v= vista.getListaViajes().getSelectedValue();
            	if (v != null) {
		            boolean exito = repositorios.CambiarEstadoViaje.cambiarNoIniciado(v.getId());;
		            if (exito) {
		                JOptionPane.showMessageDialog(vista, "Viaje no iniciado.");
		                v.setEstado("No_iniciado");
		                vista.getListaViajes().repaint();
		            } else {
		                JOptionPane.showMessageDialog(vista, "Error al cambiar el viaje.");
		            }
		        } else {
		            JOptionPane.showMessageDialog(vista, "Selecciona un viaje primero.");
		        }
            }
        });

        this.vista.getBotonEnTransito().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Viaje v= vista.getListaViajes().getSelectedValue();
            	if (v != null) {
		            boolean exito = repositorios.CambiarEstadoViaje.cambiarEnTransito(v.getId());;
		            if (exito) {
		                JOptionPane.showMessageDialog(vista, "Viaje en transito.");
		                v.setEstado("En_transito");
		                vista.getListaViajes().repaint();
		            } else {
		                JOptionPane.showMessageDialog(vista, "Error al cambiar el viaje.");
		            }
		        } else {
		            JOptionPane.showMessageDialog(vista, "Selecciona un viaje primero.");
		        }
            }
        });

        this.vista.getBotonFinalizado().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Viaje v= vista.getListaViajes().getSelectedValue();
            	if (v != null) {
		            boolean exito = repositorios.CambiarEstadoViaje.cambiarFinalizado(v.getId());;
		            if (exito) {
		                JOptionPane.showMessageDialog(vista, "Viaje finalizado.");
		                v.setEstado("Finalizado");
		                vista.getListaViajes().repaint();
		            } else {
		                JOptionPane.showMessageDialog(vista, "Error al cambiar el viaje.");
		            }
		        } else {
		            JOptionPane.showMessageDialog(vista, "Selecciona un viaje primero.");
		        }
            }
        });


    }

    public void iniciar() {
        List<Viaje> viajes = repositorios.RepositorioViaje.obtenerTodos();
        for (Viaje v : viajes) {
            vista.getModeloLista().addElement(v);
        }
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
