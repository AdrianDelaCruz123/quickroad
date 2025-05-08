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

public class VistaCamiones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField busqueda;
	private JButton botonBuscar;
	private JButton botonSalir;
	private String usuario;
	private JList<Camion> JlistProductos;
	private DefaultListModel<Camion> modeloLista;

	public VistaCamiones() {
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		ArrayList<Camion> listaProductos = repositorios.MostrarCamion.mostrarCamiones();

		modeloLista = new DefaultListModel<Camion>();

		for (Camion camion : listaProductos) {
			modeloLista.addElement(camion);
		}

		JlistProductos = new JList(modeloLista);
		contentPane.add(new JScrollPane(JlistProductos), BorderLayout.CENTER);

		// aquí iran los botones que iran en la parte inferior de la vista
		JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));

		botonSalir = new JButton("Salir");
		panel.add(botonSalir);
		
		contentPane.add(panel, BorderLayout.SOUTH);

	}

	public DefaultListModel<Camion> getModeloLista() {
		return modeloLista;
	}

	public JTextField getTextFieldBusqueda() {
		return busqueda;
	}

	public JButton getBtnBuscar() {
		return botonBuscar;
	}

	

	public JButton getAtras() {
		return botonSalir;
	}

	public String getUsuario() {
		return usuario;
	}

	public JList<Camion> getJlistProductos() {
		return JlistProductos;
	}

	public void setJlistProductos(JList<Camion> jlistProductos) {
		JlistProductos = jlistProductos;
	}

}