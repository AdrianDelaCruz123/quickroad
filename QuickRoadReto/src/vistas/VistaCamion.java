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
	private JButton descargarFichero;

	public VistaCamion(Camion camion) {
		super("Detalles de " + camion.getMarca()+" "+camion.getModelo());
		setSize(300, 200);
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


		add(detallesCamion);

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


	public JButton getAtras() {
		return botonSalir;
	}


}
