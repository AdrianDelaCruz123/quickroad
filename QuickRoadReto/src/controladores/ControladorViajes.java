package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import Clases.Viaje;
import repositorios.Sesion;
import vistas.VistaLogin;
import vistas.VistaNuevoViaje;
import vistas.VistaUsuarios;
import vistas.VistaViajes;

public class ControladorViajes {
    private VistaViajes vista;

    public ControladorViajes(VistaViajes vista) {
        this.vista = vista;

        this.vista.getBotonAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
            }
        });
        
        this.vista.getBotonAñadir().addActionListener(e -> {
        	vista.dispose();
            VistaNuevoViaje nuevaVista = new VistaNuevoViaje();
            ControladorNuevoViaje controlador = new ControladorNuevoViaje(nuevaVista);
            controlador.iniciar();
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
