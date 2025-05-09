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

public class VistaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton registrar;
	private JButton botonRenueve;
	private JButton botonBaja;
	private JTextField usuario;
	private JTextField password;
	
	public JButton getBotonBaja() {
    	return botonBaja;
    }
	public JButton getBotonRenueve() {
    	return botonRenueve;
    }
    public JButton getBtnRegistrar() {
    	return btnNewButton;
    }
   public JTextField getTxtUsuario() {
	   return usuario;
   }
   public JTextField getTxtContraseña() {
	   return password;
   }
   

	public JButton getRegistrar() {
	return registrar;
}
public void setRegistrar(JButton registrar) {
	this.registrar = registrar;
}
	
	public VistaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 200, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel panel = new JPanel(new GridLayout(6, 2, 5, 5)); 

		panel.add(new JLabel("Usuario"));
		usuario = new JTextField(10);
		panel.add(usuario);

		panel.add(new JLabel("Contraseña"));
		password = new JTextField(10);
		panel.add(password);

		panel.add(new JLabel("")); 
		btnNewButton = new JButton("Iniciar sesion");
		panel.add(btnNewButton);
		
		panel.add(new JLabel("")); 
		registrar = new JButton("Registrar");
		panel.add(registrar);
		
		panel.add(new JLabel("")); 
		botonRenueve = new JButton("He olvidado mi sesion");
		panel.add(botonRenueve);
		
		panel.add(new JLabel("")); 
		botonBaja = new JButton("Dar de baja");
		panel.add(botonBaja);

		contentPane.add(panel);
		
		
	}

}
