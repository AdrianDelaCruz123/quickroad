package controladores;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import repositorios.RepositorioUsuario;
import repositorios.Sesion;
import vistas.VerificarDni;
import vistas.VistaBienvenidaEmpleado;
import vistas.VistaDarDeBaja;
import vistas.VistaLogin;
import vistas.VistaRegistrar;
import vistas.VistaUsuarios;


public class ControlerLogin {
    private VistaLogin vista;
   

    public  ControlerLogin(VistaLogin vista) {
        this.vista = vista;
       

        // Añadir el evento de botón
        this.vista.getIniciarSesion().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               vista.dispose();
               if (RepositorioUsuario.verificarUsuario(vista.getTxtUsuario().getText(), vista.getTxtContraseña().getText())) {
                   Sesion.setUsuarioActual(vista.getTxtUsuario().getText()); // Iniciar sesión
                   
                   JOptionPane.showMessageDialog(null, "Bienvenido " + vista.getTxtUsuario().getText());
                   
                    if (!RepositorioUsuario.verificarEstadoUsuario(vista.getTxtUsuario().getText(), vista.getTxtContraseña().getText())) {
	            	   //vista empleado
	            	   VistaBienvenidaEmpleado v = new VistaBienvenidaEmpleado(); 
	            	   ControlerBienvenidaEmpleado c=new ControlerBienvenidaEmpleado(v);
               			c.iniciar();
                    }else {
	            	   //vista admin
                    	VistaUsuarios v = new VistaUsuarios(); 
                    	ControlerUsuarios c = new ControlerUsuarios(v);
        				c.iniciar();
               }
                   
                   vista.dispose(); // Cerrar ventana de login
               } else {
                   JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                   
   					VistaLogin v = new VistaLogin(); 
   					ControlerLogin c=new ControlerLogin(v);
   					c.iniciar();
               }
              
            }
        });
        
        this.vista.getRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {	
            	vista.dispose();
				VistaRegistrar v = new VistaRegistrar(); 
				ControlerRegistrar c=new ControlerRegistrar(v);
				c.iniciar();
            
            }
        });
        
        this.vista.getBotonRenueve().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {	
            	vista.dispose();
				VerificarDni v = new VerificarDni(); 
				ControlerVerificarDni c=new ControlerVerificarDni(v);
				c.iniciar();
            
            }
        });
        this.vista.getBotonBaja().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {	
            	vista.dispose();
            	VistaDarDeBaja v = new VistaDarDeBaja(); 
				ControlerDarDeBaja c=new ControlerDarDeBaja(v);
				c.iniciar();
            
            }
        });
    }

    private void verificarUsuario() {
        String usuario = vista.getTxtUsuario().getText();
        String pass = vista.getTxtContraseña().getText();

        if (RepositorioUsuario.verificarUsuario(usuario, pass)) {
     
            vista.dispose();

            
            
        } else {
            JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos");
        }
    }

    public void iniciar() {
        vista.setVisible(true);
    }
   
}

