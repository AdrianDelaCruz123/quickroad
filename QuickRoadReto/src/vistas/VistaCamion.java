package vistas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Clases.Camion;

public class VistaCamion extends JFrame {

	private String usuario;
	private JPanel contentPane;
	private JLabel matricula;
	private JLabel marca;
	private JLabel año;
	private JLabel modelo;
	private JLabel capacidad;
	private JLabel estado;
	private JButton botonSalir;
	private JButton activo;
	private JButton mantenimiento;
	private JButton inactivo;

	public VistaCamion(Camion camion) {
		super("Detalles del Camión");

		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel(new BorderLayout(10, 10));
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		setContentPane(contentPane);

		JPanel detallesCamion = new JPanel(new GridLayout(6, 1, 5, 5));
		detallesCamion.setBorder(new TitledBorder("Información del Camión"));

		matricula = new JLabel("Matrícula: " + camion.getMatricula());
		marca = new JLabel("Marca: " + camion.getMarca());
		modelo = new JLabel("Modelo: " + camion.getModelo());
		año = new JLabel("Año: " + camion.getAño());
		capacidad = new JLabel("Capacidad: " + camion.getCapacidad());
		estado = new JLabel("Estado: " + camion.getEstado());

		detallesCamion.add(matricula);
		detallesCamion.add(marca);
		detallesCamion.add(modelo);
		detallesCamion.add(año);
		detallesCamion.add(capacidad);
		detallesCamion.add(estado);

		contentPane.add(detallesCamion, BorderLayout.CENTER);

		JPanel panelEstado = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
		activo = new JButton("Activo");
		inactivo = new JButton("Inactivo");
		mantenimiento = new JButton("Mantenimiento");

		panelEstado.add(activo);
		panelEstado.add(inactivo);
		panelEstado.add(mantenimiento);

		contentPane.add(panelEstado, BorderLayout.SOUTH);

		JPanel panelVolver = new JPanel(new FlowLayout(FlowLayout.LEFT));
		botonSalir = new JButton("Volver");
		panelVolver.add(botonSalir);
		contentPane.add(panelVolver, BorderLayout.NORTH);
	}

	public JLabel getAño() {
		return año;
	}

	public JLabel getMarca() {
		return marca;
	}

	public JLabel getModelo() {
		return modelo;
	}

	public JLabel getCapacidad() {
		return capacidad;
	}

	public JLabel getEstado() {
		return estado;
	}

	public JLabel getMatricula() {
		return matricula;
	}

	public JButton getAtras() {
		return botonSalir;
	}

	public JButton getMantenimiento() {
		return mantenimiento;
	}

	public JButton getActivo() {
		return activo;
	}

	public JButton getInactivo() {
		return inactivo;
	}
}
