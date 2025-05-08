package controladores;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import repositorios.RepositorioUsuario;
import vistas.VerificarDni;
import vistas.VistaDarDeBaja;
import vistas.VistaLogin;
import vistas.VistaRegistrar;


public class ControlerLogin {
    private VistaLogin vista;
   

    public  ControlerLogin(VistaLogin vista) {
        this.vista = vista;
       

        // Añadir el evento de botón
        this.vista.getBtnRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               verificarUsuario();
            
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

