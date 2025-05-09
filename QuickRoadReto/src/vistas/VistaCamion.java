package vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
		super("Detalles de " + camion.getMarca()+" "+camion.getModelo());
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		JPanel detallesCamion = new JPanel();

		

		matricula = new JLabel("Matricula: " + camion.getMatricula());
		detallesCamion.add(matricula, BorderLayout.CENTER);

		marca = new JLabel("Marca: " + camion.getMarca());
		detallesCamion.add(marca, BorderLayout.CENTER);

		modelo = new JLabel("Modelo: " + camion.getModelo());
		detallesCamion.add(modelo, BorderLayout.CENTER);
		
		año = new JLabel("Año: " + camion.getAño());
		detallesCamion.add(año, BorderLayout.CENTER);
		
		capacidad = new JLabel("Capacidad: " + camion.getCapacidad());
		detallesCamion.add(capacidad, BorderLayout.CENTER);
		
		estado = new JLabel("Estado: " + camion.getEstado());
		detallesCamion.add(estado, BorderLayout.CENTER);

		botonSalir = new JButton("Volver");
		detallesCamion.add(botonSalir, BorderLayout.SOUTH);

		
		contentPane.add(detallesCamion, BorderLayout.CENTER);
		
		
		JPanel modificarCamion = new JPanel();
		
		activo = new JButton("Activo");
		modificarCamion.add(activo, BorderLayout.WEST);
		
		inactivo = new JButton("Inactivo");
		modificarCamion.add(inactivo, BorderLayout.CENTER);
		
		mantenimiento = new JButton("Mantenimiento");
		modificarCamion.add(mantenimiento, BorderLayout.EAST);
		
		contentPane.add(modificarCamion, BorderLayout.SOUTH);
		
		

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
