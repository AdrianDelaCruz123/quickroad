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

import Clases.Paquete;


public class VistaPaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField busqueda;
	private JButton botonBuscar;
	private JButton botonSalir;
	private JButton botonAñadirProductos;
	private String usuario;
	private JList<Paquete> JlistProductos;
	private DefaultListModel<Paquete> modeloLista;

	public VistaPaquetes() {
		this.usuario = usuario;
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		ArrayList<Paquete> listaPaquete = repositorios.MostrarPaquetes.MostrarPaquetes();

		modeloLista = new DefaultListModel<Paquete>();

		for (Paquete Paquete : listaPaquete) {
			modeloLista.addElement(Paquete);
		}

		JlistProductos = new JList(modeloLista);
		contentPane.add(new JScrollPane(JlistProductos), BorderLayout.CENTER);

		JPanel panelBuscador = new JPanel();
		busqueda = new JTextField(10);
		botonBuscar = new JButton("Buscar");
		panelBuscador.add(busqueda);
		panelBuscador.add(botonBuscar);

		contentPane.add(panelBuscador, BorderLayout.NORTH);

		// aquí iran los botones que iran en la parte inferior de la vista
		JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));

		botonSalir = new JButton("Salir");
		panel.add(botonSalir);

		botonAñadirProductos = new JButton("Añadir productos");
		panel.add(botonAñadirProductos);
		
		contentPane.add(panelBuscador, BorderLayout.NORTH);
		contentPane.add(panel, BorderLayout.SOUTH);

	}

	public DefaultListModel<Paquete> getModeloLista() {
		return modeloLista;
	}

	public JTextField getTextFieldBusqueda() {
		return busqueda;
	}

	public JButton getBtnBuscar() {
		return botonBuscar;
	}

	public JButton getBotonAñadirProductos() {
		return botonAñadirProductos;
	}

	public JButton getBtnSalir() {
		return botonSalir;
	}

	public String getUsuario() {
		return usuario;
	}

	public JList<Paquete> getJlistProductos() {
		return JlistProductos;
	}

	public void setJlistProductos(JList<Paquete> jlistProductos) {
		JlistProductos = jlistProductos;
	}

}
