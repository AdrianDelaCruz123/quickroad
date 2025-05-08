package vistas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VistaDarDeBaja extends JFrame {


	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JButton eliminar;
	    private JButton atras;
	    private JTextField dni;
	    private JLabel lblErrorTipo; 
		
		
		
	    public VistaDarDeBaja() {
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));

	        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));
	        
	        lblErrorTipo = new JLabel(""); 
	        lblErrorTipo.setForeground(Color.RED); 
	        panel.add(lblErrorTipo);

	        
	        panel.add(new JLabel("Dni"));
	        dni = new JTextField(10);  
	        panel.add(dni);

	        panel.add(new JLabel("")); 
	        eliminar = new JButton("Eliminar");
	        panel.add(eliminar);
	        
	        panel.add(new JLabel("")); 
			atras = new JButton("Atras");
			panel.add(atras);
	        
			contentPane.add(panel);
	    }
	    public JTextField getDni() {
	 	   return dni;
	    }
	    public void mostrarErrorTipo(String mensaje) {
	        lblErrorTipo.setText(mensaje); 
	    }

	    public JButton getBtnEliminar() {
	        return eliminar;
	    }
	    
	    public JButton getAtras() {
	        return atras;
	    }
	}


