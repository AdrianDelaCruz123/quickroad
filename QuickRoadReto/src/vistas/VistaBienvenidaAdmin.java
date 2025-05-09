package vistas;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaBienvenidaAdmin extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton elimUsuario;
	private JButton verUsuarios;
	private JButton bloqUsuarios;
	private JButton atras;
	
	public JButton getVerUsuarios() {
    	return verUsuarios;
    }
	
	public JButton getAtras() {
    	return atras;
    }
	public JButton getBloqUsuarios() {
    	return bloqUsuarios;
    }
    public JButton getBtnRegistrar() {
    	return btnNewButton;
    }
   
   

	public JButton getElimUsuario() {
		return elimUsuario;
	}
public void setRegistrar(JButton registrar) {
	this.elimUsuario = registrar;
}
	
	public VistaBienvenidaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5)); 
		
		panel.add(new JLabel("")); 
		elimUsuario = new JButton("Eliminar usuario");
		panel.add(elimUsuario);
		
		panel.add(new JLabel("")); 
		bloqUsuarios = new JButton("Bloquear Usuario");
		panel.add(bloqUsuarios);
		
		panel.add(new JLabel("")); 
		verUsuarios = new JButton("Ver usuarios");
		panel.add(verUsuarios);
		
		panel.add(new JLabel("")); 
		atras = new JButton("Atras");
		panel.add(atras);

		contentPane.add(panel);
		
		
	}
}
