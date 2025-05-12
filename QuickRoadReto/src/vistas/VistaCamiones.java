package vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

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
		setTitle("Gestión de Camiones");
		setSize(650, 450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel(new BorderLayout(10, 10));
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		setContentPane(contentPane);

		JPanel panelBuscador = new JPanel(new BorderLayout(5, 5));
		busqueda = new JTextField();
		busqueda.setPreferredSize(new Dimension(200, 30));
		botonBuscar = new JButton("Buscar");
		panelBuscador.add(busqueda, BorderLayout.CENTER);
		panelBuscador.add(botonBuscar, BorderLayout.EAST);
		panelBuscador.setBorder(new TitledBorder("Buscar camión"));
		contentPane.add(panelBuscador, BorderLayout.NORTH);

		ArrayList<Camion> listaProductos = repositorios.MostrarCamion.mostrarCamiones();
		modeloLista = new DefaultListModel<>();

		for (Camion camion : listaProductos) {
			modeloLista.addElement(camion);
		}

		JlistProductos = new JList<>(modeloLista);
		JlistProductos.setVisibleRowCount(10);
		JlistProductos.setFixedCellHeight(25);
		JlistProductos.setBorder(new EmptyBorder(5, 5, 5, 5));

		JScrollPane scrollPane = new JScrollPane(JlistProductos);
		scrollPane.setBorder(new TitledBorder("Lista de camiones"));
		contentPane.add(scrollPane, BorderLayout.CENTER);

		JPanel panel = new JPanel(new GridLayout(1, 1));
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

	public JButton getBotonBuscar() {
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
