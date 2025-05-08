package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import repositorios.RepositorioEliminarUsuario;
import repositorios.RepositorioUsuario;
import repositorios.RepositorioVerificarDni;
import vistas.VistaDarDeBaja;
import vistas.VistaLogin;

public class ControlerDarDeBaja {
	private VistaDarDeBaja vista;
	   

    public  ControlerDarDeBaja(VistaDarDeBaja vista) {
        this.vista = vista;
        this.vista.getBtnEliminar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String dni = vista.getDni().getText();
            	boolean existe = RepositorioVerificarDni.verificarUsuario(dni); // debe devolver boolean

                if (!existe) {
                    vista.mostrarErrorTipo("DNI no encontrado.");
                    return; 
                }
            	RepositorioEliminarUsuario.eliminarUsuario(dni);
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
