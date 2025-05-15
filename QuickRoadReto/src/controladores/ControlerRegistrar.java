package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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


         	  if (pass.trim().isEmpty()) {
       	        vista.mostrarErrorTipo("La contraseña no puede estar vacia.");
         	      return;
         	  }

         	    if (!tipo.equalsIgnoreCase("Admin") && !tipo.equalsIgnoreCase("Empleado")) {
         	        vista.mostrarErrorTipo("El tipo debe ser 'Admin' o 'Empleado'");
         	        return; 
         	    }
         	   
         	   if (tel.length() != 9) {
          	        vista.mostrarErrorTipo("El telefono debe tener exactamente 9 numeros");
         	       return;
         	   }

         	   if (dni.length() != 9) {
          	        vista.mostrarErrorTipo("El DNI debe tener 8 numeros y una letra");
         	       return;
         	   }

         	   String numerosDni = dni.substring(0, 8);
         	   char letraDni = dni.charAt(8);

         	   if (!numerosDni.matches("[0-9]+") || !Character.isLetter(letraDni)) {
         	       JOptionPane.showMessageDialog(null, "El DNI debe tener 8 números seguidos de 1 letra.");
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
