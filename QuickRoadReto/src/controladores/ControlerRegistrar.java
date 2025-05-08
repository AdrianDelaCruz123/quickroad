package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import repositorios.RepositorioAñadirUsuario;
import vistas.VistaLogin;
import vistas.VistaRegistrar;

public class ControlerRegistrar {
	private VistaRegistrar vista;
	
	public ControlerRegistrar(VistaRegistrar vista) {
		this.vista = vista;
		
		
		this.vista.getBtnRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 String usuario = vista.getTxtUsuario().getText();
         	    String pass = new String(vista.getTxtContraseña().getPassword()); 
         	    String ape = vista.getTxtApellido().getText();
         	    String dni = vista.getTxtDni().getText();
         	    String tel = vista.getTxtTelefono().getText();
         	    String dir = vista.getTxtDireccion().getText();
         	    String tipo = vista.getTxtTipo().getText();

         	    
         	    if (!tipo.equalsIgnoreCase("Admin") && !tipo.equalsIgnoreCase("Empleado")) {
         	        vista.mostrarErrorTipo("El tipo debe ser 'Admin' o 'Empleado'.");
         	        return; 
         	    }

         	    RepositorioAñadirUsuario.añadirUsuario(usuario, pass, ape, dni, tel, dir, tipo);
            	vista.dispose();
            	VistaLogin v = new VistaLogin(); 
            	ControlerLogin c=new ControlerLogin(v);
				c.iniciar();
            }
        });
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
