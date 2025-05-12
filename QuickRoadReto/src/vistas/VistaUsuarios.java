package vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Clases.Camion;
import Clases.Usuario;

public class VistaUsuarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton botonSalir;
	private JButton eliminar;
	private JButton bloquear;
	private JButton desbloquear;
	private String usuario;
	private JList<Usuario> JlistProductos;
	private DefaultListModel<Usuario> modeloLista;

	public VistaUsuarios() {
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		ArrayList<Usuario> listaUsuarios = repositorios.MostrarUsuarios.MostrarPaquetes();

		modeloLista = new DefaultListModel<Usuario>();

		for (Usuario usuario : listaUsuarios) {
			modeloLista.addElement(usuario);
		}

		JlistProductos = new JList(modeloLista);
		contentPane.add(new JScrollPane(JlistProductos), BorderLayout.CENTER);

		JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
		
		eliminar = new JButton("Eliminar");
		panel.add(eliminar);
		
		bloquear = new JButton("Bloquear");
		panel.add(bloquear);
		
		desbloquear = new JButton("Desbloquear");
		panel.add(desbloquear);
		
		botonSalir = new JButton("Salir");
		panel.add(botonSalir);
		
		contentPane.add(panel, BorderLayout.SOUTH);

	}

	public DefaultListModel<Usuario> getModeloLista() {
		return modeloLista;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public JButton getBloquear() {
		return bloquear;
	}

	public JButton getDesbloquear() {
		return desbloquear;
	}


	public JButton getAtras() {
		return botonSalir;
	}

	public String getUsuario() {
		return usuario;
	}

	public JList<Usuario> getJlistProductos() {
		return JlistProductos;
	}

	public void setJlistProductos(JList<Usuario> jlistProductos) {
		JlistProductos = jlistProductos;
	}

}