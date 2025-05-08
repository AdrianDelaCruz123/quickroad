package vistas;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;

public class VistaBienvenidaEmpleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton registrarse;
	private JButton verCamiones;
	private JButton atras;

	
	public JButton getAtras() {
    	return atras;
    }
	public JButton getCamiones() {
    	return verCamiones;
    }
    public JButton getBtnRegistrar() {
    	return btnNewButton;
    }
   
   

	public JButton getPaquete() {
		return registrarse;
	}
public void setRegistrar(JButton registrar) {
	this.registrarse = registrar;
}
	
	public VistaBienvenidaEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5)); 
		
		panel.add(new JLabel("")); 
		registrarse = new JButton("Ver paquetes");
		panel.add(registrarse);
		
		panel.add(new JLabel("")); 
		verCamiones = new JButton("Ver camiones");
		panel.add(verCamiones);
		
		panel.add(new JLabel("")); 
		atras = new JButton("Atras");
		panel.add(atras);

		contentPane.add(panel);
		
		
	}

}
