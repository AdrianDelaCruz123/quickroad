package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import Clases.Camion;
import Clases.Paquete;
import Clases.Usuario;
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
            	VistaBienvenidaEmpleado v = new VistaBienvenidaEmpleado(); 
            	ControlerBienvenidaEmpleado c = new ControlerBienvenidaEmpleado(v);
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
		
		this.vista.getBotonBuscar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String textoBusqueda = ControladorVistaCamiones.this.vista.getTextFieldBusqueda().getText();
				DefaultListModel<Camion> modeloLista = ControladorVistaCamiones.this.vista.getModeloLista();
				ControladorVistaCamiones.this.vista.getModeloLista().clear();
				ArrayList<Camion> lista = repositorios.MostrarCamion.buscarPorNombre(textoBusqueda);
				for (Camion c : lista) {
					modeloLista.addElement(c);
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
