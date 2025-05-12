package vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

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
		setTitle("Gestión de Paquetes");
		setSize(650, 450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel(new BorderLayout(10, 10));
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		setContentPane(contentPane);

		// Panel de búsqueda
		JPanel panelBuscador = new JPanel(new BorderLayout(10, 10));
		busqueda = new JTextField();
		busqueda.setPreferredSize(new Dimension(200, 30));
		botonBuscar = new JButton("Buscar");
		panelBuscador.add(busqueda, BorderLayout.CENTER);
		panelBuscador.add(botonBuscar, BorderLayout.EAST);
		panelBuscador.setBorder(new TitledBorder("Buscar paquete"));
		contentPane.add(panelBuscador, BorderLayout.NORTH);

		// Lista de paquetes
		ArrayList<Paquete> listaPaquete = repositorios.MostrarPaquetes.MostrarPaquetes();
		modeloLista = new DefaultListModel<>();

		for (Paquete paquete : listaPaquete) {
			modeloLista.addElement(paquete);
		}

		JlistProductos = new JList<>(modeloLista);
		JlistProductos.setVisibleRowCount(10);
		JlistProductos.setFixedCellHeight(25);
		JlistProductos.setBorder(new EmptyBorder(5, 5, 5, 5));

		JScrollPane scrollPane = new JScrollPane(JlistProductos);
		scrollPane.setBorder(new TitledBorder("Lista de paquetes"));
		contentPane.add(scrollPane, BorderLayout.CENTER);

		// Panel de botones inferiores
		JPanel panelInferior = new JPanel(new GridLayout(1, 2, 10, 10));
		botonAñadirProductos = new JButton("Añadir productos");
		botonSalir = new JButton("Salir");
		panelInferior.add(botonAñadirProductos);
		panelInferior.add(botonSalir);

		contentPane.add(panelInferior, BorderLayout.SOUTH);
	}

	// Getters
	public DefaultListModel<Paquete> getModeloLista() {
		return modeloLista;
	}

	public JTextField getTextFieldBusqueda() {
		return busqueda;
	}

	public JButton getBotonBuscar() {
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
