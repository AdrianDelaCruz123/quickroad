package vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Clases.Usuario;

public class VistaUsuarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton botonSalir;
	private JButton eliminar;
	private JButton bloquear;
	private JButton desbloquear;
	private JButton botonBuscar;
	private JButton botonAñadirViaje; 
	private JTextField busqueda;
	private String usuario;
	private JList<Usuario> JlistProductos;
	private DefaultListModel<Usuario> modeloLista;

	public VistaUsuarios() {
		setTitle("Gestión de Usuarios");
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
		panelBuscador.setBorder(new TitledBorder("Buscar usuario"));
		contentPane.add(panelBuscador, BorderLayout.NORTH);

		ArrayList<Usuario> listaUsuarios = repositorios.MostrarUsuarios.MostrarPaquetes();
		modeloLista = new DefaultListModel<>();

		for (Usuario usuario : listaUsuarios) {
			modeloLista.addElement(usuario);
		}

		JlistProductos = new JList<>(modeloLista);
		JlistProductos.setVisibleRowCount(10);
		JlistProductos.setFixedCellHeight(25);
		JlistProductos.setBorder(new EmptyBorder(5, 5, 5, 5));

		JScrollPane scrollPane = new JScrollPane(JlistProductos);
		scrollPane.setBorder(new TitledBorder("Lista de usuarios"));
		contentPane.add(scrollPane, BorderLayout.CENTER);

		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(3, 2, 10, 10));
		panelBotones.setBorder(new TitledBorder("Acciones"));

		eliminar = new JButton("Eliminar");
		bloquear = new JButton("Bloquear");
		desbloquear = new JButton("Desbloquear");
		botonSalir = new JButton("Salir");
		botonAñadirViaje = new JButton("Añadir Viaje"); 

		panelBotones.add(eliminar);
		panelBotones.add(bloquear);
		panelBotones.add(desbloquear);
		panelBotones.add(botonSalir);
		panelBotones.add(botonAñadirViaje);

		contentPane.add(panelBotones, BorderLayout.SOUTH);
	}

	public JButton getEliminar() { return eliminar; }
	public JButton getBloquear() { return bloquear; }
	public JButton getDesbloquear() { return desbloquear; }
	public JButton getBotonBusqueda() { return botonBuscar; }
	public JButton getAtras() { return botonSalir; }
	public JButton getBotonAñadirViaje() { return botonAñadirViaje; } 

	public JTextField getBusqueda() { return busqueda; }
	public String getUsuario() { return usuario; }

	public DefaultListModel<Usuario> getModeloLista() { return modeloLista; }

	public JList<Usuario> getJlistProductos() { return JlistProductos; }

	public void setJlistProductos(JList<Usuario> jlistProductos) {
		JlistProductos = jlistProductos;
	}
}
