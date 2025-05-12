package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Clases.Camion;
import Clases.Usuario;
import repositorios.Sesion;
import vistas.VistaBienvenidaEmpleado;
import vistas.VistaCamion;
import vistas.VistaCamiones;
import vistas.VistaLogin;
import vistas.VistaUsuarios;

public class ControlerUsuarios {
	private VistaUsuarios vista;

	public ControlerUsuarios(VistaUsuarios vista) {
		this.vista = vista;

		this.vista.getAtras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	vista.dispose();
    		    VistaLogin v = new VistaLogin(); 
    		    ControlerLogin c = new ControlerLogin(v);
				c.iniciar();
            }
        });
		this.vista.getBloquear().addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        Usuario usuario = vista.getJlistProductos().getSelectedValue();
		        if (usuario != null) {
		            boolean exito = repositorios.RepositorioUsuario.bloquearUsuario(usuario.getDni());
		            if (exito) {
		                JOptionPane.showMessageDialog(vista, "Usuario bloqueado correctamente.");
		                usuario.setEstado("BLOQUEADO");
		                vista.getJlistProductos().repaint();
		            } else {
		                JOptionPane.showMessageDialog(vista, "Error al bloquear el usuario.");
		            }
		        } else {
		            JOptionPane.showMessageDialog(vista, "Selecciona un usuario primero.");
		        }
		    }
		});
		this.vista.getDesbloquear().addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        Usuario usuario = vista.getJlistProductos().getSelectedValue();
		        if (usuario != null) {
		            boolean exito = repositorios.RepositorioUsuario.desbloquearUsuario(usuario.getDni());
		            if (exito) {
		                JOptionPane.showMessageDialog(vista, "Usuario desbloqueado correctamente.");
		                usuario.setEstado("DESBLOQUEADO");
		                vista.getJlistProductos().repaint();
		            } else {
		                JOptionPane.showMessageDialog(vista, "Error al desbloquear el usuario.");
		            }
		        } else {
		            JOptionPane.showMessageDialog(vista, "Selecciona un usuario primero.");
		        }
		    }
		});

		this.vista.getEliminar().addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        Usuario usuario = vista.getJlistProductos().getSelectedValue();
		        if (usuario != null) {
		            int confirmacion = JOptionPane.showConfirmDialog(vista, "¿Seguro que quieres eliminar este usuario?");
		            if (confirmacion == JOptionPane.YES_OPTION) {
		                boolean exito = repositorios.RepositorioUsuario.eliminarUsuario(usuario.getDni());
		                if (exito) {
		                    JOptionPane.showMessageDialog(vista, "Usuario eliminado correctamente.");
		                    vista.getModeloLista().removeElement(usuario);
		                } else {
		                    JOptionPane.showMessageDialog(vista, "Error al eliminar el usuario.");
		                }
		            }
		        } else {
		            JOptionPane.showMessageDialog(vista, "Selecciona un usuario primero.");
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

