package vistas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

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
	private JButton botonDescargar; // Nuevo botón


	public VistaPaquete(Paquete paquete) {
		super("Detalles del Paquete");

		setSize(400, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel(new BorderLayout(10, 10));
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		setContentPane(contentPane);

		JPanel detallesPanel = new JPanel(new GridLayout(8, 1, 5, 5));
		detallesPanel.setBorder(new TitledBorder("Información del Paquete"));

		idPaquete = new JLabel("ID: " + paquete.getIdPaquete());
		descripcion = new JLabel("Descripción: " + paquete.getDecripcion());
		peso = new JLabel("Peso: " + paquete.getPeso());
		alto = new JLabel("Alto: " + paquete.getAlto());
		ancho = new JLabel("Ancho: " + paquete.getAncho());
		fecharecogida = new JLabel("Fecha de recogida: " + paquete.getFecharecogida());
		fechaEntrega = new JLabel("Fecha de entrega: " + paquete.getFechaEntrega());
		estado = new JLabel("Estado: " + paquete.getEstado());

		detallesPanel.add(idPaquete);
		detallesPanel.add(descripcion);
		detallesPanel.add(peso);
		detallesPanel.add(alto);
		detallesPanel.add(ancho);
		detallesPanel.add(fecharecogida);
		detallesPanel.add(fechaEntrega);
		detallesPanel.add(estado);

		contentPane.add(detallesPanel, BorderLayout.CENTER);

		JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		botonSalir = new JButton("Volver");
		panelBoton.add(botonSalir);
		botonDescargar = new JButton("Descargar");
		panelBoton.add(botonDescargar);
		contentPane.add(panelBoton, BorderLayout.SOUTH);
	}

	
	public JButton getBotonDescargar() {
		return botonDescargar;
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
