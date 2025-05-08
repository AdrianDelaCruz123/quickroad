package controladores;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import repositorios.RepositorioAñadirUsuario;
import repositorios.RepositorioEliminarUsuario;
import repositorios.RepositorioUsuario;
import repositorios.RepositorioVerificarDni;
import vistas.VerificarDni;
import vistas.VistaActualizarDatos;
import vistas.VistaDarDeBaja;
import vistas.VistaLogin;
import vistas.VistaRegistrar;


public class ControlerVerificarDni {
    private VerificarDni vista;
   

    public  ControlerVerificarDni(VerificarDni vista) {
        this.vista = vista;
        
		this.vista.getInsertar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String dni = vista.getTxtDni().getText();

                boolean existe = RepositorioVerificarDni.verificarUsuario(dni); // debe devolver boolean

                if (!existe) {
                    vista.mostrarErrorTipo("DNI no encontrado.");
                    return; 
                }

                RepositorioEliminarUsuario.eliminarUsuario(dni);
                vista.dispose();
                VistaActualizarDatos v = new VistaActualizarDatos(); 
                ControlerActualizarDatos c = new ControlerActualizarDatos(v);
                c.iniciar();
            }
        });
    }


    public void iniciar() {
        vista.setVisible(true);
    }
   
}

