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
import Clases.Paquete;

public class VistaPaquete extends JFrame {

	private String usuario;
	private JPanel contentPane;
	private JLabel idPaquete;
	private JLabel descripcion;
	private JLabel peso;
	private JLabel alto;
	private JLabel ancho;
	private JLabel fecharecogida;
	private JLabel fechaEntrega;
	private JLabel estado;
	private JButton botonSalir;

	public VistaPaquete(Paquete paquete) {
		super("Detalles de " + paquete.getIdPaquete()+" "+paquete.getDecripcion());
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		JPanel detallesPaquete = new JPanel();

		

		idPaquete = new JLabel("ID: " + paquete.getIdPaquete());
		detallesPaquete.add(idPaquete, BorderLayout.CENTER);

		descripcion = new JLabel("Descripcion: " + paquete.getDecripcion());
		detallesPaquete.add(descripcion, BorderLayout.CENTER);

		peso = new JLabel("Peso: " + paquete.getPeso());
		detallesPaquete.add(peso, BorderLayout.CENTER);
		
		alto = new JLabel("Alto: " +paquete.getAlto());
		detallesPaquete.add(alto, BorderLayout.CENTER);
		
		ancho = new JLabel("Ancho: " +paquete.getAncho());
		detallesPaquete.add(ancho, BorderLayout.CENTER);
		
		fecharecogida = new JLabel("Fecha de recogida: " +paquete.getFecharecogida());
		detallesPaquete.add(fecharecogida, BorderLayout.CENTER);
		
		fechaEntrega = new JLabel("Fecha de entrega: " +paquete.getFechaEntrega());
		detallesPaquete.add(fechaEntrega, BorderLayout.CENTER);

		estado = new JLabel("Estado: " + paquete.getEstado());
		detallesPaquete.add(estado, BorderLayout.CENTER);

		botonSalir = new JButton("Volver");
		detallesPaquete.add(botonSalir, BorderLayout.SOUTH);


		add(detallesPaquete);

	}

	public JLabel getIdPaquete() {
		return idPaquete;
	}

	public JLabel getDescripcion() {
		return descripcion;
	}

	public JLabel getPeso() {
		return peso;
	}

	public JLabel getAlto() {
		return alto;
	}
	public JLabel getAncho() {
		return ancho;
	}
	public JLabel getFechaRecogida() {
		return fecharecogida;
	}
	public JLabel getFechaEntrega() {
		return fechaEntrega;
	}

	public JLabel getEstado() {
		return estado;
	}


	public JButton getAtras() {
		return botonSalir;
	}


}
